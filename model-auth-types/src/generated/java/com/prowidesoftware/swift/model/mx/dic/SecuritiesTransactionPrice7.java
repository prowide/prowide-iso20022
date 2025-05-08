
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
 * Choice to define the price of the securities transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTransactionPrice7", propOrder = {
    "mntryVal",
    "dgtlTknQty"
})
public class SecuritiesTransactionPrice7 {

    @XmlElement(name = "MntryVal", required = true)
    protected AmountAndDirection61 mntryVal;
    @XmlElement(name = "DgtlTknQty", required = true)
    protected DigitalTokenAmount2 dgtlTknQty;

    /**
     * Gets the value of the mntryVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection61 }
     *     
     */
    public AmountAndDirection61 getMntryVal() {
        return mntryVal;
    }

    /**
     * Sets the value of the mntryVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection61 }
     *     
     */
    public SecuritiesTransactionPrice7 setMntryVal(AmountAndDirection61 value) {
        this.mntryVal = value;
        return this;
    }

    /**
     * Gets the value of the dgtlTknQty property.
     * 
     * @return
     *     possible object is
     *     {@link DigitalTokenAmount2 }
     *     
     */
    public DigitalTokenAmount2 getDgtlTknQty() {
        return dgtlTknQty;
    }

    /**
     * Sets the value of the dgtlTknQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitalTokenAmount2 }
     *     
     */
    public SecuritiesTransactionPrice7 setDgtlTknQty(DigitalTokenAmount2 value) {
        this.dgtlTknQty = value;
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
