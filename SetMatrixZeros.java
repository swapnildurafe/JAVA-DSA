class SetMatrixZeros{

    public void setZeros(int [][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j] == 0){
                    setRow(i,matrix,c);
                    setCol(j,matrix,r);
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j] == -1){
                    matrix[i][j] = 0;
                }
            }
    }
    }

    public void setRow(int i, int[][] matrix, int c){
        for(int j=0;j<c;j++){
            if(matrix[i][j] != 0){
                matrix[i][j] = -1;
            }
        }
    }

    public void setCol(int j, int[][] matrix, int r){
        for(int i=0;i<r;i++){
            if(matrix[i][j] != 0){
                matrix[i][j] = -1;
            }
        }
    }

    public static void main(String[] args){
        int[][] matrix = { {1,1,1},
                           {1,0,1},
                           {1,1,1}
                         };
        
        SetMatrixZeros smz = new SetMatrixZeros();
        smz.setZeros(matrix);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}