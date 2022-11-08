public class Move {
    private
    String win;
    String draw;
    String lose;

    public Move(String win, String draw, String lose) {
        this.win = win;
        this.draw = draw;
        this.lose = lose;
    }

    public String result(String moveOpponent){
        String result = "";
        if(moveOpponent.equals(this.win)) result = "win";
        if(moveOpponent.equals(this.draw)) result = "draw";
        if(moveOpponent.equals(this.lose)) result = "lose";

        return result;
    };
}
