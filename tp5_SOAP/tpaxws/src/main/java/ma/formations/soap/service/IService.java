package ma.formations.soap.service;

import ma.formations.soap.service.model.Article;

import java.util.ArrayList;
import java.util.List;

public interface IService {
    List<Article> getAll();

    Article save(Article article);

    void deleteById(Long id);

    Article getById(Long id);
}
