
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
@XmlType(name = "Package4", propOrder = {
    "cmplxTradId",
    "fxSwpLkId",
    "pric",
    "sprd"
})
public class Package4 {

    @XmlElement(name = "CmplxTradId")
    protected String cmplxTradId;
    @XmlElement(name = "FxSwpLkId")
    protected String fxSwpLkId;
    @XmlElement(name = "Pric")
    protected SecuritiesTransactionPrice17Choice pric;
    @XmlElement(name = "Sprd")
    protected SecuritiesTransactionPrice20Choice sprd;

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
    public Package4 setCmplxTradId(String value) {
        this.cmplxTradId = value;
        return this;
    }

    /**
     * Gets the value of the fxSwpLkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFxSwpLkId() {
        return fxSwpLkId;
    }

    /**
     * Sets the value of the fxSwpLkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Package4 setFxSwpLkId(String value) {
        this.fxSwpLkId = value;
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
    public Package4 setPric(SecuritiesTransactionPrice17Choice value) {
        this.pric = value;
        return this;
    }

    /**
     * Gets the value of the sprd property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice20Choice }
     *     
     */
    public SecuritiesTransactionPrice20Choice getSprd() {
        return sprd;
    }

    /**
     * Sets the value of the sprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice20Choice }
     *     
     */
    public Package4 setSprd(SecuritiesTransactionPrice20Choice value) {
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
