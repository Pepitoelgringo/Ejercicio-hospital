import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int opcion = -1;
        try {
            //creo el objeto para crear una cuenta corriente
            Hospital hospital = new Hospital("Hospital General", "Calle Principal, Ciudad");
            Planta planta1 = new Planta(1, "Trauma");
            Cama cama1 = new Cama(1, planta1);
            Medico medico = new Medico("Dr. Pérez", "Pediatra");
            Enfermo enfermo = new Enfermo();
            do {
                //Try catch para evitar que el programa termine si hay un error
                System.out.println("MENU DE OPCIONES:" +
                        "\n1.- Introducir datos del paciente" +
                        "\n2.- Ingresar al paciente" +
                        "\n3.- Dar de alta" +
                        "\n0.- Salir");
                System.out.println("Enter la opcion elegida: ");
                opcion = reader.nextInt();
                //Ejemplo de switch case en Java
                switch (opcion) {
                    case 1:
                        if (enfermo.getNombrepaciente()==null) {
                            System.out.println("Introduce el nombre del paciente");
                            enfermo.setNombrepaciente(reader.next());
                            System.out.println("Introduce el numero de la seguridad social");
                            enfermo.setNumeross(reader.nextInt());
                        } else {
                            System.out.println("Hospital lleno");
                        }
                        break;
                    case 2:
                        enfermo.asignarcama(cama1);
                        enfermo.asignarmedico(medico);
                        break;
                    case 3:
                        enfermo.desasignarmedico();
                        enfermo.desasignarcama();
                        break;
                    case 0:
                        System.out.println("Adios!");
                        break;
                    default:
                        System.out.println("Número no reconocido");
                        break;
                }//switch
                System.out.println("\n"); //Mostrar un salto de línea en Java
            } while (opcion != 0);//while
            System.out.println("Hasta pronto");
        } //try
        catch (Exception e) {
            System.out.println("Uoop! Error!");
        }//catch
    }//main
}