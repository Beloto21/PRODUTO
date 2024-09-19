package teste;

public class Produto {
    private String nome;
    private String marca;
    private double precoCusto;
    private double precoVenda;

    // Construtor
    public Produto(String nome, String marca, double precoCusto, double precoVenda) {
        this.nome = nome;
        this.marca = marca;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    // aqui calcula o lucro
    public double calcularLucro() {
        return precoVenda - precoCusto;
    }

    // para acessar os atributos
    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    // exibi as informações do produto
    public void exibirInformacoes() {
        System.out.printf("Produto: %s\nMarca: %s\nPreço de Custo: R$ %.2f\nPreço de Venda: R$ %.2f\nLucro: R$ %.2f\n",
                nome, marca, precoCusto, precoVenda, calcularLucro());
    }

    public static void main(String[] args) {
        // objetos da classe Produto
        Produto produto1 = new Produto("Roupa", "Polo", 2500.00, 3500.00);
        Produto produto2 = new Produto("Carro", "BMW", 1500.00, 2500.00);

        // informações dos produtos
        produto1.exibirInformacoes();
        System.out.println();
        produto2.exibirInformacoes();
    }
}

