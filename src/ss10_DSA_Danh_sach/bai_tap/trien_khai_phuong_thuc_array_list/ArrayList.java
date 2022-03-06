package ss10_DSA_Danh_sach.bai_tap.trien_khai_phuong_thuc_array_list;

import java.util.Arrays;

public class ArrayList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public ArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public ArrayList(int capacity) {
        if (capacity > 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
    }

    public int size(){
        return this.size;
    }

    public void clear(){
        size = 0;
        for(int i = 0; i < elements.length; i++){
            elements[i] = null;
        }
    }

    public boolean add(E element){
        elements[size] = element;
        size++;
        return true;
    }

    public void ensureCapacity(int minCapacity){
        if(minCapacity >= 0){
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IndexOutOfBoundsException("minCapacity: "+ minCapacity);

        }
    }
// phương thức lấy 1 element tại vị trí index
    public E get(int index){
        return (E) elements[index];
    }

    public int indexOf(E element){
        int index = -1;
        for (int i = 0; i < size; i++) {
            if(this.elements[i].equals(element)){
                return i;
            }
        }
        return index;
    }
}