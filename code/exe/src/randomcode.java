import java.util.Random;
import java.util.Scanner;

public class randomcode {
    public static void main(String[] args) {
        /*
        1.产生随机字母包括大写字母+小写字母+数字字符等组成的随机验证码
        2.用户输入验证码
        3.进行比对
        * */
        /*产生随机验证码*/
        char[] ch = getChars();

        /*进行组合字符*/
        String randomcode = getRandomcode(ch);
        System.out.println("验证码为：" + randomcode);


        /*进行比对*/
        inputcode();

    }

    private static void inputcode() {
        Scanner sc = new Scanner(System.in);
        String checkcode = "";
        System.out.println("请输入验证码：");
        for (int i = 0; i < 5; i++) {
            checkcode += sc.nextLine();
        }
        System.out.println(checkcode);
    }

    private static String getRandomcode(char[] ch) {
        Random r = new Random();
        String randomcode = "";
        for (int i = 0; i < 5; i++) {
            randomcode += ch[r.nextInt(ch.length + 1)];
        }
        return randomcode;
    }

    private static char[] getChars() {
        char ch[] = new char[26 + 26 + 10];
        int index = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            ch[index++] = c;
        }
        for (char c = 'A'; c <= 'Z'; c++) {
            ch[index++] = c;
        }
        for (char c = '0'; c <= '9'; c++) {
            ch[index++] = c;
        }
        return ch;
    }
}
