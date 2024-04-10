package fr.hetic;

public class calculator {
  static int Calculator(int num1,int num2,String operator) {
    switch (operator) {
      case "*":
        return num1 * num2;
      case "-":
        return num1 - num2;
      case "+":
        return num1+num2;
      default:return 9999;
    }
  }
  public static void main(String[] args) {
    System.out.println(Calculator(Integer.parseInt(args[0]),Integer.parseInt(args[1]),args[2]));
  }

}

