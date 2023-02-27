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
public class ErfenfafindLearn {

    public static void main(String[] str) {
//      int [] ad={ 1,1,3,5,6,7,9,10,10,13};
//      int [] ad1={ 1,7,7,9,9};
//      int findIndx=findLittleNumRigthIndex(ad1,7);
//        System.out.println("========"+findIndx);

        int timestet=100000;
        int suijiLen=8;
        int suijiMax=18;
        for(int i=0;i<timestet;i++) {
             int [] getsort=suijiArry(suijiLen,suijiMax);
             selectPai(getsort);
//             for(int j=0;j<getsort.length;j++){
//                 System.out.print(getsort[j]+"  ");
//             }
          int g=  (int)(Math.random()* suijiMax);
            System.out.println("===========查找小于等于"+g+"数值的最右位置");
            int index= findLittleNumRigthIndex(getsort,g);
             System.out.println("位置是="+index );
            if(index>=0 && index+1<=getsort.length-1) {
               if( getsort[index+1] <= g ){
                   System.out.println("翻车ttttttt了！");
                   break;
               }

            }
        }
        System.out.println("goodyyyyyyyy!");
    }

    //在一个从小到大的有序数组里，查找小于等于Num数值的最右位置
    private static int findLittleNumRigthIndex(int [] arr,int num){
          if(arr == null || arr.length==0){
              return  -1;
          }if(arr.length ==1){
              return  arr[0]<=num?0:-1;
           }
          //L  R
          int L=0,R=arr.length-1;
          while (L<=R){
              int mid=(L+R)/2;
              //System.out.println("mid"+mid);
              if(arr[mid]<=num){
                  //在右边继续查找
                  L=mid+1;
              }else {
                  R=mid-1;
              }
            //  System.out.println("L= "+L +",,R="+R);
             // break;
          }

          return  R;
    }

    private static void selectPai(int [] luan){
        		for(int i=0;i<luan.length;i++) {
			int minV = i;
			for(int j=i+1;j<luan.length;j++){
				if(luan[minV]>=luan[j]){
					minV=j;
				}
			}
			swapVal(luan,i,minV);

		}

    }

    private static  void swapVal(int [] luan,int min, int j){
        int temp=luan[j];
        luan[j]=luan[min];
        luan[min]=temp;

    }

    private static int[] suijiArry(int lenth,int maxVale){
        int len=((int)(Math.random()* lenth))+1;
        System.out.println("随机len="+len);
         int [] arr=new int[len];
         for(int j=0;j<len;j++){
             arr[j]=(int)(Math.random()*maxVale);
             //System.out.println("随机元素="+arr[j]);
         }
         return arr;
    }
}
