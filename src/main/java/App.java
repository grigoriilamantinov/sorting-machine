import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Что желаете отсортировать?");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        char[] inputChar = str.toCharArray();
        SortingMachine sortingMachine = new SortingMachine();
        UserInterface uI = new UserInterface();
        PropertiesLoader loader = new PropertiesLoader();
        sortingMachine.getSortedByQuickSort(inputChar, 0, inputChar.length-1);
        System.out.println(Arrays.toString(inputChar));
    }
}
