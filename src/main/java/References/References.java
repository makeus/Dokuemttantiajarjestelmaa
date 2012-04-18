package References;

import Data_Access.FileManager;
import java.util.ArrayList;
import java.util.List;

public class References {

    private FileManager fileManager;
    private ReferenceHolder holder;

    public References(FileManager fileManager, ReferenceHolder holder) {
        this.fileManager = fileManager;
        this.holder = holder;
    }

    public boolean openFile(String filename) {
        return fileManager.openFile(filename);
    }

    public boolean createFile(String filename) {
        return fileManager.createFile(filename);
    }

    public boolean saveFile() {
        return fileManager.saveFile(this.getReferences());
    }

    public boolean saveAs(String filename) {
        return fileManager.saveAs(this.getReferences(), filename);
    }

    public List<Reference> getReferences() {
        return holder.getReferences();
    }

    public void addReference(Reference reference) {
        holder.addReference(reference);
    }
}
