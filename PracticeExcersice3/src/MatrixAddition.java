public class MatrixAddition {
    int row, coloumn,k=0;
    int[][] matrix1=new int[3][2];
    int[][] matrix2=new int[3][2];
    int[][] sum=new int[3][2];

    MatrixAddition(int row, int coloumn,int[][] matrix1,int[][] matrix2) {
        this.row = row;
        this.coloumn = coloumn;
        this.matrix1 = matrix1;
        this.matrix2=matrix2;
    }



    public int[][] matrixAddition() {
       // System.out.println(" hi ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coloumn; j++) {
             sum[i][j]=matrix1[i][j]+matrix2[i][j];
               // System.out.println(" i "+" j "+j+" sum "+sum[i][j]);
             k++;
            }
        }return sum;
    }

}