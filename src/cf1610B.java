import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class cf1610B {
    public static boolean checkP(ArrayList<Long> num){
        boolean is = true;
        int left = 0;
        int right = num.size()-1;
        while(left<right){
            if(!Objects.equals(num.get(left), num.get(right))){
                is = false;
                break;
            }
            left++;
            right--;
        }
        return is;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            long [] array = new long[n];
            ArrayList<Long> num = new ArrayList<>();
            for(int i = 0;i<n;i++){
                array[i] = scanner.nextLong();
            }
            boolean leftRemoval;
            boolean rightRemoval;
            int indexL = -1;
            int indexR = -1;
            int left = 0;
            int right = n-1;
            while(left<right){
                if(array[left] != array[right]){
                   indexR = right;
                   indexL = left;
                   break;
                }

                left++;
                right--;
            }
            if(indexR != -1){
                for(int i = 0;i<n;i++){
                    if(array[i]!=array[indexL]){
                        num.add(array[i]);
                    }
                }
                leftRemoval = checkP(num);
                if(!leftRemoval){
                    num.clear();
                    for(int i = 0;i<n;i++){
                        if(array[i]!=array[indexR]){
                            num.add(array[i]);
                        }
                    }
                    rightRemoval = checkP(num);
                    if(rightRemoval){
                        System.out.println("YES");
                    }else{
                        System.out.println("NO");
                    }
                }else{
                    System.out.println("YES");
                }
            }else{
                System.out.println("YES");
            }
        }
        scanner.close();
    }
}
