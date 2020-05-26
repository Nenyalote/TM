import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class WidthSearch {

  public static void main (String [] args) throws IOException {
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


    boolean [] points = new boolean[n]; //эта переменная будет true для посещенной вершины
    for (int i=0; i<n; i++){
      points[i]=false;
    }

    boolean pointCheck = true; //эта переменная определяет, остались ли непосещенные вершины

    for (int k=0; k<n; k++){ //при наличии непосещенных вершин pointCheck = false
      if (points[k]==false){
        pointCheck = false;
      }
    }

    while (pointCheck==false){ //пока есть непосещенные вершины
      int i=stV; //переходим к строке непосещенной(в первом проходе цикла стартовой) вершины
      points[stV]=true; //отмечаем ее как посещенную в массиве points
      System.out.println(stV+1); //выводим ее на экран
      for (int j=0; j<n; j++){ //идем по строке вершины stV
        if((table[i][j]==1)&&(points[j]==false)){ //если в строке есть 1 и вершина столбца, в котором она стоит, не посещена
          points[j]=true; //посещаем вершину столбца
          System.out.println(j+1);
        }
      }

      pointCheck=true; //проверяем, остались ли непосещенные вершины
      for (int k=0; k<n; k++){
        if (points[k]==false){
          pointCheck = false;
        }
      }

      int min=n;
      for (int k=0; k<points.length; k++){ //находим непосещенную вершину и принимаем ее за стартовую
        if ((points[k]==false)&&(k<min)) {
          min=k;
        }
      }
      stV=min;

    }

  }

}
