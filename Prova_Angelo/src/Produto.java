public class Produto {
    String nome;
    double preco;
    int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public boolean realizarVenda(int quantidade) {
        if (quantidade > estoque) {
            return false;
        }
        estoque -= quantidade;
        return true;
    }

    public void exibirAntesVenda() {
        System.out.println("Produto: " + nome);
        System.out.printf("Preço: R$ %.2f\n", preco);
        System.out.println("Estoque antes da venda: " + estoque + " unidades");
    }

    public void exibirDepoisVenda(int vendidos) {
        System.out.println("Venda realizada: " + vendidos + " unidades");
        System.out.println("Estoque atualizado: " + estoque + " unidades");
    }
}