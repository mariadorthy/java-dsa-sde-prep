// Program to print a solid rectangle pattern
// Input: n = 6
// Output:
// ******
// ******
// ******

public class SolidRectangle {
    public static void main(String[] args){
        int n=6;
        for(int i=1;i<=n/2;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
