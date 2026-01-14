// Program to print a Right Aligned Triangle pattern
// Input: n = 5
// Output:
// *****
//  ****
//   ***
//    **
//     *
    
package Right_aligned;

public class InvertedRightTriangle {
    public static void main(String[] args){
        int n=5;
        for(int i=n;i>=1;i--){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
