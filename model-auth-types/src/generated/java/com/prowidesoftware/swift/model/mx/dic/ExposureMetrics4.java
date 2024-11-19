
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
 * Numeric variables calculated on market exposures.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExposureMetrics4", propOrder = {
    "prncplAmt",
    "lnVal",
    "mktVal",
    "outsdngMrgnLnAmt",
    "shrtMktValAmt",
    "mrgnLn",
    "cshCollAmt",
    "collMktVal"
})
public class ExposureMetrics4 {

    @XmlElement(name = "PrncplAmt")
    protected PrincipalAmount3 prncplAmt;
    @XmlElement(name = "LnVal")
    protected ActiveOrHistoricCurrencyAndAmount lnVal;
    @XmlElement(name = "MktVal")
    protected AmountAndDirection53 mktVal;
    @XmlElement(name = "OutsdngMrgnLnAmt")
    protected ActiveOrHistoricCurrencyAndAmount outsdngMrgnLnAmt;
    @XmlElement(name = "ShrtMktValAmt")
    protected ActiveOrHistoricCurrencyAndAmount shrtMktValAmt;
    @XmlElement(name = "MrgnLn")
    protected ActiveOrHistoricCurrencyAndAmount mrgnLn;
    @XmlElement(name = "CshCollAmt")
    protected AmountAndDirection53 cshCollAmt;
    @XmlElement(name = "CollMktVal")
    protected AmountAndDirection53 collMktVal;

    /**
     * Gets the value of the prncplAmt property.
     * 
     * @return
     *     possible object is
     *     {@link PrincipalAmount3 }
     *     
     */
    public PrincipalAmount3 getPrncplAmt() {
        return prncplAmt;
    }

    /**
     * Sets the value of the prncplAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipalAmount3 }
     *     
     */
    public ExposureMetrics4 setPrncplAmt(PrincipalAmount3 value) {
        this.prncplAmt = value;
        return this;
    }

    /**
     * Gets the value of the lnVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getLnVal() {
        return lnVal;
    }

    /**
     * Sets the value of the lnVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ExposureMetrics4 setLnVal(ActiveOrHistoricCurrencyAndAmount value) {
        this.lnVal = value;
        return this;
    }

    /**
     * Gets the value of the mktVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection53 }
     *     
     */
    public AmountAndDirection53 getMktVal() {
        return mktVal;
    }

    /**
     * Sets the value of the mktVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection53 }
     *     
     */
    public ExposureMetrics4 setMktVal(AmountAndDirection53 value) {
        this.mktVal = value;
        return this;
    }

    /**
     * Gets the value of the outsdngMrgnLnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getOutsdngMrgnLnAmt() {
        return outsdngMrgnLnAmt;
    }

    /**
     * Sets the value of the outsdngMrgnLnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ExposureMetrics4 setOutsdngMrgnLnAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.outsdngMrgnLnAmt = value;
        return this;
    }

    /**
     * Gets the value of the shrtMktValAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getShrtMktValAmt() {
        return shrtMktValAmt;
    }

    /**
     * Sets the value of the shrtMktValAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ExposureMetrics4 setShrtMktValAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.shrtMktValAmt = value;
        return this;
    }

    /**
     * Gets the value of the mrgnLn property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getMrgnLn() {
        return mrgnLn;
    }

    /**
     * Sets the value of the mrgnLn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ExposureMetrics4 setMrgnLn(ActiveOrHistoricCurrencyAndAmount value) {
        this.mrgnLn = value;
        return this;
    }

    /**
     * Gets the value of the cshCollAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection53 }
     *     
     */
    public AmountAndDirection53 getCshCollAmt() {
        return cshCollAmt;
    }

    /**
     * Sets the value of the cshCollAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection53 }
     *     
     */
    public ExposureMetrics4 setCshCollAmt(AmountAndDirection53 value) {
        this.cshCollAmt = value;
        return this;
    }

    /**
     * Gets the value of the collMktVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection53 }
     *     
     */
    public AmountAndDirection53 getCollMktVal() {
        return collMktVal;
    }

    /**
     * Sets the value of the collMktVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection53 }
     *     
     */
    public ExposureMetrics4 setCollMktVal(AmountAndDirection53 value) {
        this.collMktVal = value;
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
