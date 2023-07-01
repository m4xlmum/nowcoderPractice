package HJ11_20;

import java.util.Scanner;

// 数字颠倒
public class HJ11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        // 构造StringBuilder
        StringBuilder ans = new StringBuilder(str).reverse();  // 逆序
        System.out.println(ans);  // 输出结果
    }
}
