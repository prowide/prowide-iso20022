
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
 * Securities collateral position valuation amounts.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralAmount4", propOrder = {
    "actlMktValPstValtnFctr",
    "actlMktValBfrValtnFctr",
    "xpsrCollInTxCcy",
    "xpsrCollInRptgCcy",
    "mktValAmtPstValtnFctr",
    "mktValAmtBfrValtnFctr",
    "ttlValOfOwnColl",
    "ttlValOfReusdColl"
})
public class CollateralAmount4 {

    @XmlElement(name = "ActlMktValPstValtnFctr", required = true)
    protected ActiveOrHistoricCurrencyAndAmount actlMktValPstValtnFctr;
    @XmlElement(name = "ActlMktValBfrValtnFctr")
    protected ActiveOrHistoricCurrencyAndAmount actlMktValBfrValtnFctr;
    @XmlElement(name = "XpsrCollInTxCcy")
    protected ActiveOrHistoricCurrencyAndAmount xpsrCollInTxCcy;
    @XmlElement(name = "XpsrCollInRptgCcy")
    protected ActiveOrHistoricCurrencyAndAmount xpsrCollInRptgCcy;
    @XmlElement(name = "MktValAmtPstValtnFctr")
    protected ActiveOrHistoricCurrencyAndAmount mktValAmtPstValtnFctr;
    @XmlElement(name = "MktValAmtBfrValtnFctr")
    protected ActiveOrHistoricCurrencyAndAmount mktValAmtBfrValtnFctr;
    @XmlElement(name = "TtlValOfOwnColl")
    protected ActiveOrHistoricCurrencyAndAmount ttlValOfOwnColl;
    @XmlElement(name = "TtlValOfReusdColl")
    protected ActiveOrHistoricCurrencyAndAmount ttlValOfReusdColl;

    /**
     * Gets the value of the actlMktValPstValtnFctr property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getActlMktValPstValtnFctr() {
        return actlMktValPstValtnFctr;
    }

    /**
     * Sets the value of the actlMktValPstValtnFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public CollateralAmount4 setActlMktValPstValtnFctr(ActiveOrHistoricCurrencyAndAmount value) {
        this.actlMktValPstValtnFctr = value;
        return this;
    }

    /**
     * Gets the value of the actlMktValBfrValtnFctr property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getActlMktValBfrValtnFctr() {
        return actlMktValBfrValtnFctr;
    }

    /**
     * Sets the value of the actlMktValBfrValtnFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public CollateralAmount4 setActlMktValBfrValtnFctr(ActiveOrHistoricCurrencyAndAmount value) {
        this.actlMktValBfrValtnFctr = value;
        return this;
    }

    /**
     * Gets the value of the xpsrCollInTxCcy property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getXpsrCollInTxCcy() {
        return xpsrCollInTxCcy;
    }

    /**
     * Sets the value of the xpsrCollInTxCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public CollateralAmount4 setXpsrCollInTxCcy(ActiveOrHistoricCurrencyAndAmount value) {
        this.xpsrCollInTxCcy = value;
        return this;
    }

    /**
     * Gets the value of the xpsrCollInRptgCcy property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getXpsrCollInRptgCcy() {
        return xpsrCollInRptgCcy;
    }

    /**
     * Sets the value of the xpsrCollInRptgCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public CollateralAmount4 setXpsrCollInRptgCcy(ActiveOrHistoricCurrencyAndAmount value) {
        this.xpsrCollInRptgCcy = value;
        return this;
    }

    /**
     * Gets the value of the mktValAmtPstValtnFctr property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getMktValAmtPstValtnFctr() {
        return mktValAmtPstValtnFctr;
    }

    /**
     * Sets the value of the mktValAmtPstValtnFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public CollateralAmount4 setMktValAmtPstValtnFctr(ActiveOrHistoricCurrencyAndAmount value) {
        this.mktValAmtPstValtnFctr = value;
        return this;
    }

    /**
     * Gets the value of the mktValAmtBfrValtnFctr property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getMktValAmtBfrValtnFctr() {
        return mktValAmtBfrValtnFctr;
    }

    /**
     * Sets the value of the mktValAmtBfrValtnFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public CollateralAmount4 setMktValAmtBfrValtnFctr(ActiveOrHistoricCurrencyAndAmount value) {
        this.mktValAmtBfrValtnFctr = value;
        return this;
    }

    /**
     * Gets the value of the ttlValOfOwnColl property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlValOfOwnColl() {
        return ttlValOfOwnColl;
    }

    /**
     * Sets the value of the ttlValOfOwnColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public CollateralAmount4 setTtlValOfOwnColl(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlValOfOwnColl = value;
        return this;
    }

    /**
     * Gets the value of the ttlValOfReusdColl property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlValOfReusdColl() {
        return ttlValOfReusdColl;
    }

    /**
     * Sets the value of the ttlValOfReusdColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public CollateralAmount4 setTtlValOfReusdColl(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlValOfReusdColl = value;
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
