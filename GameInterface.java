public interface GameInterface {

    Board getBoard();

    /**
     * @param playerNum could be int or colour or boolean?
     **/
    void setPlayer(int playerNum, PlayerInterface player);

}
