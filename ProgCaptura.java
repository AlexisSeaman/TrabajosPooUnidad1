class Alumno{
    String nombre;
    String matricula;
    String correo;
    String telefono;
    int promedio;

    public void setNombre(String nom){
        nombre = nom;
    }
    public String getNombre(){
        return nombre;
    }

    public void setMatricula(String mat){
        matricula = mat;
    }
    public String getMatricula(){
        return matricula;
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

    public void setPromedio(int prom){
        promedio = prom;
    }
    public int getPromedio(){
        return promedio;
    }
}

public class ProgCaptura {
    public static void main(String[] args) {
        Alumno al1 = new Alumno();
        al1.setNombre("Alexis");
        al1.setMatricula("1267145");
        al1.setCorreo("alexis.seaman@uabc.edu.mx");
        al1.setTelefono("6651441144");
        al1.setPromedio(90);

        System.out.println("Nombre alumno: "+al1.getNombre());
        System.out.println("Matricula: "+al1.getMatricula());
        System.out.println("Correo alumno: "+al1.getCorreo());
        System.out.println("Telefono alumno: "+al1.getTelefono());
        System.out.println("Promedio: "+al1.getPromedio());
    } 
}
