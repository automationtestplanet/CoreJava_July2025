package assignments.yogi;

public class Assignment2 {

	// Write a program to print count of each word from the sentence 
	// "Hello This Is Java Hello World Is Java"  -> Hello -2, This -1, Is-2, Java-2, World-1
public static void main(String[] args) {
    	
        String sentence = "Hello This Is Java Hello World Is The Java";
        String[] words = sentence.split(" ");
        
        int wordslen = words.length;

        for (int i = 0; i < wordslen; i++) {
            int count = 0;
            
            for (int j = 0; j < wordslen; j++) {
            	
                if (words[i].equals(words[j])) {
                    count++;
                }
            }
            System.out.println(words[i] + " - " + count);
        }
    }
	
}
