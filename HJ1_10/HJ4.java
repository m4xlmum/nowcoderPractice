package HJ1_10;

import java.util.Scanner;

// 字符串分隔
public class HJ4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 一直获取字符串
        while (scanner.hasNext()) {
            // 获取当次字符串
            String str = scanner.nextLine();
            // 创建StringBuilder
            StringBuilder sb = new StringBuilder();
            // 补全需要输出的字符串内容
            sb.append(str);
            int addZeroSize = 8 - str.length() % 8;
            if (addZeroSize < 8) {
                for (int i = 0; i < addZeroSize; i++) {
                    sb.append("0");
                }
            }
            // 转回字符串
            String str2 = sb.toString();
            // 输出结果
            while (str2.length() != 0){
                // 输出结果
                System.out.println(str2.substring(0, 8));
                // 更新余下
                str2 = str2.substring(8);
            }
        }
    }
}
