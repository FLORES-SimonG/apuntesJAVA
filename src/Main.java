import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hola amigoooooo");
        System.out.println("Como andas che");


        System.out.println("-----BUCLES-----");
        System.out.println("-----Array-----");

        String[] studentNames = {"Pablo", "Lorenzo", "Ariel"};

        System.out.println("=====CICLO FOR=====");
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("Este es un estudiante: " + studentNames[i]);
        }

        System.out.println("=====CICLO WHILE=====");
        int i = 0;
        while (i < studentNames.length) {
            System.out.println(studentNames[i]);
            i++;
        }

        System.out.println("=====CICLO FOR EACH=====");

        for (String studentName : studentNames) {
            System.out.println(studentName);
        }

        System.out.println("=====STREAM=====");
        Arrays.stream(studentNames).forEach(System.out::println);
//        Arrays.straem(studentNames).forEach(name -> System.out::println(name));
        // NOS PERMITE CONVERTIR EL ARRAY EN UN OBJETO


    }
}