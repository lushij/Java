package com.itheima.method;

public class MethodDemo1 {
    /*
        方法 (函数) 介绍 : 一段具有独立功能的代码块, 不调用就不执行.

        好处:
                1. 可以将原本挤在一起的臃肿代码, 按照功能做分类管理, 提高代码的可阅读性
                2. 提高了代码的复用性

        定义格式 :

                public static void 方法名 () {
                    方法体 (逻辑代码)
                }

        方法的调用格式 :

                方法名();

        注意事项:
                1. 方法与方法之间是平级关系, 不允许嵌套定义
                2. 方法不调用就不执行
                3. 方法的定义顺序, 和执行顺序无关, 要想梳理执行顺序, 就看调用顺序
     */

    public static void me(){
        System.out.println("点菜");
        System.out.println("吃菜");
    }

    public static void main(String[] args) {
        farmer();
        cook();
        me();
    }

    public static void cook(){
        System.out.println("买菜");
        System.out.println("洗菜");
        System.out.println("做菜");
    }


    public static void farmer() {
        System.out.println("除草");
        System.out.println("耕地");
        System.out.println("播种");
        System.out.println("浇水");
        System.out.println("收割");
    }

}

