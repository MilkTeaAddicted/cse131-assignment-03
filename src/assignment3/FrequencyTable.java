package assignment3;

import java.util.Random;
import java.util.Scanner;
//引入random包生成随机数
//生成介于 1 和 where 之间的整数个数,同时计算频率
public class FrequencyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maximum value for random number generation:");
        int max = scanner.nextInt();

        int[] frequencyTable = new int[max]; // 创建一个数组来存储频率表

        Random random = new Random();

        System.out.println("Frequencies for 100 randomly generated values between 1 and " + max);

        // 生成随机数并更新频率表
        for (int i = 0; i < 100; i++) {
            int randomNumber = random.nextInt(max) + 1; // 生成1到max之间的随机数
            frequencyTable[randomNumber - 1]++; // 更新对应数字的频率
        }

        // 打印频率表
        for (int i = 0; i < max; i++) {
            System.out.println((i + 1) + ": " + frequencyTable[i]);
        }

        scanner.close();
    }
}

