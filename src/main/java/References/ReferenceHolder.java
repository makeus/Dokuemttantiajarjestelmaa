package References;

import Data_Access.ReferenceReader;
import java.util.ArrayList;
import java.util.List;

public class ReferenceHolder {

    private ReferenceReader reader;
    private List<Reference> references;

    public ReferenceHolder(ReferenceReader reader) {
        this.reader = reader;
        references = new ArrayList<Reference>();
    }

    public void addReference(Reference reference) {
        references.add(reference);
    }

    public List<Reference> getReferences() {
        List<Reference> infile = reader.getReference();
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
        return references;
    }
}
