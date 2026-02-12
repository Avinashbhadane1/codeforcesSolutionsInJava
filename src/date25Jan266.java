import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class date25Jan266 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            int ax = scanner.nextInt();
            int ay = scanner.nextInt();
            int bx = scanner.nextInt();
            int by = scanner.nextInt();
            int [] xCord = new int[n];
            int [] yCord = new int[n];
            ArrayList<int []> cord = new ArrayList<>();
            long time = 0;
            for(int i = 0;i<n;i++){
                xCord[i] = scanner.nextInt();
            }
            for(int i = 0;i<n;i++){
                yCord[i] = scanner.nextInt();
            }
            for(int i = 0;i<n;i++){
                cord.add(new int[]{xCord[i],yCord[i]});
            }
            cord.sort(Comparator.comparingInt(array->array[0]));
            int lastX = cord.getFirst()[0];
            long minInThat = Integer.MAX_VALUE;
            long maxInThat = -1;
            for(int i =0;i<n;i++){
                if(lastX == cord.get(i)[0]){
                    maxInThat = Math.max(maxInThat,cord.get(i)[1]);
                    minInThat = Math.min(minInThat,cord.get(i)[1]);
                }else{
                    time += cord.get(i)[0] - lastX;
                    lastX = cord.get(i)[0];
                    time += 2*(maxInThat-minInThat);
                    minInThat = Integer.MAX_VALUE;
                    maxInThat = -1;
                }
            }
            time += cord.getFirst()[0]-ax;
            time += Math.abs(cord.getFirst()[1]-ay);
            System.out.println(time);
        }
        scanner.close();
    }
}
