class TestLogicVar {
  int a = 10;
  double b = 5 / 2;
  double c = 5 / 2.0;
  boolean d = (3 > 2 == 2 > 1);
  boolean e = (2 == 2) && (3 < 1 || 4 > 3);

  void print() {
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("c = " + c);
    System.out.println("d = " + d);
    System.out.println("e = " + e);
  }
}
