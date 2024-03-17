package Usuario;

public class TesteUsuario {

	public static void main(String[] args) {
		
	  Usuario usuario = new Usuario() ;
	  
	  usuario.setNomeCompleto("");
	  usuario.setNrCPF("");
	  usuario.setCdUsuario("");
      usuario.setDsSexo('M');
      usuario.setDsProfissao("");
      usuario.setDsEmail("");
      usuario.setVlSalario(0);
       
		
	  
      System.out.println("Nome do usuário: " + usuario.getNomeCompleto());
      System.out.println("CPF do usuário: " + usuario.getNrCPF());
      System.out.println("ID do usuário: " + usuario.getCdUsuario());
      System.out.println("Aniversário do usuário: " + usuario.getDtAniversario());
      System.out.println("Sexo do usuário: " + usuario.getDsSexo());
      System.out.println("Profissão do usuário: " + usuario.getDsProfissao());
      System.out.println("Email do usuário: " + usuario.getDsEmail());
      System.out.println("Salário do usuário: " + usuario.getVlSalario());
	  
	  
     
      usuario.cadastrarEndereco("Rua Exemplo", 123, "Bairro Exemplo", "Cidade Exemplo", "Estado Exemplo", "12345-678");
      
      usuario.cadastrarTelefone(123456789);

      usuario.cadastrarCarteira(100.0);
      
      usuario.cadastrarCartaoDeCredito(987654321);
      
      usuario.cadastrarBanco("Banco XYZ");
	  


	}

}
