package HW;
/*
 题干信息 (55分)
 题目内容：
 你的程序需要读入一行文本，其中以空格分隔为若干个单词，以'.'结束。这里的单词语言无关，可以包括各种符号，
 比如"it's一个单词，长度为4。注意，行内可能出现连续的空格。

 输入格式：
 输入在一行中给出一行文本，以'.'结束，结尾的句号不能计算在最后一个单词的长度内。

 输出格式：
 在一行中输出这行文本对应的单词的长度，每个长度之间以空格分隔，行末没有最后的空格。

 输入样例：
 It's great to see you here.

 输出样例：
 4 5 2 3 3 4
*/

import java.util.ArrayList;
import java.util.Scanner;

public class HW6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // remove blanks before and after the sentence.
        String input = sc.nextLine().trim();

        if(input.endsWith(".")){
            // substring(int beginIndex, int endIndex):
            // This is a string method that returns a substring of a string.
            // beginIndex is the index where the substring starts (inclusive),
            // and endIndex is the index where the substring ends (exclusive)
            // here we can use this to exclude the end "."
            input = input.substring(0, input.length()-1);
        }

        String[] words = input.split("\\s+");

        ArrayList<Integer> counters = new ArrayList<>();

        for(String word : words){
            counters.add(word.length());
        }

        StringBuilder result = new StringBuilder();
        result.append(counters.get(0));
        for(int i = 1; i< counters.size(); i++){
            result.append(" ").append(counters.get(i));
        }
        System.out.println(result);
        sc.close();
    }
}
