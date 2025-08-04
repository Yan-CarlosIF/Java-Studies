package TiposDeDados.Desafios.Desafio_2;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double TotalValueInStock() {
        return price * quantity;
    }

    public void AddProducts(int quantity) {
        this.quantity += Math.abs(quantity);
    }

    public void RemoveProducts(int quantity) {
        if (this.quantity < quantity) return;

        this.quantity -= quantity;
    }

    public void ShowData() {
        System.out.println("Produto:");
        System.out.println("Nome: " + this.name);
        System.out.println("Preço: " + this.price);
        System.out.println("Quantidade: " + this.quantity);
        System.out.println("Valor total no estoque: " + this.TotalValueInStock());
    }
}
