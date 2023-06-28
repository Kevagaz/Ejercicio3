public class Person{
    private int edad;
    private String nombre;
    private String telefono

    public int getEdad(){
        return edad;
    };
    public void setEdad(int edad){
        this.edad = edad;
    }


    public Stringtring getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getTelefono(){
        return this.telefono;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }


    public static void main(String [] args){
        Persona persona = new Persona();    

        persona.setEdad(27);
        persona.setNombre("Kevin");
        persona.setTelefono(12312345);


        System.out.println("La edad es " + persona.getEdad);
        System.out.println("El nombre es " + persona.getNombre);
        System.out.println("el numero es " + persona.getTelefono)
    }
}