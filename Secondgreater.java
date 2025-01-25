import java.util.*;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Secondgreater{
    public static void Greater(int x, int y, int z){
        if((x>y && x < z) || (x>z && x < y)){
            System.out.println("X is second greater");

        } else if ((y>x && y < z) || (y>z && y < x)) {
            System.out.println("y is second greater");

        }
        else{
            System.out.println("z is second greater");
        }
    }
    public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();
    Greater(x, y, z);
    }
}

