
package example;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the example package. 
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

    private final static QName _GetAvgMarkResponse_QNAME = new QName("http://example/", "getAvgMarkResponse");
    private final static QName _GetWorksForVerificationResponse_QNAME = new QName("http://example/", "getWorksForVerificationResponse");
    private final static QName _DownloadWork_QNAME = new QName("http://example/", "downloadWork");
    private final static QName _SetMark_QNAME = new QName("http://example/", "setMark");
    private final static QName _GetMarksResponse_QNAME = new QName("http://example/", "getMarksResponse");
    private final static QName _GetWorksForVerification_QNAME = new QName("http://example/", "getWorksForVerification");
    private final static QName _DownloadWorkResponse_QNAME = new QName("http://example/", "downloadWorkResponse");
    private final static QName _GetWorksResponse_QNAME = new QName("http://example/", "getWorksResponse");
    private final static QName _SetMarkResponse_QNAME = new QName("http://example/", "setMarkResponse");
    private final static QName _UploadWork_QNAME = new QName("http://example/", "uploadWork");
    private final static QName _GetWorks_QNAME = new QName("http://example/", "getWorks");
    private final static QName _GetAvgMark_QNAME = new QName("http://example/", "getAvgMark");
    private final static QName _UploadWorkResponse_QNAME = new QName("http://example/", "uploadWorkResponse");
    private final static QName _GetMarks_QNAME = new QName("http://example/", "getMarks");
    private final static QName _UploadWorkArg1_QNAME = new QName("", "arg1");
    private final static QName _DownloadWorkResponseReturn_QNAME = new QName("", "return");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: example
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SetMark }
     * 
     */
    public SetMark createSetMark() {
        return new SetMark();
    }

    /**
     * Create an instance of {@link GetMarksResponse }
     * 
     */
    public GetMarksResponse createGetMarksResponse() {
        return new GetMarksResponse();
    }

    /**
     * Create an instance of {@link GetAvgMarkResponse }
     * 
     */
    public GetAvgMarkResponse createGetAvgMarkResponse() {
        return new GetAvgMarkResponse();
    }

    /**
     * Create an instance of {@link GetWorksForVerificationResponse }
     * 
     */
    public GetWorksForVerificationResponse createGetWorksForVerificationResponse() {
        return new GetWorksForVerificationResponse();
    }

    /**
     * Create an instance of {@link DownloadWork }
     * 
     */
    public DownloadWork createDownloadWork() {
        return new DownloadWork();
    }

    /**
     * Create an instance of {@link DownloadWorkResponse }
     * 
     */
    public DownloadWorkResponse createDownloadWorkResponse() {
        return new DownloadWorkResponse();
    }

    /**
     * Create an instance of {@link GetWorksResponse }
     * 
     */
    public GetWorksResponse createGetWorksResponse() {
        return new GetWorksResponse();
    }

    /**
     * Create an instance of {@link GetWorksForVerification }
     * 
     */
    public GetWorksForVerification createGetWorksForVerification() {
        return new GetWorksForVerification();
    }

    /**
     * Create an instance of {@link GetWorks }
     * 
     */
    public GetWorks createGetWorks() {
        return new GetWorks();
    }

    /**
     * Create an instance of {@link SetMarkResponse }
     * 
     */
    public SetMarkResponse createSetMarkResponse() {
        return new SetMarkResponse();
    }

    /**
     * Create an instance of {@link UploadWork }
     * 
     */
    public UploadWork createUploadWork() {
        return new UploadWork();
    }

    /**
     * Create an instance of {@link UploadWorkResponse }
     * 
     */
    public UploadWorkResponse createUploadWorkResponse() {
        return new UploadWorkResponse();
    }

    /**
     * Create an instance of {@link GetMarks }
     * 
     */
    public GetMarks createGetMarks() {
        return new GetMarks();
    }

    /**
     * Create an instance of {@link GetAvgMark }
     * 
     */
    public GetAvgMark createGetAvgMark() {
        return new GetAvgMark();
    }

    /**
     * Create an instance of {@link Task }
     * 
     */
    public Task createTask() {
        return new Task();
    }

    /**
     * Create an instance of {@link Mark }
     * 
     */
    public Mark createMark() {
        return new Mark();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAvgMarkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/", name = "getAvgMarkResponse")
    public JAXBElement<GetAvgMarkResponse> createGetAvgMarkResponse(GetAvgMarkResponse value) {
        return new JAXBElement<GetAvgMarkResponse>(_GetAvgMarkResponse_QNAME, GetAvgMarkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWorksForVerificationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/", name = "getWorksForVerificationResponse")
    public JAXBElement<GetWorksForVerificationResponse> createGetWorksForVerificationResponse(GetWorksForVerificationResponse value) {
        return new JAXBElement<GetWorksForVerificationResponse>(_GetWorksForVerificationResponse_QNAME, GetWorksForVerificationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadWork }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/", name = "downloadWork")
    public JAXBElement<DownloadWork> createDownloadWork(DownloadWork value) {
        return new JAXBElement<DownloadWork>(_DownloadWork_QNAME, DownloadWork.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetMark }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/", name = "setMark")
    public JAXBElement<SetMark> createSetMark(SetMark value) {
        return new JAXBElement<SetMark>(_SetMark_QNAME, SetMark.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMarksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/", name = "getMarksResponse")
    public JAXBElement<GetMarksResponse> createGetMarksResponse(GetMarksResponse value) {
        return new JAXBElement<GetMarksResponse>(_GetMarksResponse_QNAME, GetMarksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWorksForVerification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/", name = "getWorksForVerification")
    public JAXBElement<GetWorksForVerification> createGetWorksForVerification(GetWorksForVerification value) {
        return new JAXBElement<GetWorksForVerification>(_GetWorksForVerification_QNAME, GetWorksForVerification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadWorkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/", name = "downloadWorkResponse")
    public JAXBElement<DownloadWorkResponse> createDownloadWorkResponse(DownloadWorkResponse value) {
        return new JAXBElement<DownloadWorkResponse>(_DownloadWorkResponse_QNAME, DownloadWorkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWorksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/", name = "getWorksResponse")
    public JAXBElement<GetWorksResponse> createGetWorksResponse(GetWorksResponse value) {
        return new JAXBElement<GetWorksResponse>(_GetWorksResponse_QNAME, GetWorksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetMarkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/", name = "setMarkResponse")
    public JAXBElement<SetMarkResponse> createSetMarkResponse(SetMarkResponse value) {
        return new JAXBElement<SetMarkResponse>(_SetMarkResponse_QNAME, SetMarkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadWork }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/", name = "uploadWork")
    public JAXBElement<UploadWork> createUploadWork(UploadWork value) {
        return new JAXBElement<UploadWork>(_UploadWork_QNAME, UploadWork.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWorks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/", name = "getWorks")
    public JAXBElement<GetWorks> createGetWorks(GetWorks value) {
        return new JAXBElement<GetWorks>(_GetWorks_QNAME, GetWorks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAvgMark }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/", name = "getAvgMark")
    public JAXBElement<GetAvgMark> createGetAvgMark(GetAvgMark value) {
        return new JAXBElement<GetAvgMark>(_GetAvgMark_QNAME, GetAvgMark.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadWorkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/", name = "uploadWorkResponse")
    public JAXBElement<UploadWorkResponse> createUploadWorkResponse(UploadWorkResponse value) {
        return new JAXBElement<UploadWorkResponse>(_UploadWorkResponse_QNAME, UploadWorkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMarks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/", name = "getMarks")
    public JAXBElement<GetMarks> createGetMarks(GetMarks value) {
        return new JAXBElement<GetMarks>(_GetMarks_QNAME, GetMarks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "arg1", scope = UploadWork.class)
    public JAXBElement<byte[]> createUploadWorkArg1(byte[] value) {
        return new JAXBElement<byte[]>(_UploadWorkArg1_QNAME, byte[].class, UploadWork.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "return", scope = DownloadWorkResponse.class)
    public JAXBElement<byte[]> createDownloadWorkResponseReturn(byte[] value) {
        return new JAXBElement<byte[]>(_DownloadWorkResponseReturn_QNAME, byte[].class, DownloadWorkResponse.class, ((byte[]) value));
    }

}
