//冒泡排序
public class BubbleSort {
    public static void main(String[] args) {
        int array[] = {63, 4, 24, 1, 3, 15};
        BubbleSort sorter = new BubbleSort();
        sorter.sort(array);
        sorter.showArray(array);
    }
    public void sort(int[] array){
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length-i-1; j++){
                if(array[j] > array[j+1]){
                    int t = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;
                }
            }
        }
    }
    public void showArray(int[] array){
        for (int i=0; i< array.length-1; i++){
            System.out.print(array[i] + " < ");
        }
        System.out.println(array[array.length-1]);
    }
}
