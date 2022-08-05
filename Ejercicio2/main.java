public class Main {
    public static void main(String[] args) {
        Persona sujeto = new Persona();
        sujeto.setEdad(23);
        sujeto.setNombre("Pepito");
        sujeto.setTelefono("11122223333");
        System.out.println("La persona se llama "+sujeto.getNombre()+" tiene "+sujeto.getEdad()+
                " años y su numero de telefono es "+sujeto.getTelefono());
    }

}
    class Persona{
        private int edad;
        private String nombre;
        private String telefono;

        public Persona(){}
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
