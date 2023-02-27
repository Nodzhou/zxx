package com.bonade.sdk.opencenter.test.mashibinglearn;

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
public class mashibingLearn {

    public static void main(String[] str) {
    //System.out.println( 4&(4<<1));
    int [] luan = {6,2,0,4,6,8,1,3,7,5,9};
		for(int i=0;i<luan.length;i++){
        System.out.print(luan[i]+" ");
    }
		System.out.println("================分割线=================");

    int length=luan.length;
    //选择排序 从小到大
//		for(int i=0;i<luan.length;i++) {
//			int minV = i;
//			for(int j=i+1;j<luan.length;j++){
//				if(luan[minV]>=luan[j]){
//					minV=j;
//				}
//			}
//			swapVal(luan,i,minV);
//
//		}
    // 冒泡排序 冒出最小值在上面，越往下 越大

//		for(int i=length-1;i>=0;i--){
//
//			for(int second=1;second<length;second++){
//				if(luan[second-1]>luan[second]){
//					swapVal(luan,second-1,second);
//				}
//			}
//		}

    // 插入排序: 联想生活场景玩扑克牌 ，耶牌动作

//		for(int i=0;i<length;i++){
//			int end = 0 ;
//			for(int pre=end-1;pre >0&luan[pre-1]>luan[pre];pre-- ){
//               swapVal(luan,pre-1,pre);
//			}
//		}

      for(int end=1;end<length;end++){
        for(int pre=end-1;pre>=0&&luan[pre]>luan[pre+1];pre--){
            swapVal(luan,pre,pre+1);
        }
    }


		for(int i=0;i<length;i++){
        System.out.print(luan[i]+" ");
    }


		System.out.println("=============0");
		print(30);
}

    private static  void swapVal(int [] luan,int min, int j){
        int temp=luan[j];
        luan[j]=luan[min];
        luan[min]=temp;

    }

    public static void print(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print(   (num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }
}
