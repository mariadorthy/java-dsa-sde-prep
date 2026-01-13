// Program to print a solid square pattern
// Input: n = 4
// Output:
// ****
// ****
// ****
// ****

public class SolidSquare{
    public static void main(String[] args){
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}