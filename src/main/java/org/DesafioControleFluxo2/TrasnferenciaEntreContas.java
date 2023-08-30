package org.DesafioControleFluxo2;

public class TrasnferenciaEntreContas {

    public void trasnfere(Conta contaorigrm , Conta contaDestino,int valor){

        if(valor <= 0){
            throw  new IllegalArgumentException("deve ser maior que zero");
        }
    }

}
