package TiposDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {
        // Tipos de dados - int, double, float, char, boolean, short.

        int idade = 20; // Valor maximo do int: 2 147 483 647
        double altura = 1.80;
        char inicialNome = 'Y';
        boolean vivoOuMorto = true;
        // Valor máximo do long: 9 223 372 036 854 775 807 (muito grande)
        long saldoBancario = 99999999L;

        System.out.println("inicialNome = " + inicialNome);
        System.out.println("vivoOuMorto = " + vivoOuMorto);
        System.out.println("altura = " + altura);
        System.out.println("idade = " + idade);
        System.out.println("saldoBancario = " + saldoBancario);
    }
}