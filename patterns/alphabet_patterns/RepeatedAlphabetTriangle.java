// Program to print a Repeated Alphabet Triangle pattern
// Input: n = 5
// Output:
// A 
// B B
// C C C
// D D D D
// E E E E E

package patterns.alphabet_patterns;

public class RepeatedAlphabetTriangle {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            char ch=(char)('A'+i);
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

}
