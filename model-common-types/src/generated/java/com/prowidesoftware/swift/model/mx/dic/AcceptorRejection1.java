
package com.prowidesoftware.swift.model.mx.dic;

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
 * Reject of an exchange.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorRejection1", propOrder = {
    "rjctRsn",
    "addtlInf",
    "msgInErr"
})
public class AcceptorRejection1 {

    @XmlElement(name = "RjctRsn", required = true)
    @XmlSchemaType(name = "string")
    protected RejectReason1Code rjctRsn;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;
    @XmlElement(name = "MsgInErr")
    protected byte[] msgInErr;

    /**
     * Gets the value of the rjctRsn property.
     * 
     * @return
     *     possible object is
     *     {@link RejectReason1Code }
     *     
     */
    public RejectReason1Code getRjctRsn() {
        return rjctRsn;
    }

    /**
     * Sets the value of the rjctRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectReason1Code }
     *     
     */
    public AcceptorRejection1 setRjctRsn(RejectReason1Code value) {
        this.rjctRsn = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AcceptorRejection1 setAddtlInf(String value) {
        this.addtlInf = value;
        return this;
    }

    /**
     * Gets the value of the msgInErr property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getMsgInErr() {
        return msgInErr;
    }

    /**
     * Sets the value of the msgInErr property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public AcceptorRejection1 setMsgInErr(byte[] value) {
        this.msgInErr = value;
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
