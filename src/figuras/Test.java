package figuras;

/**
 * Clase principal del proyecto
 * @author Miguel Ángel Sequeira Sarmiento
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {
        //Creamos tres circunferencias
        Circunferencia c1 = new Circunferencia(5.5);
        Circunferencia c2 = new Circunferencia(10.1);
        Circunferencia c3 = new Circunferencia(10.9);

        /**
         * Comparamos la circunferencia c2 con la c3 sin tener encuenta
         * los decimales
         */
        if (c2.esIgual(false, c3))
            System.out.println("c2 y c3: iguales sin considerar decimales");

        /**
         * comparamos la circunferencia c2 con la c3 teniendo en cuenta
         * los decimales
         */
        if (c2.esIgual(true, c3))
            System.out.println("c2 y c3: iguales considerando decimales");
    }

}
