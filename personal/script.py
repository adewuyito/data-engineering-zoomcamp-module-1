
def max_heapify(list, list_lenght, index):
    largest = index
    left = 2 * index + 1
    right = 2 * index + 2

    if left < list_lenght and list[left] > list[largest]:
        largest = left

    #  right
    if right < list_lenght and list[right] > list[largest]:
        largest = right
    
    if largest != index:
        list[index], list[largest] = list[largest], list[index]
        max_heapify(list, list_lenght, largest)

def max_heap(list, list_lenght):
    for i in range(list_lenght // 2, -1, -1):
        max_heapify(list, list_lenght, i)


list = [9, 23, 40, 32, 24, 40]

max_heap(list=list, list_lenght=len(list))

print(list)