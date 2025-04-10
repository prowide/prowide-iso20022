
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
 * Amount of money due to a party as compensation for a service.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Commission10", propOrder = {
    "tp",
    "xtndedTp",
    "bsis",
    "xtndedBsis",
    "amt",
    "rate",
    "rcptId",
    "comrclAgrmtRef",
    "wvgDtls"
})
public class Commission10 {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected CommissionType6Code tp;
    @XmlElement(name = "XtndedTp")
    protected String xtndedTp;
    @XmlElement(name = "Bsis")
    @XmlSchemaType(name = "string")
    protected TaxationBasis4Code bsis;
    @XmlElement(name = "XtndedBsis")
    protected String xtndedBsis;
    @XmlElement(name = "Amt")
    protected ActiveCurrencyAnd13DecimalAmount amt;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "RcptId")
    protected PartyIdentification2Choice rcptId;
    @XmlElement(name = "ComrclAgrmtRef")
    protected String comrclAgrmtRef;
    @XmlElement(name = "WvgDtls")
    protected CommissionWaiver3 wvgDtls;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionType6Code }
     *     
     */
    public CommissionType6Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionType6Code }
     *     
     */
    public Commission10 setTp(CommissionType6Code value) {
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
    public Commission10 setXtndedTp(String value) {
        this.xtndedTp = value;
        return this;
    }

    /**
     * Gets the value of the bsis property.
     * 
     * @return
     *     possible object is
     *     {@link TaxationBasis4Code }
     *     
     */
    public TaxationBasis4Code getBsis() {
        return bsis;
    }

    /**
     * Sets the value of the bsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxationBasis4Code }
     *     
     */
    public Commission10 setBsis(TaxationBasis4Code value) {
        this.bsis = value;
        return this;
    }

    /**
     * Gets the value of the xtndedBsis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedBsis() {
        return xtndedBsis;
    }

    /**
     * Sets the value of the xtndedBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Commission10 setXtndedBsis(String value) {
        this.xtndedBsis = value;
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
    public Commission10 setAmt(ActiveCurrencyAnd13DecimalAmount value) {
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
    public Commission10 setRate(BigDecimal value) {
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
    public Commission10 setRcptId(PartyIdentification2Choice value) {
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
    public Commission10 setComrclAgrmtRef(String value) {
        this.comrclAgrmtRef = value;
        return this;
    }

    /**
     * Gets the value of the wvgDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionWaiver3 }
     *     
     */
    public CommissionWaiver3 getWvgDtls() {
        return wvgDtls;
    }

    /**
     * Sets the value of the wvgDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionWaiver3 }
     *     
     */
    public Commission10 setWvgDtls(CommissionWaiver3 value) {
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
