
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Amount of money due to a party as compensation for a service.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Commission6", propOrder = {
    "tp",
    "bsis",
    "amt",
    "rate",
    "rcptId",
    "comrclAgrmtRef",
    "wvgDtls"
})
public class Commission6 {

    @XmlElement(name = "Tp")
    protected CommissionType1 tp;
    @XmlElement(name = "Bsis")
    protected TaxationBasis1 bsis;
    @XmlElement(name = "Amt")
    protected ActiveCurrencyAnd13DecimalAmount amt;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "RcptId")
    protected PartyIdentification2Choice rcptId;
    @XmlElement(name = "ComrclAgrmtRef")
    protected String comrclAgrmtRef;
    @XmlElement(name = "WvgDtls")
    protected CommissionWaiver2 wvgDtls;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionType1 }
     *     
     */
    public CommissionType1 getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionType1 }
     *     
     */
    public Commission6 setTp(CommissionType1 value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the bsis property.
     * 
     * @return
     *     possible object is
     *     {@link TaxationBasis1 }
     *     
     */
    public TaxationBasis1 getBsis() {
        return bsis;
    }

    /**
     * Sets the value of the bsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxationBasis1 }
     *     
     */
    public Commission6 setBsis(TaxationBasis1 value) {
        this.bsis = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public Commission6 setAmt(ActiveCurrencyAnd13DecimalAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Commission6 setRate(BigDecimal value) {
        this.rate = value;
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
    public Commission6 setRcptId(PartyIdentification2Choice value) {
        this.rcptId = value;
        return this;
    }

    /**
     * Gets the value of the comrclAgrmtRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComrclAgrmtRef() {
        return comrclAgrmtRef;
    }

    /**
     * Sets the value of the comrclAgrmtRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Commission6 setComrclAgrmtRef(String value) {
        this.comrclAgrmtRef = value;
        return this;
    }

    /**
     * Gets the value of the wvgDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionWaiver2 }
     *     
     */
    public CommissionWaiver2 getWvgDtls() {
        return wvgDtls;
    }

    /**
     * Sets the value of the wvgDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionWaiver2 }
     *     
     */
    public Commission6 setWvgDtls(CommissionWaiver2 value) {
        this.wvgDtls = value;
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
