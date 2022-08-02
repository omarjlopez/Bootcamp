public class Main {
    public static void main(String[] args) {
        int numeroIf = 4;
        if (numeroIf >=0){
            System.out.println("El numero es positivo");
        }
        else{
            System.out.println("El numero es negativo");
        }
        int numeroWhile = 0;
        while (numeroWhile<3){
            System.out.println(numeroWhile);
            numeroWhile ++;
        }
        do{
            System.out.println("El contador es "+numeroWhile);
            numeroWhile++;
        }
        while (numeroWhile==3);
        for(int numeroFor=0; numeroFor<3; numeroFor++){
            System.out.println(numeroFor);
        }
        String estacion= "Invierno";
        switch (estacion){
            case "Invierno":
                System.out.println("La estacion es invierno");
            break;
            case "Primavera":
                System.out.println("La Estación es primavera");
            break;
            case "Verano":
                System.out.println("La estacion es verano");
            break;
            case "Otoño":
                System.out.println("La estacion es otoño");
                break;
            default:
                System.out.println("El valor no es una estación");
        }
    }
}
