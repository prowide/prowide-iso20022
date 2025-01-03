
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
@XmlType(name = "CollateralAmount9", propOrder = {
    "actlMktValPstHrcut",
    "actlMktValBfrHrcut",
    "xpsrCollInTxCcy",
    "xpsrCollInRptgCcy",
    "mktValAmtPstHrcut",
    "mktValAmtBfrHrcut"
})
public class CollateralAmount9 {

    @XmlElement(name = "ActlMktValPstHrcut", required = true)
    protected ActiveOrHistoricCurrencyAndAmount actlMktValPstHrcut;
    @XmlElement(name = "ActlMktValBfrHrcut")
    protected ActiveOrHistoricCurrencyAndAmount actlMktValBfrHrcut;
    @XmlElement(name = "XpsrCollInTxCcy")
    protected ActiveOrHistoricCurrencyAndAmount xpsrCollInTxCcy;
    @XmlElement(name = "XpsrCollInRptgCcy")
    protected ActiveOrHistoricCurrencyAndAmount xpsrCollInRptgCcy;
    @XmlElement(name = "MktValAmtPstHrcut")
    protected ActiveOrHistoricCurrencyAndAmount mktValAmtPstHrcut;
    @XmlElement(name = "MktValAmtBfrHrcut")
    protected ActiveOrHistoricCurrencyAndAmount mktValAmtBfrHrcut;

    /**
     * Gets the value of the actlMktValPstHrcut property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getActlMktValPstHrcut() {
        return actlMktValPstHrcut;
    }

    /**
     * Sets the value of the actlMktValPstHrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public CollateralAmount9 setActlMktValPstHrcut(ActiveOrHistoricCurrencyAndAmount value) {
        this.actlMktValPstHrcut = value;
        return this;
    }

    /**
     * Gets the value of the actlMktValBfrHrcut property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getActlMktValBfrHrcut() {
        return actlMktValBfrHrcut;
    }

    /**
     * Sets the value of the actlMktValBfrHrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public CollateralAmount9 setActlMktValBfrHrcut(ActiveOrHistoricCurrencyAndAmount value) {
        this.actlMktValBfrHrcut = value;
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
    public CollateralAmount9 setXpsrCollInTxCcy(ActiveOrHistoricCurrencyAndAmount value) {
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
    public CollateralAmount9 setXpsrCollInRptgCcy(ActiveOrHistoricCurrencyAndAmount value) {
        this.xpsrCollInRptgCcy = value;
        return this;
    }

    /**
     * Gets the value of the mktValAmtPstHrcut property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getMktValAmtPstHrcut() {
        return mktValAmtPstHrcut;
    }

    /**
     * Sets the value of the mktValAmtPstHrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public CollateralAmount9 setMktValAmtPstHrcut(ActiveOrHistoricCurrencyAndAmount value) {
        this.mktValAmtPstHrcut = value;
        return this;
    }

    /**
     * Gets the value of the mktValAmtBfrHrcut property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getMktValAmtBfrHrcut() {
        return mktValAmtBfrHrcut;
    }

    /**
     * Sets the value of the mktValAmtBfrHrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public CollateralAmount9 setMktValAmtBfrHrcut(ActiveOrHistoricCurrencyAndAmount value) {
        this.mktValAmtBfrHrcut = value;
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
