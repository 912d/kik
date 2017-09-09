package al.jacek.musi.util;

public class Matrix {
    private int[] matrix2 = new int[9]; /*0-8: 9 elements. 1-X, 2-O*/

    public void putOneToMatrix(int position) {
        if (position >= 1 && position <= 9 /*relative position*/
                && positionIsEmpty(position)) {
            matrix2[position - 1] = 1; // 1 means `'X'`
        }
    }

    public void putTwoToMatrix(int position) {
        if (position >= 1 && position <= 9 /*relative position*/
                && positionIsEmpty(position)) {
            matrix2[position - 1] = 2; // 2 means `'O'`
        }
    }

    private boolean positionIsEmpty(int position) {
        return matrix2[position - 1] == 0;
    }

    /** TODO WRITE TEST
     * @return 1 when user 'X' won, 2 when computer using 'O' won
     */
    public int didSomeoneWon() {
        if (matrix2[0] == 1 && matrix2[1] == 1 && matrix2[2] == 1) {
            return 1;
        }else if (matrix2[3] == 1 && matrix2[4] == 1 && matrix2[5] == 1) {
            return 1;
        } else if (matrix2[6] == 1 && matrix2[7] == 1 && matrix2[8] == 1) {
            return 1;
        }

    }

}
