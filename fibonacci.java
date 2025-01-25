// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
    }
}