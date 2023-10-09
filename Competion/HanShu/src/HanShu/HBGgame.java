package HanShu;
import java.util.*;
public class HBGgame{
    public static void main(String[] argc){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int x,y;
        for(int j=0;j<i;j++)
        {
        	String s1=sc.next(),s2=sc.next();
        	if(s1.equals("Hunter")) x=0;
        	else if(s1.equals("Bear")) x=1;
        	else x=2;
        	if(s2.equals("Hunter")) y=0;
        	else if(s2.equals("Bear")) y=1;
        	else y=2;
        	if(x==y) System.out.println("Tie");
        	else if((x+1)%3==y) System.out.println("Player2");
            else System.out.println("Player1");
        	
        }
    }
}