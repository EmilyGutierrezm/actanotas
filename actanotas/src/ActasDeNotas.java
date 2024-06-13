import java.util.InputMismatchException;
import java.util.Scanner;

public class ActasDeNotas {
    private String nombreCurso;
    private String periodoLectivo;
    private String carrera;
    private String modalidad;
    private int codigoCurso;
    private int grupo;
    private int codigoAsignatura;
    private int codigoProgramaAsignatura;
    private int cantidadEstudiantes;

    public static void main(String[] args) {
        ActasDeNotas actasDeNotas = new ActasDeNotas();
        actasDeNotas.solicitarInformacion();
        actasDeNotas.mostrarInformacion();
    }

    public void solicitarInformacion() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el nombre del curso: ");
            nombreCurso = scanner.nextLine();

            System.out.print("Ingrese el período lectivo: ");
            periodoLectivo = scanner.nextLine();

            System.out.print("Ingrese la carrera: ");
            carrera = scanner.nextLine();

            System.out.print("Ingrese la modalidad: ");
            modalidad = scanner.nextLine();

            System.out.print("Ingrese el código del curso: ");
            codigoCurso = scanner.nextInt();

            System.out.print("Ingrese el grupo: ");
            grupo = scanner.nextInt();

            System.out.print("Ingrese el código de asignatura: ");
            codigoAsignatura = scanner.nextInt();

            System.out.print("Ingrese el código de programa de asignatura: ");
            codigoProgramaAsignatura = scanner.nextInt();

            System.out.print("Ingrese la cantidad de estudiantes: ");
            cantidadEstudiantes = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese datos válidos.");
            solicitarInformacion();
        }
    }

    public void mostrarInformacion() {
        System.out.println("Datos Generales:");
        System.out.println("Nombre del curso: " + nombreCurso);
        System.out.println("Período lectivo: " + periodoLectivo);
        System.out.println("Carrera: " + carrera);
        System.out.println("Modalidad: " + modalidad);
        System.out.println("Código del curso: " + codigoCurso);
        System.out.println("Grupo: " + grupo);
        System.out.println("Código de asignatura: " + codigoAsignatura);
        System.out.println("Código de programa de asignatura: " + codigoProgramaAsignatura);
        System.out.println("Cantidad de estudiantes: " + cantidadEstudiantes);
    }
}
