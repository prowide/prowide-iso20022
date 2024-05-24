
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.datatype.XMLGregorianCalendar;
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
 * The application header is the first element of the RequestPayload element. The payload contains the document which contains the business document. This may be an ISO 20022 message or a SWIFT proprietary message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationHeader", propOrder = {
    "from",
    "to",
    "svcName",
    "msgName",
    "msgRef",
    "crDate",
    "dup"
})
public class ApplicationHeaderImpl {

    @XmlElement(name = "From")
    protected EntityIdentification from;
    @XmlElement(name = "To")
    protected EntityIdentification to;
    @XmlElement(name = "SvcName")
    protected String svcName;
    @XmlElement(name = "MsgName")
    protected String msgName;
    @XmlElement(name = "MsgRef", required = true)
    protected String msgRef;
    @XmlElement(name = "CrDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar crDate;
    @XmlElement(name = "Dup")
    protected DuplicateIndication dup;
    public static final transient Class[] _classes = new Class[] {ApplicationHeaderImpl.class, DuplicateIndication.class, EntityIdentification.class };

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link EntityIdentification }
     *     
     */
    public EntityIdentification getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityIdentification }
     *     
     */
    public ApplicationHeaderImpl setFrom(EntityIdentification value) {
        this.from = value;
        return this;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link EntityIdentification }
     *     
     */
    public EntityIdentification getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityIdentification }
     *     
     */
    public ApplicationHeaderImpl setTo(EntityIdentification value) {
        this.to = value;
        return this;
    }

    /**
     * Gets the value of the svcName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcName() {
        return svcName;
    }

    /**
     * Sets the value of the svcName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ApplicationHeaderImpl setSvcName(String value) {
        this.svcName = value;
        return this;
    }

    /**
     * Gets the value of the msgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgName() {
        return msgName;
    }

    /**
     * Sets the value of the msgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ApplicationHeaderImpl setMsgName(String value) {
        this.msgName = value;
        return this;
    }

    /**
     * Gets the value of the msgRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgRef() {
        return msgRef;
    }

    /**
     * Sets the value of the msgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ApplicationHeaderImpl setMsgRef(String value) {
        this.msgRef = value;
        return this;
    }

    /**
     * Gets the value of the crDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCrDate() {
        return crDate;
    }

    /**
     * Sets the value of the crDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public ApplicationHeaderImpl setCrDate(XMLGregorianCalendar value) {
        this.crDate = value;
        return this;
    }

    /**
     * Gets the value of the dup property.
     * 
     * @return
     *     possible object is
     *     {@link DuplicateIndication }
     *     
     */
    public DuplicateIndication getDup() {
        return dup;
    }

    /**
     * Sets the value of the dup property.
     * 
     * @param value
     *     allowed object is
     *     {@link DuplicateIndication }
     *     
     */
    public ApplicationHeaderImpl setDup(DuplicateIndication value) {
        this.dup = value;
        return this;
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

}
