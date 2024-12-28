package HW;
/*
题目内容：（5分）
你的程序要求从一个系列正整数数据流中，输入一个整数序列，一个整数序列后跟一个负数。程序的输出要列出的数据中的最大和最小的个数。

输入格式:
一个系列正整数，整数的范围是 (0,100000) 。如果输入为 -1 则表示输入结束。

输出格式:
两个整数，第一个整数表示该序列输入整数中的最大的个数，第二个整数表示该序列输入整数中的最小的个数。两个整数之间以空格分隔。

输入样例:
934257-1

输出样例:
42
*/

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        int countEven = 0;
        int countOdd = 0;

        while (num != -1){
            if(isEven(num)){
                countEven++;
            }else{
                countOdd++;
            }
            num = sc.nextInt();
        }

        System.out.println(countOdd + " " + countEven);
        sc.close();
    }

    public static boolean isEven(int num){
//        if(num % 2 == 0){
//            return true;
//        }else{
//            return false;
//        }
        // we can simplify the above as follows
        return num % 2 == 0;
    }
}
