/**
 * Classe que tem uma lista com uma execu��o estatica de mem�ria
 * @author Lucas Bezerra
 * @version 14/08/2017
 */
public class Lista {
	private int dados[];
	private int tamanho;
	
	public Lista(int c) {
		dados = new int[c];
		tamanho = 0;
	}
	
	public void adicionaInicio(int e){
		if(tamanho == dados.length){
			System.out.println("ERRO! Lista Cheia");
		}
		else{
			for(int i=tamanho;i>0;i--){
				dados[i]=dados[i-1];
			}
			dados[0]=e;
			tamanho++;
		}
	}
	
	public void adicionaFinal(int e){
		if(tamanho == dados.length){
			System.out.println("ERRO! Lista Cheia");
		}
		else{
			dados[tamanho]=e;
			tamanho++;
		}
	}
	
	public int removeInicio(){
		int removido = -1;
		if(tamanho == 0){
			System.out.println("ERRO! Lista Vazia");
		}
		else{
			removido = dados[0];
			
			for(int i=0;i<tamanho-1;i++){
				dados[i] = dados[i+1];
			}
			tamanho--;
			
		}
		return removido;
	}
	
	public void adiciona(int e, int p){
		if(tamanho == dados.length){
			System.out.println("ERRO! Lista Cheia");

		}
		else{
			if(p>=1&& p<=tamanho+1){
				if(p<tamanho+1){
					for(int i=tamanho;i<p-1;i--){
						dados[i]=dados[i-1];
					}
				}
				dados[p-1] = e;
				tamanho++;
			}
			else{
				System.out.println("Posição Invalida!");
			}
		}
	}
	
	
	
	public String toString(){
		String r = "";
		for(int i = 0;i<tamanho;i++){
			r += " "+dados[i];
		}
		r +="\nQuantidade de elementos "+tamanho;
		return r;
	}
		
		
		

}
