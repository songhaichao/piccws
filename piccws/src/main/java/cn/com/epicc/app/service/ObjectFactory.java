package cn.com.epicc.app.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the cn.com.epicc.app.service package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _GetBDbeanByIPArgs0_QNAME = new QName(
			"http://service.app.epicc.com.cn", "args0");
	private final static QName _GetBDbeanByIPResponseReturn_QNAME = new QName(
			"http://service.app.epicc.com.cn", "return");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: cn.com.epicc.app.service
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link GetBDbeanByIP }
	 * 
	 */
	public GetBDbeanByIP createGetBDbeanByIP() {
		return new GetBDbeanByIP();
	}

	/**
	 * Create an instance of {@link GetBDbeanByIPResponse }
	 * 
	 */
	public GetBDbeanByIPResponse createGetBDbeanByIPResponse() {
		return new GetBDbeanByIPResponse();
	}

	/**
	 * Create an instance of {@link SendIDInfoResponse }
	 * 
	 */
	public SendIDInfoResponse createSendIDInfoResponse() {
		return new SendIDInfoResponse();
	}

	/**
	 * Create an instance of {@link SendIDInfo }
	 * 
	 */
	public SendIDInfo createSendIDInfo() {
		return new SendIDInfo();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.app.epicc.com.cn", name = "args0", scope = GetBDbeanByIP.class)
	public JAXBElement<String> createGetBDbeanByIPArgs0(String value) {
		return new JAXBElement<String>(_GetBDbeanByIPArgs0_QNAME, String.class,
				GetBDbeanByIP.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.app.epicc.com.cn", name = "return", scope = GetBDbeanByIPResponse.class)
	public JAXBElement<Object> createGetBDbeanByIPResponseReturn(Object value) {
		return new JAXBElement<Object>(_GetBDbeanByIPResponseReturn_QNAME,
				Object.class, GetBDbeanByIPResponse.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.app.epicc.com.cn", name = "return", scope = SendIDInfoResponse.class)
	public JAXBElement<String> createSendIDInfoResponseReturn(String value) {
		return new JAXBElement<String>(_GetBDbeanByIPResponseReturn_QNAME,
				String.class, SendIDInfoResponse.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.app.epicc.com.cn", name = "args0", scope = SendIDInfo.class)
	public JAXBElement<String> createSendIDInfoArgs0(String value) {
		return new JAXBElement<String>(_GetBDbeanByIPArgs0_QNAME, String.class,
				SendIDInfo.class, value);
	}

}
