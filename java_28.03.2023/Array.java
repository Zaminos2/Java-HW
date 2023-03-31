public class Array {
    private int [] array;
    private int size;

    public Array(int capasity){
        array = new int[capasity];
        size = 0;
    }
    public void add (int element){
        if (size == array.length){
            int[]newArray = new int[array.length];
            for (int i = 0;i < array.length; i++ ){
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[size] = element;
        size++;
    }
    public  void removw (int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        for (int i = 0;i < size; i ++){
            array[i] =array[i + 1];
        }
        size --;
    }
    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public void insert(int element, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (size == array.length) {
            // увеличиваем размер массива вдвое
            int[] newArray = new int[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = element;
        size++;
    }

    public int getSize() {
        return size;
    }
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }



}
