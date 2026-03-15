package br.com.fiap.winery;

import jakarta.jws.WebService;

@WebService(endpointInterface = "br.com.fiap.winery.WineStockService")
public class WineStockServiceImplementation implements WineStockService {

    @Override
    public String getMenu() {

        String menu = "===== MENU DE VINHOS =====\n";

        menu += "\nUva Cabernet Sauvignon:\n";
        menu += "- Cabernet Sauvignon Reserva\n";
        menu += "- Cabernet Sauvignon Premium\n";

        menu += "\nUva Merlot:\n";
        menu += "- Merlot Reserva\n";
        menu += "- Merlot Safra Especial\n";

        menu += "\nUva Chardonnay:\n";
        menu += "- Chardonnay Clássico\n";
        menu += "- Chardonnay Barricado\n";

        menu += "\nUva Pinot Noir:\n";
        menu += "- Pinot Noir Elegance\n";
        menu += "- Pinot Noir Vintage\n";

        return menu;
    }

    @Override
    public String placeOrder(String wine, int quantity) {
        return "Pedido realizado: " + quantity + " unidade(s) de " + wine;
    }
}