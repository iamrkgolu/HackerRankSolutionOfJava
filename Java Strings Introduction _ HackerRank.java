import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        String a=src.nextLine();
        String b=src.nextLine();
       
         String s=a.substring(0,1);
         s=s.toUpperCase();
         String s1=b.substring(0,1);
         s1=s1.toUpperCase();
         
         String first1=a.substring(1);
         String final1=s+first1;
         String first2=b.substring(1);
         String final2=s1+first2;
         
         
         System.out.println(a.length()+b.length());
         System.out.println(a.compareTo(b)>0?"Yes":"No");
        System.out.println(final1+" "+final2);
        
    }
}
