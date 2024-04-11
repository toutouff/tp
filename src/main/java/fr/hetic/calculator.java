package fr.hetic;

public class calculator {
  static String Calculator(String[] args) {
    if(isValidInteger(args[0]) && isValidInteger(args[1]) && isValidOperator(args[2])) {
      int num1 = Integer.parseInt(args[0]);int num2 = Integer.parseInt(args[1]);
      String operator = args[2];
      switch (operator) {
        case "*":
          return Integer.toString(num1 * num2);
        case "-":
          return Integer.toString(num1 - num2);
        case "+":
          return Integer.toString(num1 + num2);
      }
    }
    return "Error";
    
  }
  public static void main(String[] args) {
    System.out.println(Calculator(args));
  }
    public static boolean isValidInteger(String str) {
        return str.matches("-?\\d+"); // Correspond à un entier positif ou négatif
    }
  public static boolean isValidOperator(String str) {
      return str.matches("[+\\-*]"); // Correspond à un opérateur +, -, * ou /
  }
}

