package Array_Hashing;

public class ValidPalindrome {
    public boolean isPalindrome(String s){
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {

            Character start = s.charAt(i);
            Character end = s.charAt(j);

            if (!Character.isLetterOrDigit(start)) {
                i++;
                continue;
            }

            if (!Character.isLetterOrDigit(end)) {
                j--;
                continue;
            }

            if (Character.toLowerCase(start) != Character.toLowerCase(end)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome obj = new ValidPalindrome();
        System.out.println(obj.isPalindrome("0P"));
    }
}
//    String newString="";
//        s=s.toLowerCase();
//                for (int i=0;i<s.length();i++){
//        if(Character.isLetterOrDigit(s.charAt(i))){
//        newString+=String.valueOf(s.charAt(i));
//        }
//        }
//        int i=0;
//        int j =newString.length()-1;
//        while(i<=j){
//        if(newString.charAt(i)!=newString.charAt(j)){
//        return false;
//        }
//        i++;
//        j--;
//        }