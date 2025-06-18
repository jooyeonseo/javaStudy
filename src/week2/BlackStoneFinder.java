package week2;

public class BlackStoneFinder {
    public static void main(String[] args) {

        //Q3. 2차원 배열에서 검은돌(true)의 좌표(x, y) 찾기

        boolean[][] board = {
                {true, false},
                {false, true}
        };

        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[row].length; column++) {
                if (board[row][column]) {
                    System.out.println("검은돌(●) 위치 : ("+row+","+column+")");
                }
            }
        }
    }
}
