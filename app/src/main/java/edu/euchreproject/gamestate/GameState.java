package edu.euchreproject.gamestate;

public class GameState {
    int playerResources;
    int playerResourceState;
    int turn; //0-3 for players
    int sharedResources;
    //visibility of information from perspective of each player
    int currentPlayerScore;
    int timerState;
    int gameStage; //0-3

    //default constructor
    public GameState(){


    }

    //copy constructor
    public GameState(GameState other){


    }

    @Override
    public String toString(){

        return "";
    }

}
