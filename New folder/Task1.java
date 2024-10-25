public class NumberFun {
  public static long findNextSquare(long sq) {
      for (long index = 0; index <= (sq / 2); index++){
        if (index * index == sq) {
          for (long element = index+1; element <= sq; element++){
            if((element * element) / element = element) return element; 
          }
        }
        
      }
       return -1;
  }
}