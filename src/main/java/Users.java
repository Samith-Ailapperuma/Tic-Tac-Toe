public class Users {
    // currentUser would be N if the game has not started or is over
    char currentUser = 'N';

    void startGame(){
        this.currentUser = 'X';
    }

    void switchUser(){
        if(this.currentUser == 'X'){
            this.currentUser = 'O';
        } else if (this.currentUser == 'O'){
            this.currentUser = 'X';
        }
    }

    void endGame(){
        this.currentUser = 'N';
    }


}
