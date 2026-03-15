package br.com.fiap.winery;

import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import br.com.fiap.winery.consumer.WineStockService;
public class ApplicationClient1 {

    public static void main(String[] args) throws Exception {

        // URL do WSDL
        URL url = new URL("http://localhost:8085/WineStockService?wsdl");

        // targetNamespace e localPart do serviço
        QName qName = new QName(
                "http://winery.fiap.com.br/",
                "WineStockServiceImplementationService"
        );

        // Criação do Service
        Service service = Service.create(url, qName);

        // Obtendo o proxy do Web Service
        WineStockService wineStockService = service.getPort(WineStockService.class);

        // Chamando o método do Web Service
        String menu = wineStockService.getMenu();

        // Imprimindo resultado
        System.out.println(menu);
    }
}