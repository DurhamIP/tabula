public interface BoardInterface{

    /**
     * what happens if there is a double?
     * what happens if can move with one die but not two?
     * @param player could be Colour or boolean or Player
     **/
    boolean canMove(int d1, int d2, int player);
}
