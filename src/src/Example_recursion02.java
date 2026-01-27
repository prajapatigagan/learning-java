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
/// /        n iss odd..
///
/// @return
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
//public static int first=-1;
//public static int last=-1;
//
//public static void find0ccurance(String str,int idx,char element){
//    if(idx==str.length()){
//        System.out.println(first);
//        System.out.println(last);
//        return;
//    }
//
//    char current_char=str.charAt(idx);
//    if(current_char==element){
//     if(first==-1){
//         first=idx;
//     }
//     else{
//         last=idx;
//     }
//    }
//
//    find0ccurance(str,idx+1,element);
//}
//
//    public static void main(String[] args) {
//    String str="ahaarchaaah";
//        find0ccurance(str,0,'a');
//    }

    //check sorted array....
    public static boolean issorted(int arr[], int idx){
    if(arr[idx]==arr.length){
        return true;
    }
        if(arr[idx]<arr[idx+1]){
           return issorted(arr,idx+1);
        }
       else{
           return false;
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        System.out.println(issorted(arr,0));
    }
}
