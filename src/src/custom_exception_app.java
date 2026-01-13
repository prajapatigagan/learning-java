import java.util.Scanner;
class TooOldException extends RuntimeException {//unchecked exception

    TooOldException(String r) {
        super(r);
    }
}
class TooYourException extends Exception {//checked exception

    TooYourException(String p) {
        super(p);
    }
}
public class custom_exception_app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your age to check marrage eligility");
        int age = sc.nextInt();
        if (age < 21) {
            throw new TooOldException("tumhari age bhut km hai koi match ka nhi hai");
        } else if (age > 30) {
            try {
                throw new TooYourException("tumhari age bhut janda hai ki tum ab swarg me jao");
            } catch (TooYourException e) {
                System.out.println("tum mar jao ab tumhe koi na milegi");
            }
        } else {
            System.out.println("tum sadi kro ab jldi");
        }
    }
}
