
public class Print_triangle_usingMatrix {

    public static void main(String[] args) {
        int K = 0;
        int val=0;
        int ar[][] = new int[4][5];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                ar[i][j] = K;
                K++;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= val; j++) {
                System.out.print(" " + ar[i][j]);
            }
            val++;
            System.out.println();
        }
    }
}
