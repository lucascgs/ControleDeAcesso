
public class Cadastro extends Pessoa{

        public static void main(String[] args) {

            System.out.println("Controle de Entrada e Saída de Civis e Militares de Outras OM's no Recinto: ");

            System.out.println("Nome do Ususário: ");

            Pessoa pessoa1 = new Pessoa();

            pessoa1.nome = "Pedro";
            pessoa1.sexo = "Masculino";
            pessoa1.rg = "1234567";
            pessoa1.telefone = "81987654321";
            pessoa1.email = "pedro@gmail.com";
            pessoa1.endereco = "Rua Testando, 100 - Centro";

            System.out.println(pessoa1);

            //Abaixo, os possiveis destinos que os clientes ou visitantes poderão se dirigir dentro do estabelecimento

            System.out.println("Local da visita: ");

            Destino destinolocal1 = Destino.CURSO_DE_ARTILHARIA;
            System.out.println(destinolocal1.toString());

            Destino destinolocal2 = Destino.CURSO_DE_CAVALARIA;
            System.out.println(destinolocal2.toString());

            Destino destinolocal3 = Destino.CURSO_DE_COMUNICACOES;
            System.out.println(destinolocal3.toString());

            Destino destinolocal10 = Destino.DIVISAO_ADMINISTRATIVA;
            System.out.println(destinolocal10.toString());

            Destino destinolocal11 = Destino.DIVISAO_DE_ENSINO;
            System.out.println(destinolocal11.toString());


        }

}