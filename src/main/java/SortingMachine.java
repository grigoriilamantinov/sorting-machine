public class SortingMachine {
    public String getSortedByBubble(final String input) {
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

    public String getSortedByInsertion (final String input) {
        char[] inputArray = input.toCharArray();
        char rightChar;
        int indexLeft;
        for (int indexRight = 1; indexRight < inputArray.length; indexRight++) {
            rightChar = inputArray[indexRight];
            indexLeft = indexRight - 1;
            while ((indexLeft >= 0) && (inputArray[indexLeft] > rightChar)) {
                inputArray[indexLeft + 1] = inputArray[indexLeft];
                indexLeft--;
            }
            inputArray[indexLeft+1] = rightChar;
        }
        StringBuilder sb = new StringBuilder();
        for (char element : inputArray) {
            sb.append(element);
        }
        return sb.toString();
    }
}
