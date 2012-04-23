package Data_Access;

import References.Reference;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class FileManager implements UserDAO {

    private File file;
    private boolean fileopen = false;

    public FileManager() {
    }

    public boolean openFile(String filename) {
        if (filename == null) {
            return false;
        }

        file = new File(filename);

        if (!file.exists()) {
            return false;
        }
        fileopen = true;
        return true;
    }

    public boolean createFile(String filename) {
        if (filename == null) {
            return false;
        }
        try {
            if (file == null || !file.exists()) {
                file = new File(filename);
                fileopen = file.createNewFile();
                return fileopen;
            }
            return false;
        } catch (IOException iOException) {
            return false;
        }
    }

    public boolean saveAs(List<Reference> references, String filename) {
        if (filename == null || references == null) {
            return false;
        }
        this.file = new File(filename);
        if (file.exists()) {
            return false;
        }
        this.createFile(filename);
        return this.saveFile(references);
    }


    public boolean saveFile(List<Reference> references) {
        FileWriter writer;
        if (file == null || !file.exists()) {
            return false;
        }
        try {
            writer = new FileWriter(file);
            for (Reference reference : references) {
                writer.write(reference.getBibtex());
            }
            writer.close();
        } catch (IOException ex) {
            return false;
        }
        return true;

    }

    public boolean isOpen() {
        return fileopen;
    }

    public String getContents() {
        String ret = "";

        if (file != null && file.exists()) {
            Scanner lukija;
            try {
                lukija = new Scanner(file);
            } catch (FileNotFoundException fileNotFoundException) {
                return ret;
            }
            while (lukija.hasNextLine()) {
                ret = ret + lukija.nextLine() + "\n";
            }
        }
        return ret;
    }
}