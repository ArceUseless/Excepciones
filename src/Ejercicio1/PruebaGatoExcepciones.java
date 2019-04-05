package Ejercicio1;

public class PruebaGatoExcepciones {
  public static void main(String[] args) {
    GatoExcepciones gato1 = new GatoExcepciones("macho");
    GatoExcepciones gato2 = new GatoExcepciones("hembra");
    GatoExcepciones gato3 = new GatoExcepciones("hembra");
    
    try {
      GatoExcepciones gato4 = gato1.apareaCon(gato2);
      System.out.println("Sexo de gato4 "+gato4.getSexo());
      GatoExcepciones gato5 = gato2.apareaCon(gato3);
      System.out.println(gato5.getSexo());
    }catch(ExcepcionApareamientoImposible eai) {
    }
    
    
    
  }

}
