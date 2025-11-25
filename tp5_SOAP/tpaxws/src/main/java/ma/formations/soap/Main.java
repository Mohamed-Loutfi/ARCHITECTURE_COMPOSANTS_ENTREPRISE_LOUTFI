package ma.formations.soap;

import jakarta.xml.ws.Endpoint;
import ma.formations.soap.presentation.ArticleSoapController;

public class Main {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/ecommerce", new ArticleSoapController());
        System.out.println("Serveur démarré : http://localhost:9999/ecommerce");
    }
}