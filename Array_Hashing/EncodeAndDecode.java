package Array_Hashing;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecode {
    public String encode(List<String> strs) {
        // write your code here
        String encode = "";
        for (int i = 0; i < strs.size(); i++) {
            encode+=strs.get(i).length()+"#"+strs.get(i);
        }

        System.out.println(encode);
        return encode;
    }

    /*
     * @param str: A string
     * @return: decodes a single string to a list of strings
     */
    public List<String> decode(String str) {
        // write your code here
        List<String>strs = new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int length = Integer.valueOf(str.substring(i,j));
            strs.add(str.substring(j+1,j+1+length));
            i=j+1+length; 
        }
        return strs;
    }

    public static void main(String[] args) {
        EncodeAndDecode obj = new EncodeAndDecode();
        String str=obj.encode(List.of("Apurva","Bhatt","Dipa","Bhatt","Kunjal","bhatt"));
        System.out.println(obj.decode(str));
    }
}
