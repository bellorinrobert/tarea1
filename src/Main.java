public class Main {
    public static void main(String[] args) {

        int resultado = 0;

        resultado = suma(2,30,28);

        System.out.println(resultado);

        Coche miCarro = new Coche();

        miCarro.AgregarPuerta();

        System.out.println(miCarro.puertas);

    }

    public static int suma(int x, int y, int z){
        return x + y + z;
    }

}

class Coche {
    public int puertas = 0;

    public void AgregarPuerta(){

        this.puertas++;

    }

}