package Array;

public class Array {
    public static void main(String[] args) {
        int[][] num={{4,5,7},{1,2,3}};

        for (int i=0;i<num.length;i++){
            for (int j=0;j<num[i].length;j++){
                System.out.println(num[i][j]);
            }
        }
    }
}
