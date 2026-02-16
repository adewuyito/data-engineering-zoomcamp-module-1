import java.util.*;

public class Maxheap {
    public static void swap(List<Integer> list, int firt_index, int swap_index) {
        Integer temp = list.get(firt_index);
        list.set(firt_index, list.get(swap_index));
        list.set(swap_index, temp);
    }

    static void max_up(List<Integer> array, int n, int index) {
        int largest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        // Check left
        if (left < n && array.get(left) > array.get(largest)) {
            largest = left;
        }

        // Check right
        if (right < n && array.get(right) > array.get(largest)) {
            largest = right;
        }

        if (largest != index) {
            swap(array, index, largest);
            max_up(array, n, largest);
        }
    }

    public static void build_max_heap(List<Integer> array, int n) {
        for (int i = (n / 2) - 1; i >= 0; i--) {
            max_up(array, n, i);
        }
    }

    public static void pop_max(List<Integer> array, int heap_size) {
        if (heap_size <= 0) {
            return;
        }

        swap(array, 0, array.size() - 1);
        array.removeLast();
        max_up(array, heap_size - 1, 0);
    }

    public static void insert(List<Integer> array, int heap_size, int inserted_value) {
        array.add(inserted_value);

        build_max_heap(array, array.size());
    }
}