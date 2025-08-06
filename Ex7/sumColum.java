package Ex7;

import java.util.Arrays;
import java.util.Scanner;

public class sumColum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int colum, row;
        do {
            System.out.println("Nhập vào số cột: ");
            colum = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập vào số hàng");
            row = Integer.parseInt(scanner.nextLine());
            if (row > 5 || colum > 5) {
                System.out.println("hàng và cột không lớn hơn 5: ");
            }
        } while (row > 5 || colum > 5);

        int[][] matrix = new int[row][colum];

        for (int i = 0; i < row; i++) {
            System.out.println("Phần tử hàng thứ: " + (i + 1));
            for (int j = 0; j < colum; j++) {
                System.out.println("Phần tử thứ " + (j + 1) + " hàng " + (i + 1));
                matrix[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("Mảng: " + Arrays.deepToString(matrix));
        System.out.println("Nhập vào cột tính tổng(từ 0 tới " + (colum - 1) + "): ");
        int c = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < row; i++) {
            sum += matrix[i][c];
        }
        System.out.println("Tổng phần tử cột " + c + " : " + sum);
    }
}
