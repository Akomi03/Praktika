public class MehrdimesionaleArrays {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        MehrdimesionaleArrays.squareArray(5,7);


    }
    public static void squareArray(int pSizeX,int pSizeY){

        int [][] fourbyfor= new int[pSizeX][pSizeY];

        for(int i = 0; i<fourbyfor.length;i++){
            for(int j=0;j<fourbyfor[i].length;j++){
                fourbyfor[i][j]=i+j;
            }
        }
        for (int[] pInts : fourbyfor) {
            for (int pPInt : pInts) {
                System.out.print(pPInt + " | ");
            }
            System.out.print("\b\b ");
            System.out.println();
        }
    }
}

