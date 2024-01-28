public class Grid {
    char[] grid = new char[9];

    void initializeGrid(){
        int count = 0;
        char val;

        for(int i=0; i<9; i++){
            count++;
            val = (char)('0' + count);

            this.grid[i] = val;
        }
    }

    void replaceGrid(int position, char currentUser){

        if(currentUser == 'X'){
            this.grid[position - 1] = 'X';
        } else if(currentUser == 'O'){
            this.grid[position - 1] = 'O';
        }
    }

    void displayGrid(){
        System.out.println(" | " + this.grid[0] + " | " + this.grid[1] + " | " + this.grid[2] + " | ");
        System.out.println(" | " + this.grid[3] + " | " + this.grid[4] + " | " + this.grid[5] + " | ");
        System.out.println(" | " + this.grid[6] + " | " + this.grid[7] + " | " + this.grid[8] + " | ");
    }

    boolean equalRow(){
        int equalValues;
        int startIndex = 0;
        int endValue = 2;

        for(int j=0; j < 3; j++){
            equalValues = 0;
            for(int i = startIndex; i < endValue; i++){
                if(grid[i] == grid[i+1]){
                    equalValues = equalValues + 1;
                }
            }
            if(equalValues == 2){
                return true;
            }else {
                startIndex = startIndex + 3;
                endValue = endValue + 3;
            }
        }

        return false;
    }

    boolean equalColumn(){
        int equalValues;
        int startIndex = 0;
        int endValue = 4;

        for(int j=0; j < 3; j++){
            equalValues = 0;
            for(int i = startIndex; i < endValue; i+=3){
                if(this.grid[i] == this.grid[i+3]){
                    equalValues = equalValues + 1;
                }
            }
            if(equalValues == 2){
                return true;
            }else {
                startIndex = startIndex + 1;
                endValue = endValue + 1;
            }
        }

        return false;
    }

    boolean equalDiagonal(){
        return ((this.grid[0] == this.grid[4] && this.grid[4] == this.grid[8]) || (this.grid[2] == this.grid[4] &&
                this.grid[4] == this.grid[6]));
    }

    boolean isComplete(){
        return equalRow() || equalColumn() || equalDiagonal();
    }
}
