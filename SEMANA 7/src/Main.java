public class Main {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[3];
        figuras[0] = new Circulo("Círculo", 10.10);
        figuras[1] = new Rectangulo("Rectángulo", 23.0, 6.0);
        figuras[2] = new Triangulo("Triángulo", 35.0, 34.0);

        System.out.println("================================");
        System.out.println("    LAS AREAS DE LAS FIGURAS    ");
        System.out.println("================================\n");

        for (Figura figura : figuras) {
            figura.mostrarInformacion();
            System.out.printf("Área: %.2f%n", figura.calcularArea());
            System.out.println("========================");
        }
    }
}