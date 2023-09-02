package lista.OperacoesBasicas.OrdenacaoDeNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros{
    
    List<Integer> listaInteger;

    public OrdenacaoNumeros() {
        listaInteger = new ArrayList<Integer>();
    }

    public void adicionarNumero(int numero){
        listaInteger.add(numero);
    }

    public List<Integer> ordenarAscendente(){

        List<Integer> ascList = new ArrayList<Integer>(listaInteger);

        if (!ascList.isEmpty()){

            Collections.sort(ascList);

        }

        return ascList;

    }

    public List<Integer> ordenarDescendente(){

        List<Integer> descList = new ArrayList<Integer>(listaInteger);

        if (!listaInteger.isEmpty()){

            descList.sort(Collections.reverseOrder());

        }

        return descList;

    }

    public static void main(String[] args) {
        
        var o = new OrdenacaoNumeros();

        for (int i = 0; i < 10; i++){
            o.adicionarNumero(i);
        }

        System.out.println(o.ordenarAscendente());
        System.out.println(o.ordenarDescendente());

    }


    

}

