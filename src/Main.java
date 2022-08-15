public class Main {
    public static void main(String[] args) {
        //Primer ejercicio
        System.out.println("Primera parte: la suma es " + suma(10, 20, 30));
        //Segundo ejercicio
        Coche miCoche = new Coche();
        miCoche.cantPuertas();
        System.out.println("Segunda parte: El coche tiene " + miCoche.Npuertas + " Puerta");
    }
//funcion del primer ejercicio de la suma de tres valores
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }

//funcion del segundo ejercicio con la funcion de la cantidad de puertas
    public static class Coche {
        public int Npuertas = 0;
        public void cantPuertas() {
            ++this.Npuertas;
        }
    }
}
