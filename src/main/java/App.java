import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Что желаете отсортировать?");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        SortingMachine sortingMachine = new SortingMachine();
        UserInterface uI = new UserInterface();
        PropertiesLoader loader = new PropertiesLoader();
        System.out.println(sortingMachine.getSortedByInsertion(str));
        System.out.println(uI.getMessageAboutBubble(loader));
    }
}
