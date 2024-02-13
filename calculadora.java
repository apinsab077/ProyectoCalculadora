package calculadora;

//Clase Calculadora
class Calculadora {
 private int numero1;
 private int numero2;

 // Constructor
 public Calculadora(int numero1, int numero2) {
     this.numero1 = numero1;
     this.numero2 = numero2;
 }

 // Método para realizar operación
 public int realizarOperacion(String operacion) {
     switch (operacion) {
         case "suma":
             return suma();
         case "resta":
             return resta();
         default:
             System.out.println("Operación no válida");
             return 0;
     }
 }

 // Método suma
 public int suma() {
     return numero1 + numero2;
 }
 
//Método resta
 public int resta() {
     return numero1 - numero2;
 }
 
}
