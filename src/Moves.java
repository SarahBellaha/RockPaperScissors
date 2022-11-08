public class Moves {
    private
    String myMove;

    public Moves(String move){
        this.myMove = move;
    }

    Move rock = new Move ("Ciseaux", "Pierre", "Feuille");
    Move paper = new Move ("Pierre", "Feuille", "Ciseaux");
    Move scissors = new Move ("Feuille", "Ciseaux", "Pierre");

    public String getResult(String moveP2) {
        String result = "";
        switch(this.myMove) {
            case "Pierre": result = rock.result(moveP2);
                break;
            case "Feuille": result = paper.result(moveP2);
                break;
            case "Ciseaux": result = scissors.result(moveP2);
                break;
        }

        return result;
    };
}
