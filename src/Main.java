import com.hotel.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        HotelApolo hotelApolo = new HotelApolo();
        Endereco endereco = new Endereco("Professor joel lopes", 33, "proximo a praca airton sena");
        hotelApolo.setEndereco(endereco);

        int opcao = 0;
        do {
            System.out.println("______HOTEL HOSTER______");
            System.out.println("1: Cadastro Gerente:"); // cadastrarGerente
            System.out.println("2: Cadastro Recepcionista:"); // cadastrarRecepcioniosta
            System.out.println("3: Cadastro De Hospede:"); // caadastrarHospede
            System.out.println("4: Cadastro Reserva:");
            System.out.println("5: Pesquisa Hospede:"); // pesquisaHospede
            System.out.println("6: Lista Hospede"); // listarHospedes
            System.out.println("7: Alterar Dados Hospede:");
            System.out.println("8: Alterar Uma Reserva:");
            System.out.println("9: Excluir Hospede:"); // excluirHospede
            System.out.println("10: Excluir Reserva:"); // excluirReserve
            System.out.println("11: Alterar Dados Gerente:"); //alterarGerente
            System.out.println("12: Alterar Dados Resepcionista:"); // alterarRecepcionista
            System.out.println("13: Listar Reserva:");
            System.out.println("14: Mostrar Valores de todas Reservas:"); //getValorTotal
            System.out.println("0:  SAIR");
            System.out.println("____DIGITE A OPÇÃO DESEJADA___");
            opcao = leitor.nextInt();

            if (opcao == 1) {
                Gerente gerente = new Gerente();
                System.out.println("_____BEM VINDO CADASTRO GERENTE_____");
                System.out.println("Qual seu nome?");
                String nome = leitor.next();
                gerente.setNome(nome);
                System.out.println("Digite sua Idade:");
                try {
                    int idade = leitor.nextInt();
                    gerente.setIdade(idade);
                    System.out.println("Informe seu Genero \n MASCULINO - M \n FEMININO - F:");
                    String sexo = leitor.next();
                    gerente.setSexo(sexo);
                } catch (RuntimeException exception) {
                    System.out.println(exception.getMessage());
                    continue;
                }

                Endereco endereco1 = new Endereco();
                System.out.println("Qual o nome da sua Rua?");
                String rua = leitor.next();
                endereco1.setRua(rua);
                System.out.println("Qual numero da sua residência?");
                int numeroResidencia = leitor.nextInt();
                endereco1.setNumero(numeroResidencia);
                System.out.println("Ponto de Referencia:");
                String pontoDeReferencia = leitor.next();
                endereco1.setPontoDeReferencia(pontoDeReferencia);
                gerente.setEndereco(endereco1);

                Telefone telefone = new Telefone();
                System.out.println("Digite seu DDD:");
                int ddd = leitor.nextInt();
                telefone.setDdd(ddd);
                System.out.println("Informe seu Telefone:");
                String telefone1 = leitor.next();
                telefone.setTelefone(telefone1);
                System.out.println("Deseja colocar Telefone Adicional?");
                String escolha = leitor.next();
                if (escolha.equals("sim")) {
                    System.out.println("Informe seu telefone Adicional");
                    String telefoneAdicional = leitor.next();
                    telefone.setTelefoneAdicional(telefoneAdicional);
                }
                gerente.setTelefone(telefone);

                System.out.println("Informe seu Email:");
                String email = leitor.next();
                gerente.setEmail(email);

                System.out.println("Informe sua Funcão:\n" + "DIGITE (1) PARA GERENTE:\n" + "DIEGITE (2) PARA RECEPCIONISTA:");
                int escolha1 = leitor.nextInt();
                gerente.setFuncao(Cargo.GERENTE);
                if (escolha1 == 2) {
                    System.out.println(" OPS!FUNÇÃO LOCADA SOMENTE A GERENTE");
                    continue;
                }

                System.out.println("Informe seu Salario?");
                double salario = leitor.nextDouble();
                if (salario > 3000) {
                    System.out.println(" OPS!!!SALÁRIO ACIMA DO DEVIDO");
                    System.out.println("Volte ao MENU Cadastrar Gerente \n e faça um novo cadastro!");
                    continue;
                }
                gerente.setSalario(salario);
                hotelApolo.cadastroGerente(gerente);
                System.out.println("Gerente cadastrado com Sucesso!!!");

            }

            //cadasto Recepcionista
            if (opcao == 2) {
                Recepcionista recepcionista = new Recepcionista();
                System.out.println("_____CADASTRO RECEPCIONISTA______");
                System.out.println("Informe Seu Nome:");
                String nomeRecep = leitor.next();
                recepcionista.setNome(nomeRecep);
                System.out.println("Informe Sua Idade:");
                try {
                    int idadeRecp = leitor.nextInt();
                    recepcionista.setIdade(idadeRecp);
                    System.out.println("Informe seu Genero \n MASCULINO - M \n FEMININO - F:");
                    String sexoRecep = leitor.next();
                    recepcionista.setSexo(sexoRecep);
                } catch (RuntimeException exception) {
                    System.out.println(exception.getMessage());
                    continue;
                }
                Endereco enderecoRecep = new Endereco();
                System.out.println("Informe o nome de sua Rua:");
                String ruaRecep = leitor.next();
                enderecoRecep.setRua(ruaRecep);
                System.out.println("Informe o Numero da Residencia:");
                int numeroRecep = leitor.nextInt();
                enderecoRecep.setNumero(numeroRecep);
                System.out.println("Ponto de Referencia:");
                String pontoDeRefenciaRecep = leitor.next();
                enderecoRecep.setPontoDeReferencia(pontoDeRefenciaRecep);
                recepcionista.setEndereco(enderecoRecep);

                Telefone telefoneRecp = new Telefone();
                System.out.println("Informe o seu DDD:");
                int dddRecep = leitor.nextInt();
                telefoneRecp.setDdd(dddRecep);
                System.out.println("Informr o Numero do Telefone:");
                String telRecep = leitor.next();
                telefoneRecp.setTelefone(telRecep);
                System.out.println("Deseja colocar Telefone Adicional?");
                String escolha1 = leitor.next();
                if (escolha1.equals("sim")) {
                    System.out.println("Informe telefone Adicional:");
                    String telefoneAdicona = leitor.next();
                    telefoneRecp.setTelefoneAdicional(telefoneAdicona);
                }
                recepcionista.setTelefone(telefoneRecp);

                System.out.println("Informe seu Email:");
                String emailRecep = leitor.next();
                recepcionista.setEmail(emailRecep);

                System.out.println("Informe sua Funcão:\n" + "DIGITE (1) PARA GERENTE:\n" + "DIEGITE (2) PARA RECEPCIONISTA:");
                int escolha2 = leitor.nextInt();
                recepcionista.setFuncao(Cargo.RECEPCIONISTA);
                if (escolha2 == 1) {
                    System.out.println("OPS!!!FUNÇÃO LOCADA APENAS PARA RECEPCIONISTA!");
                    continue;
                }
                System.out.println("Informe seu Salario:");
                double salarioRecep = leitor.nextDouble();
                if (salarioRecep > 2000) {
                    System.out.println("OPS!!!SALÁRIO ACIMA DO DEVIDO.");
                    System.out.println("Volte ao MENU Cadastrar Recepcionisata \n e faça um novo cadastro!");
                }
                recepcionista.setSalario(salarioRecep);
                hotelApolo.cadastroRecepcionista(recepcionista);
                System.out.println("RECEPCIONISTA CADASTRADO COM SUCESSO!!!");

            }
            // cadastro hospede
            if (opcao == 3) {
                Hospede hospede = new Hospede();
                System.out.println("____ CADASTRO HOSPEDE_____");
                System.out.println("Informe Seu Nome:");
                String nomeHospe = leitor.next();
                hospede.setNome(nomeHospe);
                System.out.println("Informe Sua Idade:");
                try {
                    int idadeHospe = leitor.nextInt();
                    hospede.setIdade(idadeHospe);
                    System.out.println("Informe seu Genero \n MASCULINO - M \n FEMININO - F:");
                    String sexoGenero = leitor.next();
                    hospede.setSexo(sexoGenero);
                } catch (RuntimeException exception) {
                    System.out.println(exception.getMessage());
                }
                Endereco enderecohospe = new Endereco();
                System.out.println("Informe o Nome da Sua Rua:");
                String ruaHospe = leitor.next();
                enderecohospe.setRua(ruaHospe);
                System.out.println("Informe o Numero da Sua Residência:");
                int numeroHospe = leitor.nextInt();
                enderecohospe.setNumero(numeroHospe);
                System.out.println("Ponto de Refetrencia:");
                String pontoDeRefeHospe = leitor.next();
                enderecohospe.setPontoDeReferencia(pontoDeRefeHospe);
                hospede.setEndereco(enderecohospe);

                Telefone telefoneHospe = new Telefone();
                System.out.println("Qual seu DDD:");
                int dddHospe = leitor.nextInt();
                telefoneHospe.setDdd(dddHospe);
                System.out.println("Informe Seu Telefone:");
                String foneHospe = leitor.next();
                telefoneHospe.setTelefone(foneHospe);
                System.out.println("Deseja Adicionar Telefone Adicional?");
                String escolha = leitor.next();
                if (escolha.equals("sim")) {
                    System.out.println("Informe Telefone Adicional:");
                    String telefoneAdicional = leitor.next();
                    telefoneHospe.setTelefoneAdicional(telefoneAdicional);
                }
                hospede.setTelefone(telefoneHospe);
                System.out.println("Informe Seu Email:");
                String emalHospe = leitor.next();
                hospede.setEmail(emalHospe);
                hotelApolo.cadastroHospede(hospede);
                System.out.println("____HOSPEDE CADASTRADO COM SUCESSO!!!");


            }
            if (opcao == 4) {
                Reserva reserva = new Reserva();
                System.out.println("_____BEM VINDO A SUA RESERVA____");
                System.out.println("Informe a data de Entrada (dd/mm/yy):");
                String dataDeEntradaString = leitor.next();
                reserva.setDataDeEntrada(dataDeEntradaString);
                System.out.println("Informe a Data De Saida (dd/MM/yy):");
                String dataDeSaidaString = leitor.next();
                reserva.setDataDeSaida(dataDeSaidaString);


                Random random = new Random();
                int aleatorio = random.nextInt();
                reserva.setCodigo(aleatorio);
                System.out.println("Seu codigo de Reserva é:" + aleatorio);
                System.out.println("Informe o Valor Da Sua Reserva:");
                double valorReserva = leitor.nextDouble();
                reserva.setValor(valorReserva);
                hotelApolo.cadastroReserva(reserva);
                System.out.println("RESERVA FEITA COM SUCESSO!!!");
                System.out.println("SEU CODIGO DE ACESSO É" + aleatorio);

            }
            if (opcao == 5) {
                List<Hospede> procurarHospede = hotelApolo.listaHospede();
                System.out.println("Digite o nome do Hospede a ser Pesquisado:");
                String nomeHospede = leitor.next();
                for (int i = 0; i < procurarHospede.size(); i++) {
                    if (procurarHospede.get(i).getNome().equals(nomeHospede)) {

                        Hospede hospede = hotelApolo.pesquisaHospede(nomeHospede);
                        System.out.println("Hospede:" + nomeHospede + "\n" + hospede.getNome() + "\n" + hospede.getIdade() +
                                "\n" + hospede.getEndereco().getRua() + "\n" + hospede.getEndereco().getNumero() + "\n" + hospede.getEndereco().getPontoDeReferencia()
                                + "\n" + hospede.getTelefone().getDdd() + "\n" + hospede.getTelefone().getTelefone() + "\n" + hospede.getTelefone().
                                getTelefoneAdicional() + "\n" + hospede.getEmail() + "\n" + hospede.getSexo());
                        break;
                    } else if (!procurarHospede.get(i).getNome().equals(nomeHospede)) {
                        System.out.println("HOSPEDE PROCURADO ÃO EXISTE!!!");
                        break;
                    }
                }
            }
            if (opcao == 6) {
                System.out.println("Lista de Hospede:");
                List<Hospede> hospedes = hotelApolo.listaHospede();
                for (int i = 0; i < hospedes.size(); i++) {
                    System.out.println(hospedes.get(i).getNome() + "\n" + hospedes.get(i).getIdade() + "\n" + hospedes.get(i).getSexo() + "\n" + hospedes.get(i).getEndereco()
                            .getRua() + "\n" + hospedes.get(i).getEndereco().getNumero() + "\n" + hospedes.get(i).getEndereco().getPontoDeReferencia() + "\n" + hospedes.get(i).getTelefone()
                            .getDdd() + "\n" + hospedes.get(i).getTelefone().getTelefone() + "\n" + hospedes.get(i).getTelefone().getTelefoneAdicional() + "\n" + hospedes.get(i).getEmail());
                }
            }
            if (opcao == 7) {
                System.out.println("Qual Nome Hospede Deseja Alterar:");
                String nome = leitor.next();
                List<Hospede> hospedes = hotelApolo.listaHospede();
                for (int i = 0; i < hospedes.size(); i++) {
                    if (nome.equals(hospedes.get(i).getNome())) {
                        System.out.println("INFORME SUAS NOVAS INFORMAÇÕES:");
                        System.out.println("Informe Seu Nome:");
                        String nomeHospe = leitor.next();
                        hospedes.get(i).setNome(nomeHospe);
                        System.out.println("Informe Sua Idade");
                        int idadeHospe = leitor.nextInt();
                        hospedes.get(i).setIdade(idadeHospe);
                        System.out.println("Qual Seu Genero?");
                        String sexoGenero = leitor.next();
                        hospedes.get(i).setSexo(sexoGenero);

                        System.out.println("Informe o Nome da Sua Rua:");
                        String ruaHospe = leitor.next();
                        hospedes.get(i).getEndereco().setRua(ruaHospe);
                        System.out.println("Informe o Numero da Sua Residência:");
                        int numeroHospe = leitor.nextInt();
                        hospedes.get(i).getEndereco().setNumero(numeroHospe);
                        System.out.println("Ponto de Refetrencia:");
                        String pontoDeRefeHospe = leitor.next();
                        hospedes.get(i).getEndereco().setPontoDeReferencia(pontoDeRefeHospe);

                        System.out.println("Qual seu DDD:");
                        int dddHospe = leitor.nextInt();
                        hospedes.get(i).getTelefone().setDdd(dddHospe);
                        System.out.println("Informe Seu Telefone:");
                        String foneHospe = leitor.next();
                        hospedes.get(i).getTelefone().setTelefone(foneHospe);
                        System.out.println("Deseja Adicionar Telefone Adicional?");
                        String escolha = leitor.next();
                        if (escolha.equals("sim")) {
                            System.out.println("Informe Telefone Adicional:");
                            String telefoneAdicional = leitor.next();
                            hospedes.get(i).getTelefone().setTelefone(telefoneAdicional);
                        }


                        System.out.println("Informe Seu Email:");
                        String emalHospe = leitor.next();
                        hospedes.get(i).setEmail(emalHospe);
                        System.out.println("____HOSPEDE ALTERADO COM SUCESSO!!!");
                    }


                }
            }
            if (opcao == 8) {
                System.out.println("INFORME SEU CÓDIGO PARA ALTERAR SUA RESERVA:");
                int codigo = leitor.nextInt();
                List<Reserva> reservas = hotelApolo.getListaReserva();
                for (int i = 0; i < reservas.size(); i++) {
                    if (codigo == reservas.get(i).getCodigo()) {

                        System.out.println("INFORME SUAS NOVAS INFORMAÇÕES DE RESERVA:");
                        System.out.println("Informe a data de Entrada:");
                        String dataDeEntradaString = leitor.next();
                        reservas.get(i).setDataDeEntrada(dataDeEntradaString);
                        System.out.println("Informe a Data De Saida:");
                        String dataDeSaidaString = leitor.next();
                        reservas.get(i).setDataDeSaida(dataDeSaidaString);
                        System.out.println("Informe o Valor Da Sua Reserva:");
                        double valorReserva = leitor.nextDouble();
                        reservas.get(i).setValor(valorReserva);
                        System.out.println("RESERVA ALTERADA COM SUCESSO!!!");
                        break;

                    } else if (codigo != reservas.get(i).getCodigo()) {
                        System.out.println("OPS! CÓDIGO INVALIDO \n INFORME O CÓDIGO CORRETAMENTE!");
                        break;
                    }
                }

            }
            if (opcao == 9) {
                System.out.println("INFORME O NOME DO HOSPEDE QUE DESEJA EXCLUIR:");
                String nomeHospede = leitor.next();
                List<Hospede> procurarHospede = hotelApolo.listaHospede();
                for (int i = 0; i < procurarHospede.size(); i++) {
                    if (procurarHospede.get(i).getNome().equals(nomeHospede)) {
                        hotelApolo.excluirHospede(nomeHospede);
                        System.out.println(nomeHospede + "\n" + "Hospede Exculido com Sucesso!!!");
                        break;
                    } else if (!procurarHospede.get(i).getNome().equals(nomeHospede)) {
                        System.out.println("OPS!!!HOSPEDE NÃO ENCONTRADO!");
                        break;
                    }
                }
            }

            if (opcao == 10) {
                System.out.println("INFORME O CODIGO DA RESERVA QUE DESEJA EXCLUIR");
                int codigo = leitor.nextInt();
                hotelApolo.excluirReserva(codigo);
                System.out.println(codigo + "REserva excluido com sucesso!!!");
            }

            if (opcao == 11) {
                System.out.println("INFORME O NOME DO GERENTE QUE DESEJA ALTERAR");
                String nomeGerente = leitor.next();
                List<Gerente> gerentes = hotelApolo.getListaGerente();
                for (int i = 0; i < gerentes.size(); i++) {
                    if (nomeGerente.equals(gerentes.get(i).getNome())) {

                        System.out.println("INFORME SUAS NOVAS INFORMAÇÕES");
                        System.out.println("Qual seu nome?");
                        String nome = leitor.next();
                        gerentes.get(i).setNome(nome);
                        System.out.println("Digite sua Idade:");
                        int idade = leitor.nextInt();
                        gerentes.get(i).setIdade(idade);
                        System.out.println("Qual seu Genero?");
                        String sexo = leitor.next();
                        gerentes.get(i).setSexo(sexo);

                        System.out.println("Qual o nome da sua Rua?");
                        String rua = leitor.next();
                        gerentes.get(i).getEndereco().setRua(rua);
                        System.out.println("Qual numero da sua residência?");
                        int numeroResidencia = leitor.nextInt();
                        gerentes.get(i).getEndereco().setNumero(numeroResidencia);
                        System.out.println("Ponto de Referencia:");
                        String pontoDeReferencia = leitor.next();
                        gerentes.get(i).getEndereco().setPontoDeReferencia(pontoDeReferencia);

                        System.out.println("Digite seu DDD:");
                        int ddd = leitor.nextInt();
                        gerentes.get(i).getTelefone().setDdd(ddd);
                        System.out.println("Informe seu Telefone:");
                        String telefone1 = leitor.next();
                        gerentes.get(i).getTelefone().setTelefone(telefone1);
                        System.out.println("Deseja colocar Telefone Adicional?");
                    }
                    String escolha = leitor.next();
                    if (escolha.equals("sim")) {
                        System.out.println("Informe seu telefone Adicional");
                        String telefoneAdicional = leitor.next();
                        gerentes.get(i).getTelefone().setTelefoneAdicional(telefoneAdicional);
                    }
                    System.out.println("Informe seu Email:");
                    String email = leitor.next();
                    gerentes.get(i).setEmail(email);

                    System.out.println("Informe sua Funcão:\n" + "DIGITE (1) PARA GERENTE:\n" + "DIEGITE (2) PARA RECEPCIONISTA");
                    int escolha1 = leitor.nextInt();
                    gerentes.get(i).setFuncao(Cargo.GERENTE);

                    System.out.println("Informe seu Salario?");
                    double salario = leitor.nextDouble();
                    gerentes.get(i).setSalario(salario);
                    System.out.println("GERENTE ALTERADO COM SUCESSO!!!");

                }

            }
            if (opcao == 12) {
                System.out.println("ALTERAR DADOS DO RESEPCIONISTA:");
                String nomeResepcionista = leitor.next();
                List<Recepcionista> recepcionistas = hotelApolo.getListaRecepcionista();
                for (int i = 0; i < recepcionistas.size(); i++) {
                    if (nomeResepcionista.equals(recepcionistas.get(i).getNome())) {

                        System.out.println("_____CADASTRO RECEPCIONISTA______");
                        System.out.println("Informe Seu Nome:");
                        String nomeRecep = leitor.next();
                        recepcionistas.get(i).setNome(nomeRecep);
                        System.out.println("Informe Sua Idade:");
                        int idadeRecp = leitor.nextInt();
                        recepcionistas.get(i).setIdade(idadeRecp);
                        System.out.println("Qual seu Genero:");
                        String sexoRecep = leitor.next();
                        recepcionistas.get(i).setSexo(sexoRecep);

                        System.out.println("Informe o nome de sua Rua:");
                        String ruaRecep = leitor.next();
                        recepcionistas.get(i).getEndereco().setRua(ruaRecep);
                        System.out.println("Informe o Numero da Residencia:");
                        int numeroRecep = leitor.nextInt();
                        recepcionistas.get(i).getEndereco().setNumero(numeroRecep);
                        System.out.println("Ponto de Referencia:");
                        String pontoDeRefenciaRecep = leitor.next();
                        recepcionistas.get(i).getEndereco().setPontoDeReferencia(pontoDeRefenciaRecep);


                        System.out.println("Informe o seu DDD:");
                        int dddRecep = leitor.nextInt();
                        recepcionistas.get(i).getTelefone().setDdd(dddRecep);
                        System.out.println("Informr o Numero do Telefone:");
                        String telRecep = leitor.next();
                        recepcionistas.get(i).getTelefone().setTelefone(telRecep);
                        System.out.println("Deseja colocar Telefone Adicional?");
                        String escolha1 = leitor.next();
                        if (escolha1.equals("sim")) {
                            System.out.println("Informe telefone Adicional:");
                            String telefoneAdicona = leitor.next();
                            recepcionistas.get(i).getTelefone().setTelefoneAdicional(telefoneAdicona);
                        }


                        System.out.println("Informe seu Email:");
                        String emailRecep = leitor.next();
                        recepcionistas.get(i).setEmail(emailRecep);

                        System.out.println("Informe sua Funcão:\n" + "DIGITE (1) PARA GERENTE:\n" + "DIEGITE (2) PARA RECEPCIONISTA");
                        int escolha2 = leitor.nextInt();
                        recepcionistas.get(i).setFuncao(Cargo.RECEPCIONISTA);

                        System.out.println("Informe seu Salario:");
                        double salarioRecep = leitor.nextDouble();
                        recepcionistas.get(i).setSalario(salarioRecep);
                        System.out.println("RECEPCIONISTA ALTERADO COM COM SUCESSO!!!");
                    }

                }
            }
            if (opcao == 13) {
                System.out.println("Lista Reserva:");
                List<Reserva> reservas = hotelApolo.getListaReserva();
                for (int i = 0; i < reservas.size(); i++) {
                    System.out.println(reservas.get(i).getDataDeEntrada() + "\n" + reservas.get(i).getDataDeSaida() + "\n" + reservas.get(i).getCodigo());
                }

            }


            if (opcao == 14) {
                System.out.println("_____VALORES RESERVAS_____");
                hotelApolo.valorTotal();
                System.out.println("valores totais:" + "\n" + hotelApolo.valorTotal());
            }


        } while (opcao != 0);
    }
}