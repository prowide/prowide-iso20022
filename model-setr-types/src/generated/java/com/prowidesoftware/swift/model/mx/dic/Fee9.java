
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
@XmlType(name = "Fee9", propOrder = {
    "tp",
    "bsis",
    "stdAmt",
    "stdRate",
    "dscntDtls",
    "reqdAmt",
    "reqdRate",
    "nonStdSLARef",
    "rcptId"
})
public class Fee9 {

    @XmlElement(name = "Tp", required = true)
    protected ChargeType10Choice tp;
    @XmlElement(name = "Bsis")
    protected ChargeBasis2Choice bsis;
    @XmlElement(name = "StdAmt")
    protected ActiveCurrencyAndAmount stdAmt;
    @XmlElement(name = "StdRate")
    protected BigDecimal stdRate;
    @XmlElement(name = "DscntDtls")
    protected ChargeOrCommissionDiscount1 dscntDtls;
    @XmlElement(name = "ReqdAmt")
    protected ActiveCurrencyAndAmount reqdAmt;
    @XmlElement(name = "ReqdRate")
    protected BigDecimal reqdRate;
    @XmlElement(name = "NonStdSLARef")
    protected String nonStdSLARef;
    @XmlElement(name = "RcptId")
    protected PartyIdentification139 rcptId;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeType10Choice }
     *     
     */
    public ChargeType10Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeType10Choice }
     *     
     */
    public Fee9 setTp(ChargeType10Choice value) {
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
    public Fee9 setBsis(ChargeBasis2Choice value) {
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
    public Fee9 setStdAmt(ActiveCurrencyAndAmount value) {
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
    public Fee9 setStdRate(BigDecimal value) {
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
    public Fee9 setDscntDtls(ChargeOrCommissionDiscount1 value) {
        this.dscntDtls = value;
        return this;
    }

    /**
     * Gets the value of the reqdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getReqdAmt() {
        return reqdAmt;
    }

    /**
     * Sets the value of the reqdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Fee9 setReqdAmt(ActiveCurrencyAndAmount value) {
        this.reqdAmt = value;
        return this;
    }

    /**
     * Gets the value of the reqdRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReqdRate() {
        return reqdRate;
    }

    /**
     * Sets the value of the reqdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Fee9 setReqdRate(BigDecimal value) {
        this.reqdRate = value;
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
    public Fee9 setNonStdSLARef(String value) {
        this.nonStdSLARef = value;
        return this;
    }

    /**
     * Gets the value of the rcptId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification139 }
     *     
     */
    public PartyIdentification139 getRcptId() {
        return rcptId;
    }

    /**
     * Sets the value of the rcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification139 }
     *     
     */
    public Fee9 setRcptId(PartyIdentification139 value) {
        this.rcptId = value;
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
