import java.util.*;
public class Switch {
    public static void func(int n){
        switch(n){
            case 1 :
                System.out.println("Spring");
                break;
            case 2 :
                System.out.println("Summer");
                break;
            case 3 :
                System.out.println("Fall");
                break;
            case 4 :
                System.out.println("Winter");
                break;
            default :
                System.out.println("Invalid input");

        }
    }

    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        func(number);

    }
}