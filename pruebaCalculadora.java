package calculadora;

//Clase pruebaCalculadora (main)
public class pruebaCalculadora {
 public static void main(String[] args) {
     // Crear objeto de tipo Calculadora
     Calculadora calculadora = new Calculadora(5, 3);

     // Realizar operaciones
     int resultadoSuma = calculadora.realizarOperacion("suma");
     int resultadoResta = calculadora.realizarOperacion("resta");

     // Mostrar resultados
     System.out.println("Resultado de la suma: " + resultadoSuma);
     System.out.println("Resultado de la resta: " + resultadoResta);
 }
}
