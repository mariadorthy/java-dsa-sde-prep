// Program to print a Repeated Number Triangle pattern
// Input: n = 5
// Output:
// 1 
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5

package patterns.number_patterns;

public class RepeatedNumberTriangle {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
