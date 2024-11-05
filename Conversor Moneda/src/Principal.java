import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaDivisa consulta = new ConsultaDivisa();

        int opcion = 0;
        while (opcion != 8) {
            System.out.println("***********************\n" +
                    "Bienvenidos al conversor de monedas\n\n" +
                    "Ingresa la conversion que deseas realizar\n\n" +
                    "1. Dolar a peso Mexicano\n" +
                    "2. Peso Mexicano a Dolar\n" +
                    "3. Dolar a Yuan\n" +
                    "4. Yuan a Dolar\n" +
                    "5. Dolar a Rublo\n" +
                    "6. Rublo a Dolar\n" +
                    "7. Convertir otra divisa...\n" +
                    "8. Salir");
            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion) {
                case 1:
                    ConvertirDivisa.convertir("USD", "MXN", consulta, lectura);
                    break;
                case 2:
                    ConvertirDivisa.convertir("MXN", "USD", consulta, lectura);
                    break;
                case 3:
                    ConvertirDivisa.convertir("USD", "CNY", consulta, lectura);
                    break;
                case 4:
                    ConvertirDivisa.convertir("CNY", "USD", consulta, lectura);
                    break;
                case 5:
                    ConvertirDivisa.convertir("USD", "RUB", consulta, lectura);
                    break;
                case 6:
                    ConvertirDivisa.convertir("RUB", "USD", consulta, lectura);
                    break;
                case 7:
                    ConvertirDivisa.convertirOtraDivisa(consulta, lectura);
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}
