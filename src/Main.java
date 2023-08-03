import org.anthony.desafio.models.Banco;
import org.anthony.desafio.models.Conta;

public class Main {
    public static void main(String[] args) {


        Conta conta1 = new Conta(1,2,3000,"Anthony", "Santander");
        Conta conta2 = new Conta(1,3,1500,"Andy", "Bradesco");

        conta1.debito(222, conta2);
        conta1.descriçãoTransação(conta1);

        System.out.println("*****************************************+");

        conta2.credito(333);
        conta2.descriçãoTransação(conta2);
    }
}