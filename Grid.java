import java.util.*;
import java.util.random.*;
public class Grid{
    private static void enter(int a, int b, int[][] arr){
        if(a > arr.length - 1 || b > arr[0].length - 1){
            System.out.println("Not Possible");
        }else{
            arr[a][b] = 1;
        }
    }
    private static void opt(int[][] arr){
        boolean door = false;
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                if(arr[i][j] == 1){
                    for(int k = 0;k<arr[0].length;k++){
                        if(arr[i][k] == 1){
                            door = true;
                            continue;
                        }
                        door = false;
                        break;
                    }
                    if(door){
                        for(int k = 0;k<arr[0].length;k++){
                            arr[i][k] = -1;
                        }
                    }
                }
            }
        }
    }
    private static void pp(int[][] arr){
        boolean door = false;
        int pos = arr.length - 1;
        for(int i = pos; i >= 0;i--){
            for(int j = arr.length - 1; j >= 0;j--){
                if(arr[i][j] == -1){
                    door = true;
                }
                if(door){
                    if(i - 1 >= 0){
                        int swap = arr[i][j];
                        arr[i][j] = arr[i-1][j];
                        arr[i-1][j] = swap;
                        continue;
                    }
                }
            }
        }
    }
    private static void print(int[][] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                if(arr[i][j] == -1){
                    System.out.print("-" + " ");
                }else{
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Random rans = new Random();
    int[][] arr = new int[5][5];
    for(int i = 0;i<arr.length;i++){
        for(int j = 0;j<arr[0].length;j++){
            arr[i][j] = rans.nextInt(9);
        }
    }
    System.out.println("Grid Manipulation Game!");
    print(arr);
    while(true){
        System.out.println("Enter: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        enter(a, b, arr);
        opt(arr);
        pp(arr);
        print(arr);
    }
}
}