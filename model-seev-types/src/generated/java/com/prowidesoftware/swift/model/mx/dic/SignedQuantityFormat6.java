
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Signed quantity of security formats.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignedQuantityFormat6", propOrder = {
    "shrtLngPos",
    "qty"
})
public class SignedQuantityFormat6 {

    @XmlElement(name = "ShrtLngPos", required = true)
    @XmlSchemaType(name = "string")
    protected ShortLong1Code shrtLngPos;
    @XmlElement(name = "Qty", required = true)
    protected FinancialInstrumentQuantity1Choice qty;

    /**
     * Gets the value of the shrtLngPos property.
     * 
     * @return
     *     possible object is
     *     {@link ShortLong1Code }
     *     
     */
    public ShortLong1Code getShrtLngPos() {
        return shrtLngPos;
    }

    /**
     * Sets the value of the shrtLngPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShortLong1Code }
     *     
     */
    public SignedQuantityFormat6 setShrtLngPos(ShortLong1Code value) {
        this.shrtLngPos = value;
        return this;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public SignedQuantityFormat6 setQty(FinancialInstrumentQuantity1Choice value) {
        this.qty = value;
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
