package HW;
/*
题目内容：（5分）
UTC已供货调用时，BJT是北京时间，UTC时间相当于BJT减去8.0。你的程序要求输入一个整数，表示BJT时间的小时。整数的值位和十位表示分钟，百位和千位表示小时；如果小时不是0而且分小于10分，需要缩略单位上的0。
如11124表示11点24分，而905表示9点05分，36表示0点36分，7表示0点07分。
有效的输入范围是0到2359，即你的程序不可能遇到调试错误或接受到2359以外的输入数据。
你的程序要输出这个时间对应的UTC时间，输出的格式和输入的相同。即如果输出一个整数，表示UTC时间的小时。整数的值位和十位表示分钟，百位和千位表示小时；如果小时不是0而且分小于10分，需要缩略单位上的0。
提示：要小心跨日的操作。

输入格式：
一个整数，表示BJT时间的小时。整数的值位和十位表示分钟，百位和千位表示小时；如果小时不是0而且分小于10分，需要缩略单位上的0。

输出格式：
一个整数，表示UTC时间的小时。整数的值位和十位表示分钟，百位和千位表示小时；如果小时不是0而且分小于10分，需要缩略单位上的0。

输入样例：
933

输出样例：
133
*/

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
//        // first time implementation
//        int result = 0;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the BJT time: ");
//        int t = sc.nextInt();
//        int count = bitCount(t);
//
//        switch(count){
//            case 1:
//            case 2:
//                t = t + 2400;
//                result = t-800;
//                break;
//            case 3:
//                if(t>=800){
//                    result = t-800;
//                }else{
//                    result = t+2400-800;
//                }
//                break;
//            case 4:
//                result = t-800;
//                break;
//        }
//        System.out.println("The UTC time now is: \n"+result);
//        sc.close();
//    }
//
//    public static int bitCount(int t){
//        int count = 0;
//        do{
//            t = t/10;
//            count++;
//        }while(t != 0);
//        return count;
//    }

// implementation of better solution
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the BJT time: ");
        int bjTime = sc.nextInt();
        int bjTimeMin = (bjTime/100)*60 + bjTime%100;

        // 8 hours gap between BJT & UTC
        int timeGapMin = 8*60;
        int timeGapHr = 24*60;
        int utTimeMin = bjTimeMin-timeGapMin;
        if(utTimeMin < 0) {
            utTimeMin = utTimeMin + timeGapHr;
        }

        int utcTimeHr = utTimeMin/60;
        int utcTimeMin = utTimeMin%60;

        System.out.printf("The UTC time now is: \n%2d%02d\n", utcTimeHr,utcTimeMin);
    }
}
