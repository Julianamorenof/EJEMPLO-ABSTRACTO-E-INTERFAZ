void main() {
    // no se puede hacer el scanner (Figura f = new Figura...) porque da error

    // crear objetos de clases normales
    Circulo circulo = new Circulo("Azul", 5.0);
    Rectangulo rectangulo = new Rectangulo("Rojo", 4.0, 6.0);

    // Usar POLIMORFISMO con la clase abstracta

    Figura[] figuras = {circulo, rectangulo};
    System.out.println("DEMOSTRACIÓN DEL POLIMORFISMO CON CLASE ABSTRACTA ");
    for (Figura f : figuras) {
        f.mostrarInfoCompleta(); // se usa metodo de la clase abstracta
    }

    System.out.println("DEMOSTRACIÓN INTERFAZ Dibujable ");

    // Polimorfismo con INTERFAZ
    Dibujable[] dibujables = {circulo, rectangulo};
    for (Dibujable d : dibujables) {
        d.dibujar();        // metodo de la interfaz
        d.mostrarInfo();    // metodo default de la interfaz
        System.out.println();
    }
}



