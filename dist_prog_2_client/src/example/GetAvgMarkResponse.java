
package example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAvgMarkResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAvgMarkResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAvgMarkResponse", propOrder = {
    "_return"
})
public class GetAvgMarkResponse {

    @XmlElement(name = "return")
    protected float _return;

    /**
     * Gets the value of the return property.
     * 
     */
    public float getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     */
    public void setReturn(float value) {
        this._return = value;
    }

}
