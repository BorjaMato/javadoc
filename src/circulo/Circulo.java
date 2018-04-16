package circulo;
/*
 * Clase Circulo para probas en NetBeans 
 */

/**
 *Representa un circulo y coordenadas
 * @author uadmin
 * @version 1.0.0
 */

public class Circulo {
    private int x;
    private int y;
    private double radio;

    /*
     * Constructor para a clase Circulo que asigna valores das
     * coordenadas x, y así como valor do radio
     */

    /**
     * Constructor para a clase Circulo que asigna valores das
     * coordenadas x, y así como valor do radio
     * @param valorX coordenada x
     * @param valorY coordenada y
     * @param valorRadio valor radio
     */

    public Circulo(int valorX, int valorY, double valorRadio) {
        establecerX(valorX);
        establecerY(valorY);
        establecerRadio(valorRadio);
    }

    /**
     * Metodo para la coordenada x
     * @param valorX pues si
     */
    public void establecerX(int valorX) {
        x=valorX;
    }

    /**
     * Medoto para optener la X
     * @return X ok
     */
    public int obterX() {
        return x;
    }

    /**
     * Coordenada Y
     * @param valorY y
     */
    public void establecerY(int valorY) {
        y=valorY;
    }

    /**
     * Devuelve Y
     * @return y
     */
    public int obterY() {
        return y;
    }

    /**
     * Valor de radio
     * @param valorRadio radio
     */
    public void establecerRadio(double valorRadio) {

        radio=(valorRadio < 0.0 ? 0.0 : valorRadio);
    }

    /**
     * Devuelve el radio
     * @return radio
     */
    public double obterRadio() {
        return radio;
    }

    /**
     * obtener el diametro
     * @return radio*2
     */
    public double obterDiametro() {
        return radio * 2;
    }

    /**
     * obtener la circunferencia
     * @return circuferencia
     */
    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    /**
     * obtener area
     * @return area
     */
    public double obterArea() {
        return Math.PI * radio * radio;
    }
    
    @Override
    public String toString() {
        return "Centro = [" + x + "," + y + "]; Radio = " + radio;
    }
}
