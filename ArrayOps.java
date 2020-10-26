public class ArrayOps{
  //4a
  public static int sum(int[] arr){
    int sum = 0;
    for(int i = 0; i<arr.length; i ++){
      sum += arr[i];
    }
    return sum;
  }
  //4b
  public static int largest(int[] arr){
    int large = 0;
    for(int i = 0; i < arr.length; i ++){
      if(arr[i] > large){
        large = arr[i];
      }
    }
    return large;
  }
  //4c
  public static int[] sumRows(int[][] matrix){
    int sum = 0;
    int[] arr = new int[matrix.length];
    for(int i = 0; i < arr.length; i ++){
      arr[i] = sum(matrix[i]);
      sum = 0;
    }
    return arr;
  }
  //4d
  public static int[] largestInRows(int[][] matrix){
    int sum = 0;
    int[] arr = new int[matrix.length];
    for(int i = 0; i < arr.length; i ++){
      arr[i] = largest(matrix[i]);
      sum = 0;
    }
    return arr;
  }
  //4e
  public static int sum(int[][] arr){
    int sum = 0;
    for(int i = 0; i < arr.length; i ++){
      for(int j =0; j < arr[i].length; j ++){
        sum += arr[i][j];
      }
    }
    return sum;
  }
  //5a
  public static int[] sumCols(int[][] matrix){
    int sum = 0;
    int size = matrix[0].length;
    int[] arr = new int[size];
    for(int i= 0; i < matrix.length; i ++){
      for(int j = 0; j < matrix[i].length;j++){
        arr[j] += matrix[i][j];
      }
    }
    return arr;
  }
  //5b
  public static boolean isRowMagic(int[][] matrix){
    int[] arr = sumRows(matrix);
    for(int i = 1; i <arr.length; i ++){
      if(arr[i] != arr[0]){
        return false;
      }
    }
    return true;
  }

}
