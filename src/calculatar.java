import java.util.Scanner;

public class calculatar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a+b;
            System.out.println(c);
        }else {
            System.out.println("Error");
        }
    }
}
