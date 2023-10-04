import java.util.Scanner;

class Persona{
    String nombre;
    String correo;
    String telefono;

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

class Alumno extends Persona{
    String matricula;
    int promedio;

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

class Profesor extends Persona{
    int numempleado;
    int sueldo;

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

public class ProgHerencias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cantidad de Alumnos: ");
        int CanAlumnos = sc.nextInt();
        sc.nextLine();
        Alumno[] Alumnos = new Alumno[CanAlumnos];
        Profesor profesor = new Profesor();
        for (int i=0;i<Alumnos.length;i++){
            Alumno alumno = new Alumno();
            System.out.println("Datos del alumno - " +(i+1));
            System.out.println("Nombre Alumno: "); 
            alumno.setNombre(sc.nextLine());
            System.out.println("Matricula Alumno: ");
            alumno.setMatricula(sc.nextLine());
            System.out.println("Correo Alumno: ");
            alumno.setCorreo(sc.nextLine());
            System.out.println("Telefono Alumno: ");
            alumno.setTelefono(sc.nextLine());
            System.out.println("Promedio Alumno: ");
            alumno.setPromedio(sc.nextInt());
            sc.nextLine();
            Alumnos[i] = alumno;
            System.out.println();
        }

        System.out.println("Datos del Profesor");
        System.out.println("Nombre: ");
        profesor.setNombre(sc.nextLine());
        System.out.println("Correo: ");
        profesor.setCorreo(sc.nextLine());
        System.out.println("Telefono: ");
        profesor.setTelefono(sc.nextLine());
        System.out.println("Num. Empleado: ");
        profesor.setNumempleado(sc.nextInt());
        sc.nextLine();
        System.out.println("Sueldo: ");
        profesor.setSueldo(sc.nextInt());
        sc.nextLine();
        for (int i=0;i<Alumnos.length;i++){
            System.out.println("Alumno - " + (i+1));
            System.out.println("Nombre alumno: " + Alumnos[i].getNombre());
            System.out.println("Matricula alumno: " + Alumnos[i].getMatricula());
            System.out.println("Correo alumno: " + Alumnos[i].getCorreo());
            System.out.println("Telefono alumno: " + Alumnos[i].getTelefono());
            System.out.println("Promedio alumno: " + Alumnos[i].getPromedio());
            System.out.println("\n");
        }
        System.out.println("Nombre del profesor: " + profesor.getNombre());
        System.out.println("Correo: " + profesor.getCorreo());
        System.out.println("Telefono: " + profesor.getTelefono());
        System.out.println("Num. de empleado: " + profesor.getNumempleado());
        System.out.println("Sueldo: " + profesor.getSueldo());
    }
}
