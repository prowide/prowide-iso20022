
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
@XmlType(name = "TradeQueryCriteria8", propOrder = {
    "tradLifeCyclHstry",
    "outsdngTradInd",
    "tradPtyCrit",
    "tradTpCrit",
    "tmCrit",
    "othrCrit"
})
public class TradeQueryCriteria8 {

    @XmlElement(name = "TradLifeCyclHstry")
    protected boolean tradLifeCyclHstry;
    @XmlElement(name = "OutsdngTradInd")
    protected boolean outsdngTradInd;
    @XmlElement(name = "TradPtyCrit")
    protected TradePartyQueryCriteria5 tradPtyCrit;
    @XmlElement(name = "TradTpCrit")
    protected TradeTypeQueryCriteria1 tradTpCrit;
    @XmlElement(name = "TmCrit")
    protected TradeDateTimeQueryCriteria2 tmCrit;
    @XmlElement(name = "OthrCrit")
    protected TradeAdditionalQueryCriteria6 othrCrit;

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
    public TradeQueryCriteria8 setTradLifeCyclHstry(boolean value) {
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
    public TradeQueryCriteria8 setOutsdngTradInd(boolean value) {
        this.outsdngTradInd = value;
        return this;
    }

    /**
     * Gets the value of the tradPtyCrit property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyQueryCriteria5 }
     *     
     */
    public TradePartyQueryCriteria5 getTradPtyCrit() {
        return tradPtyCrit;
    }

    /**
     * Sets the value of the tradPtyCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyQueryCriteria5 }
     *     
     */
    public TradeQueryCriteria8 setTradPtyCrit(TradePartyQueryCriteria5 value) {
        this.tradPtyCrit = value;
        return this;
    }

    /**
     * Gets the value of the tradTpCrit property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTypeQueryCriteria1 }
     *     
     */
    public TradeTypeQueryCriteria1 getTradTpCrit() {
        return tradTpCrit;
    }

    /**
     * Sets the value of the tradTpCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTypeQueryCriteria1 }
     *     
     */
    public TradeQueryCriteria8 setTradTpCrit(TradeTypeQueryCriteria1 value) {
        this.tradTpCrit = value;
        return this;
    }

    /**
     * Gets the value of the tmCrit property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDateTimeQueryCriteria2 }
     *     
     */
    public TradeDateTimeQueryCriteria2 getTmCrit() {
        return tmCrit;
    }

    /**
     * Sets the value of the tmCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDateTimeQueryCriteria2 }
     *     
     */
    public TradeQueryCriteria8 setTmCrit(TradeDateTimeQueryCriteria2 value) {
        this.tmCrit = value;
        return this;
    }

    /**
     * Gets the value of the othrCrit property.
     * 
     * @return
     *     possible object is
     *     {@link TradeAdditionalQueryCriteria6 }
     *     
     */
    public TradeAdditionalQueryCriteria6 getOthrCrit() {
        return othrCrit;
    }

    /**
     * Sets the value of the othrCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeAdditionalQueryCriteria6 }
     *     
     */
    public TradeQueryCriteria8 setOthrCrit(TradeAdditionalQueryCriteria6 value) {
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
