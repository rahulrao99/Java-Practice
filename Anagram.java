import java.util.*;

public class Anagram{
    public static boolean areAnagrams(String str1,String str2){
        str1=str1.replaceAll("\\s","").toLowerCase();
        str2=str2.replaceAll("\\s","").toLowerCase();
        char[] charArray1=str1.toCharArray();
        char[] charArray2=str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1,charArray2);
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the first String:");
        String str1=sc.nextLine();
        
        System.out.println("Enter the second string:");
        String str2=sc.nextLine();
        
        sc.close();
        
        if(areAnagrams(str1,str2)){
            System.out.println(str1+" and " + str2 + " are anagrams.");
        }else{
            System.out.println(str2+" and " + str2 + "are not anagrams:");
        }
        
    }
}
