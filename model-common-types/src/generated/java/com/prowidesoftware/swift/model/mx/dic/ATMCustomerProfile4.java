
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
 * Profile of the customer selected by an ATM.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMCustomerProfile4", propOrder = {
    "rtrvlMd",
    "prflRef",
    "cstmrId"
})
public class ATMCustomerProfile4 {

    @XmlElement(name = "RtrvlMd", required = true)
    @XmlSchemaType(name = "string")
    protected ATMCustomerProfile1Code rtrvlMd;
    @XmlElement(name = "PrflRef")
    protected String prflRef;
    @XmlElement(name = "CstmrId")
    protected String cstmrId;

    /**
     * Gets the value of the rtrvlMd property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCustomerProfile1Code }
     *     
     */
    public ATMCustomerProfile1Code getRtrvlMd() {
        return rtrvlMd;
    }

    /**
     * Sets the value of the rtrvlMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCustomerProfile1Code }
     *     
     */
    public ATMCustomerProfile4 setRtrvlMd(ATMCustomerProfile1Code value) {
        this.rtrvlMd = value;
        return this;
    }

    /**
     * Gets the value of the prflRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrflRef() {
        return prflRef;
    }

    /**
     * Sets the value of the prflRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMCustomerProfile4 setPrflRef(String value) {
        this.prflRef = value;
        return this;
    }

    /**
     * Gets the value of the cstmrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstmrId() {
        return cstmrId;
    }

    /**
     * Sets the value of the cstmrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMCustomerProfile4 setCstmrId(String value) {
        this.cstmrId = value;
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
