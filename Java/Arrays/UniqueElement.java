package Arrays;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

//* Given an unsorted array, print all unique element in an array
//* Time complexity - O(n), Space complexity - O(n)

public class UniqueElement {

    public static void findUnique(int[] arr)
    {
        Set<Integer> uniqKeys = new TreeSet<Integer>();
        Integer[] array = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        uniqKeys.addAll(Arrays.asList(array));
        System.out.println(uniqKeys);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,2,3,5,1};
        findUnique(arr);
    }
}
