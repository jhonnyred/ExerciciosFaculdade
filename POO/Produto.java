class Produto{
    String nome;
    String marca;
    double custo;
    double venda;

    Produto(String nome, String marca, double custo, double venda){
        this.nome = nome;
        this.marca = marca;
        this.custo = custo;
        this.venda = venda;
    }

    String calculador(){
        String lucro = String.valueOf(this.venda - this.custo);
        return
           lucro;

    }
}

static void main(String[] args){
    
    Produto prod1 = new Produto("Refri","Coca-Cola",3,8);
    Produto prod2 = new Produto("Escova dental","Colgate",3, 15);
    Produto prod3 = new Produto("Papel Higiênico","Neve",10,45.76);

    System.out.println("Nome: " +prod1.nome+ "\nMarca: " +prod1.marca+ "\nCusto: " +prod1.custo+ "\nPreço de venda: " +prod1.venda+ "\nLucro: " +prod1.calculador() +"\n\n");
    System.out.println("Nome: " +prod2.nome+ "\nMarca: " +prod2.marca+ "\nCusto: " +prod2.custo+ "\nPreço de venda: " +prod2.venda+ "\nLucro: " +prod2.calculador() +"\n\n");
    System.out.println("Nome: " +prod3.nome+ "\nMarca: " +prod3.marca+ "\nCusto: " +prod3.custo+ "\nPreço de venda: " +prod3.venda+ "\nLucro: " +prod3.calculador());
}
