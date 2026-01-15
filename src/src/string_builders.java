import java.util.*;

public class string_builders {
    public static void main(String[] args) {
//        StringBuilder sb=new StringBuilder("gagan");
//        System.out.println(sb);

        //char of index o...
//        System.out.println(sb.charAt(1));

        //set char at index 0..
//        System.out.println(sb.replace(0,1,"M"));
//        sb.setCharAt(0,'G');
//        System.out.println(sb);

//        sb.insert(4,'n');
//        System.out.println(sb);
        //deleye the extra n...
//        sb.delete(4,5);
//        System.out.println(sb);

//        StringBuilder sb=new StringBuilder("G");
//        sb.append("a");
//        sb.append("g");
//        sb.append("a");
//        sb.append("n");
//        System.out.println(sb);
//        System.out.println(sb.length());
//        System.out.println(sb.reverse());


          StringBuilder sb=new StringBuilder("Rahul");
        for (int i = 0; i <sb.length()/2 ; i++) {
            int start=i;
            int end=sb.length()-1-i;

            char frontchar=sb.charAt(start);
            char backchar=sb.charAt(end);

            //use for setcharAt function..
            sb.setCharAt(start,backchar);
            sb.setCharAt(end,frontchar);
        }
        System.out.println(sb);
    }
}
