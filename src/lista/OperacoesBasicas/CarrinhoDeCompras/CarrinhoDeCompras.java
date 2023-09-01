package lista.OperacoesBasicas.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinhoList;

    public CarrinhoDeCompras(){
        carrinhoList = new ArrayList<Item>();
    }
    
    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){

        List<Item> itemsARemover = new ArrayList<Item>();

        for (Item item : carrinhoList){
            if (item.getNome().equals(nome)){
                itemsARemover.add(item);
            }
        }

        carrinhoList.removeAll(itemsARemover);

    }

    public double calcularValorTotal(){

        double valorTotal = 0;

        for (Item i : carrinhoList){

            valorTotal += i.getPreco() * i.getQuantidade();

        }

        return valorTotal;
    }

    public void exibirItens(){
        System.out.println("---------------------------");
        
        System.out.println(carrinhoList);
        
        System.out.println("---------------------------");
        
    }

    public static void main(String[] args) {
        
        CarrinhoDeCompras carro = new CarrinhoDeCompras();

        carro.adicionarItem("Abacate", 25.00, 3);
        carro.adicionarItem("Maçã", 2.00, 7);
        carro.adicionarItem("Jabuticaba", 12.00, 15);

        carro.exibirItens();

        carro.removerItem("Jabuticaba");

        carro.exibirItens();

        System.out.println(carro.calcularValorTotal());

    }

}
