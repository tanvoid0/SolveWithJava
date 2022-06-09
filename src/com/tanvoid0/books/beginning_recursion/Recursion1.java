package com.tanvoid0.books.beginning_recursion;

public class Recursion1 {
  static final int N = 4;

  public static void main(String[] args) {
    System.out.println(example16(1));
  }

  // 16. 5.6.7 + 6.7.8 + 7.8.9 + 8.9.10 = 1770
  public static int example16(int i) {
    if (i > N) {
      return 0;
    }
    return (4 + i) * (5 + i) * (6 + i) + example16(i + 1);
  }

  // 15. 2.5.8 + 5.8.11 + 8.11.14 + 11.14.17 = 4370
  public static int example15(int i) {
    if (i > N) {
      return 0;
    }
    return (3 * i - 1) * (3 * (i + 1) - 1) * (3 * (i + 2) - 1) + example15(i + 1);
  }

  // 14. 1.3.5.7 + 3.5.7.9 + 5.7.9.11 + 7.9.11.13 = 13524
  public static int example14(int i) {
    if (i > N) {
      return 0;
    }
    return (2 * i - 1) * (2 * (i + 1) - 1) * (2 * (i + 2) - 1) * (2 * (i + 3) - 1) + example14(i + 1);
  }

  // 13. 1.2.3 + 2.3.4 + 3.4.5 + 4.5.6 = 210
  public static int example13(int i) {
    if (i > N) {
      return 0;
    }
    return i * (i + 1) * (i + 2) + example13(i + 1);
  }

  // 12. 1^2.2^2 + 2^2.3^2 + 3^2.4^2 + 4^2.5^2 = 584
  public static int example12(int i) {
    if (i > N) {
      return 0;
    }
    return (i * i) * (i + 1) * (i + 1) + example12(i + 1);
  }

  // 11. 1.2^2 + 2.3^2 + 3.4^2 + 4.5^2 = 170
  public static int example11(int i) {
    if (i > N) {
      return 0;
    }
    return i * (i + 1) * (i + 1) + example11(i + 1);
  }

  // 10. 1.1^2 + 2.3^2 + 3.5^2 + 4.7^2 = 290
  public static int example10(int i) {
    if (i > N) {
      return 0;
    }
    return i * (2 * i - 1) * (2 * i - 1) + example10(i + 1);
  }

  // 9. 1^2 + 3^2 + 5^2 + 7^2 = 84
  public static int example9(int i) {
    if (i > N) {
      return 0;
    }
    return (2 * i - 1) * (2 * i - 1) + example9(i + 1);
  }

  // 8. 1.3 + 3.5 + 5.7 + 7.9 = 116
  public static int example8(int i) {
    if (i > N) {
      return 0;
    }
    return (2 * i - 1) * (2 * i + 1) + example8(i + 1);
  }

  // 7. 2.1 + 5.3 + 8.5 + 11.7 = 134
  public static int example7(int i) {
    if (i > N) {
      return 0;
    }
    return (3 * i - 1) * (2 * i - 1) + example7(i + 1);
  }

  // 6. 1.2 + 2.3 + 3.4 + 4.5 = 40
  public static int example6(int i) {
    if (i > N) {
      return 0;
    }
    return (i * (i + 1)) + example6(i + 1);
  }

  // 5. 2+5+8+11=26
  public static int example5(int i) {
    if (i > N) {
      return 0;
    }
    return (3 * i - 1) + example5(i + 1);
  }

  // 4. 4+12+20+28 = 100
  public static int example4(int i) {
    if (i > N) {
      return 0;
    }
    return 4 * (i * 2 - 1) + example4(i + 1);
  }

  // 3. 1+3+5+7=16
  public static int example3(int i) {
    if (i > N) {
      return 0;
    }
    return (2 * i - 1) + example3(i + 1);
  }

  // 2. 2+4+6+8=20
  public static int example2(int i) {
    if (i > N) {
      return 0;
    }
    return (2 * i) + example2(i + 1);
  }

  // 1. 1+2+3+4=10
  public static int example1(int i) {
    if (i > N) {
      return 0;
    }
    return i + example1(i + 1);
  }

}
