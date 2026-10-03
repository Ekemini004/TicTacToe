import java.util.Scanner;

public class TicTacToe{


public static void main(String [] args){

Scanner input = new Scanner(System.in);


//array starts with values 1-9
/*int [][] arrayBasket  =  {

        {1,2,3}, {4,5,6}, {7,8,9}

    };


for the printing of the array
for(int arrayRowIndex = 0; arrayRowIndex < 3; arrayRowIndex++){
  
        for(int arrayColumnIndex = 0; arrayColumnIndex < 3; arrayColumnIndex++){

                
                System.out.print(arrayBasket[arrayRowIndex][arrayColumnIndex] + " ");


          }

            System.out.println();
       

}
for the display of instruction/prompt to select a position 1-9

System.out.print("Player x, select a position(1-9): ");
int userNumber = input.nextInt();
*/






//created empty array and assigned values 1-9 to each position using a loop. omo e no easy!
//this is responsible for chooking the values into the arrayIndexes and  then displaying the complete array.

int placeHolder = 49; // 49 is the ascii value that represents the character--number 1
char [][] arrayBasket = new char [3][3];



for(int arrayRowIndex = 0; arrayRowIndex < 3; arrayRowIndex++){

        for(int arrayColumnIndex = 0; arrayColumnIndex < 3; arrayColumnIndex++){
              
                while(placeHolder < 58){      
                
                arrayBasket[arrayRowIndex][arrayColumnIndex] = (char)placeHolder;

                placeHolder++;

                break;

                 }
                      
                                 
                System.out.print(arrayBasket[arrayRowIndex][arrayColumnIndex] + " ");


          }

            System.out.println();

            
       

}


int round = 1;
while(round < 6) {

        //for the display of instruction/prompt to select a position 1-9
        System.out.print("Player X, select a position(1-9): ");
        int playerXnumber = input.nextInt();

         //System.out.print("\n\tround is now: " + round);


        //matching the users choice of 1-9
        switch(playerXnumber){

            case 1 -> { arrayBasket[0][0] = 'X';
                    TicTacToeMethods.displayArray(arrayBasket);
            }

            case 2 -> { arrayBasket[0][1] = 'X';
                    TicTacToeMethods.displayArray(arrayBasket);
            }

            case 3 -> { arrayBasket[0][2] = 'X';
                    TicTacToeMethods.displayArray(arrayBasket);
            }

            case 4 -> { arrayBasket[1][0] = 'X';
                    TicTacToeMethods.displayArray(arrayBasket);
            }

            case 5 -> { arrayBasket[1][1] = 'X';
                    TicTacToeMethods.displayArray(arrayBasket);
            }

            case 6 -> { arrayBasket[1][2] = 'X';
                    TicTacToeMethods.displayArray(arrayBasket);
            }

            case 7 -> { arrayBasket[2][0] = 'X';
                    TicTacToeMethods.displayArray(arrayBasket);
            }

            case 8 -> { arrayBasket[2][1] = 'X';
                    TicTacToeMethods.displayArray(arrayBasket);
            }

            case 9 -> { arrayBasket[2][2] = 'X';
                    TicTacToeMethods.displayArray(arrayBasket);
            }

             default-> System.out.println("invalid number. Select a number from 1-9");

        }



         if(round == 5) break;




        System.out.print("Player O, select a position(1-9): ");
        int playerOnumber = input.nextInt();

        switch(playerOnumber){

            case 1 -> { arrayBasket[0][0] = 'O';
                    TicTacToeMethods.displayArray(arrayBasket);
            }

            case 2 -> { arrayBasket[0][1] = 'O';
                    TicTacToeMethods.displayArray(arrayBasket);
            }

            case 3 -> { arrayBasket[0][2] = 'O';
                    TicTacToeMethods.displayArray(arrayBasket);
            }

            case 4 -> { arrayBasket[1][0] = 'O';
                    TicTacToeMethods.displayArray(arrayBasket);
            }

            case 5 -> { arrayBasket[1][1] = 'O';
                    TicTacToeMethods.displayArray(arrayBasket);
            }

            case 6 -> { arrayBasket[1][2] = 'O';
                    TicTacToeMethods.displayArray(arrayBasket);
            }

            case 7 -> { arrayBasket[2][0] = 'O';
                    TicTacToeMethods.displayArray(arrayBasket);
            }

            case 8 -> { arrayBasket[2][1] = 'O';
                    TicTacToeMethods.displayArray(arrayBasket);
            }

            case 9 -> { arrayBasket[2][2] = 'O';
                    TicTacToeMethods.displayArray(arrayBasket);
            }

             default -> System.out.println("invalid number. Select a number from 1-9");
            

        }




        round++;


}













    





}




}

