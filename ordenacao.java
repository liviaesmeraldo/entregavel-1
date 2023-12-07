import java.util.ArrayList;
import java.util.List;

class Main {
  public static void main(String[] args) {
    List<Integer> array = new ArrayList<>();
        array.add(4);
        array.add(2);
        array.add(7);
        array.add(1);
        array.add(9);
        array.add(3);

        List<Integer> sortedArray = quickSort(array);

        System.out.println(sortedArray);
  }
      public static List<Integer> quickSort(List<Integer> arr) {
        if (arr.size() <= 1) {
            return arr;
        }

        int pivot = arr.get(0);
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 1; i < arr.size(); i++) {
            int current = arr.get(i);
            if (current < pivot) {
                left.add(current);
            } else {
                right.add(current);
            }
        }

        List<Integer> sortedLeft = quickSort(left);
        List<Integer> sortedRight = quickSort(right);

        List<Integer> sortedArray = new ArrayList<>();
        sortedArray.addAll(sortedLeft);
        sortedArray.add(pivot);
        sortedArray.addAll(sortedRight);

        return sortedArray;
    }
}