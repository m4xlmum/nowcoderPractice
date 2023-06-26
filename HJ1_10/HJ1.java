package HJ1_10;

import java.util.Scanner;

// 字符串最后一个单词的长度
public class HJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* 1.使用库函数分割 */
        String s = sc.nextLine();  // 获取输入
        String[] ss = s.split(" ");  // 分割输入内容
        int ans = (ss[ss.length - 1]).length();  // 获取最后单词的长度
        System.out.println(ans);  // 输出结果
    }
}
