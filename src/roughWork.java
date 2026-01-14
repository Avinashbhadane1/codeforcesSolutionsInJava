public class roughWork {
//    public static String shift(String s ){
//        StringBuilder builder = new StringBuilder();
//        for(int i = 0;i<s.length();i++){
//            char c = s.charAt(i);
//            char newC = (char) ((c -'a' +25 )%26 + 'a');
//            builder.append(newC);
//        }
//        return builder.toString();
//    }
//    public static void main(String[] args) {
////        String s= "aabb";
////        s = shift(s);
////        System.out.println(s);
//        StringBuilder b = new StringBuilder();
//        b.append("hello");
//        b.append(2);
//        b.append(1);
//        int x = Integer.parseInt(String.valueOf(b.toString().charAt(b.length()-1))) + 1;
//        b.append(x);
//        System.out.println(b);
//    }
public static void main(String[] args) {
    String name = "00215";
    String a = "hello";
    name  = a+name;
    System.out.println(name+a);
}
}
