import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        System.out.println("Hello world!");
//        System.out.println("Hola amigoooooo");
//        System.out.println("Como andas che");
//
//
//        System.out.println("-----BUCLES-----");
//        System.out.println("-----Array-----");
//
//        String[] studentNames = {"Pablo", "Lorenzo", "Ariel"};
//
//        System.out.println("=====CICLO FOR=====");
//        for (int i = 0; i < studentNames.length; i++) {
//            System.out.println("Este es un estudiante: " + studentNames[i]);
//        }
//
//        System.out.println("=====CICLO WHILE=====");
//        int i = 0;
//        while (i < studentNames.length) {
//            System.out.println(studentNames[i]);
//            i++;
//        }
//
//        System.out.println("=====CICLO FOR EACH=====");
//
//        for (String studentName : studentNames) {
//            System.out.println(studentName);
//        }
//
//        System.out.println("=====STREAM=====");
//        Arrays.stream(studentNames).forEach(System.out::println);
////        Arrays.straem(studentNames).forEach(name -> System.out::println(name));
//        // NOS PERMITE CONVERTIR EL ARRAY EN UN OBJETO
//

//        Scanner scanner = new Scanner(System.in); // con esto leo la consola
//        System.out.println("INGRESA TU NOMBRE:");
//        String name = scanner.nextLine(); //para leer nombres
//        System.out.println("hola amigo, vos te llamás---> " + name);
//        System.out.println("INGRESA TU EDAD:");
//        int age =scanner.nextInt();
//
//        if (age<18){
//            System.err.println("la edad no puede ser negativa");
//        }else {
//            System.out.println("Bienvenido");
//        }
//        System.out.println("addios mundito");
//        scanner.close(); // para cerrar el scanner, es buena practica hacer esto.


//        String[] arrayGrande = {"pedro", "arbol", "corazón", "amigo", "indigo", "calzón", "uranio"};
//
//        for (int i = 0; i < arrayGrande.length; i++) {
//            char primeraLetra = arrayGrande[i].charAt(0);
//            String vocales = "aeiou";
//            if (vocales.indexOf(primeraLetra) != -1) {
//                System.out.println(arrayGrande[i]);
//            } else {
//                System.out.println("letra no válida --> " + arrayGrande[i]);
//            }
//        }
//       CREACIÓN DE ARCHIVOS
        FileWriter writer = new FileWriter("demo.txt", true);
        writer.write("Esto es un mensaje importante\n");
        writer.write("Este es otro mensajito\n");
        writer.close();

    }
}