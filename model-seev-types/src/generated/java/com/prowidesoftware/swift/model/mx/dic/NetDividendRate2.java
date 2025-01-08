
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
 * Cash dividend amount per equity after deductions or allowances have been made.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetDividendRate2", propOrder = {
    "rateTp",
    "amt"
})
public class NetDividendRate2 {

    @XmlElement(name = "RateTp", required = true)
    protected NetDividendRateType1FormatChoice rateTp;
    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAndAmount amt;

    /**
     * Gets the value of the rateTp property.
     * 
     * @return
     *     possible object is
     *     {@link NetDividendRateType1FormatChoice }
     *     
     */
    public NetDividendRateType1FormatChoice getRateTp() {
        return rateTp;
    }

    /**
     * Sets the value of the rateTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetDividendRateType1FormatChoice }
     *     
     */
    public NetDividendRate2 setRateTp(NetDividendRateType1FormatChoice value) {
        this.rateTp = value;
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
    public NetDividendRate2 setAmt(ActiveCurrencyAndAmount value) {
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
