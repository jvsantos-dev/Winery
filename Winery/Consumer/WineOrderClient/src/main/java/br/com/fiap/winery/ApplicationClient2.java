package br.com.fiap.winery;

import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;

import br.com.fiap.winery.consumer.WineWarningService;

public class ApplicationClient2 {

    public static void main(String[] args) throws Exception {

        // URL do WSDL
        URL url2 = new URL("http://localhost:8086/WineWarningService?wsdl");

        // QName com targetNamespace e localPart
        QName qName2 = new QName(
                "http://winery.fiap.com.br/",
                "WineWarningServiceImplementationService"
        );

        // Criação do serviço
        Service service2 = Service.create(url2, qName2);

        // Obtendo a interface do WebService
        WineWarningService wineWarningService =
                service2.getPort(WineWarningService.class);

        // Chamando o método sendWarn
        String warn = wineWarningService.sendWarn();

        // Imprimindo no console
        System.out.println(warn);
    }
}