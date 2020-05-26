import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DepthSearch {

  public static void main (String []  args) throws IOException {
    /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Введите размерность матрицы");
    int n = Integer.parseInt(reader.readLine());
    int[][] table = new int[n][n];

    System.out.println("Введите элементы матрицы");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++){
        table[i][j] = Integer.parseInt(reader.readLine()); //Заполнение матрицы
      }
    }

    System.out.println("Введите стартовую вершину, то есть ее номер с вычитанием 1");
    int stV = Integer.parseInt(reader.readLine());*/

    int n=7;
    int[][] table ={{0,1,1,1,1,0,0},{1,0,0,1,1,0,0},{1,0,0,0,0,1,1},{1,1,0,0,1,1,0,0,},{1,1,0,1,0,0,0},{0,0,1,0,0,0,1},{0,0,1,0,0,1,0}};

    int stV = 0; //стартовая вершина


    boolean [] points = new boolean[n]; //эта переменная определяет, остались ли непосещенные вершины
    for (int i=0; i<n; i++){
      points[i]=false;
    }

    DepthSearch(stV, points, table); //вызываем функцию

  }

  public static void DepthSearch(int v, boolean [] points, int [][] table){
   points[v]=true; //посещаем стартовую вершину
   System.out.println(v+1);
   int i=v;

   for (int j=0; j<points.length; j++){ //если в строке стартовой вершины есть 1 и вершина столбца этой 1 не посещена,
     if((table[i][j]==1)&&(points[j]==false)){
       DepthSearch(j, points,table); //посещаем вершину столбца
     }
   }

   for (int k=0; k<points.length; k++){ //находим непосещенную вершину и посещаем ее
     if (points[k]==false) {
       DepthSearch(k, points, table);
     }
   }
  }
}

