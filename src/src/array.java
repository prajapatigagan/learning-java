import java.util.*;

public class array {
    public static void main(String[] args) {
//        int[] marks=new int[3];
//        marks[0]=97;
//        marks [1]=98;
//        marks[2]=99;
//        int marks[]={97,98,95};
//        for (int i=0; i<3; i++){
//            System.out.println(marks[i]);
//        }

//        Scanner sc=new Scanner(System.in);
//        int size=sc.nextInt();
//        int number[]=new int[size];
//
//        for (int i=0; i<size; i++){
//            number[i]= sc.nextInt();
//        }
//
//        for (int i=0; i<size; i++){
//            System.out.println("Numbers:"+number[i]);
//        }

//
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the size");
//        int size=sc.nextInt();
//        int number[]=new int[size];
//
//        System.out.println("enter the value");
//        for (int i=0; i<size; i++){
//            number[i]= sc.nextInt();
//        }
//        System.out.println("enter the searching value");
//        int x=sc.nextInt();
//        for (int i=0; i<number.length; i++){
//            if(number[i]==x){
//                System.out.println("x found of index:"+i);
//            }
//        }


//Take an array of names as input from the user and print them on the screen.
//   Scanner sc=new Scanner(System.in);
//   int size= sc.nextInt();
//   String name[]=new String[size];
//
//   for (int i=0; i<size; i++){
//       name[i]=sc.next();
//   }
//   for (int i=0; i<name.length; i++){
//       System.out.println("name"+(i+1)+"is"+name[i]);
//   }


        //Find the maximum & minimum number in an array of integers.

//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int number[] = new int[size];
//
//        for (int i = 0; i < size; i++) {
//            number[i] = sc.nextInt();
//        }
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//
//        for (int i = 0; i < number.length; i++) {
//            if (number[i] > max) {
//                max = number[i];
//            }
//            if (number[i] < min) {
//                min = number[i];
//            }
//        }
//        System.out.println("Maximum number: " + max);
//        System.out.println("Minimum number: " + min);


//        Take an array of numbers as input and check if it is an array sorted in ascending order.

//        Scanner sc=new Scanner(System.in);
//        int size=sc.nextInt();
//        int Numbers[]=new int[size];
//
//        for (int i=0; i<size; i++){
//            Numbers[i]=sc.nextInt();
//        }
//
//        boolean ascending=true;
//        for(int i=0; i<Numbers.length-1; i++){
//            if(Numbers[i]>Numbers[i+1]){
//                ascending=false;
//            }
//        }
//        if(ascending){
//            System.out.println("sorted array");
//        }
//        else{
//            System.out.println("not sorted array");
//        }


//        disanding order
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int Numbers[]=new int[size];

        for (int i=0; i<size; i++){
            Numbers[i]=sc.nextInt();
        }

        boolean disanding=true;
        for(int i=0; i<Numbers.length-1; i++){
            if(Numbers[i]<Numbers[i+1]){
                disanding=false;
            }
        }
        if(disanding){
            System.out.println("sorted array");
        }
        else{
            System.out.println("not sorted array");
        }
    }
}
