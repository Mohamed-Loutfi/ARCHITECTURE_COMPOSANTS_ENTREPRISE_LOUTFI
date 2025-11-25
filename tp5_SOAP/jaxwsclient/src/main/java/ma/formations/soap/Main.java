package ma.formations.soap;

import stub.Article;
import stub.ArticleSoapController;
import stub.EcommerceWS;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArticleSoapController service=new EcommerceWS().getArticleSoapControllerPort();
        List <Article> result=service.getAll();
        result.forEach(System.out::println);
    }
}