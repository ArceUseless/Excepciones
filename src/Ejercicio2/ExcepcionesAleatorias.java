package Ejercicio2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcepcionesAleatorias {
  public static void main(String[]args) {
    int radInt;
    
    try {
      radInt = (int) (Math.random()*5);
      switch (radInt) {
        case 0:
          throw new NumberFormatException();
        case 1:
          throw new IOException();
        case 2:
          throw new FileNotFoundException();
        case 3:
          throw new IndexOutOfBoundsException();
        case 4:
          throw new ArithmeticException();
      }
    }catch (Exception e ){
      System.out.println("Excepción: "+e.getClass());
    }
    
  }

}
