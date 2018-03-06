/**
 * @param {number} num
 * @return {string}
 */
var intToRoman = function(num) {
  var out = "";

  var quotient = Math.floor(num / 1000);
  for (i = 0; i < quotient; i++) {
    out = out.concat("M");
    num -= 1000;
  }

  quotient = Math.floor(num / 900);
  for (i = 0; i < quotient; i++) {
    out = out.concat("CM");
    num -= 900;
  }

  quotient = Math.floor(num / 500);
  for (i = 0; i < quotient; i++) {
    out = out.concat("D");
    num -= 500;
  }

  quotient = Math.floor(num / 400);
  for (i = 0; i < quotient; i++) {
    out = out.concat("CD");
    num -= 400;
  }

  quotient = Math.floor(num / 100);
  for (i = 0; i < quotient; i++) {
    out = out.concat("C");
    num -= 100;
  }

  quotient = Math.floor(num / 90);
  for (i = 0; i < quotient; i++) {
    out = out.concat("XC");
    num -= 90;
  }

  quotient = Math.floor(num / 50);
  for (i = 0; i < quotient; i++) {
    out = out.concat("L");
    num -= 50;
  }

  quotient = Math.floor(num / 40);
  for (i = 0; i < quotient; i++) {
    out = out.concat("XL");
    num -= 40;
  }

  quotient = Math.floor(num / 10);
  for (i = 0; i < quotient; i++) {
    out = out.concat("X");
    num -= 10;
  }

  quotient = Math.floor(num / 9);
  for (i = 0; i < quotient; i++) {
    out = out.concat("IX");
    num -= 9;
  }

  quotient = Math.floor(num / 5);
  for (i = 0; i < quotient; i++) {
    out = out.concat("V");
    num -= 5;
  }

  quotient = Math.floor(num / 4);
  for (i = 0; i < quotient; i++) {
    out = out.concat("IV");
    num -= 4;
  }

  quotient = Math.floor(num / 1);
  for (i = 0; i < quotient; i++) {
    out = out.concat("I");
    num -= 1;
  }

  return out;
};
