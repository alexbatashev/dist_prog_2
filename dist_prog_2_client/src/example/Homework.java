
package example;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.7-b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Homework", targetNamespace = "http://example/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Homework {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "uploadWork", targetNamespace = "http://example/", className = "example.UploadWork")
    @ResponseWrapper(localName = "uploadWorkResponse", targetNamespace = "http://example/", className = "example.UploadWorkResponse")
    @Action(input = "http://example/Homework/uploadWorkRequest", output = "http://example/Homework/uploadWorkResponse")
    public int uploadWork(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        byte[] arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns byte[]
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "downloadWork", targetNamespace = "http://example/", className = "example.DownloadWork")
    @ResponseWrapper(localName = "downloadWorkResponse", targetNamespace = "http://example/", className = "example.DownloadWorkResponse")
    @Action(input = "http://example/Homework/downloadWorkRequest", output = "http://example/Homework/downloadWorkResponse")
    public byte[] downloadWork(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "setMark", targetNamespace = "http://example/", className = "example.SetMark")
    @ResponseWrapper(localName = "setMarkResponse", targetNamespace = "http://example/", className = "example.SetMarkResponse")
    @Action(input = "http://example/Homework/setMarkRequest", output = "http://example/Homework/setMarkResponse")
    public void setMark(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2);

    /**
     * 
     * @param arg0
     * @return
     *     returns float
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAvgMark", targetNamespace = "http://example/", className = "example.GetAvgMark")
    @ResponseWrapper(localName = "getAvgMarkResponse", targetNamespace = "http://example/", className = "example.GetAvgMarkResponse")
    @Action(input = "http://example/Homework/getAvgMarkRequest", output = "http://example/Homework/getAvgMarkResponse")
    public float getAvgMark(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.Integer>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getWorksForVerification", targetNamespace = "http://example/", className = "example.GetWorksForVerification")
    @ResponseWrapper(localName = "getWorksForVerificationResponse", targetNamespace = "http://example/", className = "example.GetWorksForVerificationResponse")
    @Action(input = "http://example/Homework/getWorksForVerificationRequest", output = "http://example/Homework/getWorksForVerificationResponse")
    public List<Integer> getWorksForVerification();

    /**
     * 
     * @return
     *     returns java.util.List<example.Task>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getWorks", targetNamespace = "http://example/", className = "example.GetWorks")
    @ResponseWrapper(localName = "getWorksResponse", targetNamespace = "http://example/", className = "example.GetWorksResponse")
    @Action(input = "http://example/Homework/getWorksRequest", output = "http://example/Homework/getWorksResponse")
    public List<Task> getWorks();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<example.Mark>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMarks", targetNamespace = "http://example/", className = "example.GetMarks")
    @ResponseWrapper(localName = "getMarksResponse", targetNamespace = "http://example/", className = "example.GetMarksResponse")
    @Action(input = "http://example/Homework/getMarksRequest", output = "http://example/Homework/getMarksResponse")
    public List<Mark> getMarks(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}
