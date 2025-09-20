package org.example;

public class Veterinaria {
    private Consultorio consultorio;

    public Veterinaria(Consultorio consultorio) {
        this.consultorio = consultorio;
    }

    public void atender(Animal a) {
        System.out.println("Atendiendo en consultorio: " + consultorio.getUbicacion());
        a.sonido();  // Polimorfismo: ejecuta sonido() del objeto real (Perro o Gato)
    }
}
