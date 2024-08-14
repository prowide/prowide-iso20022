
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
 * Requirement for a clearing member to post collateral at a central counterparty with respect to a default fund.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefaultFundRequirement1", propOrder = {
    "clrMmbId",
    "svcId",
    "amt"
})
public class DefaultFundRequirement1 {

    @XmlElement(name = "ClrMmbId", required = true)
    protected GenericIdentification165 clrMmbId;
    @XmlElement(name = "SvcId")
    protected String svcId;
    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAndAmount amt;

    /**
     * Gets the value of the clrMmbId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification165 }
     *     
     */
    public GenericIdentification165 getClrMmbId() {
        return clrMmbId;
    }

    /**
     * Sets the value of the clrMmbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification165 }
     *     
     */
    public DefaultFundRequirement1 setClrMmbId(GenericIdentification165 value) {
        this.clrMmbId = value;
        return this;
    }

    /**
     * Gets the value of the svcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcId() {
        return svcId;
    }

    /**
     * Sets the value of the svcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DefaultFundRequirement1 setSvcId(String value) {
        this.svcId = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public DefaultFundRequirement1 setAmt(ActiveCurrencyAndAmount value) {
        this.amt = value;
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
