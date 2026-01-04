import java.util.*;

public class cf1614B {
    static class Pair {
        long visits;
        int index;

        Pair(long visits, int index) {
            this.visits = visits;
            this.index = index;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            long [] order = new long[n];
            for(int i = 0;i<n;i++){
                order[i] = scanner.nextLong();
            }
            List<Pair> building = new ArrayList<>();
            for(int i = 0;i<n;i++){
                building.add(new Pair(order[i],i));
            }
            building.sort((p1,p2) -> Long.compare(p2.visits,p1.visits));
            long [] ans = new long[n+1];
            ans[0] = 0;
            long minutes = 0;
            long coordinate = 1;
            for(int i = 0;i<n;i++){
                ans[building.get(i).index + 1] = coordinate;
                minutes += 2*(Math.abs(coordinate)*building.get(i).visits);
                if(coordinate<0){
                    coordinate = Math.abs(coordinate) + 1;
                }else{
                    coordinate *= -1;
                }
            }
            System.out.println(minutes);
            for(long x:ans){
                System.out.print(x + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
