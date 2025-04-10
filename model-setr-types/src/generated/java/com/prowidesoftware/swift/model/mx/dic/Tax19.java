
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
 * Tax related to an investment fund order.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tax19", propOrder = {
    "taxTp",
    "amt",
    "rate",
    "ctry",
    "euDvddStsTp",
    "euCptlGnTp",
    "rcptId",
    "xmptnInd",
    "xmptnRsnTp"
})
public class Tax19 {

    @XmlElement(name = "TaxTp", required = true)
    protected TaxDetailsType1Choice taxTp;
    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAnd13DecimalAmount amt;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "EUDvddStsTp")
    protected EUDividendStatusType1Choice euDvddStsTp;
    @XmlElement(name = "EUCptlGnTp")
    protected EUCapitalGainType1Choice euCptlGnTp;
    @XmlElement(name = "RcptId")
    protected PartyIdentification2Choice rcptId;
    @XmlElement(name = "XmptnInd")
    protected boolean xmptnInd;
    @XmlElement(name = "XmptnRsnTp")
    protected ExemptionReasonType1Choice xmptnRsnTp;

    /**
     * Gets the value of the taxTp property.
     * 
     * @return
     *     possible object is
     *     {@link TaxDetailsType1Choice }
     *     
     */
    public TaxDetailsType1Choice getTaxTp() {
        return taxTp;
    }

    /**
     * Sets the value of the taxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDetailsType1Choice }
     *     
     */
    public Tax19 setTaxTp(TaxDetailsType1Choice value) {
        this.taxTp = value;
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
    public Tax19 setAmt(ActiveCurrencyAnd13DecimalAmount value) {
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
    public Tax19 setRate(BigDecimal value) {
        this.rate = value;
        return this;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Tax19 setCtry(String value) {
        this.ctry = value;
        return this;
    }

    /**
     * Gets the value of the euDvddStsTp property.
     * 
     * @return
     *     possible object is
     *     {@link EUDividendStatusType1Choice }
     *     
     */
    public EUDividendStatusType1Choice getEUDvddStsTp() {
        return euDvddStsTp;
    }

    /**
     * Sets the value of the euDvddStsTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link EUDividendStatusType1Choice }
     *     
     */
    public Tax19 setEUDvddStsTp(EUDividendStatusType1Choice value) {
        this.euDvddStsTp = value;
        return this;
    }

    /**
     * Gets the value of the euCptlGnTp property.
     * 
     * @return
     *     possible object is
     *     {@link EUCapitalGainType1Choice }
     *     
     */
    public EUCapitalGainType1Choice getEUCptlGnTp() {
        return euCptlGnTp;
    }

    /**
     * Sets the value of the euCptlGnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link EUCapitalGainType1Choice }
     *     
     */
    public Tax19 setEUCptlGnTp(EUCapitalGainType1Choice value) {
        this.euCptlGnTp = value;
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
    public Tax19 setRcptId(PartyIdentification2Choice value) {
        this.rcptId = value;
        return this;
    }

    /**
     * Gets the value of the xmptnInd property.
     * 
     */
    public boolean isXmptnInd() {
        return xmptnInd;
    }

    /**
     * Sets the value of the xmptnInd property.
     * 
     */
    public Tax19 setXmptnInd(boolean value) {
        this.xmptnInd = value;
        return this;
    }

    /**
     * Gets the value of the xmptnRsnTp property.
     * 
     * @return
     *     possible object is
     *     {@link ExemptionReasonType1Choice }
     *     
     */
    public ExemptionReasonType1Choice getXmptnRsnTp() {
        return xmptnRsnTp;
    }

    /**
     * Sets the value of the xmptnRsnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExemptionReasonType1Choice }
     *     
     */
    public Tax19 setXmptnRsnTp(ExemptionReasonType1Choice value) {
        this.xmptnRsnTp = value;
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
