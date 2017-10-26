package customExeptions;

public class NoCarFoundExeption extends RuntimeException {

   public NoCarFoundExeption(String errorMessage) {
       super(errorMessage);
   }
}
