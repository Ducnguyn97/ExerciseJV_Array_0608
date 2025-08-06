package Ex9;

import java.util.Arrays;
import java.util.Scanner;

public class countChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi:");
        String str = scanner.nextLine();
        String[] array = str.split("");
        System.out.println("Mảng: " + Arrays.toString(array));
        System.out.println("Nhập ký tự muốn đếm ");
        String ch = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(ch)) {
                count++;
            }
        }
        System.out.println("Ký tự " + ch + " xuất hiện " + count + " lần.");
    }
}
