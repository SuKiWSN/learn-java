public class TransposeA {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        TransposeA transposer = new TransposeA();
        transposer.transpose(array);
        transposer.showArray(array);
    }
    void transpose(int[][] array){
        int n = array[0].length;
        int t;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                t = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = t;
            }
        }
    }
    void showArray(int[][] array){
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
