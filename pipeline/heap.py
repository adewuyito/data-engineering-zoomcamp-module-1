heap = [9, 23, 40, 32, 24, 40]

def max_heapify(A, n, i):
    largest = i
    l = 2 * i + 1
    r = 2 * i + 2

    if l < n and A[l] > A[largest]:
        largest = l

    if r < n and A[r] > A[largest]:
        largest = r

    if largest != i:
        A[i], A[largest] = A[largest], A[i]
        max_heapify(A, n, largest)

def MAX_HEAP(A, n):
    # Build a maxheap.
    for i in range(n // 2 - 1, -1, -1):
        max_heapify(A, n, i)

MAX_HEAP(heap, len(heap))
print(heap)