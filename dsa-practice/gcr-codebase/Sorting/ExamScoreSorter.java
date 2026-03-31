package sorting;

public class ExamScoreSorter {

    public static void selectionSort(int[] scores) {
        int n = scores.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;   

            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = scores[i];
                scores[i] = scores[minIndex];
                scores[minIndex] = temp;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] examScores = {72, 88, 95, 63, 84, 77};

        System.out.println("Original Scores:");
        printArray(examScores);

        selectionSort(examScores);

        System.out.println("Sorted Scores (Ascending):");
        printArray(examScores);
    }
}