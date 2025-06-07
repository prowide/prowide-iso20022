
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
 * Indicates the price of the bid response.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BidResponsePrice1", propOrder = {
    "pric",
    "comssn",
    "grssInd",
    "sd",
    "fairVal",
    "ctry",
    "tradgSsn",
    "sttlmDtls"
})
public class BidResponsePrice1 {

    @XmlElement(name = "Pric")
    protected Price1 pric;
    @XmlElement(name = "Comssn", required = true)
    protected Commission2 comssn;
    @XmlElement(name = "GrssInd")
    protected boolean grssInd;
    @XmlElement(name = "Sd", required = true)
    @XmlSchemaType(name = "string")
    protected Side1Code sd;
    @XmlElement(name = "FairVal")
    protected ActiveCurrencyAndAmount fairVal;
    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "TradgSsn")
    protected TradingSession1 tradgSsn;
    @XmlElement(name = "SttlmDtls")
    protected SecuritiesSettlement2 sttlmDtls;

    /**
     * Gets the value of the pric property.
     * 
     * @return
     *     possible object is
     *     {@link Price1 }
     *     
     */
    public Price1 getPric() {
        return pric;
    }

    /**
     * Sets the value of the pric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price1 }
     *     
     */
    public BidResponsePrice1 setPric(Price1 value) {
        this.pric = value;
        return this;
    }

    /**
     * Gets the value of the comssn property.
     * 
     * @return
     *     possible object is
     *     {@link Commission2 }
     *     
     */
    public Commission2 getComssn() {
        return comssn;
    }

    /**
     * Sets the value of the comssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Commission2 }
     *     
     */
    public BidResponsePrice1 setComssn(Commission2 value) {
        this.comssn = value;
        return this;
    }

    /**
     * Gets the value of the grssInd property.
     * 
     */
    public boolean isGrssInd() {
        return grssInd;
    }

    /**
     * Sets the value of the grssInd property.
     * 
     */
    public BidResponsePrice1 setGrssInd(boolean value) {
        this.grssInd = value;
        return this;
    }

    /**
     * Gets the value of the sd property.
     * 
     * @return
     *     possible object is
     *     {@link Side1Code }
     *     
     */
    public Side1Code getSd() {
        return sd;
    }

    /**
     * Sets the value of the sd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Side1Code }
     *     
     */
    public BidResponsePrice1 setSd(Side1Code value) {
        this.sd = value;
        return this;
    }

    /**
     * Gets the value of the fairVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getFairVal() {
        return fairVal;
    }

    /**
     * Sets the value of the fairVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public BidResponsePrice1 setFairVal(ActiveCurrencyAndAmount value) {
        this.fairVal = value;
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
    public BidResponsePrice1 setCtry(String value) {
        this.ctry = value;
        return this;
    }

    /**
     * Gets the value of the tradgSsn property.
     * 
     * @return
     *     possible object is
     *     {@link TradingSession1 }
     *     
     */
    public TradingSession1 getTradgSsn() {
        return tradgSsn;
    }

    /**
     * Sets the value of the tradgSsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingSession1 }
     *     
     */
    public BidResponsePrice1 setTradgSsn(TradingSession1 value) {
        this.tradgSsn = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlement2 }
     *     
     */
    public SecuritiesSettlement2 getSttlmDtls() {
        return sttlmDtls;
    }

    /**
     * Sets the value of the sttlmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlement2 }
     *     
     */
    public BidResponsePrice1 setSttlmDtls(SecuritiesSettlement2 value) {
        this.sttlmDtls = value;
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
