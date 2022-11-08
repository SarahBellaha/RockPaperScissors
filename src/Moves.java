public class Moves {
    private
    int myMove;

    public Moves(int move){
        this.myMove = move;
    }

    public int getResult(int moveP2) {
        int[][] points = {
            {0, -1, 1},
            {1, 0, -1},
            {-1, 1, 0}
        };

        return points[this.myMove-1][moveP2-1];
    };
}
