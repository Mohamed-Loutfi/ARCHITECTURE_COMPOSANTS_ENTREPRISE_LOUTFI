
package stub;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the stub package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _DeleteById_QNAME = new QName("http://presentation.soap.formations.ma/", "deleteById");
    private static final QName _DeleteByIdResponse_QNAME = new QName("http://presentation.soap.formations.ma/", "deleteByIdResponse");
    private static final QName _GetAll_QNAME = new QName("http://presentation.soap.formations.ma/", "getAll");
    private static final QName _GetAllResponse_QNAME = new QName("http://presentation.soap.formations.ma/", "getAllResponse");
    private static final QName _GetById_QNAME = new QName("http://presentation.soap.formations.ma/", "getById");
    private static final QName _GetByIdResponse_QNAME = new QName("http://presentation.soap.formations.ma/", "getByIdResponse");
    private static final QName _SaveArticle_QNAME = new QName("http://presentation.soap.formations.ma/", "saveArticle");
    private static final QName _SaveArticleResponse_QNAME = new QName("http://presentation.soap.formations.ma/", "saveArticleResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: stub
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteById }
     * 
     * @return
     *     the new instance of {@link DeleteById }
     */
    public DeleteById createDeleteById() {
        return new DeleteById();
    }

    /**
     * Create an instance of {@link DeleteByIdResponse }
     * 
     * @return
     *     the new instance of {@link DeleteByIdResponse }
     */
    public DeleteByIdResponse createDeleteByIdResponse() {
        return new DeleteByIdResponse();
    }

    /**
     * Create an instance of {@link GetAll }
     * 
     * @return
     *     the new instance of {@link GetAll }
     */
    public GetAll createGetAll() {
        return new GetAll();
    }

    /**
     * Create an instance of {@link GetAllResponse }
     * 
     * @return
     *     the new instance of {@link GetAllResponse }
     */
    public GetAllResponse createGetAllResponse() {
        return new GetAllResponse();
    }

    /**
     * Create an instance of {@link GetById }
     * 
     * @return
     *     the new instance of {@link GetById }
     */
    public GetById createGetById() {
        return new GetById();
    }

    /**
     * Create an instance of {@link GetByIdResponse }
     * 
     * @return
     *     the new instance of {@link GetByIdResponse }
     */
    public GetByIdResponse createGetByIdResponse() {
        return new GetByIdResponse();
    }

    /**
     * Create an instance of {@link SaveArticle }
     * 
     * @return
     *     the new instance of {@link SaveArticle }
     */
    public SaveArticle createSaveArticle() {
        return new SaveArticle();
    }

    /**
     * Create an instance of {@link SaveArticleResponse }
     * 
     * @return
     *     the new instance of {@link SaveArticleResponse }
     */
    public SaveArticleResponse createSaveArticleResponse() {
        return new SaveArticleResponse();
    }

    /**
     * Create an instance of {@link Article }
     * 
     * @return
     *     the new instance of {@link Article }
     */
    public Article createArticle() {
        return new Article();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteById }{@code >}
     */
    @XmlElementDecl(namespace = "http://presentation.soap.formations.ma/", name = "deleteById")
    public JAXBElement<DeleteById> createDeleteById(DeleteById value) {
        return new JAXBElement<>(_DeleteById_QNAME, DeleteById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://presentation.soap.formations.ma/", name = "deleteByIdResponse")
    public JAXBElement<DeleteByIdResponse> createDeleteByIdResponse(DeleteByIdResponse value) {
        return new JAXBElement<>(_DeleteByIdResponse_QNAME, DeleteByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAll }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAll }{@code >}
     */
    @XmlElementDecl(namespace = "http://presentation.soap.formations.ma/", name = "getAll")
    public JAXBElement<GetAll> createGetAll(GetAll value) {
        return new JAXBElement<>(_GetAll_QNAME, GetAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://presentation.soap.formations.ma/", name = "getAllResponse")
    public JAXBElement<GetAllResponse> createGetAllResponse(GetAllResponse value) {
        return new JAXBElement<>(_GetAllResponse_QNAME, GetAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetById }{@code >}
     */
    @XmlElementDecl(namespace = "http://presentation.soap.formations.ma/", name = "getById")
    public JAXBElement<GetById> createGetById(GetById value) {
        return new JAXBElement<>(_GetById_QNAME, GetById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://presentation.soap.formations.ma/", name = "getByIdResponse")
    public JAXBElement<GetByIdResponse> createGetByIdResponse(GetByIdResponse value) {
        return new JAXBElement<>(_GetByIdResponse_QNAME, GetByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveArticle }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaveArticle }{@code >}
     */
    @XmlElementDecl(namespace = "http://presentation.soap.formations.ma/", name = "saveArticle")
    public JAXBElement<SaveArticle> createSaveArticle(SaveArticle value) {
        return new JAXBElement<>(_SaveArticle_QNAME, SaveArticle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveArticleResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaveArticleResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://presentation.soap.formations.ma/", name = "saveArticleResponse")
    public JAXBElement<SaveArticleResponse> createSaveArticleResponse(SaveArticleResponse value) {
        return new JAXBElement<>(_SaveArticleResponse_QNAME, SaveArticleResponse.class, null, value);
    }

}
