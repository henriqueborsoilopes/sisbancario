package com.hblsistemas.atividade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AtividadeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtividadeApplication.class, args);
		
//		boolean aberto = true;
//        JOptionPane.showMessageDialog(null, "Você abre a clínica para atendimento.");
//        
//        Fila fila = new Fila(20);
//        
//        do {
//
//            String[] opcoes = {"Adicionar paciente", "Chamar próximo paciente", "Fechar a clínica"};
//            int escolha = JOptionPane.showOptionDialog(null, "O que deseja vazer agora?",
//                    "Menu de atendimento",
//                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[2]);
//            
//           
//            if(escolha == 0) {
//                if(! fila.isFull()){
//                    fila.enqueue(
//                            JOptionPane.showInputDialog("Insira o nome do paciente:"));
//                } 
//                else {
//                    JOptionPane.showMessageDialog(null, "A fila está lotada.\nPor favor atenda os pacientes presentes primeiro.");
//                }
//            } 
//
//
//            else if(escolha ==  1){
//                if(! fila.isEmpty()){
//                    String atendido = fila.dequeue();
//                    JOptionPane.showMessageDialog(null, "Você atende o paciente:\n" + atendido);
//                } 
//                else {
//                    JOptionPane.showMessageDialog(null, "Ninguem está presente na fila, por favor adicione alguem primeiro.");
//                    escolha = 0;
//                }
//            }
//                    
//            else
//                aberto = false;
//
//        } while(aberto);
//        
//        JOptionPane.showMessageDialog(null, "Você fecha a clínica por hoje.");
		
			
		
		
//        String[] escolha = {"Binária", "Linear"};
//        int tipo = JOptionPane.showOptionDialog(null, "Escolha qual tipo de pesquisa deseja fazer:",
//                "Tipo de pesquisa",
//                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, escolha, escolha[0]);
//        
//        //Escolher quantidade de posições
//        int qtdPos = Integer.parseInt(
//                JOptionPane.showInputDialog("Quantas posições deve ter o vetor:")
//        );
//        
//        //Se for binária
//        if(tipo == 0){
//            Binaria binaria = new Binaria();
//            binaria.criarVetor(qtdPos);
//            binaria.populaVetor();
//            
//            int numPesquisa = Integer.parseInt(
//                    JOptionPane.showInputDialog("Que número deseja pesquisar?")
//            );
//
//            binaria.setNumPesquisa(numPesquisa);
//            binaria.pesquisar();
//
//            JOptionPane.showMessageDialog(null, binaria.toString());
//        }
//        
//        //Se for Linear
//        else{
//            
//            Linear linear = new Linear();
//            linear.criarVetor(qtdPos);
//            linear.populaVetor();
//            
//            int numPesquisa = Integer.parseInt(
//                    JOptionPane.showInputDialog("Que número deseja pesquisar?")
//            );
//
//            linear.setNumPesquisa(numPesquisa);
//            linear.pesquisar();
//
//            JOptionPane.showMessageDialog(null, linear.toString());
//            
//        }
		
			
			
		
//		boolean aberto = true;
//        JOptionPane.showMessageDialog(null, "Você abre o banco para atendimento.");
//        
//        int qtdNormal = Integer.parseInt(
//                JOptionPane.showInputDialog("Quantas senhas deseja desponibilizar para a fila comum:"));
//        
//        int qtdPioritaria = Integer.parseInt(
//                JOptionPane.showInputDialog("Quantas senhas deseja desponibilizar para a fila prioritária:"));
//        
//        
//        Banco banco = new Banco(qtdNormal, qtdPioritaria);
//        
//        do {
//
//            String[] opcoes = {"Adicionar cliente", "Chamar próximo cliente", "Fechar o banco"};
//            int escolha = JOptionPane.showOptionDialog(null, "O que deseja vazer agora?",
//                    "Menu de atendimento",
//                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[2]);
//            
//           
//            if(escolha == 0) {
//                Cliente cliente = new Cliente();
//                
//                String nome = JOptionPane.showInputDialog("Qual o nome do paciente:");
//                
//                int anoNascimentoPaciente = Integer.parseInt(
//                JOptionPane.showInputDialog("Qual o ano de nasciemento do paciente:"));
//                
//                cliente.setAnoNascimento(anoNascimentoPaciente);
//                cliente.setNome(nome);
//                
//                banco.adicionar(cliente);
//            } 
//
//
//            else if(escolha ==  1){
//                //Atender o paciente
//                if( (! banco.getFilaNormal().isEmpty()) || (! banco.getFilaPrioritaria().isEmpty()) ){
//                    banco.atender();
//                } 
//                //Se nenhum paciente estiver na fila
//                else {
//                    JOptionPane.showMessageDialog(null, "Ninguem está presente na fila, por favor adicione alguem primeiro.");
//                    escolha = 0;
//                }
//            }
//                    
//            //Fehcar a loja
//            else
//                aberto = false;
//
//        } while(aberto);
//        
//        JOptionPane.showMessageDialog(null, "Você fecha o banco por hoje.");
		
			
			
//		 int qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantas pessoa deseja adicionar?"));
//	        PesqBinaria pesquisa = new PesqBinaria(qtd);
//	        
//	        for(int i = 0; i < qtd; i++){
//	            int cod = Integer.parseInt(JOptionPane.showInputDialog("Pessoa "+ i +":\nQual será o codigo dessa pessoa"));
//	            String nome = JOptionPane.showInputDialog("Pessoa "+ i +":\nQual o nome dessa pessoa");
//	            String cpf = JOptionPane.showInputDialog("Pessoa "+ i +":\nQual o cpf dessa pessoa");
//	            String dataNascimento = JOptionPane.showInputDialog("Pessoa "+ i +":\nQual a data de nascimento dessa pessoa");
//	            
//	            pesquisa.addVet(new Cliente(cod, cpf, nome, dataNascimento));
//	        }
//	        
//	        int codPesq = Integer.parseInt(JOptionPane.showInputDialog("Por qual código deseja buscar?"));
//	        pesquisa.setPosPesq(codPesq);
//	        int retorno = pesquisa.pesquisar();
//	        
//	        if(retorno == -1)
//	            JOptionPane.showMessageDialog(null, "Cliente encontrado!\nPosição do cliente:\n"+ retorno + "\n\n" + pesquisa.toString());
//	        
//	        else
//	            JOptionPane.showMessageDialog(null, "Cliente não encontrado!\nPosição:\n"+ retorno + "\n\n" + pesquisa.toString());
	}

}
