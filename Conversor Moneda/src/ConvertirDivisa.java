import java.util.Scanner;

public class ConvertirDivisa {

    public static void convertir(String monedaBase, String monedaTarget, ConsultaDivisa consulta, Scanner lectura) {
        double cantidad;
        double cantidadConvertida;
        Moneda moneda = consulta.buscaDivisa(monedaBase, monedaTarget);
        System.out.println("La tasa de conversión de hoy\n1 " + monedaBase + " = " + moneda.conversion_rate() + " " + monedaTarget);
        System.out.println("Ingrese la cantidad de " + monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * moneda.conversion_rate();
        System.out.println(cantidad + " " + monedaBase + " = " + cantidadConvertida + " " + moneda.target_code());
    }

    public static void convertirOtraDivisa(ConsultaDivisa consulta, Scanner lectura) {
        System.out.println("Ingresa el código de la moneda base:");
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.println("Ingresa la moneda objetivo:");
        String monedaObjetivo = lectura.nextLine().toUpperCase();
        convertir(monedaBase, monedaObjetivo, consulta, lectura);
    }
}
