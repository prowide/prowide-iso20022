
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "TradeQueryCriteria4", propOrder = {
    "tradLifeCyclHstry",
    "outsdngTradInd",
    "tradPtyCrit",
    "finInstrmCrit",
    "tmCrit",
    "othrCrit"
})
public class TradeQueryCriteria4 {

    @XmlElement(name = "TradLifeCyclHstry")
    protected boolean tradLifeCyclHstry;
    @XmlElement(name = "OutsdngTradInd")
    protected boolean outsdngTradInd;
    @XmlElement(name = "TradPtyCrit")
    protected TradePartyQueryCriteria3 tradPtyCrit;
    @XmlElement(name = "FinInstrmCrit")
    protected TradeSecurityIdentificationQueryCriteria2 finInstrmCrit;
    @XmlElement(name = "TmCrit")
    protected TradeDateTimeQueryCriteria2 tmCrit;
    @XmlElement(name = "OthrCrit")
    protected TradeAdditionalQueryCriteria3 othrCrit;

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
    public TradeQueryCriteria4 setTradLifeCyclHstry(boolean value) {
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
    public TradeQueryCriteria4 setOutsdngTradInd(boolean value) {
        this.outsdngTradInd = value;
        return this;
    }

    /**
     * Gets the value of the tradPtyCrit property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyQueryCriteria3 }
     *     
     */
    public TradePartyQueryCriteria3 getTradPtyCrit() {
        return tradPtyCrit;
    }

    /**
     * Sets the value of the tradPtyCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyQueryCriteria3 }
     *     
     */
    public TradeQueryCriteria4 setTradPtyCrit(TradePartyQueryCriteria3 value) {
        this.tradPtyCrit = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmCrit property.
     * 
     * @return
     *     possible object is
     *     {@link TradeSecurityIdentificationQueryCriteria2 }
     *     
     */
    public TradeSecurityIdentificationQueryCriteria2 getFinInstrmCrit() {
        return finInstrmCrit;
    }

    /**
     * Sets the value of the finInstrmCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeSecurityIdentificationQueryCriteria2 }
     *     
     */
    public TradeQueryCriteria4 setFinInstrmCrit(TradeSecurityIdentificationQueryCriteria2 value) {
        this.finInstrmCrit = value;
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
    public TradeQueryCriteria4 setTmCrit(TradeDateTimeQueryCriteria2 value) {
        this.tmCrit = value;
        return this;
    }

    /**
     * Gets the value of the othrCrit property.
     * 
     * @return
     *     possible object is
     *     {@link TradeAdditionalQueryCriteria3 }
     *     
     */
    public TradeAdditionalQueryCriteria3 getOthrCrit() {
        return othrCrit;
    }

    /**
     * Sets the value of the othrCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeAdditionalQueryCriteria3 }
     *     
     */
    public TradeQueryCriteria4 setOthrCrit(TradeAdditionalQueryCriteria3 value) {
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
