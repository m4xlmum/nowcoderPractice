import java.util.Scanner;

// 计算某字符出现次数
public class HJ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 获取输入字符串
        String str1 = scanner.nextLine();
        // 获取输入字符
        String str2 = scanner.nextLine();
        // 将字符串中的字符替换，使用减法获取出现次数
        int ans = str1.length() - str1.toUpperCase().replaceAll(str2.toUpperCase(), "").length();

        // 输出结果
        System.out.println(ans);
    }
}
