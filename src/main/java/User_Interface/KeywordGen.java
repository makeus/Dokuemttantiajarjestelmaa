package User_Interface;

import References.Reference;
import References.References;
import java.util.ArrayList;
import java.util.List;

public class KeywordGen {
    
    private References references;
    
    public KeywordGen(References references) {
        this.references = references;
    }
    
    public String generateKeyword(String[] lNames, int year) {
        if(lNames == null || year == (Integer)null || year == 0  || year < 10 || lNames.length == 0)
            return "";
        String keyword = "";
        for (String lname : lNames) {
            String [] temp = lname.split(" ");
            for(int i = 0;i<temp.length;i++){
                keyword = keyword + temp[i].charAt(0);
            }
        }
        keyword = keyword + last2numbers(year);
        
        ArrayList<String> keywords = new ArrayList<String>();
        List<Reference> list = references.getReferences();
        for (Reference reference : list) {
            keywords.add(reference.getKeyword());
        }
        if (keywords.contains(keyword)) {
            keyword = addExtra(keywords, keyword);
        }
        
        return keyword;
    }
    
    private String addExtra(ArrayList<String> keywords, String keyword) throws RuntimeException {
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int i = 0, j = 0;
        keyword += chars[i];
        i++;
        while (keywords.contains(keyword)) {
            keyword = keyword.substring(0, keyword.length() - 1);
            keyword = keyword + chars[i];
            i++;
            if (i == chars.length) {
                i=0;
                keyword += chars[j];
                j++;
            }
            if (j == chars.length) {
                break;
            }
        }
        return keyword;
    }
    
    private String last2numbers(int year) throws RuntimeException {
        String yearlast = Integer.toString(year);
        return yearlast.substring(2);
    }
}
