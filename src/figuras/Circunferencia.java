package figuras;

/**
 * Dado un radio, podemos comparar el radio de la circunferencia con otra,
 * mostrar por pantalla el diámetro, el color y el área de dicha circunferencia
 * @author Miguel Ángel Sequeira Sarmiento
 * @version 1.0
 */
public class Circunferencia {
    /**
     * Radio de la circunferencia
     */
    private double radio;
    /**
     * Color de la circunferencia
     */
    private String color;

    /**
     * Inicializa y asigna el radio a la circunferencia
     * @param radio: Radio de la circunferencia
     */
    public Circunferencia(double radio) {

        this.radio = radio;
    }

    /**
     * Getter, obtiene el radio de la circunferencia
     * @return radio: devuelve el radio de la circunferencia
     */
    public double getRadio() {

        return radio;
    }

    /**
     * Setter, asigna el radio a la circunferencia
     * @param radio: Asigna el radio a la circunferencia
     */
    public void setRadio(double radio) {

        this.radio = radio;
    }

    /**
     * Inicializa color a rojo y presenta por pantalla el diámetro, el color y
     * el área de la circunferencia
     */
    public void imprimir() {
        color = "rojo";
        System.out.println("Diámetro: " + 2 * radio);
        System.out.println("Color: " + color);
        double area = 2 * 3.1416 * radio * radio;
        System.out.println(area);
    }

    /**
     * Compara el radio con el de otra circunferencia
     * @param considerarDecimales: True si de deben tener en cuenta los decimales.
     *                           False para tener en cuenta sólo valores absolutos
     * @param otro: Circunferencia con la que queremos comprar
     * @return True si sin iguales o false si son distintas
     */
    public boolean esIgual(boolean considerarDecimales, Circunferencia otro) {
        double radio1 = this.radio;
        double radio2 = otro.getRadio();
        if (considerarDecimales) {
            if (radio1 == radio2)
                return true;
            else
                return false;
        } else {
            if (Math.abs(radio1 - radio2) < 1)
                return true;
            else
                return false;
        }
    }
}

