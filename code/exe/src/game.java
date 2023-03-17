public class game {
    public static void main(String[] args) {
        sevenout();
    }
    /*
    *游戏规则
    * 1.1-100之间的数字
    * 2.个位数字或十位数字是7 或能被7整除的过*/
    public static void sevenout(){
        for (int i = 1; i <=100; i++) {
            int ge=i%10;
            int shi=i/10%10;
            if(ge==7 || shi==7 || i%7==0)
            {

            }
            else {
                System.out.print(i+" ");
            }
        }
    }
}
