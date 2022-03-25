import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Что желаете отсортировать?");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        SortingMachine sort = new SortingMachine();
        System.out.println(sort.insertion(str));
    }
}
