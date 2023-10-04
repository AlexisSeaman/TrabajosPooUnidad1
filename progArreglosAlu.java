import java.util.Scanner;
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

public class progArreglosAlu{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cantidad de Alumnos: ");
        int CanAlumnos = sc.nextInt();
        sc.nextLine();
        Alumno[] Alumnos = new Alumno[CanAlumnos];
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

        for (int i=0;i<Alumnos.length;i++){
            System.out.println("Alumno - " +(i+1));
            System.out.println("Nombre alumno: " +Alumnos[i].getNombre());
            System.out.println("Matricula alumno: " +Alumnos[i].getMatricula());
            System.out.println("Correo alumno: " +Alumnos[i].getCorreo());
            System.out.println("Telefono alumno: " +Alumnos[i].getTelefono());
            System.out.println("Promedio alumno: " +Alumnos[i].getPromedio());
            System.out.println();
        }
    }   
}
