//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //conversión implícita, donde no haya riesgo de pérdidad de datos
        int numeroEntero = 42;
        double numeroDecimal = numeroEntero; // Conversi{on implícita de int a double
        System.out.println(numeroDecimal); //imprime. 42.0

        // int a long
        long numeroLargo = numeroEntero; // conversión implícita de int a long
        System.out.println(numeroLargo);

        //char a int
        char letra = 'A';
        int codigoAscii = letra; // Conversión implícita de char a int
        System.out.println(codigoAscii); // Imprime: 65

        //conversión explícita (Casting), donde hay riesgo de pérdida de datos
        double numeroDecimal2 = 9.99;
        int numeroEntero2 = (int) numeroDecimal2; //conversión explícita de double a int
        System.out.println(numeroEntero2);

        long numeroLargo3 = 10000L;
        int numeroEntero3 = (int) numeroLargo3; //Conversión explícita de long a int
        System.out.println(numeroEntero3); // imprime: 10000

        String texto = "123";
        int numero = Integer.parseInt(texto); // Conversión de String a int utilizando un método
        System.out.println(numero); // Imprime: 123

        //Riesgos
        double valorDecimal = 123.456;
        int valorEntero = (int) valorDecimal; // Se pierde la parte decimal
        System.out.println(valorEntero);

        //float iva = (float) valor / 0.15 *100;

        //conversión implícita, donde no haya riesgo de pérdidad de datos
        byte  numbyte= 14;
        short numshort = numbyte;
        System.out.println(numshort);
        }
    }
