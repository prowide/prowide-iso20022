
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
@XmlType(name = "Charge20", propOrder = {
    "tp",
    "xtndedTp",
    "amt",
    "chrgBsis",
    "xtndedChrgBsis",
    "chrgBr",
    "rcptId"
})
public class Charge20 {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected ChargeType12Code tp;
    @XmlElement(name = "XtndedTp")
    protected String xtndedTp;
    @XmlElement(name = "Amt", required = true)
    protected ActiveOrHistoricCurrencyAndAmount amt;
    @XmlElement(name = "ChrgBsis")
    @XmlSchemaType(name = "string")
    protected TaxationBasis2Code chrgBsis;
    @XmlElement(name = "XtndedChrgBsis")
    protected String xtndedChrgBsis;
    @XmlElement(name = "ChrgBr")
    @XmlSchemaType(name = "string")
    protected ChargeBearer1Code chrgBr;
    @XmlElement(name = "RcptId")
    protected PartyIdentification2Choice rcptId;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeType12Code }
     *     
     */
    public ChargeType12Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeType12Code }
     *     
     */
    public Charge20 setTp(ChargeType12Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the xtndedTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedTp() {
        return xtndedTp;
    }

    /**
     * Sets the value of the xtndedTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Charge20 setXtndedTp(String value) {
        this.xtndedTp = value;
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
    public Charge20 setAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the chrgBsis property.
     * 
     * @return
     *     possible object is
     *     {@link TaxationBasis2Code }
     *     
     */
    public TaxationBasis2Code getChrgBsis() {
        return chrgBsis;
    }

    /**
     * Sets the value of the chrgBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxationBasis2Code }
     *     
     */
    public Charge20 setChrgBsis(TaxationBasis2Code value) {
        this.chrgBsis = value;
        return this;
    }

    /**
     * Gets the value of the xtndedChrgBsis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedChrgBsis() {
        return xtndedChrgBsis;
    }

    /**
     * Sets the value of the xtndedChrgBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Charge20 setXtndedChrgBsis(String value) {
        this.xtndedChrgBsis = value;
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
    public Charge20 setChrgBr(ChargeBearer1Code value) {
        this.chrgBr = value;
        return this;
    }

    /**
     * Gets the value of the rcptId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getRcptId() {
        return rcptId;
    }

    /**
     * Sets the value of the rcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public Charge20 setRcptId(PartyIdentification2Choice value) {
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
