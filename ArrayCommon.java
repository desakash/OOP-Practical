import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayCommon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the first array from the user
        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();

        // Read the elements of the first array from the user
        int[] array1 = new int[size1];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }

        // Read the size of the second array from the user
        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();

        // Read the elements of the second array from the user
        int[] array2 = new int[size2];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

        int[] commonElements = findCommonElements(array1, array2);

        System.out.println("Common elements between the two arrays:");
        for (int element : commonElements) {
            System.out.print(element + " ");
        }
    }

    public static int[] findCommonElements(int[] array1, int[] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);

        int length1 = array1.length;
        int length2 = array2.length;

        int i = 0, j = 0;
        List<Integer> commonList = new ArrayList<>();

        while (i < length1 && j < length2) {
            if (array1[i] < array2[j]) {
                i++;
            } else if (array1[i] > array2[j]) {
                j++;
            } else {
                commonList.add(array1[i]);
                i++;
                j++;
            }
        }

        int[] commonElements = new int[commonList.size()];
        for (int k = 0; k < commonList.size(); k++) {
            commonElements[k] = commonList.get(k);
        }

        return commonElements;
    }
}
