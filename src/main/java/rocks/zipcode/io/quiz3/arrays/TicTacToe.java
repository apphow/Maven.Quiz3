package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    String [][] matrix;
    boolean isWinner = false;
    String winner = "";

    public TicTacToe(String[][] board) {
        this.matrix = board;
    }

    public TicTacToe() {

    }

    public String[] getRow(Integer value) {
        String [] result = new String[matrix.length];
        for(int i = 0; i < matrix.length; i++) {
            result[i] = matrix[value][i];
        }
        return result;
    }

    public String[] getColumn(Integer value) {
        String[] result = new String[matrix.length];

        for(int i = 0; i < matrix.length; i++) {
            result[i] = matrix[i][value];
        }
        return result;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        String rowOne = matrix[rowIndex][0];
        String rowTwo = matrix[rowIndex][1];
        String rowThree = matrix[rowIndex][2];

       return rowOne.equals(rowTwo) && rowOne.equals(rowThree);
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        String columnOne = matrix[0][columnIndex];
        String columnTwo = matrix[1][columnIndex];
        String columnThree = matrix[2][columnIndex];

        return columnOne.equals(columnTwo) && columnOne.equals(columnThree);
    }

    public String getWinner() {
        for (int i = 0; i < 3; i++) {
            checkChars(matrix[i][0], matrix[i][1], matrix[i][2]);
            if(isWinner) {
                return winner;
            }
        }
        for( int i = 0; i < 3; i++) {
            checkChars(matrix[0][i], matrix[1][i], matrix[2][i]);
        }
        return winner;
    }

    public void checkChars(String charOne, String charTwo, String charThree) {
        if(charOne.equals("X")) {
            isWinner = true;
            winner = "X";
        } else if (charOne.equals("0")) {
    isWinner = true;
    winner = "O";
        } else {
    winner = "";
        }
    }

    public String[][] getBoard() {
        return null;
    }
}
