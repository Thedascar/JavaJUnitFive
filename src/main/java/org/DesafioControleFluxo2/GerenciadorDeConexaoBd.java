package org.DesafioControleFluxo2;

import java.util.logging.Logger;

public class GerenciadorDeConexaoBd {

    public static final Logger LOGGER = Logger.getLogger(GerenciadorDeConexaoBd.class.getName());


    public static void iniciarConexao(){
        LOGGER.info("Iniciou a conexação");
    }


    public static void finalizarConexao(){
        LOGGER.info("Finalizou a conexão");
    }

    public static void insereDados(Pessoa pessoa){
        LOGGER.info("inseriu dados");
    }

    public static void removeDados(Pessoa pessoa){
        LOGGER.info("removeu dados");
    }
}
