public class App {
public static void main(String[]args){
   Vendedor roberto = new Vendedor();


    roberto.nome = "Roberto Silva";
    roberto.comissão = "0.08%";
    roberto.cpf = "615.458.285.02";
    roberto.numeroDeVenda = "65";

    Cliente vinicius = new Cliente();

    vinicius.nome = "Vinicius Souza";
    vinicius.numeroDeCompra = "4";
    vinicius.quantidadeDeCompra = "1";


    Fornecedor fornecedor1 = new Fornecedor();


    fornecedor1.endereco = "av.campobom";  
    fornecedor1.nome = "entregasltda";
    fornecedor1.parceiro = "25";
    fornecedor1.cnpj = "3852700000100";
    fornecedor1.quantidade = 40;
    fornecedor1.unidadeDeMedida = "1kg";
   

     Produto notebook = new Produto();{
      

    notebook.numeroTotalDeProdutos = "150";
    notebook.descriçao = "Dell Inpiroin 15000";
    notebook.precoUnitario = "R$2.400";
   


    Transportadora miller = new Transportadora();

    miller.nome = "Ernesto Miller";
    miller.cnpj = "3542600000100";
    miller.numeroDeVeiculosNaFrota = 50;


   }
}