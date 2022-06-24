public class SortingMachine {
    public String getSortedByBubble(final char[] inputCharArray) {
        char[] sortableArray = inputCharArray;
        boolean isSorted = false;
        char buffer;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < sortableArray.length-1; i++) {
                if (sortableArray[i] > sortableArray[i+1]) {
                    isSorted = false;
                    buffer = sortableArray[i];
                    sortableArray[i] = sortableArray[i+1];
                    sortableArray[i+1] = buffer;
                }
            }
        }
        StringBuilder sb = new StringBuilder();

        for (char element : sortableArray) {
            sb.append(element);
        }
        return sb.toString();
    }

    public String getSortedByInsertion (final char[] inputCharArray) {
        char[] sortableArray = inputCharArray;
        char rightChar;
        int indexLeft;
        for (int indexRight = 1; indexRight < sortableArray.length; indexRight++) {
            rightChar = sortableArray[indexRight];
            indexLeft = indexRight - 1;
            while ((indexLeft >= 0) && (sortableArray[indexLeft] > rightChar)) {
                sortableArray[indexLeft + 1] = sortableArray[indexLeft];
                indexLeft--;
            }
            sortableArray[indexLeft+1] = rightChar;
        }
        StringBuilder sb = new StringBuilder();
        for (char element : sortableArray) {
            sb.append(element);
        }
        return sb.toString();
    }

    public void getSortedByQuickSort (
        final char[] inputCharArray,
        int low,
        int high
    ) {
        if (inputCharArray.length == 0) {
            return;
        }

        if (low >=high) {
            return;
        }

        int middle = low + (high - low) / 2;
        int anchor = inputCharArray[middle];

        int lowIndex = low;
        int highIndex = high;
        while (lowIndex <= highIndex) {
            while (inputCharArray[lowIndex] < anchor) {
                lowIndex++;
            }
            while (inputCharArray[highIndex] > anchor) {
                highIndex--;
            }

            if (lowIndex <= highIndex) {
                char buffer = inputCharArray[lowIndex];
                inputCharArray[lowIndex] = inputCharArray[highIndex];
                inputCharArray[highIndex] = buffer;
                lowIndex++;
                highIndex--;
            }
        }

        if (low < highIndex) {
            this.getSortedByQuickSort(inputCharArray, low, highIndex);
        }
        if (high > lowIndex)
            this.getSortedByQuickSort(inputCharArray, lowIndex, high);

    }
}
