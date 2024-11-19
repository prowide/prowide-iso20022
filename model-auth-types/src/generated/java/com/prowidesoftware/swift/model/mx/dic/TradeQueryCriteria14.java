
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
@XmlType(name = "TradeQueryCriteria14", propOrder = {
    "tradLifeCyclHstry",
    "mrgnLifeCyclHstry",
    "outsdngTradInd",
    "tradPtyCrit",
    "finInstrmCrit",
    "tmCrit",
    "othrCrit"
})
public class TradeQueryCriteria14 {

    @XmlElement(name = "TradLifeCyclHstry")
    protected Boolean tradLifeCyclHstry;
    @XmlElement(name = "MrgnLifeCyclHstry")
    protected Boolean mrgnLifeCyclHstry;
    @XmlElement(name = "OutsdngTradInd")
    protected boolean outsdngTradInd;
    @XmlElement(name = "TradPtyCrit")
    protected TradePartyQueryCriteria7 tradPtyCrit;
    @XmlElement(name = "FinInstrmCrit")
    protected TradeSecurityIdentificationQueryCriteria3 finInstrmCrit;
    @XmlElement(name = "TmCrit")
    protected TradeDateTimeQueryCriteria6 tmCrit;
    @XmlElement(name = "OthrCrit")
    protected TradeAdditionalQueryCriteria9 othrCrit;

    /**
     * Gets the value of the tradLifeCyclHstry property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTradLifeCyclHstry() {
        return tradLifeCyclHstry;
    }

    /**
     * Sets the value of the tradLifeCyclHstry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TradeQueryCriteria14 setTradLifeCyclHstry(Boolean value) {
        this.tradLifeCyclHstry = value;
        return this;
    }

    /**
     * Gets the value of the mrgnLifeCyclHstry property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMrgnLifeCyclHstry() {
        return mrgnLifeCyclHstry;
    }

    /**
     * Sets the value of the mrgnLifeCyclHstry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TradeQueryCriteria14 setMrgnLifeCyclHstry(Boolean value) {
        this.mrgnLifeCyclHstry = value;
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
    public TradeQueryCriteria14 setOutsdngTradInd(boolean value) {
        this.outsdngTradInd = value;
        return this;
    }

    /**
     * Gets the value of the tradPtyCrit property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyQueryCriteria7 }
     *     
     */
    public TradePartyQueryCriteria7 getTradPtyCrit() {
        return tradPtyCrit;
    }

    /**
     * Sets the value of the tradPtyCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyQueryCriteria7 }
     *     
     */
    public TradeQueryCriteria14 setTradPtyCrit(TradePartyQueryCriteria7 value) {
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
    public TradeQueryCriteria14 setFinInstrmCrit(TradeSecurityIdentificationQueryCriteria3 value) {
        this.finInstrmCrit = value;
        return this;
    }

    /**
     * Gets the value of the tmCrit property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDateTimeQueryCriteria6 }
     *     
     */
    public TradeDateTimeQueryCriteria6 getTmCrit() {
        return tmCrit;
    }

    /**
     * Sets the value of the tmCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDateTimeQueryCriteria6 }
     *     
     */
    public TradeQueryCriteria14 setTmCrit(TradeDateTimeQueryCriteria6 value) {
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
    public TradeQueryCriteria14 setOthrCrit(TradeAdditionalQueryCriteria9 value) {
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
