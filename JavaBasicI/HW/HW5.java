package HW;
/*
题目内容：（5分）
要求编程求一个多项式在给定的X值范围与系数矩阵的情况，比如:
2x^6+3x^5+12x^3+6x+20
现在，你的程序要求输入两个多项式，然后输出这两个多项式相乘的结果，输出的多项式的系数相加总和上限。
程序要处理的最高次为100。

输入格式:
输入描述输入两个多项式，每个多项式的输入格式如下:
每行输入两个数字，第一个表示系数，第二个表示该系数的幂级，连续输入直到遇到一行包含0系数的行为止。第一个系数是最高次幂，最后一个一定是0次幂。
注意第一行和最后一行之间不一定按照次幂降低顺序排列；如果某个次幂系数为0，就不出现在输入的系数/幂级中了；0次幂的系数为0的时候还是会出现在输入中。

输出格式:
从最高幂开始依次降低幂级，如:
2x^6+3x^5+12x^3+6x+20
注意处理的次数从最高次，而且所有的幂级应该按照次数，如果某个次幂为0则不需要有那一项。

输入样例:
6 2
5 3
3 12
1 6
0 20
6 2
5 3
2 12
1 6
0 20

输出样例:
4x^6+6x^5+12x^3+12x^2+12x+40
*/

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {

        System.out.print("Enter your first numbers ");
        int[] arrFirst = createArray(101);

        System.out.print("Enter your second numbers ");
        int[] arrSecond = createArray(101);

        int[] arrResult = new int[101];

        for (int i = 0; i < arrResult.length; i++) {
            arrResult[i] = arrFirst[i] + arrSecond[i];
        }

        StringBuilder result = new StringBuilder();
        for(int i = arrResult.length - 1; i >= 0; i--) {
            if(arrResult[i] != 0){
                // check if it's not the first element, if true append + first then append element
                if(result.length() >0) {
                    result.append("+");
                }
                if(i == 0){
                    result.append(arrResult[i]);
                }
                else if(i == 1) {
                    result.append(arrResult[i]).append("x");
                }else{
                    result.append(arrResult[i]).append("x").append(i);
                }
            }
        }

//
//        for (int i = arrResult.length - 1; i > 1; i--) {
//            if(arrResult[i] != 0) {
//                System.out.print(arrResult[i] + "x"+ i + "+");
//            }
//        }
//
//        if(arrResult[1] != 0) {
//            System.out.print(arrResult[1] + "x" + "+");
//        }
//
//        if(arrResult[0] != 0) {
//            System.out.print(arrResult[0]);
//        }
        if(result.length() == 0) {
            System.out.println("0");
        }else{
            System.out.println(result);
        }
    }

    public static int[] createArray(int size){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            int expo = sc.nextInt();
            int cff = sc.nextInt();
            arr[expo] = cff;
            if (expo == 0) {
                break;
            }
        }
        return arr;
    }
}
