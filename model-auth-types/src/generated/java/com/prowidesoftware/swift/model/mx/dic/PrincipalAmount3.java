
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
 * Indication of the cash values to be settled as of the start and maturity date of the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrincipalAmount3", propOrder = {
    "valDtAmt",
    "mtrtyDtAmt"
})
public class PrincipalAmount3 {

    @XmlElement(name = "ValDtAmt")
    protected ActiveOrHistoricCurrencyAndAmount valDtAmt;
    @XmlElement(name = "MtrtyDtAmt")
    protected ActiveOrHistoricCurrencyAndAmount mtrtyDtAmt;

    /**
     * Gets the value of the valDtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getValDtAmt() {
        return valDtAmt;
    }

    /**
     * Sets the value of the valDtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public PrincipalAmount3 setValDtAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.valDtAmt = value;
        return this;
    }

    /**
     * Gets the value of the mtrtyDtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getMtrtyDtAmt() {
        return mtrtyDtAmt;
    }

    /**
     * Sets the value of the mtrtyDtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public PrincipalAmount3 setMtrtyDtAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.mtrtyDtAmt = value;
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
