public class EjMat2 {
   public static void main(String[] args) {
     int[][] num = { {1, 2, 3, 4}, {5, 6, 7, 8} };
     for (int i = 0; i < num.length; ++i) {
        for(int j = 0; j < num[i].length; ++j) {
           System.out.println("La posición es:  "+ i + " " + j + " " + " El numero es: " + num[i][j]);
        }
     }
   }
}