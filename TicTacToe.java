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
int placeHolder = 49; // 49 is the ascii value that represents the character--number 1
char [][] arrayBasket = new char [3][3];
int round = 1;
while(round < 10){

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

//for the display of instruction/prompt to select a position 1-9

//System.out.print("Player X, select a position(1-9): ");
//char userNumber = input.nextChar();

break;

//how to handle the case for 1-9 , its corresponding array position and then userinput, how to match it
// i can use match case to do it but it will be long i dont know if theres a better way and what if there were more than 3 rows, will i write match case for each ? theres got to e a better way. I need to think clearly!













}




















/*String arrayBasketIndexDisplay = """ 

         1 | 2 | 3
        ---+---+---
        4 | 5 | 6
        ---+---+---
       7 | 8 | 9

Player x, select a position(1-9): 

"""; These numbers are placeholders for positions in the array, not the numbers in them or even the index. Theyre more for user guidance/experince.

System.out.println(arrayBasketIndexDisplay);
int userNumber = input.nextInt();

*/







}




}

