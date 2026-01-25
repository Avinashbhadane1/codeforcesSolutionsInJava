import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class cf1495A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            List<Long> minersMod = new ArrayList<>();
            List<Long> diamondsMod = new ArrayList<>();
            for (int i = 0;i<2*n;i++){
                long x = scanner.nextLong();
                long y = scanner.nextLong();
                if(x==0){
                    minersMod.add(Math.abs(y));
                }else if(y==0){
                    diamondsMod.add(Math.abs(x));
                }
            }
            minersMod = minersMod.stream().sorted().toList();
            diamondsMod = diamondsMod.stream().sorted().toList();

            double energy = 0;
            for (int i = 0; i < diamondsMod.size(); i++) {
                energy += Math.sqrt(
                        minersMod.get(i) * minersMod.get(i) +
                                diamondsMod.get(i) * diamondsMod.get(i)
                );
            }

            System.out.println(energy);
        }
        scanner.close();
    }
}
