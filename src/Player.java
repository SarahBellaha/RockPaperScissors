public class Player {
    private String name;
    private int points;
    private int currentMove;

    public Player(String name){
        this.name = name;
        this.points = 0;
        this.currentMove= 0;
    }

    public String getName() {
        return this.name;
    }

    public int getPoints(){
        return this.points;
    }

    public void setPoints(int points){
        this.points += points;
    }

    public int getCurrentMove() {
        return this.currentMove;
    }

    public void setCurrentMove(int value) {
        this.currentMove = value;
    }
}
