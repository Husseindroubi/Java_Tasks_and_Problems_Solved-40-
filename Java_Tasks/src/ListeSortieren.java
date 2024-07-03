import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListeSortieren {
    static void divide(List<Integer> list) {
        if (list.size() < 2) {
            return;
        }
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list.size()/2; i++) {
            list1.add(list.get(i));
        }
        for (int j = list.size()/2; j < list.size(); j++) {
            list2.add(list.get(j));
        }
        divide(list1);
        divide(list2);
        mergeThis(list, list1, list2);
    }
    static void mergeThis(List<Integer> list, List<Integer> list1, List<Integer> list2) {
        int n = 0, n1 = 0, n2 = 0;
        while (n1 < list1.size() && n2 < list2.size()) {
            if (list1.get(n1) <= list2.get(n2)) {
                list.set(n++, list1.get(n1++));
            } else {
                list.set(n++, list2.get(n2++));
            }
        }
        while (n1 < list1.size()) {
            list.set(n++, list1.get(n1++));
        }
        while (n2 < list2.size()) {
            list.set(n++, list2.get(n2++));
        }
    }

    public static void main(String[] args) {
        Random r = new Random();
        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            myList.add(r.nextInt(101)) ;
        }
        System.out.println("Unsorted List: " + myList);

        divide(myList);
        System.out.println("Sorted array: " + myList);
    }
}
