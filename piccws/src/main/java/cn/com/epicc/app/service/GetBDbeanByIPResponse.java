package cn.com.epicc.app.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
 *       &lt;sequence&gt;
 *         &lt;element name=&quot;return&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot; minOccurs=&quot;0&quot;/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "_return" })
@XmlRootElement(name = "getBDbeanByIPResponse")
public class GetBDbeanByIPResponse {

	@XmlElementRef(name = "return", namespace = "http://service.app.epicc.com.cn", type = JAXBElement.class)
	protected JAXBElement<Object> _return;

	/**
	 * Gets the value of the return property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link Object }{@code >}
	 * 
	 */
	public JAXBElement<Object> getReturn() {
		return _return;
	}

	/**
	 * Sets the value of the return property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link Object }{@code >}
	 * 
	 */
	public void setReturn(JAXBElement<Object> value) {
		this._return = ((JAXBElement<Object>) value);
	}

}
