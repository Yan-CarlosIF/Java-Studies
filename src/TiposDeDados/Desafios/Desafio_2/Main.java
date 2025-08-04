package TiposDeDados.Desafios.Desafio_2;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Produto 1", 50, 10);

        product.ShowData();

        product.AddProducts(20);

        product.ShowData();

        product.RemoveProducts(20);

        product.ShowData();
    }
}
