public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(25, "Pepito", "22222", "11122233");
        System.out.println("La persona se llama " + cliente.getNombre() + " tiene " + cliente.getEdad() +
                " años y su numero de telefono es " + cliente.getTelefono() + " Tiene un credito con numero " +
                cliente.getCredito());
        Trabajador trabajador = new Trabajador(28, "Juanito", "888888", 10000);
        System.out.println("El trabajador se llama " + trabajador.getNombre() + " tiene " + trabajador.getEdad() +
                " años y su numero de telefono es " + trabajador.getTelefono() + " Tiene un salario de " +
                trabajador.getSalario());
    }
}
class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public Persona(int edad, String nombre, String telefono){
        this.setEdad(edad);
        this.setNombre(nombre);
        this.setTelefono(telefono);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
class Cliente extends Persona{
    private String credito;

    public Cliente(int edad, String nombre, String telefono, String credito) {
        super(edad, nombre, telefono);
        this.setCredito(credito);
    }

    public String getCredito() {
        return credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }
}
class Trabajador extends Persona{
    private int salario;
    public Trabajador(int edad, String nombre, String telefono, int salario) {
        super(edad, nombre, telefono);
        this.setSalario(salario);
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
