package br.com.fiap.winery;

import jakarta.xml.ws.Endpoint;

public class Loader {

    public static void main(String[] args) {

        // Instanciando o serviço
        WineWarningServiceImplementation wineWarning = new WineWarningServiceImplementation();

        // Publicando o serviço
        Endpoint.publish("http://localhost:8086/WineWarningService", wineWarning);

        // Mensagem no console
        System.out.println("Serviço publicado!");

        // WineStockServiceImplementation wineStock = new WineStockServiceImplementation();

        // Endpoint.publish("http://localhost:8085/WineStockService", wineStock);

        // .out.println("Serviço publicado!");
    }
}