
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Amount of money associated with a service.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargesDetails4", propOrder = {
    "chrgsTp",
    "amt"
})
public class ChargesDetails4 {

    @XmlElement(name = "ChrgsTp", required = true)
    protected ChargesType1Choice chrgsTp;
    @XmlElement(name = "Amt", required = true)
    protected CurrencyAndAmount amt;

    /**
     * Gets the value of the chrgsTp property.
     * 
     * @return
     *     possible object is
     *     {@link ChargesType1Choice }
     *     
     */
    public ChargesType1Choice getChrgsTp() {
        return chrgsTp;
    }

    /**
     * Sets the value of the chrgsTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargesType1Choice }
     *     
     */
    public ChargesDetails4 setChrgsTp(ChargesType1Choice value) {
        this.chrgsTp = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public ChargesDetails4 setAmt(CurrencyAndAmount value) {
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
