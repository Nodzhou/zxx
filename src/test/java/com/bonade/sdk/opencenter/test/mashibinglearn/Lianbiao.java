package com.bonade.sdk.opencenter.test.mashibinglearn;

import javax.sound.midi.Soundbank;

/**
 * Copyright© 2020.10.20 by 博纳德集团有限公司.All rights reserved.
 * 1.版权归博纳德集团公司所有；
 * 2.未经原作者允许不得转载本代码内容，否则将视为侵权；
 * 3.对于不遵守此声明或者其他违法使用本代码内容者，本公司依法保留追究权。.
 * <b>Description:</b><br>
 *
 * @author nod
 * <b>ProjectName:</b> open-center-sdk
 * <br><b>PackageName:</b> com.bonade.sdk.opencenter.test.mashibinglearn
 * <br><b>ClassName:</b>
 * <br><b>Date:</b> 2022/9/24 15:26
 */
public class Lianbiao {

    public static void main(String[] args) {
        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(3);
       n1.next=n2;
       n2.next=n3;
//
//       while (n1!=null){
//           System.out.print(n1.vale+" ");
//              n1 =n1.next;
//       }
        n1=fanxulie(n1);
        System.out.println("=============getOnde.val"+n1.vale);

        while (n1!=null){
            System.out.print(n1.vale+" ");
            n1 =n1.next;
        }
    }

    private static Node fanxulie(Node head){
        // 1->2->3  : 1 为 head; 2 为1的 next, null 为 1 的 pre;
        // 变为如下:
        // 1<-2<-3
        Node pre=null;
        Node next=null;
        while (head!=null){
               next= head.next;
               head.next=pre;
                  pre=head;
                  head=next;

        }
     return pre;

    }

    private static DoubleNode fanHuangxulie(DoubleNode doubleNode){
        // 1->2->3  : 1 为 head; 2 为1的 next, null 为 1 的 pre;
        // 1<-2<-3


        // 变为如下:
        // 3->2->1  :
        // 3<-2<-1
       //DoubleNode pre
    return  null;
    }


}
