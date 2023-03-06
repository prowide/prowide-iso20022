
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Content of the Message TransactionStatus Request message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageStatusRequestData1", propOrder = {
    "xchgId",
    "initgPty",
    "rctRprntFlg",
    "docQlfr"
})
public class MessageStatusRequestData1 {

    @XmlElement(name = "XchgId", required = true)
    protected String xchgId;
    @XmlElement(name = "InitgPty", required = true)
    protected GenericIdentification171 initgPty;
    @XmlElement(name = "RctRprntFlg")
    protected Boolean rctRprntFlg;
    @XmlElement(name = "DocQlfr")
    @XmlSchemaType(name = "string")
    protected List<DocumentType7Code> docQlfr;

    /**
     * Gets the value of the xchgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXchgId() {
        return xchgId;
    }

    /**
     * Sets the value of the xchgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MessageStatusRequestData1 setXchgId(String value) {
        this.xchgId = value;
        return this;
    }

    /**
     * Gets the value of the initgPty property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification171 }
     *     
     */
    public GenericIdentification171 getInitgPty() {
        return initgPty;
    }

    /**
     * Sets the value of the initgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification171 }
     *     
     */
    public MessageStatusRequestData1 setInitgPty(GenericIdentification171 value) {
        this.initgPty = value;
        return this;
    }

    /**
     * Gets the value of the rctRprntFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRctRprntFlg() {
        return rctRprntFlg;
    }

    /**
     * Sets the value of the rctRprntFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public MessageStatusRequestData1 setRctRprntFlg(Boolean value) {
        this.rctRprntFlg = value;
        return this;
    }

    /**
     * Gets the value of the docQlfr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the docQlfr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocQlfr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentType7Code }
     * 
     * 
     */
    public List<DocumentType7Code> getDocQlfr() {
        if (docQlfr == null) {
            docQlfr = new ArrayList<DocumentType7Code>();
        }
        return this.docQlfr;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * Adds a new item to the docQlfr list.
     * @see #getDocQlfr()
     * 
     */
    public MessageStatusRequestData1 addDocQlfr(DocumentType7Code docQlfr) {
        getDocQlfr().add(docQlfr);
        return this;
    }

}
