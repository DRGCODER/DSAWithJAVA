
public class DynamicArray {
    private int size;
    private int[] arr;
    private int deleteCount;

    public DynamicArray() {
        size = 0;
        arr = new int[10];
        deleteCount = 0;
    }

    public int[] getArrayValue() {
        int[] arrValues = new int[size];
        for (int i = 0; i < size; i++) {
            arrValues[i] = arr[i];
        }
        return arrValues;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return arr[index];
    }

    public int getSize() {
        return size;
    }

    public void deleteElement(int valueToDelete) {
        int[] newArray = new int[arr.length];
        int index = 0;
        boolean foundVal = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] != valueToDelete) {
                newArray[index++] = arr[i];
            } else {
                foundVal = true;
                deleteCount++;
            }
        }
        if (foundVal) {
            size = index;
            arr = newArray;
        }
        if (deleteCount >= 10) {
            reduceArray();
            deleteCount = 0;
        }

    }

    private void reduceArray() {
        int[] newArray = new int[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = arr[i];
        }
        arr = newArray;
    }

    private void expand(int expandVal) {
        int newSize = arr.length + expandVal;
        int[] newArr = new int[newSize];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        
        arr = newArr;
    }

    public void addVal(int value) {
        if (size + 1 > arr.length) {
            expand(10);
        }
        arr[size++] = value;

    }
    public int findVal(int value) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
        return value;
        
    }

}
