
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
 * Details of the triparty collateral transaction deal.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DealTransactionDetails7", propOrder = {
    "clsgDt",
    "dealDtlsAmt"
})
public class DealTransactionDetails7 {

    @XmlElement(name = "ClsgDt", required = true)
    protected ClosingDate4Choice clsgDt;
    @XmlElement(name = "DealDtlsAmt")
    protected CollateralAmount14 dealDtlsAmt;

    /**
     * Gets the value of the clsgDt property.
     * 
     * @return
     *     possible object is
     *     {@link ClosingDate4Choice }
     *     
     */
    public ClosingDate4Choice getClsgDt() {
        return clsgDt;
    }

    /**
     * Sets the value of the clsgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClosingDate4Choice }
     *     
     */
    public DealTransactionDetails7 setClsgDt(ClosingDate4Choice value) {
        this.clsgDt = value;
        return this;
    }

    /**
     * Gets the value of the dealDtlsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralAmount14 }
     *     
     */
    public CollateralAmount14 getDealDtlsAmt() {
        return dealDtlsAmt;
    }

    /**
     * Sets the value of the dealDtlsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralAmount14 }
     *     
     */
    public DealTransactionDetails7 setDealDtlsAmt(CollateralAmount14 value) {
        this.dealDtlsAmt = value;
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
