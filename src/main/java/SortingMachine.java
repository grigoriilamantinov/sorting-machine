import java.util.StringJoiner;

public class SortingMachine {
    public String bubble(String input) {
        char[] inputArray = input.toCharArray();
        boolean isSorted = false;
        char buffer;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < inputArray.length-1; i++) {
                if (inputArray[i] > inputArray[i+1]) {
                    isSorted = false;

                    buffer = inputArray[i];
                    inputArray[i] = inputArray[i+1];
                    inputArray[i+1] = buffer;
                }
            }
        }
        StringBuilder sb = new StringBuilder();

        for (char element : inputArray) {
            sb.append(element);
        }
        return sb.toString();
    }
}
