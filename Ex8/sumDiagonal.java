package Ex8;

import java.util.Arrays;
import java.util.Scanner;

public class sumDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int colum, row;
        do {
            System.out.println("Nhập vào số cột: ");
            colum = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập vào số hàng");
            row = Integer.parseInt(scanner.nextLine());
            if (row != colum) {
                System.out.println("hàng và cột không phải bằng nhau: ");
            }
        } while (row != colum);

        int[][] matrix = new int[row][colum];

        for (int i = 0; i < row; i++) {
            System.out.println("Phần tử hàng thứ: " + (i + 1));
            for (int j = 0; j < colum; j++) {
                System.out.println("Phần tử thứ " + (j + 1) + " hàng " + (i + 1));
                matrix[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("Mảng: " + Arrays.deepToString(matrix));
        int sum1 = 0;
        for (int i = 0; i < row; i++) {
            sum1 += matrix[i][i];
        }
        System.out.println("Tổng các phần tử chéo chính: " + sum1);
        int sum2 = 0;
        for (int i = 0; i < row; i++) {
            sum2 += matrix[i][row - 1 - i];
        }
        System.out.println("Tổng các phần tử chéo phụ: " + sum2);
    }

}