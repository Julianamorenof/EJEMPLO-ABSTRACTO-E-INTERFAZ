public abstract class Figura {

    // Propiedades compartidas por todas las figuras
    protected String color;
    protected double area;

    // Constructor
    public Figura(String color) {
        this.color = color;
        this.area = 0;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Figura{" +
                "color='" + color + '\'' +
                ", area=" + area +
                '}';
    }

    // metodo normal (con implementación)
    public void mostrarColor() {
        System.out.println("Color: " + color);
    }

    // metodo constructor de area (común pero necesita ser calculado)

    public abstract double calcularArea(); // Las subclases lo deben tener, es el metodo abstracto sin implementacion

    // metodo abstracto
    public abstract void mostrarDimensiones(); //metodo concreto con implementacion

    // metodo normal que usa el metodo abstracto
    public final void mostrarInfoCompleta() {
        System.out.println("INFORMACIÓN DE LA FIGURA");
        mostrarColor();
        calcularArea();
        System.out.println("Área: " + area);
        mostrarDimensiones();
    }
}
