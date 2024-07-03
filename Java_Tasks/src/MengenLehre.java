import java.util.HashSet;
import java.util.Set;

public class MengenLehre {
    static Set<Integer> intersectThese(Set<Integer> A, Set<Integer> B) {
        Set<Integer> intersection = new HashSet<>(A);
        //intersection.addAll(A);
        intersection.retainAll(B);
        return intersection;
    }

    static Set<Integer> unifyThese(Set<Integer> A, Set<Integer> B, Set<Integer> C) {
        Set<Integer> union = new HashSet<>();
        union.addAll(A);
        union.addAll(B);
        union.addAll(C);
        return union;
    }

    static Set<Integer> differThese(Set<Integer> A, Set<Integer> B) {
        Set<Integer> difference = new HashSet<>();
        difference.addAll(A);
        difference.removeAll(B);
        return difference;
    }

    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>(); setA.add(1); setA.add(3); setA.add(5);
        Set<Integer> setB = new HashSet<>(); setB.add(3); setB.add(5); setB.add(7);
        Set<Integer> setC = new HashSet<>(); setC.add(5); setC.add(7); setC.add(9);

        System.out.println("A ∩ B = "+intersectThese(setA, setB));
        System.out.println("B ∩ C = "+intersectThese(setB, setC));
        System.out.println("A ∩ C = "+intersectThese(setA, setC));
        System.out.println("-------------------------------");
        System.out.println("A ∪ B ∪ C  = "+ unifyThese(setA, setB, setC));
        System.out.println("-------------------------------");
        System.out.println("A - B = "+differThese(setA, setB));
        System.out.println("B - A = "+differThese(setB, setA));
        System.out.println("A - C = "+differThese(setA, setC));
        System.out.println("C - A = "+differThese(setC, setA));
        System.out.println("B - C = "+differThese(setB, setC));
        System.out.println("C - B = "+differThese(setC, setB));
    }
}
