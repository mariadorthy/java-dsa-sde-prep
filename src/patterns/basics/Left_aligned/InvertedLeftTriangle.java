// Program to print a Inverted Left Triangle pattern
// Input: n = 5
// Output:
// *****
// ****
// ***
// **
// *

package patterns.basics.Left_aligned;

public class InvertedLeftTriangle {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
