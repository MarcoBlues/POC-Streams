import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[]ars)
    {

        List<Persona> PersonList = new ArrayList<>();

        for(int i =1;i<30;i++)
        {
            PersonList.add(new Persona(i*5,i*6000000));
        }

        List<Persona> Aux = PersonList.
                            stream().
                            filter(Persona -> Persona.getEdad() > 21).
                            collect(Collectors.toList());

        List<Persona> Aux2 = PersonList.
                stream().
                filter(Persona -> Persona.getEdad() < 18).
                collect(Collectors.toList());


        List<Persona> Aux3 = PersonList.
                stream().
                filter(Persona -> Persona.getEdad() > 21).
                filter(Persona -> Persona.getDni() > 20000000).
                collect(Collectors.toList());

        System.out.println("\n______PERSONAS MAYORES A 21_______");
        System.out.println(String.format("Persona %s" , Aux));

        System.out.println("\n_______PERSONAS MENORES A 18_________");
        System.out.println(String.format("Persona %s" , Aux2));
        System.out.println("\n________PERSONAS MAYORES A 21 Y UN DNI MAYOR A 200000_________");
        System.out.println(String.format("Persona %s" , Aux3));

    }
}
