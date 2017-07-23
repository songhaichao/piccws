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
 *         &lt;element name=&quot;args0&quot; type=&quot;{http://www.w3.org/2001/XMLSchema}string&quot; minOccurs=&quot;0&quot;/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "args0" })
@XmlRootElement(name = "getBDbeanByIP")
public class GetBDbeanByIP {

	@XmlElementRef(name = "args0", namespace = "http://service.app.epicc.com.cn", type = JAXBElement.class)
	protected JAXBElement<String> args0;

	/**
	 * Gets the value of the args0 property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	public JAXBElement<String> getArgs0() {
		return args0;
	}

	/**
	 * Sets the value of the args0 property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	public void setArgs0(JAXBElement<String> value) {
		this.args0 = ((JAXBElement<String>) value);
	}

}
