package assignment3;

import java.util.Random;
import java.util.Scanner;

public class SymmetricalImage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (n): ");
        int n = scanner.nextInt();

        System.out.print("Enter the number of columns (m): ");
        int m = scanner.nextInt();

        char[][] image = new char[n][m]; // 创建一个二维数组来存储图像

        Random random = new Random();

        // 生成随机点及其镜像点
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m / 2; j++) {
                // 随机决定当前位置是否放置 '*'
                if (random.nextDouble() < 0.5) {
                    // 控制放置 '*' 的概率，使用随机的random生成导致*的概率出现的很低
                    //所以特地进行了概率的调整
                    int randomRow = i;
                    int randomCol = j;

                    // 计算镜像点的位置
                    int mirroredRow = randomRow;
                    int mirroredCol = m - 1 - randomCol;

                    // 在图像中标记随机点及其镜像点
                    image[randomRow][randomCol] = '*';
                    image[mirroredRow][mirroredCol] = '*';
                }
            }
        }

        // 调用打印函数的方法
        System.out.println("A randomly generated, symmetrical " + n + " x " + m + " image:");
        printImage(image);

        scanner.close();
    }

    // 打印图像
    public static void printImage(char[][] image) {
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if (image[i][j] == '*') {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // 每打印完一行后换行
        }
    }
}




