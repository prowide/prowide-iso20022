
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the amount of a premium on a currency option together with its calculation method.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PremiumQuote1Choice", propOrder = {
    "pctgOfCallAmt",
    "pctgOfPutAmt",
    "ptsOfCallAmt",
    "ptsOfPutAmt"
})
public class PremiumQuote1Choice {

    @XmlElement(name = "PctgOfCallAmt")
    protected BigDecimal pctgOfCallAmt;
    @XmlElement(name = "PctgOfPutAmt")
    protected BigDecimal pctgOfPutAmt;
    @XmlElement(name = "PtsOfCallAmt")
    protected BigDecimal ptsOfCallAmt;
    @XmlElement(name = "PtsOfPutAmt")
    protected BigDecimal ptsOfPutAmt;

    /**
     * Gets the value of the pctgOfCallAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPctgOfCallAmt() {
        return pctgOfCallAmt;
    }

    /**
     * Sets the value of the pctgOfCallAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PremiumQuote1Choice setPctgOfCallAmt(BigDecimal value) {
        this.pctgOfCallAmt = value;
        return this;
    }

    /**
     * Gets the value of the pctgOfPutAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPctgOfPutAmt() {
        return pctgOfPutAmt;
    }

    /**
     * Sets the value of the pctgOfPutAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PremiumQuote1Choice setPctgOfPutAmt(BigDecimal value) {
        this.pctgOfPutAmt = value;
        return this;
    }

    /**
     * Gets the value of the ptsOfCallAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPtsOfCallAmt() {
        return ptsOfCallAmt;
    }

    /**
     * Sets the value of the ptsOfCallAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PremiumQuote1Choice setPtsOfCallAmt(BigDecimal value) {
        this.ptsOfCallAmt = value;
        return this;
    }

    /**
     * Gets the value of the ptsOfPutAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPtsOfPutAmt() {
        return ptsOfPutAmt;
    }

    /**
     * Sets the value of the ptsOfPutAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PremiumQuote1Choice setPtsOfPutAmt(BigDecimal value) {
        this.ptsOfPutAmt = value;
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
