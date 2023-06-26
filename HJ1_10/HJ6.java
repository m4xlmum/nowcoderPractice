package HJ1_10;

import java.util.Scanner;

// 质数因子
public class HJ6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        getPrime(scanner.nextInt());
    }

    // 函数用于递归输出质因子
    public static void getPrime(int n) {
        for (int i = 2; i <= Math.floor(Math.sqrt(n)); i++) {
            if (n % i == 0) {
                System.out.print(i + " ");  // 输出此质因子
                getPrime(n / i);  // 递归
                break;
            }

            // 质因子只有1和本身，此时直接输出本身的值
            if (i == Math.floor(Math.sqrt(n))) {
                System.out.print(n + "");
                break;
            }
        }
    }
}
