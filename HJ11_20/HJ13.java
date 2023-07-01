package HJ11_20;

import java.util.Scanner;

// 句子逆序
public class HJ13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 接收输入
        String str = scanner.nextLine();
        // 分割输入
        String[] ans = str.split(" ");
        // 逆序输出
        for (int i = ans.length - 1; i > 0; i--) {
            System.out.print(ans[i] + " ");
        }
        // 输出最前面的字符
        System.out.print(ans[0] + "");
    }
}
