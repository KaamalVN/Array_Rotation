import java.util.Arrays;
import java.util.Scanner;

public class Array_Rotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size= scanner.nextInt();
        int[] array = new int[size];
        for(int iterator=0;iterator<size;iterator++){
            array[iterator]=scanner.nextInt();
        }
        int b= scanner.nextInt();
        int k=b;
        array_rotation(array,0,size-1);

            array_rotation(array, 0, b - 1);
            array_rotation(array, b, size - 1);

        System.out.println(Arrays.toString(array));
    }

    static int[] array_rotation(int[] array, int b, int c) {
        int temp=0;
        while(b<c){
            temp=array[b];
            array[b]=array[c];
            array[c]=temp;
            b++;
            c--;
        }
        return array;
    }
}
