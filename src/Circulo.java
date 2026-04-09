public class Circulo extends Figura implements Dibujable {

    private double radio;

    public Circulo(String color, double radio) {
        super(color); // Llama al constructor de la clase abstracta
        this.radio = radio;
    }

    // implementa el metodo abstracto de la clase abstracta
    @Override
    public double calcularArea() {
        area = Math.PI * radio * radio;
        return area;
    }

    // implementa el metodo abstracto de la clase abstracta
    @Override
    public void mostrarDimensiones() {
        System.out.println("Radio: " + radio);
    }

    // implementa el metodo de la interfaz
    @Override
    public void dibujar() {
        System.out.println("Dibujando círculo de radio " + radio);
    }
}
