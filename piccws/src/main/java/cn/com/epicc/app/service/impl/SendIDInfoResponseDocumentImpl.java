/*
 * An XML document type.
 * Localname: sendIDInfoResponse
 * Namespace: http://service.app.epicc.com.cn
 * Java type: cn.com.epicc.app.service.SendIDInfoResponseDocument
 *
 * Automatically generated - do not modify.
 */
package cn.com.epicc.app.service.impl;
/**
 * A document containing one sendIDInfoResponse(@http://service.app.epicc.com.cn) element.
 *
 * This is a complex type.
 */
public class SendIDInfoResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cn.com.epicc.app.service.SendIDInfoResponseDocument
{
    
    public SendIDInfoResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SENDIDINFORESPONSE$0 = 
        new javax.xml.namespace.QName("http://service.app.epicc.com.cn", "sendIDInfoResponse");
    
    
    /**
     * Gets the "sendIDInfoResponse" element
     */
    public cn.com.epicc.app.service.SendIDInfoResponseDocument.SendIDInfoResponse getSendIDInfoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cn.com.epicc.app.service.SendIDInfoResponseDocument.SendIDInfoResponse target = null;
            target = (cn.com.epicc.app.service.SendIDInfoResponseDocument.SendIDInfoResponse)get_store().find_element_user(SENDIDINFORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sendIDInfoResponse" element
     */
    public void setSendIDInfoResponse(cn.com.epicc.app.service.SendIDInfoResponseDocument.SendIDInfoResponse sendIDInfoResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            cn.com.epicc.app.service.SendIDInfoResponseDocument.SendIDInfoResponse target = null;
            target = (cn.com.epicc.app.service.SendIDInfoResponseDocument.SendIDInfoResponse)get_store().find_element_user(SENDIDINFORESPONSE$0, 0);
            if (target == null)
            {
                target = (cn.com.epicc.app.service.SendIDInfoResponseDocument.SendIDInfoResponse)get_store().add_element_user(SENDIDINFORESPONSE$0);
            }
            target.set(sendIDInfoResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "sendIDInfoResponse" element
     */
    public cn.com.epicc.app.service.SendIDInfoResponseDocument.SendIDInfoResponse addNewSendIDInfoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cn.com.epicc.app.service.SendIDInfoResponseDocument.SendIDInfoResponse target = null;
            target = (cn.com.epicc.app.service.SendIDInfoResponseDocument.SendIDInfoResponse)get_store().add_element_user(SENDIDINFORESPONSE$0);
            return target;
        }
    }
    /**
     * An XML sendIDInfoResponse(@http://service.app.epicc.com.cn).
     *
     * This is a complex type.
     */
    public static class SendIDInfoResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cn.com.epicc.app.service.SendIDInfoResponseDocument.SendIDInfoResponse
    {
        
        public SendIDInfoResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("http://service.app.epicc.com.cn", "return");
        
        
        /**
         * Gets the "return" element
         */
        public java.lang.String getReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "return" element
         */
        public org.apache.xmlbeans.XmlString xgetReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETURN$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "return" element
         */
        public boolean isNilReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETURN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "return" element
         */
        public boolean isSetReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RETURN$0) != 0;
            }
        }
        
        /**
         * Sets the "return" element
         */
        public void setReturn(java.lang.String xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETURN$0);
                }
                target.setStringValue(xreturn);
            }
        }
        
        /**
         * Sets (as xml) the "return" element
         */
        public void xsetReturn(org.apache.xmlbeans.XmlString xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RETURN$0);
                }
                target.set(xreturn);
            }
        }
        
        /**
         * Nils the "return" element
         */
        public void setNilReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RETURN$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "return" element
         */
        public void unsetReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RETURN$0, 0);
            }
        }
    }
}
