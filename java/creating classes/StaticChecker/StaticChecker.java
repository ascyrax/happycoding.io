public class StaticChecker {
  static int staticVariableA = 5;
  int normalVariableA = 0;

  public void normalFunctionA() {
    System.out.println("normal function: normal variable = " + normalVariableA);
    System.out.println("normal function: static variable = " +
        staticVariableA);
  }

  public static void staticFunctionA() {
    System.out.println("static function: normal variable = " +
        normalVariableA);
    System.out.println("static function: static variable = " +
        staticVariableA);
  }

  public static void main(String[] args) {
    StaticChecker a = new StaticChecker();
    StaticChecker b = new StaticChecker();
    a.normalVariableA = 4;
    b.normalVariableA = 100;
    a.normalFunctionA();
    b.normalFunctionA();
    StaticChecker.staticFunctionA();
  }
}