package HJ1_10;

import java.util.Scanner;
import java.util.TreeMap;

public class HJ8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 创建存储数据的TreeMap，按key大小升序排序
        TreeMap<Integer, Integer> ans = new TreeMap<>();
        // 接收键值对个数n
        int n = scanner.nextInt();
        int k, v;
        for (int i = 0; i < n; i++) {
            k = scanner.nextInt();
            v = scanner.nextInt();
            if (ans.containsKey(k)) {
                v += ans.get(k);  // 若已经包含则做加法，更新
            }
            ans.put(k, v);
        }
        // 输出
        for (Integer key : ans.keySet()) {
            System.out.println(key + " " + ans.get(key));
        }
    }
}
