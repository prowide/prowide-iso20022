
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Query criteria on a trade transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeQueryCriteria13", propOrder = {
    "tradLifeCyclHstry",
    "outsdngTradInd",
    "tradPtyCrit",
    "finInstrmCrit",
    "tmCrit",
    "othrCrit"
})
public class TradeQueryCriteria13 {

    @XmlElement(name = "TradLifeCyclHstry")
    protected boolean tradLifeCyclHstry;
    @XmlElement(name = "OutsdngTradInd")
    protected boolean outsdngTradInd;
    @XmlElement(name = "TradPtyCrit")
    protected TradePartyQueryCriteria6 tradPtyCrit;
    @XmlElement(name = "FinInstrmCrit")
    protected TradeSecurityIdentificationQueryCriteria3 finInstrmCrit;
    @XmlElement(name = "TmCrit")
    protected TradeDateTimeQueryCriteria5 tmCrit;
    @XmlElement(name = "OthrCrit")
    protected TradeAdditionalQueryCriteria9 othrCrit;

    /**
     * Gets the value of the tradLifeCyclHstry property.
     * 
     */
    public boolean isTradLifeCyclHstry() {
        return tradLifeCyclHstry;
    }

    /**
     * Sets the value of the tradLifeCyclHstry property.
     * 
     */
    public TradeQueryCriteria13 setTradLifeCyclHstry(boolean value) {
        this.tradLifeCyclHstry = value;
        return this;
    }

    /**
     * Gets the value of the outsdngTradInd property.
     * 
     */
    public boolean isOutsdngTradInd() {
        return outsdngTradInd;
    }

    /**
     * Sets the value of the outsdngTradInd property.
     * 
     */
    public TradeQueryCriteria13 setOutsdngTradInd(boolean value) {
        this.outsdngTradInd = value;
        return this;
    }

    /**
     * Gets the value of the tradPtyCrit property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyQueryCriteria6 }
     *     
     */
    public TradePartyQueryCriteria6 getTradPtyCrit() {
        return tradPtyCrit;
    }

    /**
     * Sets the value of the tradPtyCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyQueryCriteria6 }
     *     
     */
    public TradeQueryCriteria13 setTradPtyCrit(TradePartyQueryCriteria6 value) {
        this.tradPtyCrit = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmCrit property.
     * 
     * @return
     *     possible object is
     *     {@link TradeSecurityIdentificationQueryCriteria3 }
     *     
     */
    public TradeSecurityIdentificationQueryCriteria3 getFinInstrmCrit() {
        return finInstrmCrit;
    }

    /**
     * Sets the value of the finInstrmCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeSecurityIdentificationQueryCriteria3 }
     *     
     */
    public TradeQueryCriteria13 setFinInstrmCrit(TradeSecurityIdentificationQueryCriteria3 value) {
        this.finInstrmCrit = value;
        return this;
    }

    /**
     * Gets the value of the tmCrit property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDateTimeQueryCriteria5 }
     *     
     */
    public TradeDateTimeQueryCriteria5 getTmCrit() {
        return tmCrit;
    }

    /**
     * Sets the value of the tmCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDateTimeQueryCriteria5 }
     *     
     */
    public TradeQueryCriteria13 setTmCrit(TradeDateTimeQueryCriteria5 value) {
        this.tmCrit = value;
        return this;
    }

    /**
     * Gets the value of the othrCrit property.
     * 
     * @return
     *     possible object is
     *     {@link TradeAdditionalQueryCriteria9 }
     *     
     */
    public TradeAdditionalQueryCriteria9 getOthrCrit() {
        return othrCrit;
    }

    /**
     * Sets the value of the othrCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeAdditionalQueryCriteria9 }
     *     
     */
    public TradeQueryCriteria13 setOthrCrit(TradeAdditionalQueryCriteria9 value) {
        this.othrCrit = value;
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
