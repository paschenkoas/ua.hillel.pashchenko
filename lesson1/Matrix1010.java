import static java.lang.Math.random;

public class Matrix1010 {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
//zapolnjaem elementami;
        for (int i=0;i < array.length;i++){
            for (int j=0;j < array[i].length;j++){
                array[i][j]=(int)(random()*100);
            }
        }
//vivod elementov;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
