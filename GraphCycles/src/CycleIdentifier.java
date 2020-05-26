import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CycleIdentifier {

  public static void main (String []  args) throws  IOException{
    /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Введите размерность матрицы");
    int n = Integer.parseInt(reader.readLine());
    int[][] table = new int[n][n];

    System.out.println("Введите элементы матрицы");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++){
        table[i][j] = Integer.parseInt(reader.readLine()); //Заполнение матрицы
      }
    }*/

    int n=7;
    int[][] table ={{0,1,1,1,1,0,0},{1,0,0,1,1,0,0},{1,0,0,0,0,1,1},{1,1,0,0,1,1,0,0,},{1,1,0,1,0,0,0},{0,0,1,0,0,0,1},{0,0,1,0,0,1,0}};


    int sumStr = 0;
    int sumStl = 0;
    int waysCount = 0;

    for (int i=0; i<n; i++){
      for (int j=0; j<n; j++){
        sumStr=sumStr+table[i][j];    //считаем сумму по строкам
      }

      if (sumStr==0){                // если сумма 0
        for (int k=0; k<n; k++){  //обнуляем столбец нулевой строки
          table[k][i]=0;
        }
    }
    }

    for (int j=0; j<n; j++){
      for (int i=0; i<n; i++){
        sumStl=sumStl+table[i][j];    //считаем сумму по cтолбцам
      }

      if (sumStl==0){                // если сумма 0
        for (int k=0; k<n; k++){  //обнуляем строку нулевого столбца
          table[k][j]=0;
        }
      }
  }

    for (int i=0; i<n; i++){
      for (int j=0; j<n; j++){
       if (table[i][j]!=0){
         waysCount = waysCount+1;
       }
      }
    }

    if (waysCount==0){
      System.out.println("Циклов нет");
    } else{
      System.out.println("Циклы есть");
    }

  }
}
