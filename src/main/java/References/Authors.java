package References;

import java.util.ArrayList;
import java.util.List;

public class Authors {

    public Authors() {
    }

    public List<Reference> getReferences(String author, List<Reference> references) {
        List<Reference> ret = new ArrayList<Reference>();

        for (Reference reference : references) {
            if (reference.getAuthor().contains(author)) {
                ret.add(reference);
            }
        }
        return ret;
    }

    public String[] getAuthors(List<Reference> references) {
        ArrayList<String> authors = new ArrayList<String>();
        for (Reference reference : references) {
            for (String author : pickAuthors(reference.getAuthor())) {
                if (!(authors.indexOf(author.trim()) > 0)) {
                    authors.add(author.trim());
                }
            }
        }
        String[] ret = new String[authors.size()];
        return authors.toArray(ret);
    }

    private String[] pickAuthors(String authors) {
        String[] authorsplit = authors.split("and");
        for (int i = 0; i < authorsplit.length - 1; i++) {
            authorsplit[i] = authorsplit[i].trim();
        }
        return authorsplit;
    }
}
