public interface Dibujable {

        // metodo abstracto (sin implementación, cualquier clase que implemente esta interfaz debe tener este metodo
        void dibujar();

        // metodo con implementación por defecto
        default void mostrarInfo() {
            System.out.println("Esta figura se puede dibujar en pantalla");
        }
}
