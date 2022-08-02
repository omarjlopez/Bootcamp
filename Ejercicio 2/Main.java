public class Main {
    public static void main(String[] args) {
        int a=1, b=2, c=3;
        System.out.println("La suma de "+a+" + "+b+" + "+c+" Es: "+suma(a,b,c));
        coche miCoche = new coche();
        System.out.println("Mi coche ahora tiene "+miCoche.incrementarPuertas()+" puertas");
    }

    public static int suma(int a, int b, int c){
        return a+b+c;
    }
}

class coche{
    public int puertas=4;
    public int incrementarPuertas(){
        this.puertas ++;
        return this.puertas;
    }
}
