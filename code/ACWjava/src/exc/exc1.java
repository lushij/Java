package exc;

import java.util.*;
public class exc1{
    public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for(int i=0;i<count;i++)
        {
            int[] scx= new int[26];
            String s=sc.next();
            for(char c:s.toCharArray()){
                scx[c-'a']++;
            }
            int max=scx[0];
            char  ch=s.charAt(0);
            for(char c :s.toCharArray()){
                if(scx[c-'a']>max){
                    max=scx[c-'a'];
                    ch=c;
                }
            }
            System.out.print(ch+" "+max);
        }
    }
}