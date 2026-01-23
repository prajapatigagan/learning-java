public class Example_recursion02 {
    //print x^n(stack hight=n)
//    public static int gagan(int x,int n){
//        if (n==0) {
//            return 1;
//        } if (x==0) {
//            return 0;
//        }
//        int xpownm1=gagan(x,n-1);
//        int xpow=x*xpownm1;
//        return xpow;
//    }
//
//    public static void main(String[] args) {
//        int n=5;
//        int x=2;
//        int ans=gagan(x,n);
//        System.out.println(ans);
//    }

    //print x^n(stack hight=logn))
    public static int gagan(int x,int n){
        if (n==0) {
            return 1;
        } if (x==0) {
            return 0;
        }
        //n in even..
        if(n%2==0){
            return gagan(x,n/2)*gagan(x,n/2);
        }
//        n iss odd..
        else{
            return gagan(x,n/2)*gagan(x,n/2)*x;
        }
    }
    public static void main(String[] args) {
        int n=5;
        int x=2;
        int ans=gagan(x,n);
        System.out.println(ans);
    }
}
