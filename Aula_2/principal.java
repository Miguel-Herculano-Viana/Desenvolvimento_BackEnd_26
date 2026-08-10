package Aula_2;

public class principal {
    //metodo principal para executar o codigo
    public static void main(String[] args){
        //cria objeto
        carro meuCarro = new carro();

        //atribui uma cor e a marca ao objeto
        meuCarro.marca = "Mitsubishi";
        meuCarro.cor = "Vermelho";
        System.out.println("Marca Carro: " + meuCarro.marca + "\nCor: " + meuCarro.cor);
        meuCarro.buzinar();
    }
    
}
