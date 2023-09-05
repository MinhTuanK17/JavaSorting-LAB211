package Controller;

import Common.Algorithm;
import Common.Library;
import Model.Element;
import View.Menu;

/**
 *
 * @author MINH TUAN
 */
public class SortProgramming extends Menu<String> {

    static String[] mc = {"Buddle Sort", "Quick Sort", "Exit"};

    protected Library library;
    protected Algorithm algorithm;
    protected int[] array;
    protected int size_array;

    public SortProgramming(Element element) {
        super("PROGRAMMING", mc);
        library = new Library();
        algorithm = new Algorithm();
        size_array = element.getSize_array();
        array = element.getArray();

    }

    public void execute(int n) {
        switch (n) {
            case 1:
                bubbleSort();
                break;
            case 2:
                quickSort();
                break;
            case 3:
                System.out.println("___<3___Thank you___<3___");
                System.exit(0);
        }
    }

    public void bubbleSort() {
        algorithm.bubbleSort(array);
        System.out.println("\nSorted array by Buddle Sort: ");
        library.display(array);
        System.out.println("");
    }

    public void quickSort() {
        algorithm.quickSort(array, 0, size_array - 1);
        System.out.println("\nSorted array by Quick Sort: ");
        library.display(array);
        System.out.println("");
    }

}
