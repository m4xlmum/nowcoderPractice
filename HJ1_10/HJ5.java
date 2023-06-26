package HJ1_10;

import java.util.Scanner;

// 进制转换
public class HJ5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 获取十六进制整数
        String Hex_int = scanner.next();
        // 去掉前面的0X
        Hex_int = Hex_int.substring(2);
        // 获取十进制整数
        int Dec_int = Integer.parseInt(Hex_int, 16);
        // 输出结果
        System.out.println(Dec_int);
    }
}
