package org.example;

public class Main {
    public static void main(String[] args) {
        // Crear un collar y un perro
        Collar collar = new Collar("rojo");
        Perro perro = new Perro("Rocky", collar);

        // Crear un gato
        Gato gato = new Gato("Michi");

        // Crear una veterinaria
        Consultorio consultorio = new Consultorio("Av. Central 123");
        Veterinaria vet = new Veterinaria(consultorio);

        // Atender a los animales
        vet.atender(perro);
        vet.atender(gato);

        // Genéricos
        Caja<Animal> cajaAnimal = new Caja<>();
        cajaAnimal.guardar(gato);

        Animal a = cajaAnimal.obtener();
        a.sonido();

        // Casting
        Animal animal = new Perro("Bobby", new Collar("azul"));
        if (animal instanceof Perro) {
            Perro p = (Perro) animal;
            p.moverCola();
            System.out.println("Collar de color: " + p.getCollar().getColor());
        }
    }
}
