// Program to print a Inverted Repeated Alphabet Triangle pattern
// Input: n = 5
// Output:
//A A A A A 
//B B B B 
//C C C 
//D D 
//E 

package patterns.alphabet_patterns;

public class InvertedRepeatedAlphabetTriangle {
    public static void main(String[] args) {
        int n=5,k=0;
        for(int i=n;i>=1;i--){
            char ch=(char)('A'+k);
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
            k++;
        }
    }
}
