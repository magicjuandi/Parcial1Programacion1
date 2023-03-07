package com.Zoo;

public class MainZoo {

    public static void main(String[] args) {

        mamifero[] mamiferos = new mamifero[6];

        mamifero leon = new Lion(120d, 5, 7.5f, 58, "Sur Africa", 120, 220, 190);
        mamifero tigre = new Tiger("Siberiano", 7.9f, 72, "Rusia", 130, 330, 300);
        mamifero lobo = new Wolf(9, "Ibérico", 2.5f, "Gris marrón y negro", "Europa", 80, 120, 70);
        mamifero perro = new Dog(317, 2.5f, "Tricolor de manchas negras, blancas y óxido", "Africa", 43, 92, 35);
        mamifero tigreBengala = new Tiger("Bengala", 7.9f, 72, "India e Indonesia", 110, 270, 220);
        mamifero guepardo = new Cheetah(4.9f, 130, "Africa", 94, 140, 72);

        mamiferos[0] = leon;
        mamiferos[1] = tigre;
        mamiferos[2] = lobo;
        mamiferos[3] = perro;
        mamiferos[4] = tigreBengala;
        mamiferos[5] = guepardo;

        for (mamifero animal : mamiferos) {

            System.out.println(" =============== " + animal.getClass().getSimpleName() + " =============== ");
            System.out.println("Habitat:" + animal.getHabitat());
            System.out.println("Altura:" + animal.getAltura());
            System.out.println("Largo:" + animal.getLargo());
            System.out.println("Peso:" + animal.getPeso());

            if (animal instanceof Canines) {
                System.out.println("Clomillos:" + ((Canines) animal).getTamanoColmillos());
                System.out.println("Color:" + ((Canines) animal).getColor());

                if (animal instanceof Wolf) {
                    System.out.println("Especie Lobo:" + ((Wolf) animal).getEspecieLobo());
                    System.out.println("Número Integrantes:" + ((Wolf) animal).getNumCamada());
                }
                if (animal instanceof Dog) {
                    System.out.println("Fuerza mordida kg:" + ((Dog) animal).getFuerzaMordida());
                }
            }

            if (animal instanceof Felines) {
                System.out.println("Tamaño Garras:" + ((Felines) animal).getTamanoGarras());
                System.out.println("Velocidad:" + ((Felines) animal).getVelocidad());

                if (animal instanceof Lion) {
                    System.out.println("Potencia Rugido:" + ((Lion) animal).getPotenciaRugidoDecibel());
                    System.out.println("Número Integrantes:" + ((Lion) animal).getNumManada());
                }
                if (animal instanceof Tiger) {
                    System.out.println("especie Tigre:" + ((Tiger) animal).getEspecieTigre());
                }
            }

            System.out.println(animal.comer());
            System.out.println(animal.dormir());
            System.out.println(animal.correr());
            System.out.println(animal.comunicarse());
        }
    }
}
