import java.util.Scanner;

public class MultiDimensionalArray{

public static void main(String[] args){

  //Scanner input = new Scanner(System.in);

  //System.out.println("Enter a number");
   //int userNumber = input.nextInt();

     
     int [][] arrayBasket  =  {

        {3,5,7}, {10,2,9}

    };
    //print the first row, bc our array has 2 rows and 3 columns. as you can see we are on the same row one and we are increasing up columns only
    //System.out.println(arrayBasket[0][0]);

    //System.out.println(arrayBasket[0][1]);

    //System.out.println(arrayBasket[0][2]);


    //System.out.println(arrayBasket[1][0]);

    //System.out.println(arrayBasket[1][1]);

    //System.out.println(arrayBasket[1][2]);



    for(int indexOne = 0; indexOne < 2; indexOne++){

     
        for(int indexTwo = 0; indexTwo < 3; indexTwo++){

                System.out.print(arrayBasket[indexOne][indexTwo] + " ");

            }

                System.out.println();
       }





for(int indexOne = 0; indexOne < 3 ; indexOne++){

        



        for(int indexTwo = 0; indexTwo < 2; indexTwo++){

                System.out.print(arrayBasket[indexTwo][indexOne] + " ");

            }

                System.out.println();

        }

































   
}



}
