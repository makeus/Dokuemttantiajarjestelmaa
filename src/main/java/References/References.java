package References;

import Data_Access.FileManager;
import java.util.ArrayList;
import java.util.List;

public class References {
 
    private FileManager fileManager;
    private List<Reference> references;

    public References(FileManager fileManager) {
        this.fileManager = fileManager;
        references = new ArrayList<Reference>();
    }

    public void addReference(Reference reference){
        references.add(reference);
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
        if (fileManager.isOpen()) {
            List<Reference> infile = fileManager.getReference();
            for (Reference article : infile) {
                boolean contains = false;
                for (Reference inarticles : references) {
                    if (inarticles.getKeyword().equals(article.getKeyword())) {
                        contains = true;
                    }
                }
                if (!contains) {
                    references.add(article);
                }
            }
        }

        return references;
    }
}
