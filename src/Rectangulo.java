public class Rectangulo extends Figura implements Dibujable {

    private double ancho;
    private double alto;

    public Rectangulo(String color, double ancho, double alto) {
        super(color);
        this.ancho = ancho;
        this.alto = alto;
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
