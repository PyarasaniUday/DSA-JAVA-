//import java.util.*;
/*public class Strings {
    public static void main(String[] args){
        String str = "Uday";
        str.concat("Kumar"); 
        // str is immutable 
        System.out.println(str);

        String name1 = new String("Uday");
        String name2 = new String("Uday");

        System.out.println(name1==name2); // not exact method return false 
        System.out.println(name1.equals(name2)); // return true 
        System.out.println(name1.charAt(0));
         // string to Array 

        System.out.println(Arrays.toString(name1.toCharArray()));
        System.out.println(name1.substring(1, 3));
        System.out.println(name1.concat(name2));
        System.out.println(name1.toUpperCase());
        System.out.println(name1.contains("v"));
    } 
}


*/


// palindrome 
/*
public class Strings{
    public static void main(String[] args){
        String str = "ABCCBA";
        str.contains(" ");
        System.out.println(ispalindrom(str));
    }

    static boolean ispalindrom(String str){
       // str=str.toLowerCase();
        for(int i=0;i<str.length()/2;i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);

            if(start!=end){
                return false;
            }
        }
        return true;
    }
}
*/
//pattern 

class Strings{
    public static void main(String[] args){
        int n = 4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}