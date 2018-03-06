class Solution {
  public String intToRoman(int num) {
    StringBuilder out = new StringBuilder(30);

    int quotient = num / 1000;
    for (int i = 0; i < quotient; i++) {
      out.append('M');
      num -= 1000;
    }

    quotient = num / 900;
    for (int i = 0; i < quotient; i++) {
      out.append('C');
      out.append('M');
      num -= 900;
    }

    quotient = num / 500;
    for (int i = 0; i < quotient; i++) {
      out.append('D');
      num -= 500;
    }

    quotient = num / 400;
    for (int i = 0; i < quotient; i++) {
      out.append('C');
      out.append('D');
      num -= 400;
    }

    quotient = num / 100;
    for (int i = 0; i < quotient; i++) {
      out.append('C');
      num -= 100;
    }

    quotient = num / 90;
    for (int i = 0; i < quotient; i++) {
      out.append('X');
      out.append('C');
      num -= 90;
    }

    quotient = num / 50;
    for (int i = 0; i < quotient; i++) {
      out.append('L');
      num -= 50;
    }

    quotient = num / 40;
    for (int i = 0; i < quotient; i++) {
      out.append('X');
      out.append('L');
      num -= 40;
    }

    quotient = num / 10;
    for (int i = 0; i < quotient; i++) {
      out.append('X');
      num -= 10;
    }

    quotient = num / 9;
    for (int i = 0; i < quotient; i++) {
      out.append('I');
      out.append('X');
      num -= 9;
    }

    quotient = num / 5;
    for (int i = 0; i < quotient; i++) {
      out.append('V');
      num -= 5;
    }

    quotient = num / 4;
    for (int i = 0; i < quotient; i++) {
      out.append('I');
      out.append('V');
      num -= 4;
    }

    quotient = num / 1;
    for (int i = 0; i < quotient; i++) {
      out.append('I');
      num -= 1;
    }

    return out.toString();
  }
}
