package Ejercicio1;

public class GatoExcepciones {
  //Atributos
   
  String color, raza, sexo;
  int edad;
  double peso;
  
  //Constructor
  GatoExcepciones(String s){
    this.sexo = s;
  }
  
  //Getter
  String getSexo() {
    return this.sexo;
  }
  
  void maulla() {
    System.out.println("Miauuuu");
  }
  
  void ronronea() {
    System.out.println("Mrrrrrr");
  }
  
  void come(String comida) {
    if(comida.equals("pescado")){
      System.out.println("Hmmm, gracias");
    }else {
      System.out.println("Lo siento, yo solo como pescado.");
    }
  }
  
  void peleaCon(GatoExcepciones contrincante) {
    if (this.sexo.equals("hembra")) {
      System.out.println("No me gusta pelear");
    }
    if(contrincante.sexo.equals("hembra")){
      System.out.println("No peleo contra gatitas");
    } else {
      System.out.println("Ven aquí que te vas a enterar");
    }
  }
  
  /**
   * Devuelve un nuevo objeto Gato
   * 
   * @param Gato Objeto de tipo GatoExcepciones
   * @return Un objeto de tipo GatoExcepciones
   * @throws ExcepcionApareamientoImposible 
   */
  GatoExcepciones apareaCon(GatoExcepciones gato) throws ExcepcionApareamientoImposible {
    if(this.getSexo() == gato.getSexo()) {
      throw new ExcepcionApareamientoImposible();
    }
    return new GatoExcepciones("hembra");
  }
  
  
}
