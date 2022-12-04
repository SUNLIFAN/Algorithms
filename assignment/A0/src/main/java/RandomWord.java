import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        int i = 1;

        String champion = null;

        String curWord = null;

        while(!StdIn.isEmpty()){
            curWord = StdIn.readString();
            if(champion == null || StdRandom.bernoulli(1.0 / i)){
                champion = curWord;
            }
            i ++;
        }

        System.out.println(champion);
    }
}
