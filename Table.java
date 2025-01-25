import java.util.*;
public class Table {
    public static void tabble(int x){
        for(int i = 1;i<11; i++){
            System.out.println(x*i);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number I will return table of thst nuumber : ");
        int x  = sc.nextInt();
        tabble(x);

    }
}
