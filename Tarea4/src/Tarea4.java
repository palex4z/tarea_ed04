
package javaapplication9;

public class JavaApplication9 {

    public static void main(String[] args) {
        System.out.println("Febrero de 2026 tiene " + Pruebas.diasEnMesArray(2, 2026) + " d�as");
        System.out.println("60mph son " + Pruebas.kmhAms(Pruebas.mphAKmh(60)) + " metros por segundo");
        System.out.println("Si el cateto A mide 3cm y el cateto B mide 4cm, entonces la hipotenusa mide "
                + Pruebas.hip(3, 4) + "cm");
    }

}
