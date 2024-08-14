
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
 * Reason to reject the message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RejectionReason23", propOrder = {
    "rsn",
    "addtlInf",
    "lkdMsg"
})
public class RejectionReason23 {

    @XmlElement(name = "Rsn", required = true)
    @XmlSchemaType(name = "string")
    protected MessageRejectedReason1Code rsn;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;
    @XmlElement(name = "LkdMsg")
    protected LinkedMessage1Choice lkdMsg;

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link MessageRejectedReason1Code }
     *     
     */
    public MessageRejectedReason1Code getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageRejectedReason1Code }
     *     
     */
    public RejectionReason23 setRsn(MessageRejectedReason1Code value) {
        this.rsn = value;
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
    public RejectionReason23 setAddtlInf(String value) {
        this.addtlInf = value;
        return this;
    }

    /**
     * Gets the value of the lkdMsg property.
     * 
     * @return
     *     possible object is
     *     {@link LinkedMessage1Choice }
     *     
     */
    public LinkedMessage1Choice getLkdMsg() {
        return lkdMsg;
    }

    /**
     * Sets the value of the lkdMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkedMessage1Choice }
     *     
     */
    public RejectionReason23 setLkdMsg(LinkedMessage1Choice value) {
        this.lkdMsg = value;
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
