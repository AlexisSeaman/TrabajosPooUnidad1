class PersonaCasa{
    private String nombre;
    private int edad;
    private String parentesco;
    private int posicion;
    private int ingresos;

    public PersonaCasa(String nombre, int edad, String parentesco, int posicion, int ingresos){
    this.nombre = nombre;
    this.edad = edad;
    this.parentesco = parentesco;
    this.posicion = posicion;
    this.ingresos = ingresos;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    }

    public void setParentesco(String parentesco){
        this.parentesco = parentesco;
    }
    public String getParentesco(){
        return parentesco;
    }

    public void setPosicion(int posicion){
        this.posicion = posicion;
    }
    public int getPosicion(){
        return posicion;
    }

    public void setIngresos(int ingresos){
        this.ingresos = ingresos;
    }
    public int getIngresos(){
        return ingresos;
    }
}

class PersonaEscuela{
    private String nombre;
    private int edad;
    private String escuela;
    private String matricula;
    private int promedio;

    public PersonaEscuela(String nombre, int edad, String escuela, String matricula, int promedio){
        this.nombre = nombre;
        this.edad = edad;
        this.escuela = escuela;
        this.matricula = matricula;
        this.promedio = promedio;
    }

    public void setNombre(String nombre){
    this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    }

    public void setEscuela(String escuela){
        this.escuela = escuela;
    }
    public String getEscuela(){
        return escuela;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public String getMatricula(){
        return matricula;
    }

    public void setPromedio(int promedio){
        this.promedio = promedio;
    }
    public int getPromedio(){
        return promedio;
    }
}

class PersonaTrabajo{
    private String nombre;
    private int edad;
    private String empresa;
    private int numempleado;
    private int sueldo;

    public PersonaTrabajo(String nombre, int edad, String empresa, int numempleado, int sueldo){
        this.nombre = nombre;
        this.edad = edad;
        this.numempleado = numempleado;
        this.empresa = empresa;
        this.sueldo = sueldo;
    }

    public void setNombre(String nombre){
    this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    }

    public void setEmpresa(String empresa){
    this.empresa = empresa;
    }
    public String getEmpresa(){
        return empresa;
    }

    public void setNumEmpleado(int numempleado){
        this.numempleado = numempleado;
    }
    public int getNumEmpleado(){
        return numempleado;
    }

    public void setSueldo(int sueldo){
        this.sueldo = sueldo;
    }
    public int getSueldo(){
        return sueldo;
    }
}

public class progAbstraccion{
    public static void main(String[] args) {
        PersonaCasa personaCas = new PersonaCasa("Alexis", 24, "Hijo", 3 , 1000);
        PersonaEscuela personaEscu = new PersonaEscuela("Jorge", 21, "Uabc", "1265432", 80);
        PersonaTrabajo personaTrab = new PersonaTrabajo("Maria", 31, "Servicios", 23452, 10000);

        System.out.println("Persona Familia:");
        System.out.println("Nombre: " + personaCas.getNombre());
        System.out.println("Edad: " + personaCas.getEdad());
        System.out.println("Relación: " + personaCas.getParentesco());
        System.out.println("Integrantes Hogar: " + personaCas.getPosicion());
        System.out.println("Hobby: " + personaCas.getIngresos());

        System.out.println("\nAlumno:");
        System.out.println("Nombre: " + personaEscu.getNombre());
        System.out.println("Edad: " + personaEscu.getEdad());
        System.out.println("Promedio: " + personaEscu.getPromedio());
        System.out.println("Escuela: " + personaEscu.getEscuela());
        System.out.println("Carrera: " + personaEscu.getMatricula());

        System.out.println("\nPersona Empleo:");
        System.out.println("Nombre: " + personaTrab.getNombre());
        System.out.println("Edad: " + personaTrab.getEdad());
        System.out.println("Puesto: " + personaTrab.getNumEmpleado());
        System.out.println("Empresa actual: " + personaTrab.getEmpresa());
        System.out.println("Salario: " + personaTrab.getSueldo());
    }
}