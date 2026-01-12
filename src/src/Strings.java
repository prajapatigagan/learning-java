import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //single word ke liye...
//        String name=sc.next();
//        System.out.println("my name is "+name);
        //multipule word ke liye..
//        String name=sc.nextLine();
//        System.out.println("my name is "+name);

        //concatination--> do String add krnaa..
//        String firstname="gagan";
//        String lastname="prajapati";
//        String firstname=sc.next();
//        String lastname=sc.next();
//        String fullname=firstname+" "+lastname;
//        System.out.println(fullname);

        //print of length...
//    System.out.println(fullname.length());

    //charAt...
//        for (int i = 0; i <fullname.length() ; i++) {
//            System.out.println(fullname.charAt(i));
//        }

        //string compariton
        //1 s1>s2-->+ve
        //2 s1==s2-->0
        //3 s1<s2-->-ve
//        String name1="gagan";
//        String name2="gagan";
//        if(name1.compareTo(name2)==0){
//            System.out.println("String are equal");
//        }else{
//            System.out.println("String not equal");
//        }

        //subString-->catch to small part..
//        String sentence="my name is gagandeep prajapati";
//        String name=sentence.substring(11);
//        System.out.println(name);
//        String name=sentence.substring(11,20);
//        System.out.println(name);

//        ParseInt Method of Integer class
//        String str="123";
//        int number=Integer.parseInt(str);
//        System.out.println(number);

//        ToString Method of String class
//        int number=123;
//        String str=Integer.toString(number);
//        System.out.println(str.length());


//        Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
//        int size=sc.nextInt();
//        String array[]=new String[size];
//        int totlength=0;
//        for (int i = 0; i <size ; i++) {
//            array[i]=sc.next();
//            totlength+=array[i].length();
//        }
//        System.out.println(totlength);


//        Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’.
//        String str=sc.next();
//        String result="";
//
//        for (int i = 0; i <str.length() ; i++) {
//            if (str.charAt(i)=='e') {
//                result +='i';
//            }
//            else {
//                result +=str.charAt(i);
//            }
//        }
//        System.out.println(result);


//        Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
        String email=sc.next();
        String username="";

        for (int i=0; i<email.length(); i++){
            if(email.charAt(i)=='@'){
               break;
            }else{
                username +=email.charAt(i);
            }
        }
        System.out.println(username);
    }
}
