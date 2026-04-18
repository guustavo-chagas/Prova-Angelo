import java.util.Scanner;

public class ControleEstoque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Produto: ");
        String nome = sc.nextLine();

        System.out.print("Preço: R$ ");
        String precoStr = sc.next().replace(",", ".");
        double preco = Double.parseDouble(precoStr);

        System.out.print("Estoque inicial: ");
        int estoque = sc.nextInt();

        System.out.print("Quantidade vendida: ");
        int vendidos = sc.nextInt();

        Produto produto = new Produto(nome, preco, estoque);

        System.out.println("\n----- Antes da venda -----");
        produto.exibirAntesVenda();

        if (!produto.realizarVenda(vendidos)) {
            System.out.println("\nEstoque insuficiente para realizar a venda.");
        } else {
            System.out.println("\n----- Depois da venda -----");
            produto.exibirDepoisVenda(vendidos);
        }

        sc.close();
    }
}