
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
 * Specifies the detailed parameters a service to be billed.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingServiceParameters2", propOrder = {
    "bkSvc",
    "vol",
    "unitPric",
    "svcChrgAmt"
})
public class BillingServiceParameters2 {

    @XmlElement(name = "BkSvc", required = true)
    protected BillingServiceIdentification2 bkSvc;
    @XmlElement(name = "Vol")
    protected BigDecimal vol;
    @XmlElement(name = "UnitPric")
    protected AmountAndDirection34 unitPric;
    @XmlElement(name = "SvcChrgAmt", required = true)
    protected AmountAndDirection34 svcChrgAmt;

    /**
     * Gets the value of the bkSvc property.
     * 
     * @return
     *     possible object is
     *     {@link BillingServiceIdentification2 }
     *     
     */
    public BillingServiceIdentification2 getBkSvc() {
        return bkSvc;
    }

    /**
     * Sets the value of the bkSvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingServiceIdentification2 }
     *     
     */
    public BillingServiceParameters2 setBkSvc(BillingServiceIdentification2 value) {
        this.bkSvc = value;
        return this;
    }

    /**
     * Gets the value of the vol property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVol() {
        return vol;
    }

    /**
     * Sets the value of the vol property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public BillingServiceParameters2 setVol(BigDecimal value) {
        this.vol = value;
        return this;
    }

    /**
     * Gets the value of the unitPric property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getUnitPric() {
        return unitPric;
    }

    /**
     * Sets the value of the unitPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public BillingServiceParameters2 setUnitPric(AmountAndDirection34 value) {
        this.unitPric = value;
        return this;
    }

    /**
     * Gets the value of the svcChrgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getSvcChrgAmt() {
        return svcChrgAmt;
    }

    /**
     * Sets the value of the svcChrgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public BillingServiceParameters2 setSvcChrgAmt(AmountAndDirection34 value) {
        this.svcChrgAmt = value;
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
