class Conta{
    
        int numero;
        double saldo = 0;

        Conta(int numero, double saldo){
            this.numero = numero;
            this.saldo = saldo;
        }

        void deposito(double valor){
            this.saldo += valor;
        }

        void saque (double valor){
            this.saldo -= valor;
        }
        
}
static void main(String[] args){
        Conta conta = new Conta(1234, 800);

        conta.deposito(1200);
        conta.deposito(600);
        conta.saque(500);

        System.out.println("Saldo " +conta.saldo);
        
}