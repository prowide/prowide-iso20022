
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
 * Special conditions for the loan.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialCondition1", propOrder = {
    "incmgAmt",
    "outgngAmt",
    "incmgAmtToOthrAcct",
    "pmtFrOthrAcct"
})
public class SpecialCondition1 {

    @XmlElement(name = "IncmgAmt", required = true)
    protected ActiveCurrencyAndAmount incmgAmt;
    @XmlElement(name = "OutgngAmt", required = true)
    protected ActiveCurrencyAndAmount outgngAmt;
    @XmlElement(name = "IncmgAmtToOthrAcct")
    protected ActiveCurrencyAndAmount incmgAmtToOthrAcct;
    @XmlElement(name = "PmtFrOthrAcct")
    protected ActiveCurrencyAndAmount pmtFrOthrAcct;

    /**
     * Gets the value of the incmgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getIncmgAmt() {
        return incmgAmt;
    }

    /**
     * Sets the value of the incmgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public SpecialCondition1 setIncmgAmt(ActiveCurrencyAndAmount value) {
        this.incmgAmt = value;
        return this;
    }

    /**
     * Gets the value of the outgngAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getOutgngAmt() {
        return outgngAmt;
    }

    /**
     * Sets the value of the outgngAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public SpecialCondition1 setOutgngAmt(ActiveCurrencyAndAmount value) {
        this.outgngAmt = value;
        return this;
    }

    /**
     * Gets the value of the incmgAmtToOthrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getIncmgAmtToOthrAcct() {
        return incmgAmtToOthrAcct;
    }

    /**
     * Sets the value of the incmgAmtToOthrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public SpecialCondition1 setIncmgAmtToOthrAcct(ActiveCurrencyAndAmount value) {
        this.incmgAmtToOthrAcct = value;
        return this;
    }

    /**
     * Gets the value of the pmtFrOthrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getPmtFrOthrAcct() {
        return pmtFrOthrAcct;
    }

    /**
     * Sets the value of the pmtFrOthrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public SpecialCondition1 setPmtFrOthrAcct(ActiveCurrencyAndAmount value) {
        this.pmtFrOthrAcct = value;
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
