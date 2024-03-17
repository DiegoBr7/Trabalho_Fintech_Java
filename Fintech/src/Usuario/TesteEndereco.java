package Usuario;

public class TesteEndereco {

	public static void main(String[] args) {
		
		Endereco endereco = new Endereco();
		
		endereco.incluirEndereco(1, 12345678, "Rua Exemplo", "Bairro Exemplo", "Cidade Exemplo", "Estado Exemplo", 123);
        
		
		System.out.println("cd do endereco : " + endereco.getCdEndereco());
		System.out.println("numero do cep : " + endereco.getNrCep());
		System.out.println("nome da rua : " + endereco.getNmRua() )  ;
		System.out.println("nome do bairro : " + endereco.getNmBairro() );
		System.out.println("nome do Estado : " + endereco.getNmEstado());
		System.out.println("numero do Imovel : " + endereco.getNrImovel() );
		
		

	}

}
