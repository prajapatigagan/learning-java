public class Recursion_Example {

//    //numbers from 5 to 1....
//   public static void gagan(int n){
//       if (n == 0) {
//           return;
//       }
//       System.out.println(n);
//       gagan(n-2);
//   }
//
//    public static void main(String[] args) {
//       int n=9;
//        gagan(n);
//    }
//      //numbers from 1 to 5....
//  public static void gagan(int n){
//    if (n == 9) {
//        return;
//    }
//    System.out.println(n);
//    gagan(n+1);
//}
//
//    public static void main(String[] args) {
//        int n=1;
//        gagan(n);
//    }

//    //print sum of n natural number....
//    public static void gagan(int n,int sum){
//        if (n == 10) {
//            sum+=n;
//            System.out.println(sum);
//            return ;
//
//        }
//
//        sum+=n;
//        System.out.println(n);
//        gagan(n+1,sum);
//
//    }
//
//    public static void main(String[] args) {
//        int n=1;
//        gagan(n,0);
//    }
//print sum of n fectorial number....
public static int gagan(int n){
    if (n == 1||n==0) {
        return 1;

    }

   return gagan(n-1)*gagan(n-2);

}

    public static void main(String[] args) {
        int n=5;
        int ans=gagan(n);
        System.out.println(ans);
    }
}
