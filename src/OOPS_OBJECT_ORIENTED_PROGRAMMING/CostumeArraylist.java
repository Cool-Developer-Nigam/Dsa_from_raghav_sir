package OOPS_OBJECT_ORIENTED_PROGRAMMING;

import java.util.Arrays;

 class CustomArrayList<E> {
    private Object[] elementData;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    // Initialize with default capacity
    public CustomArrayList() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }

    // Add element to the end
    public void add(E element) {
        ensureCapacity();
        elementData[size++] = element;
    }

    // Add element at a specific index
    public void add(int index, E element) {
        if (index > size || index < 0) throw new IndexOutOfBoundsException("Index: " + index);
        ensureCapacity();
        // Shift elements to the right
        System.arraycopy(elementData, index, elementData, index + 1, size - index);
        elementData[index] = element;
        size++;
    }

    // Get element by index
    @SuppressWarnings("unchecked")
    public E get(int index) {
        if (index >= size || index < 0) throw new IndexOutOfBoundsException("Index: " + index);
        return (E) elementData[index];
    }

    // Remove element by index
    @SuppressWarnings("unchecked")
    public E remove(int index) {
        if (index >= size || index < 0) throw new IndexOutOfBoundsException("Index: " + index);
        E oldValue = (E) elementData[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        }
        elementData[--size] = null; // Clear to let GC work
        return oldValue;
    }

    // Dynamic Resizing Logic
    private void ensureCapacity() {
        if (size == elementData.length) {
            int newSize = elementData.length * 2;
            elementData = Arrays.copyOf(elementData, newSize);
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size));
    }
}

public class CostumeArraylist {
    static void main() {

    }

}
