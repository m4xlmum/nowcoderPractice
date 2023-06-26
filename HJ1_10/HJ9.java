package HJ1_10;

import java.util.Scanner;

public class HJ9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 输出内容
        StringBuilder sb = new StringBuilder(scanner.nextLine()).reverse();
        // 存放结果
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            if (sb.indexOf(String.valueOf(sb.charAt(i))) == i) {  // charAt()为第一次出现位置，此时说明不重复
                ans.append(sb.charAt(i));
            }
        }
        // 输出结果
        System.out.println(ans.toString());
    }
}
