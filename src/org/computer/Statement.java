package org.computer;

public class Statement {
    public static void main(String[] args) {
        String name = "Hi";
      String message = switch (name){
          case "Hi" -> {
              System.out.println("Thi sis Connection");
              yield "Monday";
          }
          default -> throw new IllegalStateException("Unexpected value: " + name);
      };
    }
}
