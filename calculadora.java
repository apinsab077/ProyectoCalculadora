
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
         case "multiplicacion":
             return multiplicacion();
         case "division":
             return (int) division();
         case "modulo":
             return (int) modulo();
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
 

//Método multiplicación
 public int multiplicacion() {
     return numero1 * numero2;
 }
 
// Método división
 public double division() {
     if (numero2 == 0) {
         System.out.println("No se puede dividir por cero");
         return 0;
     }
     return (double) numero1 / numero2;
 }

// Método modulo
 public double modulo() {
    if (numero2 == 0) {
        System.out.println("No se puede dividir por cero");
        return 0;
    }
    return (double) numero1 % numero2;
}
}

