public interface GameInterface {

    BoardInterface getBoard();

    /**
     * @param playerNum could be int or colour or boolean?
     **/
    void setPlayer(int playerNum, PlayerInterface player);

}
