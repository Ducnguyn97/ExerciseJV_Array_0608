package Ex1;

import java.util.Arrays;
import java.util.Scanner;
public class deleteValue {
    public static void main(String[] args) {
        int size;
        int array[];
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Nhập số phần tử của mảng: ");
            size = Integer.parseInt(scanner.nextLine());
            if(size > 20){
                System.out.println("Mảng không quá 20 phần tử");
            }
        }while(size>20);
        array = new int[size];
        for(int i=0;i<array.length;i++){
            System.out.println("phần tử thứ "+ (i+1));
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng: "+ Arrays.toString(array));
        array = deleteValue(array);
        System.out.println("Mảng sau xóa phần tử " + Arrays.toString(array));
    }
    public static int[] deleteValue(int[] array){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhâp giá trị muốn xóa: ");
        int x = Integer.parseInt(scanner.nextLine());
        int[] newArray = new int[array.length-1];
        int index_del = -1;
        for(int i=0;i<array.length;i++){
            if(array[i] == x){
                index_del = i;
                break;
            }
        }
        for(int i = 0; i < index_del; i++){
            newArray[i] = array[i];
        }
        for(int j = index_del;j<newArray.length ;j++){
            newArray[j] = array[j+1];
        }
        return newArray;
    }
}

