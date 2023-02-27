package com.bonade.sdk.opencenter.test.mashibinglearn;

import javax.swing.text.rtf.RTFEditorKit;
import java.util.Arrays;

/**
 * Copyright© 2020.10.20 by 博纳德集团有限公司.All rights reserved.
 * 1.版权归博纳德集团公司所有；
 * 2.未经原作者允许不得转载本代码内容，否则将视为侵权；
 * 3.对于不遵守此声明或者其他违法使用本代码内容者，本公司依法保留追究权。.
 * <b>Description:</b><br>
 *
 * @author nod
 * <b>ProjectName:</b> open-center-sdk
 * <br><b>PackageName:</b> com.bonade.sdk.opencenter.test
 * <br><b>ClassName:</b>  kdfs
 * <br><b>Date:</b> 2022/9/22 9:26
 */
public class sujishuLearn {

    public static void main(String[] str) {
    //  int i=  (int)(Math.random()*16) +1;
      //  System.out.println(i);
        System.out.println("=====验证开始=====");


        int timetsmte=100000;
        int count[]=new int[57];
        for(int k=0;k<timetsmte;k++){
            int get = dui();
           // System.out.println("get="+get);
            count[get]++;
        }
       for(int i=0;i<57;i++){
           System.out.println(i +"出现w了"+count[i]);
       }
        System.out.println("=====验证结束=====");
//        System.out.println("Math.pow "+(int)Math.pow(2,5));
//        print(32);
//        System.out.println("=====验证结束3=6e6eeee6e=e==");
//        System.out.println((1<<5) + (1<<3));
      //  System.out.println(print((int)Math.pow(2,5)));
    }


   // 输出 0 到 16 的随机数
    private static int f0(){

        return  (int)(Math.random()*17);
    }
    //// 输出 3到 19 的随机数
    private static int f1(){
        return  f0()+3;
    }

    //// 输出 3~10, 12 ~19 对应 0 和 1 的等概率 函数
    private static int f2(){
        //int ans=0;
        int b=f1();
       // System.out.println("b="+b);
        if (b>=3&&b<=10){
            return 0;
        }else if (b>=12&&b<=19){
            return 1;
        }else{
           // System.out.println("递归走这里=====");
            return f2();
        }
    }

    ///输出0~36 的随机树
    private static int f3(){
        //最大36 占几位 的 二进制的数
        //
        int ans= (f2()<<5)+(f2()<<2);
        return  ans;

    }

    ///输出20~56 的随机树
    private static int f4(){
        //最大36 占几位 的 二进制的数
        //
        int ans= dui()+20;
        return  ans;

    }
    ///输出20~56 的随机树
    private static int dui(){
        int a =0;
        do {
            a = (f2()<<5)+(f2()<<4)+(f2()<<3)+(f2()<<2)+(f2()<<1)+f2();
        }while(a>36);
        return a+20;
    }




    public static void print(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print(   (num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }




}
