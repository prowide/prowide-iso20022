
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
 * Specifies the conditions under which an order will be triggered/activated by market events as well as it specifies the order's behavior in the market once it has been triggered.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TriggeringInstructions", propOrder = {
    "tp",
    "actn",
    "pric",
    "pricPrtcnScp",
    "pricDrctn",
    "newPric",
    "ordrTp",
    "newQty",
    "pricTp",
    "trggrSctyDtls",
    "tradgSsnDtls"
})
public class TriggeringInstructions {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected TriggerType1Code tp;
    @XmlElement(name = "Actn")
    @XmlSchemaType(name = "string")
    protected TriggerAction1Code actn;
    @XmlElement(name = "Pric")
    protected Price1 pric;
    @XmlElement(name = "PricPrtcnScp")
    @XmlSchemaType(name = "string")
    protected PriceProtectionScope2Code pricPrtcnScp;
    @XmlElement(name = "PricDrctn")
    protected Boolean pricDrctn;
    @XmlElement(name = "NewPric")
    protected Price1 newPric;
    @XmlElement(name = "OrdrTp")
    @XmlSchemaType(name = "string")
    protected OrderType2Code ordrTp;
    @XmlElement(name = "NewQty")
    protected FinancialInstrumentQuantityChoice newQty;
    @XmlElement(name = "PricTp")
    @XmlSchemaType(name = "string")
    protected TriggerPriceType1Code pricTp;
    @XmlElement(name = "TrggrSctyDtls")
    protected SecurityIdentification7 trggrSctyDtls;
    @XmlElement(name = "TradgSsnDtls")
    protected TradingSession1 tradgSsnDtls;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerType1Code }
     *     
     */
    public TriggerType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerType1Code }
     *     
     */
    public TriggeringInstructions setTp(TriggerType1Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the actn property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerAction1Code }
     *     
     */
    public TriggerAction1Code getActn() {
        return actn;
    }

    /**
     * Sets the value of the actn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerAction1Code }
     *     
     */
    public TriggeringInstructions setActn(TriggerAction1Code value) {
        this.actn = value;
        return this;
    }

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
    public TriggeringInstructions setPric(Price1 value) {
        this.pric = value;
        return this;
    }

    /**
     * Gets the value of the pricPrtcnScp property.
     * 
     * @return
     *     possible object is
     *     {@link PriceProtectionScope2Code }
     *     
     */
    public PriceProtectionScope2Code getPricPrtcnScp() {
        return pricPrtcnScp;
    }

    /**
     * Sets the value of the pricPrtcnScp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceProtectionScope2Code }
     *     
     */
    public TriggeringInstructions setPricPrtcnScp(PriceProtectionScope2Code value) {
        this.pricPrtcnScp = value;
        return this;
    }

    /**
     * Gets the value of the pricDrctn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPricDrctn() {
        return pricDrctn;
    }

    /**
     * Sets the value of the pricDrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TriggeringInstructions setPricDrctn(Boolean value) {
        this.pricDrctn = value;
        return this;
    }

    /**
     * Gets the value of the newPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price1 }
     *     
     */
    public Price1 getNewPric() {
        return newPric;
    }

    /**
     * Sets the value of the newPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price1 }
     *     
     */
    public TriggeringInstructions setNewPric(Price1 value) {
        this.newPric = value;
        return this;
    }

    /**
     * Gets the value of the ordrTp property.
     * 
     * @return
     *     possible object is
     *     {@link OrderType2Code }
     *     
     */
    public OrderType2Code getOrdrTp() {
        return ordrTp;
    }

    /**
     * Sets the value of the ordrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderType2Code }
     *     
     */
    public TriggeringInstructions setOrdrTp(OrderType2Code value) {
        this.ordrTp = value;
        return this;
    }

    /**
     * Gets the value of the newQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public FinancialInstrumentQuantityChoice getNewQty() {
        return newQty;
    }

    /**
     * Sets the value of the newQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public TriggeringInstructions setNewQty(FinancialInstrumentQuantityChoice value) {
        this.newQty = value;
        return this;
    }

    /**
     * Gets the value of the pricTp property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerPriceType1Code }
     *     
     */
    public TriggerPriceType1Code getPricTp() {
        return pricTp;
    }

    /**
     * Sets the value of the pricTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerPriceType1Code }
     *     
     */
    public TriggeringInstructions setPricTp(TriggerPriceType1Code value) {
        this.pricTp = value;
        return this;
    }

    /**
     * Gets the value of the trggrSctyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public SecurityIdentification7 getTrggrSctyDtls() {
        return trggrSctyDtls;
    }

    /**
     * Sets the value of the trggrSctyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public TriggeringInstructions setTrggrSctyDtls(SecurityIdentification7 value) {
        this.trggrSctyDtls = value;
        return this;
    }

    /**
     * Gets the value of the tradgSsnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TradingSession1 }
     *     
     */
    public TradingSession1 getTradgSsnDtls() {
        return tradgSsnDtls;
    }

    /**
     * Sets the value of the tradgSsnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingSession1 }
     *     
     */
    public TriggeringInstructions setTradgSsnDtls(TradingSession1 value) {
        this.tradgSsnDtls = value;
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
