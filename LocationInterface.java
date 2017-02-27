public interface LocationInterface {

    /**
     * @param player could be Colour or boolean
     */
    boolean validMove(int player);

    /**
     * what happens if the move is not valid?
     * what happens if the move knocks off another piece?
     *
     ** @param player could be Colour or boolean
     ** 
     **/
    boolean makeMove(int player);
}
