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

}
