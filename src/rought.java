import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class rought {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<int []> arr = new ArrayList<>();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int j = 0;

        for(int i = 0;i<n;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(j<k){
                if(i+1==a || i+1==b) {
                    arr.add(new int[]{x, y, 1, 1});
                }else{
                    arr.add(new int[]{x, y, 1, 0});
                }
                j++;
            }else{
                if(i+1==a || i+1==b) {
                    arr.add(new int[]{x, y, 0, 1});
                }else{
                    arr.add(new int[]{x, y, 0, 0});
                }
            }
        }
        arr.sort(Comparator.comparingInt(array->Math.abs(array[0]) + Math.abs(array[1])));
        for (int[] ints : arr) {
            System.out.print(ints[0] + " ");
            System.out.print( ints[1] + " ");
            System.out.print( ints[2] + " ");
            System.out.print( ints[3] + " ");
            System.out.println();
        }
        System.out.println("------------");
        arr.sort(Comparator.comparingInt(array->array[2]));
        for (int[] ints : arr) {
            System.out.print( ints[0] + " ");
            System.out.print( ints[1] + " ");
            System.out.print(ints[2] + " ");
            System.out.print(ints[3] + " ");
            System.out.println();
        }
    }
}
