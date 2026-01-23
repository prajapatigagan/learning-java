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
//    public static int gagan(int x,int n){
//        if (n==0) {
//            return 1;
//        } if (x==0) {
//            return 0;
//        }
//        //n in even..
//        if(n%2==0){
//            return gagan(x,n/2)*gagan(x,n/2);
//        }
////        n iss odd..
//        else{
//            return gagan(x,n/2)*gagan(x,n/2)*x;
//        }
//    }
//    public static void main(String[] args) {
//        int n=5;
//        int x=2;
//        int ans=gagan(x,n);
//        System.out.println(ans);
//    }

    //tower of hinoi...
//public static void tower_of_hanoi(int n, String scr, String helper, String dest){
//    if(n==0){
//        System.out.println("transfer disk "+n+" from "+scr+" to "+dest);
//        return;
//    }
//    tower_of_hanoi(n-1,scr,dest,helper);
//    System.out.println("transfer disk "+n+" from "+scr+" to "+dest);
//    tower_of_hanoi(n-1,helper,scr,dest);
//}
//public static void main(String[] args) {
//    int n=3;
//    tower_of_hanoi(n,"S","H","D");
//}

    //print string reverse...
//    public static void revstring(String str,int idx){
//        if(idx==0){
//            System.out.println(str.charAt(idx));
//            return;
//        }
//        System.out.print(str.charAt(idx));
//        revstring(str, idx-1);
//    }
//    public static void main(String[] args) {
//        String str="gagan";
//        revstring(str,str.length()-1);
//    }

//find the 1st and last occurance of an element in string
public static void revstring(String str,int idx){
    if(idx==0){
        System.out.println(str.charAt(idx));
        return;
    }
    System.out.print(str.charAt(idx));
    revstring(str, idx-1);
}
    public static void main(String[] args) {
        String str="gagan";
        revstring(str,str.length()-1);
    }
}
