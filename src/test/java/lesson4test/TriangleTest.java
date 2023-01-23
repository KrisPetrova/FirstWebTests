package lesson4test;


/*import lesson4.TriangleArea;
import lesson4.TriangleException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TriangleTest {

  static Logger logger = LoggerFactory.getLogger(TriangleTest.class);

  @Test
  @Disabled
  public void simpleTest(){
      logger.info("Инфо");
      logger.error("ошибка");
      assertTrue(true);
  }

  private void assertTrue(boolean b) {
  }

private void assertTrue() {
  }


  @Test
  void test() throws TriangleException {
      TriangleArea triangleArea = new TriangleArea();
      Assertions.assertEquals(6,triangleArea.geroneSquare(3, 4, 5));
      Assertions.assertThrows(TriangleException.class,()-> triangleArea.geroneSquare(3, 4, 5));
  }

  @ParameterizedTest
  @CsvSource({ "10,20,30","100,200,300","1,2,3"})
  void testWithCsvSource(int a, int b, int result) throws TriangleException {
      TriangleArea triangleArea = new TriangleArea();
      Assertions.assertEquals(result,triangleArea.geroneSquare(a,b));

  }

  @ParameterizedTest
  @CsvSource({ "-10,20","-100, 200","1,-2"})
  void testWithCsvSourceN(int a, int b) throws TriangleException {
      TriangleArea triangleArea = new TriangleArea();
      Assertions.assertThrows(TriangleException.class,()-> triangleArea.geroneSquare(a,b));

  }
}*/