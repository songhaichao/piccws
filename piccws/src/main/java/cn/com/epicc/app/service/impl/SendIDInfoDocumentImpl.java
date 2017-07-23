/*
 * An XML document type.
 * Localname: sendIDInfo
 * Namespace: http://service.app.epicc.com.cn
 * Java type: cn.com.epicc.app.service.SendIDInfoDocument
 *
 * Automatically generated - do not modify.
 */
package cn.com.epicc.app.service.impl;
/**
 * A document containing one sendIDInfo(@http://service.app.epicc.com.cn) element.
 *
 * This is a complex type.
 */
public class SendIDInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cn.com.epicc.app.service.SendIDInfoDocument
{
    
    public SendIDInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SENDIDINFO$0 = 
        new javax.xml.namespace.QName("http://service.app.epicc.com.cn", "sendIDInfo");
    
    
    /**
     * Gets the "sendIDInfo" element
     */
    public cn.com.epicc.app.service.SendIDInfoDocument.SendIDInfo getSendIDInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cn.com.epicc.app.service.SendIDInfoDocument.SendIDInfo target = null;
            target = (cn.com.epicc.app.service.SendIDInfoDocument.SendIDInfo)get_store().find_element_user(SENDIDINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sendIDInfo" element
     */
    public void setSendIDInfo(cn.com.epicc.app.service.SendIDInfoDocument.SendIDInfo sendIDInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            cn.com.epicc.app.service.SendIDInfoDocument.SendIDInfo target = null;
            target = (cn.com.epicc.app.service.SendIDInfoDocument.SendIDInfo)get_store().find_element_user(SENDIDINFO$0, 0);
            if (target == null)
            {
                target = (cn.com.epicc.app.service.SendIDInfoDocument.SendIDInfo)get_store().add_element_user(SENDIDINFO$0);
            }
            target.set(sendIDInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "sendIDInfo" element
     */
    public cn.com.epicc.app.service.SendIDInfoDocument.SendIDInfo addNewSendIDInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cn.com.epicc.app.service.SendIDInfoDocument.SendIDInfo target = null;
            target = (cn.com.epicc.app.service.SendIDInfoDocument.SendIDInfo)get_store().add_element_user(SENDIDINFO$0);
            return target;
        }
    }
    /**
     * An XML sendIDInfo(@http://service.app.epicc.com.cn).
     *
     * This is a complex type.
     */
    public static class SendIDInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cn.com.epicc.app.service.SendIDInfoDocument.SendIDInfo
    {
        
        public SendIDInfoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ARGS0$0 = 
            new javax.xml.namespace.QName("http://service.app.epicc.com.cn", "args0");
        
        
        /**
         * Gets the "args0" element
         */
        public java.lang.String getArgs0()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARGS0$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "args0" element
         */
        public org.apache.xmlbeans.XmlString xgetArgs0()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARGS0$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "args0" element
         */
        public boolean isNilArgs0()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARGS0$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "args0" element
         */
        public boolean isSetArgs0()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ARGS0$0) != 0;
            }
        }
        
        /**
         * Sets the "args0" element
         */
        public void setArgs0(java.lang.String args0)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARGS0$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARGS0$0);
                }
                target.setStringValue(args0);
            }
        }
        
        /**
         * Sets (as xml) the "args0" element
         */
        public void xsetArgs0(org.apache.xmlbeans.XmlString args0)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARGS0$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARGS0$0);
                }
                target.set(args0);
            }
        }
        
        /**
         * Nils the "args0" element
         */
        public void setNilArgs0()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARGS0$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARGS0$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "args0" element
         */
        public void unsetArgs0()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ARGS0$0, 0);
            }
        }
    }
}
