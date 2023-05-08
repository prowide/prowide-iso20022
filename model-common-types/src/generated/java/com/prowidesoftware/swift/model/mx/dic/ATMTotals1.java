
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Current totals of the ATM.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMTotals1", propOrder = {
    "mdiaTp",
    "ccy",
    "atmBal",
    "atmCur",
    "atmBalNb",
    "atmCurNb"
})
public class ATMTotals1 {

    @XmlElement(name = "MdiaTp")
    @XmlSchemaType(name = "string")
    protected ATMMediaType1Code mdiaTp;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "ATMBal")
    protected BigDecimal atmBal;
    @XmlElement(name = "ATMCur")
    protected BigDecimal atmCur;
    @XmlElement(name = "ATMBalNb")
    protected BigDecimal atmBalNb;
    @XmlElement(name = "ATMCurNb")
    protected BigDecimal atmCurNb;

    /**
     * Gets the value of the mdiaTp property.
     * 
     * @return
     *     possible object is
     *     {@link ATMMediaType1Code }
     *     
     */
    public ATMMediaType1Code getMdiaTp() {
        return mdiaTp;
    }

    /**
     * Sets the value of the mdiaTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMMediaType1Code }
     *     
     */
    public ATMTotals1 setMdiaTp(ATMMediaType1Code value) {
        this.mdiaTp = value;
        return this;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMTotals1 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the atmBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getATMBal() {
        return atmBal;
    }

    /**
     * Sets the value of the atmBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMTotals1 setATMBal(BigDecimal value) {
        this.atmBal = value;
        return this;
    }

    /**
     * Gets the value of the atmCur property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getATMCur() {
        return atmCur;
    }

    /**
     * Sets the value of the atmCur property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMTotals1 setATMCur(BigDecimal value) {
        this.atmCur = value;
        return this;
    }

    /**
     * Gets the value of the atmBalNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getATMBalNb() {
        return atmBalNb;
    }

    /**
     * Sets the value of the atmBalNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMTotals1 setATMBalNb(BigDecimal value) {
        this.atmBalNb = value;
        return this;
    }

    /**
     * Gets the value of the atmCurNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getATMCurNb() {
        return atmCurNb;
    }

    /**
     * Sets the value of the atmCurNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMTotals1 setATMCurNb(BigDecimal value) {
        this.atmCurNb = value;
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
