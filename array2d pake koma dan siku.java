public class Matriks {
public static void main(String[] args) {
int[][] data = {
{1, 2, 3},
{4, 5, 6}
};
System.out.println(data[1][2]);
for (int i = 0; i < data.length; i++) {
  System.out.print("[");
for (int j = 0; j < data[i].length; j++) {
System.out.print(data[i][j]);
  if(j<data.length){
    System.out.print(",");
  }else{
    System.out.print("]");
  }
}
System.out.println();
}
}
}