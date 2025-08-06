package Ex3;

import java.util.Arrays;
import java.util.Scanner;

public class addArray {
    public static void main(String[] args) {
        int size1, size2;
        int[] array1, array2,array3;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhập số phần tử mảng thứ nhất: ");
            size1 = Integer.parseInt(sc.nextLine());
            if(size1 > 20){
                System.out.println("Mảng không quá 20 phần tử");
            }
        }while(size1 > 20);
        array1 = new int[size1];
        for(int i = 0; i< array1.length; i++ ){
            System.out.println("Phần tử thứ "+ (i+1));
            array1[i] = Integer.parseInt(sc.nextLine());
        }
        do{
            System.out.println("Nhập số phần tử mảng thứ hai: ");
            size2 = Integer.parseInt(sc.nextLine());
            if(size2 > 20){
                System.out.println("Mảng không quá 20 phần tử");
            }
        }while(size2 > 20);
        array2 = new int[size2];
        for(int i = 0; i< array2.length; i++ ){
            System.out.println("Phần tử thứ "+ (i+1));
            array2[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Mảng 1: "+ Arrays.toString(array1));
        System.out.println("Mảng 2: "+ Arrays.toString(array2));
        array3 = addArray(array1,array2);
        System.out.println("Mảng sau khi gộp: "+Arrays.toString(array3));
    }
    public static int[] addArray(int[] array1, int[] array2){
        int index = array1.length ;
        int[] newArray =new int[array1.length+array2.length];
        for(int i = 0; i< array1.length; i++ ){
            newArray[i] = array1[i];
        }
        for(int i = 0; i< array2.length; i++ ){
            newArray[index] = array2[i];
            index++;
        }
        return newArray;
    }
}
