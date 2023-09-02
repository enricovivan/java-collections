package lista.OperacoesBasicas.SomaDeNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> numeros;

    public SomaNumeros(){
        numeros = new ArrayList<Integer>();
    }

    // métodos
    public void adicionarNumero(int numero){
        numeros.add(numero);
    }

    public int calcularSoma(){

        int total = 0;

        if (!numeros.isEmpty()){
            for (Integer n : numeros){
                
                total += n.intValue();

            }
        }

        return total;

    }

    public int encontrarMaiorNumero(){

        Integer maior = 0;
        Integer maiorTemp = 0;

        if (!numeros.isEmpty()){

            for (int i = 0; i < numeros.size(); i++){

                if (i == 0){

                    maior = numeros.get(i);
                    maiorTemp = maior;

                }
                else {

                    maiorTemp = numeros.get(i);

                    if (maiorTemp > maior){

                        maior = maiorTemp;

                    }

                }

            }

        }

        return maior;

    }

    public int encontrarMenorNumero(){

        Integer menor = 0;
        Integer menorTemp;

        if (!numeros.isEmpty()){

            for (int i = 0; i < numeros.size(); i++){

                if (i == 0){

                    menor = numeros.get(i);
                    menorTemp = numeros.get(i);

                }
                else {

                    menorTemp = numeros.get(i);

                    if (menorTemp < menor){

                        menor = menorTemp;

                    }

                }

            }

        }

        return menor;

    }

    public List<Integer> exibirNumeros(){

        return numeros;

    }

    public static void main(String[] args) {
        
        SomaNumeros soma = new SomaNumeros();

        soma.adicionarNumero(5);
        soma.adicionarNumero(9);
        soma.adicionarNumero(24);
        soma.adicionarNumero(15);
        soma.adicionarNumero(1);
        soma.adicionarNumero(8);

        System.out.println(soma.exibirNumeros());

        System.out.println("Maior: " + soma.encontrarMaiorNumero());
        System.out.println("Menor: " + soma.encontrarMenorNumero());

        System.out.println("Soma: " + soma.calcularSoma());

    }
    
}
