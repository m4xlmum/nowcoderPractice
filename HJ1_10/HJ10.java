package HJ1_10;

import java.util.HashSet;
import java.util.Scanner;

// 字符个数统计
public class HJ10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 创建hashset
        HashSet ans = new HashSet();
        String str = scanner.nextLine();
        while (!str.equals("")) {
            ans.add(str.substring(0, 1));  // 加入set
            str = str.substring(1);
        }
        // 输出结果
        System.out.println(ans.size());
    }
}
