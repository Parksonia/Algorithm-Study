import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] arr = str.split("");
        int n = sc.nextInt();
        System.out.println(arr[n-1]);
    }
}
