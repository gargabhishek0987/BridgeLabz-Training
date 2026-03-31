package sorting;

public class EmployeeIDSorter {

    public static void insertionSort(int[] ids) {
        int n = ids.length;

        for (int i = 1; i < n; i++) {
            int key = ids[i];     
            int j = i - 1;

            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j];
                j--;
            }

            ids[j + 1] = key;
        }
    }

    
    public static void printArray(int[] ids) {
        for (int id : ids) {
            System.out.print(id + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] employeeIDs = {1003,1005,1004,1006,1007};

        System.out.println("Original IDs:");
        printArray(employeeIDs);

        insertionSort(employeeIDs);

        System.out.println("Sorted IDs (Ascending):");
        printArray(employeeIDs);
    }
}