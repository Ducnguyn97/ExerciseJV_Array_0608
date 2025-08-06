package Ex2;

import java.util.Arrays;
import java.util.Scanner;

public class addValue {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            size = Integer.parseInt(scanner.nextLine());
            if(size > 20){
                System.out.println("Mảng không quá 20 phân tử");
            }
        }while(size>20);
        array = new int[size];
        for(int i=0;i<array.length;i++){
            System.out.println("Phần tử thứ "+ (i+1));
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng: " + Arrays.toString(array));
        array = addValue(array);
        System.out.println("Mảng sau khi thêm phần tử: " +  Arrays.toString(array));
    }
    public static int[] addValue(int[] array){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào phần tử muốn thêm: ");
        int x = Integer.parseInt(scanner.nextLine());
        int[] newArray = new int[array.length+1];
        int index_add;
        do{
            System.out.println("Nhập vào vị trí muốn thêm(từ 0 đến " +(array.length)+" ): ");
            index_add =  Integer.parseInt(scanner.nextLine());
            if(index_add < 0 || index_add > array.length){
                System.out.println("Không chèn được phần tử vào mảng");
            }
        }while(index_add < 0  || index_add >array.length );
        for(int i = 0; i< array.length; i++ ){
            newArray[i] = array[i];
        }
        newArray[index_add] = x;
        for(int i=index_add;i<array.length;i++){
            newArray[i+1] = array[i];
        }
        return newArray;
    }
}
