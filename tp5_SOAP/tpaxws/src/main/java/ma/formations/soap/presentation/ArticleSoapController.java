package ma.formations.soap.presentation;

import jakarta.annotation.PostConstruct;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import ma.formations.soap.service.IService;
import ma.formations.soap.service.ServiceImpl;
import ma.formations.soap.service.model.Article;

import java.util.List;


@WebService(serviceName = "EcommerceWS")
public class ArticleSoapController {
    private IService service;

    @WebMethod
    @WebResult(name = "Article")
    public Article saveArticle(@WebParam(name = "article") Article article) {
        return service.save(article);
    }

    @PostConstruct
    private void init() {
        this.service = new ServiceImpl();
    }

    @WebMethod
    @WebResult(name = "Article")
    public List<Article> getAll() {
        return service.getAll();
    }

    @WebMethod
    public String deleteById(Long id) {
        service.deleteById(id);
        return String.format("Article with id=%s is removed with success", id);
    }

    @WebMethod
    @WebResult(name = "Article")
    public Article getById(Long id) {
        return service.getById(id);
    }
}
