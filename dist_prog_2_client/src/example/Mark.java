
package example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mark complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mark">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="submitter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mark" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mark", propOrder = {
    "submitter",
    "mark"
})
public class Mark {

    protected String submitter;
    protected int mark;

    /**
     * Gets the value of the submitter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmitter() {
        return submitter;
    }

    /**
     * Sets the value of the submitter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmitter(String value) {
        this.submitter = value;
    }

    /**
     * Gets the value of the mark property.
     * 
     */
    public int getMark() {
        return mark;
    }

    /**
     * Sets the value of the mark property.
     * 
     */
    public void setMark(int value) {
        this.mark = value;
    }

}
