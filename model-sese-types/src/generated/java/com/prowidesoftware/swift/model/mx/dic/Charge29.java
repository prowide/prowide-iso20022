
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
 * Amount of money associated with a service.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Charge29", propOrder = {
    "tp",
    "amt",
    "chrgBsis",
    "chrgBr",
    "rcptId"
})
public class Charge29 {

    @XmlElement(name = "Tp", required = true)
    protected ChargeType4Choice tp;
    @XmlElement(name = "Amt", required = true)
    protected ActiveOrHistoricCurrencyAndAmount amt;
    @XmlElement(name = "ChrgBsis")
    protected ChargeBasisType1Choice chrgBsis;
    @XmlElement(name = "ChrgBr")
    @XmlSchemaType(name = "string")
    protected ChargeBearer1Code chrgBr;
    @XmlElement(name = "RcptId")
    protected PartyIdentification70Choice rcptId;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeType4Choice }
     *     
     */
    public ChargeType4Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeType4Choice }
     *     
     */
    public Charge29 setTp(ChargeType4Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public Charge29 setAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the chrgBsis property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeBasisType1Choice }
     *     
     */
    public ChargeBasisType1Choice getChrgBsis() {
        return chrgBsis;
    }

    /**
     * Sets the value of the chrgBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeBasisType1Choice }
     *     
     */
    public Charge29 setChrgBsis(ChargeBasisType1Choice value) {
        this.chrgBsis = value;
        return this;
    }

    /**
     * Gets the value of the chrgBr property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeBearer1Code }
     *     
     */
    public ChargeBearer1Code getChrgBr() {
        return chrgBr;
    }

    /**
     * Sets the value of the chrgBr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeBearer1Code }
     *     
     */
    public Charge29 setChrgBr(ChargeBearer1Code value) {
        this.chrgBr = value;
        return this;
    }

    /**
     * Gets the value of the rcptId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification70Choice }
     *     
     */
    public PartyIdentification70Choice getRcptId() {
        return rcptId;
    }

    /**
     * Sets the value of the rcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification70Choice }
     *     
     */
    public Charge29 setRcptId(PartyIdentification70Choice value) {
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
