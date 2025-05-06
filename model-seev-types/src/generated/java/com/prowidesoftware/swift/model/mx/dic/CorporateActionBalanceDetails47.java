
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Account balances shared with issuer agent.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionBalanceDetails47", propOrder = {
    "sctyClldAmt",
    "ttlAmtOutsdng"
})
public class CorporateActionBalanceDetails47 {

    @XmlElement(name = "SctyClldAmt")
    protected BigDecimal sctyClldAmt;
    @XmlElement(name = "TtlAmtOutsdng")
    protected BigDecimal ttlAmtOutsdng;

    /**
     * Gets the value of the sctyClldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSctyClldAmt() {
        return sctyClldAmt;
    }

    /**
     * Sets the value of the sctyClldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CorporateActionBalanceDetails47 setSctyClldAmt(BigDecimal value) {
        this.sctyClldAmt = value;
        return this;
    }

    /**
     * Gets the value of the ttlAmtOutsdng property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlAmtOutsdng() {
        return ttlAmtOutsdng;
    }

    /**
     * Sets the value of the ttlAmtOutsdng property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CorporateActionBalanceDetails47 setTtlAmtOutsdng(BigDecimal value) {
        this.ttlAmtOutsdng = value;
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
