
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
@XmlType(name = "BillingServiceParameters1", propOrder = {
    "bkSvc",
    "vol"
})
public class BillingServiceParameters1 {

    @XmlElement(name = "BkSvc", required = true)
    protected BillingServiceIdentification1 bkSvc;
    @XmlElement(name = "Vol")
    protected BigDecimal vol;

    /**
     * Gets the value of the bkSvc property.
     * 
     * @return
     *     possible object is
     *     {@link BillingServiceIdentification1 }
     *     
     */
    public BillingServiceIdentification1 getBkSvc() {
        return bkSvc;
    }

    /**
     * Sets the value of the bkSvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingServiceIdentification1 }
     *     
     */
    public BillingServiceParameters1 setBkSvc(BillingServiceIdentification1 value) {
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
    public BillingServiceParameters1 setVol(BigDecimal value) {
        this.vol = value;
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
