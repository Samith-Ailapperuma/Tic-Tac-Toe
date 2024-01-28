import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Users users = new Users();
        Grid grid = new Grid();
        int location;
        String status = null;
        int remainingNumbers = 9;

        Scanner sn = new Scanner(System.in);

        grid.initializeGrid();

        users.startGame();

        while(!grid.isComplete()){
            if(remainingNumbers == 0){
                status = "Game is drawn";
                break;
            }
            grid.displayGrid();

            System.out.print("The user " + users.currentUser + " chooses location ");
            location = sn.nextInt();

            grid.replaceGrid(location, users.currentUser);
            remainingNumbers -= 1;

            users.switchUser();
        }

        if(grid.isComplete()){
            users.switchUser();
            status = "Player " + users.currentUser + " has won";
        }

        users.endGame();
        grid.displayGrid();
        System.out.println(status);

    }



}
