
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
 * Additional information required for distribution in the UK market.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalProductInformation3", propOrder = {
    "finInstrmTxCostsExAnteUK",
    "finInstrmTxCostsExPstUK"
})
public class AdditionalProductInformation3 {

    @XmlElement(name = "FinInstrmTxCostsExAnteUK")
    protected BigDecimal finInstrmTxCostsExAnteUK;
    @XmlElement(name = "FinInstrmTxCostsExPstUK")
    protected BigDecimal finInstrmTxCostsExPstUK;

    /**
     * Gets the value of the finInstrmTxCostsExAnteUK property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFinInstrmTxCostsExAnteUK() {
        return finInstrmTxCostsExAnteUK;
    }

    /**
     * Sets the value of the finInstrmTxCostsExAnteUK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public AdditionalProductInformation3 setFinInstrmTxCostsExAnteUK(BigDecimal value) {
        this.finInstrmTxCostsExAnteUK = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmTxCostsExPstUK property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFinInstrmTxCostsExPstUK() {
        return finInstrmTxCostsExPstUK;
    }

    /**
     * Sets the value of the finInstrmTxCostsExPstUK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public AdditionalProductInformation3 setFinInstrmTxCostsExPstUK(BigDecimal value) {
        this.finInstrmTxCostsExPstUK = value;
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
