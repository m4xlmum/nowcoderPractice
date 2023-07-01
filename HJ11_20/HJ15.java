package HJ11_20;

import java.util.Scanner;

// 求int型正整数在内存中存储时1的个数
public class HJ15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 获取输入的int类型的数值
        int n = scanner.nextInt();
        // 转换为二进制
        String str = Integer.toBinaryString(n);
        // 将0替换为空
        str = str.replace("0", "");
        // 输出结果
        System.out.println(str.length());
    }
}
