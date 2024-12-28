
package HW;

/*
题目名称：温度转换（5分）

题目内容：
写一个将华氏温度转换成摄氏温度的程序。转换的公式是:
°F = (9/5)*°C + 32
其中C表示摄氏度，F表示华氏温度。
程序的输入是一个整数，表示华氏温度。输出对应的摄氏温度，也是一个整数。
提示，为了把计算结果的浮点数转换成整数，需要使用下面的表达式:
(int)x;
其中x是要转换的浮点数值。

注意：除了温度变换的算法，不需编写任何其他程序。比如输入和输出程序。当出现的程序需要编写输入输出。这样做是为了让程序的测试更简单，程序只需要编写计算部分的函数，程序只需要调用这个函数，然后为这个函数传递所需的参数。

输入格式:
一个整数。

输出格式:
一个整数。

输入样例:
        100

输出样例:
        37

时间限制: 500ms	内存限制: 32000kb
*/

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        System.out.println("Please enter an F: ");
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int c = convert(f);
        System.out.println("The converted C is: \n" + c);
        sc.close();
    }
    public static int convert(int f) {
        return (int)((f-32)*5/9.0);
    }
}
