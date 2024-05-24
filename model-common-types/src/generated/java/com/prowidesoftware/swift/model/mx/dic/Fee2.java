
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
 * Amount of money associated with a service.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fee2", propOrder = {
    "tp",
    "bsis",
    "stdAmt",
    "stdRate",
    "dscntDtls",
    "apldAmt",
    "apldRate",
    "nonStdSLARef",
    "rcptId",
    "inftvInd"
})
public class Fee2 {

    @XmlElement(name = "Tp", required = true)
    protected ChargeType5Choice tp;
    @XmlElement(name = "Bsis")
    protected ChargeBasis2Choice bsis;
    @XmlElement(name = "StdAmt")
    protected ActiveCurrencyAndAmount stdAmt;
    @XmlElement(name = "StdRate")
    protected BigDecimal stdRate;
    @XmlElement(name = "DscntDtls")
    protected ChargeOrCommissionDiscount1 dscntDtls;
    @XmlElement(name = "ApldAmt")
    protected ActiveCurrencyAndAmount apldAmt;
    @XmlElement(name = "ApldRate")
    protected BigDecimal apldRate;
    @XmlElement(name = "NonStdSLARef")
    protected String nonStdSLARef;
    @XmlElement(name = "RcptId")
    protected PartyIdentification113 rcptId;
    @XmlElement(name = "InftvInd")
    protected boolean inftvInd;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeType5Choice }
     *     
     */
    public ChargeType5Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeType5Choice }
     *     
     */
    public Fee2 setTp(ChargeType5Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the bsis property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeBasis2Choice }
     *     
     */
    public ChargeBasis2Choice getBsis() {
        return bsis;
    }

    /**
     * Sets the value of the bsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeBasis2Choice }
     *     
     */
    public Fee2 setBsis(ChargeBasis2Choice value) {
        this.bsis = value;
        return this;
    }

    /**
     * Gets the value of the stdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getStdAmt() {
        return stdAmt;
    }

    /**
     * Sets the value of the stdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Fee2 setStdAmt(ActiveCurrencyAndAmount value) {
        this.stdAmt = value;
        return this;
    }

    /**
     * Gets the value of the stdRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStdRate() {
        return stdRate;
    }

    /**
     * Sets the value of the stdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Fee2 setStdRate(BigDecimal value) {
        this.stdRate = value;
        return this;
    }

    /**
     * Gets the value of the dscntDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeOrCommissionDiscount1 }
     *     
     */
    public ChargeOrCommissionDiscount1 getDscntDtls() {
        return dscntDtls;
    }

    /**
     * Sets the value of the dscntDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeOrCommissionDiscount1 }
     *     
     */
    public Fee2 setDscntDtls(ChargeOrCommissionDiscount1 value) {
        this.dscntDtls = value;
        return this;
    }

    /**
     * Gets the value of the apldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getApldAmt() {
        return apldAmt;
    }

    /**
     * Sets the value of the apldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Fee2 setApldAmt(ActiveCurrencyAndAmount value) {
        this.apldAmt = value;
        return this;
    }

    /**
     * Gets the value of the apldRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getApldRate() {
        return apldRate;
    }

    /**
     * Sets the value of the apldRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Fee2 setApldRate(BigDecimal value) {
        this.apldRate = value;
        return this;
    }

    /**
     * Gets the value of the nonStdSLARef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonStdSLARef() {
        return nonStdSLARef;
    }

    /**
     * Sets the value of the nonStdSLARef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Fee2 setNonStdSLARef(String value) {
        this.nonStdSLARef = value;
        return this;
    }

    /**
     * Gets the value of the rcptId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification113 }
     *     
     */
    public PartyIdentification113 getRcptId() {
        return rcptId;
    }

    /**
     * Sets the value of the rcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification113 }
     *     
     */
    public Fee2 setRcptId(PartyIdentification113 value) {
        this.rcptId = value;
        return this;
    }

    /**
     * Gets the value of the inftvInd property.
     * 
     */
    public boolean isInftvInd() {
        return inftvInd;
    }

    /**
     * Sets the value of the inftvInd property.
     * 
     */
    public Fee2 setInftvInd(boolean value) {
        this.inftvInd = value;
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
