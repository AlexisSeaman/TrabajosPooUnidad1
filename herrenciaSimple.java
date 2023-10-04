class Persona{
    private String nombre;
    private String correo;
    private String telefono;

    public void setNombre(String nom){
        nombre = nom;
    }
    public String getNombre(){
        return nombre;
    }

    public void setCorreo(String corr){
        correo = corr;
    }
    public String getCorreo(){
        return correo;
    }

    public void setTelefono(String tel){
        telefono = tel;
    }
    public String getTelefono(){
        return telefono;
    }
}

class PersonaCasa extends Persona{
    private String parentesco;
    private String posicion;
    private int ingresos;

    public void setParentesco(String paren){
        parentesco = paren;
    }
    public String getParentesco(){
        return parentesco;
    }

    public void setPosicion(String posi){
        posicion = posi;
    }
    public String getPosicion(){
        return posicion;
    }

    public void setIngresos(int ingr){
        ingresos = ingr;
    }
    public int getIngresos(){
        return ingresos;
    }
}

class PersonaEscuela extends Persona{
    private String escuela;
    private String matricula;
    private int promedio;

    public void setEscuela(String escu){
        escuela = escu;
    }
    public String getEscuela(){
        return escuela;
    }

    public void setMatricula(String mat){
        matricula = mat;
    }
    public String getMatricula(){
        return matricula;
    }
    
    public void setPromedio(int prom){
        promedio = prom;
    }
    public int getPromedio(){
        return promedio;
    }
}

class PersonaTrabajo extends Persona{
    private String empresa;
    private int numempleado;
    private int sueldo;

    public void setEmpresa(String emp){
        empresa = emp;
    }
    public String getEmpresa(){
        return empresa;
    }

    public void setNumempleado(int num){
        numempleado = num;
    }
    public int getNumempleado(){
        return numempleado;
    }

    public void setSueldo(int suel){
        sueldo = suel;
    }
    public int getSueldo(){
        return sueldo;
    }
}


public class herrenciaSimple{
    public static void main(String[] args){
        PersonaCasa personaFam = new PersonaCasa();
        PersonaEscuela personaAlu = new PersonaEscuela();
        PersonaTrabajo personaEmpl = new PersonaTrabajo();

        personaFam.setNombre("Alexis");
        personaFam.setCorreo("alexis.seaman@uabc.edu.mx");
        personaFam.setTelefono("6651441144");
        personaFam.setParentesco("Hijo");
        personaFam.setPosicion("3");
        personaFam.setIngresos(1000);

        personaAlu.setNombre("Jorge");
        personaAlu.setCorreo("Jorge@uabc.edu.mx");
        personaAlu.setTelefono("6648766312");
        personaAlu.setEscuela("UABC");
        personaAlu.setMatricula("1267145");
        personaAlu.setPromedio(70);

        personaEmpl.setNombre("Jazmin");
        personaEmpl.setCorreo("Jazmin@gmail.com");
        personaEmpl.setTelefono("6644101077");
        personaEmpl.setEmpresa("Servicios Integrales");
        personaEmpl.setNumempleado(345632);
        personaEmpl.setSueldo(5000);


        System.out.println("**Persona/Casa**");
        System.out.println("Nombre: "+personaFam.getNombre());
        System.out.println("Correo: "+personaFam.getCorreo());
        System.out.println("Telefono: "+personaFam.getTelefono());
        System.out.println("Parentesco: "+personaFam.getParentesco());
        System.out.println("Posicion en la Familia: "+personaFam.getPosicion());
        System.out.println("Ingresos aportados: "+personaFam.getIngresos());
        System.out.println("\n");
        System.out.println("**Persona/Escuela**");
        System.out.println("Nombre Alumno: "+personaAlu.getNombre());
        System.out.println("Correo Alumno: "+personaAlu.getCorreo());
        System.out.println("Telefono Alumno: "+personaAlu.getTelefono());
        System.out.println("Escuela: "+personaAlu.getEscuela());
        System.out.println("Matricula: "+personaAlu.getMatricula());
        System.out.println("Promedio: "+personaAlu.getPromedio());
        System.out.println("\n");
        System.out.println("**Persona/Trabajo**");
        System.out.println("Nombre Empleado: "+personaEmpl.getNombre());
        System.out.println("Correo Empleado: "+personaEmpl.getCorreo());
        System.out.println("Telefono Empleado: "+personaEmpl.getTelefono());
        System.out.println("Nombre Empresa: "+personaEmpl.getEmpresa());
        System.out.println("Numero de Empleado: "+personaEmpl.getNumempleado());
        System.out.println("Sueldo: "+personaEmpl.getSueldo());
    }
    
}
