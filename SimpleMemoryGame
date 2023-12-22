/*
    @Author: hakancemgercek
    @Project: MemoryGame
    @Date: 6/11/23
    @Info: A simple memory game by trying to guess the right cards every time.
*/
package hakancemgercek.memorygame;
import java.util.Scanner;
public class MemoryGame {
    // Notation: Creating card array in the global and static field.
    private static Cards[][] card = new Cards[4][4];
    
    public static void main(String[] args) {
        // Notation: Creaeting every single cards with values.
        card[0][0]= new Cards('E');
        card[0][1]= new Cards('A');
        card[0][2]= new Cards('B');
        card[0][3]= new Cards('F');
        card[1][0]= new Cards('G');
        card[1][1]= new Cards('A');
        card[1][2]= new Cards('D');
        card[1][3]= new Cards('H');
        card[2][0]= new Cards('F');
        card[2][1]= new Cards('C');
        card[2][2]= new Cards('D');
        card[2][3]= new Cards('H');
        card[3][0]= new Cards('E');
        card[3][1]= new Cards('G');
        card[3][2]= new Cards('B');
        card[3][3]= new Cards('C');
        
        // Notation: Creating a loop for viewing table every time we predict.
        // If 'isGameOver' method is false the program keeps running.
        while(isGameOver()==false){
            gameTable();
            cardPredict();
        }
        
        
    }
    // Notation: Creating a method to make a table for the game.
    public static void gameTable(){
        // Notation: Checking the predictions are true or not and then
        // printing them by their results.
        for(int i=0; i<4; i++){
            System.out.println("____________________");
            for(int j=0; j<4; j++){
                if(card[i][j].getPrediction()){
                    System.out.print(" |"+card[i][j].getValue()+"| ");
                }
                else{
                    System.out.print(" | | ");
                }
            }
            System.out.println("");
        }
        System.out.println("____________________");
    }
    
    // Notation: Creating a method which includes a loop to control if the
    // game is over or not.
    public static boolean isGameOver(){
        /* Notation: If at least one prediction is 'false' the loop keeps on.
           But if all the predictions are 'true' which this makes the game over,
        loop ends. */ 
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                if(card[i][j].getPrediction()==false){
                    return false;
                }
            }
        }
        return true;
    }
    
    // Notation: Creating a method which makes us to predict.
    public static void cardPredict(){
        Scanner keyboard = new Scanner(System.in);
        // Notation: First guess.
        System.out.println("First guess!");
        System.out.print("Enter your card numbers with one space between them! : ");
        int i1 = keyboard.nextInt();
        int j1 = keyboard.nextInt();        
        
        // Notation: If the prediction is 'true', view the game table.
        // In the beginning we make it 'true' by default.
        card[i1][j1].setPrediction(true);
        gameTable();
        
        // Notation: Second guess.
        System.out.println("Second guess!");
        System.out.print("Enter your card numbers with one space between them! : ");
        int i2 = keyboard.nextInt();
        int j2 = keyboard.nextInt();
        
        if(card[i1][j1].getValue() == card[i2][j2].getValue()){
            System.out.println("Good memory!");
            card[i2][j2].setPrediction(true);
            // Notation: If 'setPrediction' is 'true', gameTable() method prints
            // the array with the true guess type.
        }
        else{
            System.out.println("Try again!");
            card[i1][j1].setPrediction(false);
            // Notation: If 'setPrediction' is 'false', gameTable() method prints
            // the array with the false guess type.
        }
    }
}

// Notation: Creating a class for Cards.
class Cards {
    // Notation: Creating atributes.
    private char value;
    private boolean prediction=false;
    // Notation: Constructor method.
    public Cards(char value){
        this.value = value;
    }
    // Notation: get method for 'value'.
    public char getValue(){
        return value;
    }
    // Notation: set metod for 'value'.
    public void setValue(char value){
        this.value = value;
    }
    // Notation: get metod for 'prediction'.
    public boolean getPrediction(){
        return prediction;
    }
    // Notation: set metod for 'prediction'.
    public void setPrediction(boolean prediction){
        this.prediction = prediction;
    }
}
