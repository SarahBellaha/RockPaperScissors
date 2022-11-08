public class Player {
    private String name;
    private int points;
    private String currentMove;

    public Player(String name){
        this.name = name;
        this.points = 0;
        this.currentMove= "";
    }

    public String getName() {
        return this.name;
    }

    public int getPoints(){
        return this.points;
    }

    public void setPoints(int points){
        this.points = points;
    }

    public String getCurrentMove() {
        return this.currentMove;
    }

    public void setCurrentMove(String value) {
        this.currentMove = value;
    }
}
