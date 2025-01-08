
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
 * Combination of two or more transactions that are reported separately but that are negotiated together as the product of a single economic agreement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Package1", propOrder = {
    "cmplxTradId",
    "pric",
    "sprd"
})
public class Package1 {

    @XmlElement(name = "CmplxTradId", required = true)
    protected String cmplxTradId;
    @XmlElement(name = "Pric")
    protected SecuritiesTransactionPrice17Choice pric;
    @XmlElement(name = "Sprd")
    protected SecuritiesTransactionPrice13Choice sprd;

    /**
     * Gets the value of the cmplxTradId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmplxTradId() {
        return cmplxTradId;
    }

    /**
     * Sets the value of the cmplxTradId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Package1 setCmplxTradId(String value) {
        this.cmplxTradId = value;
        return this;
    }

    /**
     * Gets the value of the pric property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice17Choice }
     *     
     */
    public SecuritiesTransactionPrice17Choice getPric() {
        return pric;
    }

    /**
     * Sets the value of the pric property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice17Choice }
     *     
     */
    public Package1 setPric(SecuritiesTransactionPrice17Choice value) {
        this.pric = value;
        return this;
    }

    /**
     * Gets the value of the sprd property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice13Choice }
     *     
     */
    public SecuritiesTransactionPrice13Choice getSprd() {
        return sprd;
    }

    /**
     * Sets the value of the sprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice13Choice }
     *     
     */
    public Package1 setSprd(SecuritiesTransactionPrice13Choice value) {
        this.sprd = value;
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
