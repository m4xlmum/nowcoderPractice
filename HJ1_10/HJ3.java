package HJ1_10;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

// 明明的随机数
public class HJ3 {
    public static void main(String[] args) {
        // 创建接收器
        Scanner sc = new Scanner(System.in);
        // 获取个数
        int n = sc.nextInt();
        //创建TreeSet，可以进行去重排序
        TreeSet set = new TreeSet();

        // 获取数据
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }
        // 输出结果
        Iterator itSet = set.iterator();
        while (itSet.hasNext()) {
            System.out.println(itSet.next());
        }
    }
}