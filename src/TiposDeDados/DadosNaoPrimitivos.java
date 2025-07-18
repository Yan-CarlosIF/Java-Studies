package TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        // Dados não primitivos: String, Array, Class, enum
        // Criar um objeto e atribuir métodos à ele

        String name = "Yan";
        String nameToUpperCase = name.toUpperCase();
        Integer idade = 10;
        System.out.println(idade.toString());
        System.out.println(name);
        System.out.println("Esse texto está em caixa alta: " + nameToUpperCase);
    }
}
