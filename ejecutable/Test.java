package ejecutable;

import modelo.Fecha;

public class Test {
    public static void main(String[] args) 
    {
        Fecha f1 = new Fecha(11,5,2023);

        Fecha f2 = new Fecha(11,5,2023);
        


        System.out.println("Dia: " + f1.getDia());
        System.out.println("Mes: " + f1.getMes());
        System.out.println("Año: " + f1.getAnio());
        System.out.println(f1);

        if(f1.equals(f2))
        {
            System.out.println("Son fechas iguales");
        }

        
        
    }
}
