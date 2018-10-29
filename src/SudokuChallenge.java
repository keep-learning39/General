/**
 * Created by puranisu on 8/23/2018.
 */
public class SudokuChallenge {

    static int[] array = new int[81];
    static int[][] row = new int[9][9];
    static int[][] col = new int[9][9];


    public static void main(String[] args) {

        array[0] = 8;
        row[7][0] = 1;
        col[7][0] = 1;
        array[1] = 7;
        row[6][0] = 1;
        col[6][1] = 1;
        array[5] = 6;
        row[5][0] = 1;
        col[5][5] = 1;
        array[7] = 5;
        row[4][0] = 1;
        col[4][7] = 1;
        array[8] = 2;
        row[1][0] = 1;
        col[1][8] = 1;

        array[9] = 5;
        row[4][1] = 1;
        col[4][0] = 1;

        array[15] = 4;
        row[3][1] = 1;
        col[3][6] = 1;

        array[19] = 9;
        row[8][2] = 1;
        col[8][1] = 1;

        array[22] = 2;
        row[1][2] = 1;
        col[1][4] = 1;

        array[24] = 3;
        row[2][2] = 1;
        col[2][6] = 1;

        array[32] = 3;
        row[2][3] = 1;
        col[2][5] = 1;

        array[40] = 5;
        row[4][4] = 1;
        col[4][4] = 1;

        array[43] = 9;
        row[8][4] = 1;
        col[8][7] = 1;

        array[48] = 2;
        row[1][5] = 1;
        col[1][3] = 1;

        array[56] = 3;
        row[2][6] = 1;
        col[2][2] = 1;

        array[72] = 1;
        row[0][8] = 1;
        col[0][0] = 1;

        array[73] = 5;
        row[4][8] = 1;
        col[4][1] = 1;

        array[75] = 9;
        row[8][8] = 1;
        col[8][3] = 1;

        array[77] = 2;
        row[1][8] = 1;
        col[1][5] = 1;

        array[79] = 4;
        row[3][8] = 1;
        col[3][7] = 1;
/*
        array[0] = 8;
        array[1] = 7;
        array[5] = 6;
        array[7] = 5;
        array[8] = 2;
*/

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int num = array[i*9+j];
                if ( num == 0 ) {
                    for (int k = 8; k >=0; k--) {
                        if(boxCheck(k,i,j)){
                            if(row[k][i]==0 && col[k][j]==0){
                                row[k][i]=1;
                                col[k][j]=1;
                                array[i*9+j] = k +1;
                                break;
                            }
                        }

                    }
                }
            }
            System.out.println();
        }


        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(array[i*9+j]+"  ");
            }
            System.out.println();
        }
    }

    static boolean boxCheck(int num, int i, int j){
        int[] prev3Mult = {0,0,0,3,3,3,6,6,6} ;
        int[] next3Mult = {2,2,2,5,5,5,8,8,8} ;


        for (int k = prev3Mult[i]; k <next3Mult[i] ; k++) {
            for (int l = prev3Mult[j]; l < next3Mult[j] ; l++) {
                if(array[k*9+l]==num+1){
                    return false;
                }
            }
        }
        return true;
    }

}




/*


0 -- 0
1 -- 0
2 -- 0
3 -- 3
4 -- 3
5 -- 3,5

8 -- 6,8


 */