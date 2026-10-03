public class LoopSixteen{

public static void main(String[] args){


   String word = "ekemini" ;
    int count = 0;
  
  for(int index = 0; index < word.length();  index++ ){
    
    if(word.charAt(index) == 'a' || word.charAt(index) == 'e' || word.charAt(index) == 'i'|| word.charAt(index) == 'o' || word.charAt(index) == 'u' )
    
    count ++;
        
    }
    

   System.out.printf("%nthere are %d vowels in the above word%n", count);


}



}
