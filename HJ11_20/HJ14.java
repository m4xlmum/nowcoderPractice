package HJ11_20;

import java.util.Arrays;
import java.util.Scanner;

//  字符串排序
public class HJ14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 获取输入数量
        int n = scanner.nextInt();
        // 存储字符串
        String[] strs = new String[n];
        // 获取字符串
        for (int i = 0; i < n; i++) {
            strs[i] = scanner.next();  // 若是使用nextLine会出现第一个字符串无法被读取的状况。
        }
        Arrays.sort(strs);  // 数组排序函数
        for (String str: strs) {
            System.out.println(str);
        }
    }
}
