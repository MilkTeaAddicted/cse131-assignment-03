package assignment3;


import java.util.Scanner;
//冒泡排序实现
public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        输入array的大小
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Given values:");
        // 使用冒泡排序算法前我们的输入
        printArray(array);

        bubbleSort(array);

        //冒泡排序算法后
        System.out.println("Sorted values:");
        printArray(array);

        scanner.close();
    }

    // 冒泡排序算法实现的函数
    public static void bubbleSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // 交换 array[j] 和 array[j+1] 的值
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    // 输出数组的工具方法
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
