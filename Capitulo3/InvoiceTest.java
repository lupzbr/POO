package br.com.kyrios.poo.exercicio.capitulo3;
public class InvoiceTest {
    public static void main (String [] args){
        Invoice teste1 = new Invoice("12A", "Copo de Leite", 12, 18.5);
        String numero = teste1.getNumero();
        String descricao = teste1.getDescricao();
        int quantidade = teste1.getQuantidade();
        double preco = teste1.getPreco();
        double total = teste1.getInvoiceAmount();
        System.out.printf("Teste de exibição: \n "
                + "%s  -  %s  -  %d  -  R$ %.2f  - R$ %.2f", numero, descricao, quantidade, preco, total);
        teste1.setNumero("13A");
        teste1.setDescricao("Leite de copo");
        teste1.setQuantidade(15);
        teste1.setPreco(12.5);
        numero = teste1.getNumero();
        descricao = teste1.getDescricao();
        quantidade = teste1.getQuantidade();
        preco = teste1.getPreco();
        total = teste1.getInvoiceAmount();
        System.out.printf("\n Teste de alteração: \n "
                + "%s  -  %s  -  %d  -  R$ %.2f  - R$ %.2f \n", numero, descricao, quantidade, preco, total);
    }
}
