package trabalhopoo;

import java.util.ArrayList;

public class Cofrinho {

    // ArrayList contendo todas as moedas adicionadas.
    private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>(); 

    public void adicionar(Moeda m) {

        // Atributo tipo boolean para verificar se foi encontrado na lista o mesmo tipo de moeda.
        boolean encontrado = false; 

        for (Moeda moedaLista : listaMoedas) {
            if (moedaLista.mesmoTipo(m)) { // Verificando se ja existe moeda do mesmo tipo.
                moedaLista.valor += m.valor; // Somando os valores.
                encontrado = true; // Atributo recebento True.
                break; // Saindo do loop apos encontrar e somar a moeda.
            }
        }

        // Adicionando a moeda nova caso nao exista na lista.
        if (!encontrado) {
            listaMoedas.add(m); 
        }
    }

    public void remover(Moeda m) {

        // Atributo tipo boolean para verificar se foi encontrado na lista o mesmo tipo de moeda.
        boolean encontrado = false; 

        for (Moeda moedaLista : listaMoedas) {
            if(moedaLista.mesmoTipo(m)) { // Verificando se ja existe moeda do mesmo tipo.
                listaMoedas.remove(moedaLista); // Removendo da lista a moeda que vai ser removida.
                System.out.println("");
                System.out.printf("%s removido.", m.nome());
                System.out.println("");
                encontrado = true; // Atributo recebento True.
                break; // Saindo do loop apos encontrar e remover a moeda.
            }
        }
        // Caso a moeda não exista.
        if (!encontrado) { 
            System.out.println();
            System.out.println("Moeda não existe.");
        }
    }

    public void listagemMoedas() {

        // Verifica se o cofrinho esta vazio.
        if(listaMoedas.isEmpty()) { 
            System.out.println();
            System.out.println("Cofrinho vazio.");
        }

        // Passando moeda por moeda na lista e imprimindo para o usuario.
        for (Moeda m : listaMoedas) { 
            System.out.println();
            m.info();
        }

    }

    // Atributo total para receber o total convertido em reais.
    double total; 

    public void totalConvertido() {
    	
    	total = 0; // Reiniciando o total a cada vez que o método for chamado
    	
    	if (listaMoedas.isEmpty()) { // Verificando se a lista de moedas está vazia.
    		System.out.println();
    		System.out.println("Sem moedas para converter.");
    		return; // Retorna nada.
    	}
    	
    	for (Moeda m : listaMoedas) { // Passando moeda por moeda na lista.
            total += m.converter(); // Atributo total recebendo os valores convertidos de todas as moedas.
    	}
    	
    	// Informando o valor total.
    	if (total > 0) { 
    		System.out.println();
    		System.out.printf("Total convertido em reais: R$%.2f", total);
    		System.out.println();
    	}
    	
    }


    // Metodo infomenu para evitar repeticao de codigo na classe main.
    public void infoMenu() { 
    	System.out.println();
        System.out.println("COFRINHO");
        System.out.println("1 - Adicionar moeda");
        System.out.println("2 - Remover moeda");
        System.out.println("3 - Listar moedas");
        System.out.println("4 - Somar todas as moedas convertidas para real");
        System.out.println("0 - Sair");
        System.out.print(">>");
    }
}
