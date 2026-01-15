import java.util.*;

public class Bits {
    public static void main(String[] args) {
//        int n=5;
//        int pos=3;
//        int bit_mask=1<<pos;


//        get operation(&)
//        if((bit_mask & n)==0){
//            System.out.println("bit was zero");
//        }else{
//            System.out.println("bit was one");
//        }

//        int n=5;
//        int pos=1;
//        int bit_mask=1<<pos;
//
//        //set operation(|)
//       int newNumber=bit_mask|n;
//        System.out.println(newNumber);


//        int n=5;
//        int pos=2;
//        int bit_mask=1<<pos;
//        int notbitmask=~(bit_mask);
//
//        //clear bit operation(|)
//        int newNumber=notbitmask & n;
//        System.out.println(newNumber);

        Scanner sc=new Scanner(System.in);
        int oper=sc.nextInt();
        //oper=1: set oper=0; clear
        int n=5;//0101-->0111-->dec 7
        int pos=1;

        int bitmask=1<<pos;
        if (oper==1) {
            //set operation(|)
            int new_number =bitmask | n;
            System.out.println(new_number);
        }
        else {
            //clesr
            int newbitmask=~(bitmask);
            int new_number=bitmask & n;
            System.out.println(new_number);
        }
    }
}
