package uk.ac.cam.yw580.SupoWork.Supo3;

import java.util.AbstractList;

public class CollectionArrayList<T> extends AbstractList<T> {
    private Object[] arr;
    private int count;

    public CollectionArrayList() {
        this(1);
    }

    public CollectionArrayList(int n) {
        arr = new Object[n];
    }

    @Override
    public T get(int index) {
        return (T) arr[index];
    }

    @Override
    public int size() {
        return count;
    }
    @Override
    public void add(int ind, T item) {
        System.arraycopy(arr,ind, arr, ind + 1, count - ind);
        arr[ind] = item;
        count++;
        normalise();
    }
    @Override
    public T remove(int ind) {
        T item = (T) arr[ind];
        System.arraycopy(arr,ind + 1, arr, ind, --count);
        return item;
    }
    @Override
    public T set(int ind, T t) {
        T item = (T) arr[ind];
        arr[ind] = t;
        return item;
    }
    private void normalise() {
        if (count < arr.length)
            return;
        Object[] newArr = new Object[arr.length * 2];
        System.arraycopy(arr,0,newArr,0,count);
        arr = newArr;
        System.out.println("Normalised");
    }
}
