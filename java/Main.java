import java.util.*;

public class Main {

    public static boolean isMaxHeap(int[] arr) {
        int n = arr.length;

        // We only need to check internal nodes (nodes with at least one child).
        // All nodes from (n/2) to n-1 are leaves and don't need checking.
        for (int i = 0; i <= (n / 2) - 1; i++) {

            int left = 2 * i + 1;
            int right = 2 * i + 2;

            // Check left child
            if (left < n && arr[i] < arr[left]) {
                return false;
            }

            // Check right child
            if (right < n && arr[i] < arr[right]) {
                return false;
            }
        }
        return true;
    }

    public static void swap(List<Integer> list, int firt_index, int swap_index) {
        Integer temp = list.get(firt_index);
        list.set(firt_index, list.get(swap_index));
        list.set(swap_index, temp);
    }

    public static void max_up(List<Integer> array, int n, int index) {
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

    public static void make_max_heap(List<Integer> array, int n) {
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

        make_max_heap(array, array.size());
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }

        // print normal heap
        int[] arr = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        make_max_heap(list, list.size());
        System.out.println("Max Heap: " + list);
        System.out.println("Is max heap: " + isMaxHeap(arr));

        // Popped max
        pop_max(list, list.size());

        arr = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println("New Max Heap: " + list);
        System.out.println("Is max heap: " + isMaxHeap(arr));

        // Inserted new value
        insert(list, list.size(), random.nextInt(100));

        arr = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println("New Max Heap: " + list);
        System.out.println("Is max heap: " + isMaxHeap(arr));
    }
}