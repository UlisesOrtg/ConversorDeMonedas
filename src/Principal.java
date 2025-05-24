import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws InterruptedException {
        Scanner lectura = new Scanner(System.in);
        ConsultarCambio consulta = new ConsultarCambio();
        int salir = 1;

        while (salir != 0) {
            System.out.println("***************************************************");
            System.out.println("Bienvenido a la aplicacion de Cambio de divisas");
            System.out.println("***************************************************");
            System.out.println("1) Dolar >>> Peso Argentino");
            System.out.println("2) Peso Argentino >>> Dolar");
            System.out.println("3) Dolar >>> Real Brasil");
            System.out.println("4) Real Brasil >>> Dolar");
            System.out.println("5) Dolar >>> Peso Colombiano");
            System.out.println("6) Peso Colombiano >>> Dolar");
            System.out.println("7) Peso Mexicano >>> Dolar");
            System.out.println("8) Dolar >>> Peso Mexicano");
            System.out.println("9) SALIR");
            System.out.println("*****************************************");
            System.out.println("Elija una opcion valida: ");


            String opcion = lectura.nextLine();
            String base = "", destino = "";

            switch (opcion) {
                case "1":
                    base = "USD";
                    destino = "ARS";
                    break;
                case "2":
                    base = "ARS";
                    destino = "USD";
                    break;
                case "3":
                    base = "USD";
                    destino = "BRL";
                    break;
                case "4":
                    base = "BRL";
                    destino = "USD";
                    break;
                case "5":
                    base = "USD";
                    destino = "COP";
                    break;
                case "6":
                    base = "COP";
                    destino = "USD";
                    break;
                case "7":
                    base = "MXN";
                    destino = "USD";
                    break;
                case "8":
                    base = "USD";
                    destino = "MXN";
                    break;
                case "9":
                    salir = 0;
                    System.out.println("\n Gracias por usar la aplicacion de Cambio de divisas");
                    Thread.sleep(2000);
                    System.out.println("Saliendo...");
                    System.out.println("\033[H\033[2J");
                    continue;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
                    continue;
            }
            System.out.println("*****************************************");
            System.out.print("Cuanto quieres cambiar? : ");
            String montoStr = lectura.nextLine();
            double monto;
            try {
                monto = Double.parseDouble(montoStr);
            } catch (NumberFormatException e) {
                System.out.println("Monto invalido. Intente de nuevo.");
                continue;
            }

            try {
                Cambio cambioDivisa = consulta.buscaCambio(base);
                Double tasaDestino = cambioDivisa.conversion_rates().get(destino.toUpperCase());
                if (tasaDestino != null) {
                    double resultado = monto * tasaDestino;
                    System.out.println(">>> "+monto + " " + base + " equivale a: " + resultado + " " + destino + " <<<");
                    System.out.println("*****************************************\n");
                    HistorialCambio historial = new HistorialCambio();
                    try {
                        historial.guardarJscon(base, destino, tasaDestino, monto , resultado);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    System.out.println("No se encontro la tasa para la divisa destino.");
                }
            } catch (Exception e) {
                System.out.println("El cambio no se encuentra disponible");
            }
        }
    }
}