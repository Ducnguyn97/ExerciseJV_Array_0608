package Ex6;

import java.util.Arrays;
import java.util.Scanner;

public class countStudent {
    public static void main(String[] args) {
        int size;
        int array[];
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập số sinh viên: ");
            size = Integer.parseInt(scanner.nextLine());
            if (size > 30) {
                System.out.println("không quá 30 sinh viên");
            }
        } while (size > 30);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Sinh viên thứ " + (i + 1) + " có điểm số: ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Danh sách sinh viên: " + Arrays.toString(array));
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 5 && array[i] <= 10) {
                count++;
            }
        }
        System.out.println("Số sinh viên qua môn: " + count);
    }
}
