import java.util.Scanner;

public class twodarray01 {
    public static void main(String[] args) {

        //2d array first type...
//        int[][] num= new int[3][3];
//        int[][] arr= {{1, 2, 3}, {1, 2, 3}};
//        for (int i=0; i< arr.length; i++){
//            for (int j=0; j<arr[i].length; j++){
//                    System.out.print(arr[i][j]+" ");
//
//            }
//            System.out.println();
//        }

//second type...
//        int[][] arr= new int[3][3];
//        arr[0][0]=1;
//        arr[0][1]=1;
//        arr[0][2]=1;
//        arr[1][0]=1;
//        arr[1][1]=1;
//        arr[1][2]=1;
//        arr[2][0]=1;
//        arr[2][1]=1;
//        arr[2][2]=1;
//        for (int i=0; i<arr.length; i++){
//            for (int j=0; j<arr[i].length; j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }

//user to input...
//        Scanner sc=new Scanner(System.in);
//        System.out.println("row size");
//        int row=sc.nextInt();
//        System.out.println("col size");
//        int col=sc.nextInt();
//        int arr[][]=new int[row][col];
//
//        System.out.println("Enter value for matrix");
//        for (int i = 0; i <row; i++) {
//            for (int j = 0; j < col; j++) {
//                arr[i][j]=sc.nextInt();
//            }
//        }
//
//        System.out.println("Show matrix");
//        for (int i = 0; i <row; i++) {
//            for (int j = 0; j < col; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//

        //find the indexing...
//        Scanner sc=new Scanner(System.in);
//        System.out.println("row size");
//        int row=sc.nextInt();
//        System.out.println("col size");
//        int col=sc.nextInt();
//        int arr[][]=new int[row][col];
//
//        System.out.println("Enter value for matrix");
//        for (int i = 0; i <row; i++) {
//            for (int j = 0; j < col; j++) {
//                arr[i][j]=sc.nextInt();
//            }
//        }
//
//        System.out.println("Show matrix");
//        for (int i = 0; i <row; i++) {
//            for (int j = 0; j < col; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//        int x=sc.nextInt();
//
//        for (int i = 0; i <row; i++) {
//            for (int j = 0; j < col; j++) {
//               if(arr[i][j]==x){
//                   System.out.println("indexing for X"+i+","+j);
//               }
//               }
//            }

//        Print the spiral order matrix as output for a given matrix of numbers.

        Scanner sc=new Scanner(System.in);
        System.out.println("row size");
        int n=sc.nextInt();
        System.out.println("col size");
        int m=sc.nextInt();
        int arr[][]=new int[n][m];

        System.out.println("Enter value for matrix");
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Show spacil order matrix");
        int row_start=0;
        int row_end=n-1;
        int col_start=0;
        int col_end=m-1;

        while(row_end>=row_start&&col_end>=col_start) {
            for (int i = col_start; i <=col_end; i++) {
                System.out.print(arr[row_start][i]+" ");
            }
            row_start++;

            for (int i = row_start; i <=row_end; i++) {
                System.out.print(arr[i][col_end]+ " ");
            }
            col_end--;

            for (int i = col_end; i >=col_start; i--) {
                System.out.print(arr[row_end][i]+" ");
            }
            row_end--;
            for (int i = row_end; i >=row_start ; i--) {
                System.out.print(arr[i][col_start]+" ");
            }
            col_start++;

            System.out.println();
        }
    }
}
