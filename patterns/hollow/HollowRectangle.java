// Program to print a Hollow Rectangle pattern
// Input: n = 12
// Output:
// ************
// *          *
// *          *
// *          *
// *          *
// ************

package patterns.hollow;

public class HollowRectangle {
    public static void main(String[] args) {
        int n=12;
        for(int i=1;i<=(n+1)/2;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==(n+1)/2 || j==1 || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
