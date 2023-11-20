import java.util.Scanner;

public class ContaTerminal{

    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        ContaTerminal c1 =  new ContaTerminal();

        System.out.println("Por favor, digite o número da agência:");

        c1.setAgencia(entrada.next());

        System.out.println("Por favor, digite o número da conta:");

        c1.setNumero(entrada.nextInt());

        System.out.println("Por favor, digite o seu nome:");

        c1.setNomeCliente(entrada.next());
        System.out.println("Por favor, digite o seu saldo:");

        c1.setSaldo(entrada.nextDouble());


        System.out.println("Olá " +c1.getNomeCliente() +
        ", obrigado por criar uma conta em nosso banco, sua agência é " + c1.getAgencia() +
        ", conta " + c1.getNumero() + 
        " e seu saldo "+ c1.getSaldo()+ " já está disponível para saque");
        
    }
}