
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
 * Information on the posted margin or collateral of the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostedMarginOrCollateral6", propOrder = {
    "initlMrgnPstdPreHrcut",
    "initlMrgnPstdPstHrcut",
    "vartnMrgnPstdPreHrcut",
    "vartnMrgnPstdPstHrcut",
    "xcssCollPstd"
})
public class PostedMarginOrCollateral6 {

    @XmlElement(name = "InitlMrgnPstdPreHrcut")
    protected ActiveOrHistoricCurrencyAnd20DecimalAmount initlMrgnPstdPreHrcut;
    @XmlElement(name = "InitlMrgnPstdPstHrcut")
    protected ActiveOrHistoricCurrencyAnd20DecimalAmount initlMrgnPstdPstHrcut;
    @XmlElement(name = "VartnMrgnPstdPreHrcut")
    protected ActiveOrHistoricCurrencyAnd20DecimalAmount vartnMrgnPstdPreHrcut;
    @XmlElement(name = "VartnMrgnPstdPstHrcut")
    protected ActiveOrHistoricCurrencyAnd20DecimalAmount vartnMrgnPstdPstHrcut;
    @XmlElement(name = "XcssCollPstd")
    protected ActiveOrHistoricCurrencyAnd20DecimalAmount xcssCollPstd;

    /**
     * Gets the value of the initlMrgnPstdPreHrcut property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd20DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd20DecimalAmount getInitlMrgnPstdPreHrcut() {
        return initlMrgnPstdPreHrcut;
    }

    /**
     * Sets the value of the initlMrgnPstdPreHrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd20DecimalAmount }
     *     
     */
    public PostedMarginOrCollateral6 setInitlMrgnPstdPreHrcut(ActiveOrHistoricCurrencyAnd20DecimalAmount value) {
        this.initlMrgnPstdPreHrcut = value;
        return this;
    }

    /**
     * Gets the value of the initlMrgnPstdPstHrcut property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd20DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd20DecimalAmount getInitlMrgnPstdPstHrcut() {
        return initlMrgnPstdPstHrcut;
    }

    /**
     * Sets the value of the initlMrgnPstdPstHrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd20DecimalAmount }
     *     
     */
    public PostedMarginOrCollateral6 setInitlMrgnPstdPstHrcut(ActiveOrHistoricCurrencyAnd20DecimalAmount value) {
        this.initlMrgnPstdPstHrcut = value;
        return this;
    }

    /**
     * Gets the value of the vartnMrgnPstdPreHrcut property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd20DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd20DecimalAmount getVartnMrgnPstdPreHrcut() {
        return vartnMrgnPstdPreHrcut;
    }

    /**
     * Sets the value of the vartnMrgnPstdPreHrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd20DecimalAmount }
     *     
     */
    public PostedMarginOrCollateral6 setVartnMrgnPstdPreHrcut(ActiveOrHistoricCurrencyAnd20DecimalAmount value) {
        this.vartnMrgnPstdPreHrcut = value;
        return this;
    }

    /**
     * Gets the value of the vartnMrgnPstdPstHrcut property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd20DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd20DecimalAmount getVartnMrgnPstdPstHrcut() {
        return vartnMrgnPstdPstHrcut;
    }

    /**
     * Sets the value of the vartnMrgnPstdPstHrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd20DecimalAmount }
     *     
     */
    public PostedMarginOrCollateral6 setVartnMrgnPstdPstHrcut(ActiveOrHistoricCurrencyAnd20DecimalAmount value) {
        this.vartnMrgnPstdPstHrcut = value;
        return this;
    }

    /**
     * Gets the value of the xcssCollPstd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd20DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd20DecimalAmount getXcssCollPstd() {
        return xcssCollPstd;
    }

    /**
     * Sets the value of the xcssCollPstd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd20DecimalAmount }
     *     
     */
    public PostedMarginOrCollateral6 setXcssCollPstd(ActiveOrHistoricCurrencyAnd20DecimalAmount value) {
        this.xcssCollPstd = value;
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
