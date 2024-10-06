// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
   int num;
    int i;
    System.out.println("A program that prints the numbers from 1 to 100.");

    for(i=0; i<=100; i++){
      num = randomInt(1,100);
      System.out.println(num);
    }
  }

public static int randomInt(int min, int max){
  int result = (int) (Math.random() * (max - min + 1)) + min;
  return result;
}
 
}
