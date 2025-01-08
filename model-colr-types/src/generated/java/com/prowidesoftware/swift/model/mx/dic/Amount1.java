
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Margin amount payable by one party to the other party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Amount1", propOrder = {
    "agrdAmt",
    "mrgnCallReqId",
    "addtlInf"
})
public class Amount1 {

    @XmlElement(name = "AgrdAmt", required = true)
    protected ActiveCurrencyAndAmount agrdAmt;
    @XmlElement(name = "MrgnCallReqId", required = true)
    protected String mrgnCallReqId;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Gets the value of the agrdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAgrdAmt() {
        return agrdAmt;
    }

    /**
     * Sets the value of the agrdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Amount1 setAgrdAmt(ActiveCurrencyAndAmount value) {
        this.agrdAmt = value;
        return this;
    }

    /**
     * Gets the value of the mrgnCallReqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrgnCallReqId() {
        return mrgnCallReqId;
    }

    /**
     * Sets the value of the mrgnCallReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Amount1 setMrgnCallReqId(String value) {
        this.mrgnCallReqId = value;
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
    public Amount1 setAddtlInf(String value) {
        this.addtlInf = value;
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
