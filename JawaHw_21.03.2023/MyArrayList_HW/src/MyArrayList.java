import Exeptions.MyExeptions;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList<T> {
    private T[] array;
    private int fullSize;

    public MyArrayList(int initialCapacity) {
        this.array = (T[]) new Object[initialCapacity];
        this.fullSize = 0;
    }

    public void add(T value) {
        array[fullSize] = value;
        fullSize++;
    }

    public void insertIntoArray(T value, int position) {
        if (fullSize == array.length) {
            T[] newArray = (T[]) new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, fullSize);
            array = newArray;
        }
        for (int i = fullSize; i > position; i--) {
            array[i] = array[i - 1];
        }
        array[position] = value;
        fullSize++;
    }

    public void delete(int pos) throws MyExeptions {
        if (pos >= fullSize) {
            throw new MyExeptions("Нет такого индекса");
        }
        for (int i = pos; i < fullSize - 1; i++) {
            array[i] = array[i + 1];
        }
        array[fullSize - 1] = null;
        fullSize--;
    }

    public void sorting() {
        int gap = fullSize / 2;
        while (gap > 0) {
            for (int i = gap; i < fullSize; i++) {
                T temp = array[i];
                int j = i;
                while (j >= gap && ((Comparable<T>) array[j - gap]).compareTo(temp) > 0) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = temp;
            }
            gap /= 2;
        }
    }

    public List<Integer> search(T value) {
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < fullSize; i++) {
            if (array[i].equals(value)) {
                indexes.add(i);
            }
        }
        return indexes;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < fullSize; i++) {
            sb.append(array[i]);
            if (i != fullSize - 1){
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();

    }
}