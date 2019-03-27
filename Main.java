import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[]ars)
    {

        List<Persona> PersonList = Arrays.asList(
                new Persona( 15,40951430)
                ,new Persona(21,39431249)
                ,new Persona(20,5258964)
                ,new Persona(28, 37893932)
                ,new Persona(30,375487212)
                ,new Persona(18, 10000000));


        System.out.println("\n______PERSONAS MAYORES A 21_______");
        System.out.println(String.format("Persona %s" , PersonList.
                                                        stream().
                                                        filter(Persona -> Persona.getEdad() > 21).
                                                        collect(Collectors.toList())));

        System.out.println("\n_______PERSONAS MENORES A 18_________");
        System.out.println(String.format("Persona %s" , PersonList.
                                                        stream().
                                                        filter(Persona -> Persona.getEdad() < 18).
                                                        collect(Collectors.toList())));


        System.out.println("\n________PERSONAS MAYORES A 21 Y UN DNI MAYOR A 200000_________");
        System.out.println(String.format("Persona %s" , PersonList.
                                                        stream().
                                                        filter(Persona -> Persona.getEdad() > 21).
                                                        filter(Persona -> Persona.getDni() > 20000000).
                                                        collect(Collectors.toList())));

    }
}
