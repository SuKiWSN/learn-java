public class ReverseSort {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70};
        ReverseSort sorter = new ReverseSort();
        sorter.sort(array);
        sorter.showArray(array);
    }
    public void sort(int[] array) {
        int t;
        for(int i=0;i<array.length/2;i++){
            t = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = t;
        }
    }
    public void showArray(int[] array){
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
