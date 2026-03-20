package tarea4;

/**
 * @author Alex
 * @version 1.0
 * @since 2026
 */
public class Utilidades {

    /**
     * Determina si el año es bisiesto
     * @param anio El año que se desea comprobar.
     * @return true si el año es bisiesto, false en caso contrario.
     */
    public static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    /**
     * Km/h a m/s.
     * * @param kmh Velocidad en km/h.
     * @return Velocidad equivalente en m/s.
     */
    public static double kmhAms(double kmh) {
        return kmh / 3.6;
    }

    /**
     * Convierte grados decimales a radianes.
     * * @param grados Valor del ángulo en grados.
     * @return El valor del ángulo en radianes.
     */
    public static double gradosARadianes(double grados) {
        return grados * Math.PI / 180;
    }

    /**
     * Convierte un ángulo expresado en grados, minutos y segundos a radianes.
     * * @param grados Parte entera de los grados.
     * @param minutos Minutos del ángulo.
     * @param segundos Segundos del ángulo.
     * @return El valor del ángulo total convertido a radianes.
     */
    public static double gradosARadianes(int grados, int minutos, int segundos) {
        return gradosARadianes(grados + (minutos / 60.0) + (segundos / 3600.0));
    }

    /**
     * Convierte una temperatura de grados Celsius a Fahrenheit.
     * * @param celsius Temperatura en grados Celsius.
     * @return Temperatura equivalente en Fahrenheit.
     */
    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    /**
     * Convierte una temperatura de grados Fahrenheit a Celsius.
     * * @param fahrenheit Temperatura en grados Fahrenheit.
     * @return Temperatura equivalente en Celsius.
     */
    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    /**
     * Calcula el área de un círculo dado su radio.
     * * @param radio Radio del círculo.
     * @return Área del círculo.
     */
    public static double areaCirculo(double radio) {
        return Math.PI * alCuadrado(radio);
    }

    /**
     * Calcula la longitud de una circunferencia.
     * * @param radio Radio de la circunferencia.
     * @return Longitud total de la circunferencia.
     */
    public static double longitudCircunferencia(double radio) {
        return 2 * Math.PI * radio;
    }

    /**
     * Calcula el cuadrado de un número.
     * * @param num Número base.
     * @return El número elevado a la potencia de 2.
     */
    public static double alCuadrado(double num) {
        return Math.pow(num, 2.0);
    }

    /**
     * Calcula la hipotenusa de un triángulo rectángulo a partir de sus dos catetos.
     * * @param cateto1 Longitud del primer cateto.
     * @param cateto2 Longitud del segundo cateto.
     * @return Longitud de la hipotenusa.
     */
    public static double hipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(alCuadrado(cateto1) + alCuadrado(cateto2));
    }

    /**
     * Calcula la longitud del cateto A de un triángulo rectángulo.
     * (Anteriormente llamado método cat).
     * * @param hipotenusa Longitud de la hipotenusa.
     * @param cateto Longitud del otro cateto (cateto B).
     * @return Longitud del cateto A resultante.
     */
    public static double catetoA(double hipotenusa, double cateto) {
        return Math.sqrt(alCuadrado(hipotenusa) - alCuadrado(cateto));
    }

    /**
     * Convierte una velocidad de millas por hora a kilómetros por hora.
     * * @param mph Velocidad en millas por hora.
     * @return Velocidad equivalente en kilómetros por hora.
     */
    public static double mphAKmh(double mph) {
        return mph * 1.60934;
    }

    /**
     * Convierte una velocidad de kilómetros por hora a millas por hora.
     * * @param kmh Velocidad en kilómetros por hora.
     * @return Velocidad equivalente en millas por hora.
     */
    public static double kmhAMph(double kmh) {
        return kmh / 1.60934;
    }
}