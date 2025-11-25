package ma.formations.soap;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import stub.Article;
import stub.ArticleSoapController;
import stub.EcommerceWS;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestWS {

    private static ArticleSoapController proxy = null;
    private static final List<Article> expectedData = new ArrayList<>();

    @BeforeAll
    public static void init() {
        proxy = new EcommerceWS().getArticleSoapControllerPort();
        expectedData.add(Article.builder().id(1l).description("Article_1").price(12000.0).quantity(10.0).build());
        expectedData.add(Article.builder().id(2l).description("Article_2").price(13000.0).quantity(20.0).build());
        expectedData.add(Article.builder().id(3l).description("Article_3").price(13000.0).quantity(30.0).build());
        expectedData.add(Article.builder().id(4l).description("Article_4").price(14000.0).quantity(40.0).build());
        expectedData.add(Article.builder().id(5l).description("Article_5").price(15000.0).quantity(50.0).build());
    }

    @Test
    public void testGetAll() {

        List<Article> result = proxy.getAll();
        assertEquals(5, result.size());
    }

    @ParameterizedTest
    @ValueSource(longs = {1, 2, 3, 4, 5})
    public void testGetById(Long id) {
        Article expectedArticleById=expectedData.stream().filter(a->a.getId().equals(id)).findFirst().get();
        Article result = proxy.getById(id);
        assertAll(
                () -> assertEquals(expectedArticleById.getId(), result.getId()),
                () -> assertEquals(expectedArticleById.getDescription(), result.getDescription()),
                () -> assertEquals(expectedArticleById.getPrice(), result.getPrice()),
                () -> assertEquals(expectedArticleById.getQuantity(), result.getQuantity())
        );
    }

    @Test
    public void testDeleteById() {
        String result = proxy.deleteById(1l);
        assertEquals(String.format("Article with id=%s is removed with success", 1l), result);
    }

    @Test
    public void testSave() {
        Article article=Article.builder().id(6l).description("Article_6").price(32000.0).quantity(55.0).build();
        proxy.saveArticle(article);

        Article result = proxy.getById(6l);
        assertAll(
                () -> assertEquals(article.getId(), result.getId()),
                () -> assertEquals(article.getDescription(), result.getDescription()),
                () -> assertEquals(article.getPrice(), result.getPrice()),
                () -> assertEquals(article.getQuantity(), result.getQuantity())
        );
    }
}
