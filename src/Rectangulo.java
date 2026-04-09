public class Rectangulo extends Figura implements Dibujable {

    private double ancho;
    private double alto;

    public Rectangulo(String color, double ancho, double alto) {
        super(color);
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                ", color='" + color + '\'' +
                ", area=" + area +
                '}';
    }

    // implementa el metodo abstracto de la clase abstracta
    @Override
    public double calcularArea() {
        area = ancho * alto;
        return area;
    }

    // implementa el metodo abstracto de la clase abstracta
    @Override
    public void mostrarDimensiones() {
        System.out.println("Ancho: " + ancho + ", Alto: " + alto);
    }

    // implementa el metodo de la interfaz
    @Override
    public void dibujar() {
        System.out.println("Dibujando rectángulo " + ancho + "x" + alto);
    }
}
