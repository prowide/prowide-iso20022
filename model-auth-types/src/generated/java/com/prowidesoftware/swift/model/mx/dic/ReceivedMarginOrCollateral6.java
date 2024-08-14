
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
 * Information on the received margin or collateral of the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceivedMarginOrCollateral6", propOrder = {
    "initlMrgnRcvdPreHrcut",
    "initlMrgnRcvdPstHrcut",
    "vartnMrgnRcvdPreHrcut",
    "vartnMrgnRcvdPstHrcut",
    "xcssCollRcvd"
})
public class ReceivedMarginOrCollateral6 {

    @XmlElement(name = "InitlMrgnRcvdPreHrcut")
    protected ActiveOrHistoricCurrencyAnd20DecimalAmount initlMrgnRcvdPreHrcut;
    @XmlElement(name = "InitlMrgnRcvdPstHrcut")
    protected ActiveOrHistoricCurrencyAnd20DecimalAmount initlMrgnRcvdPstHrcut;
    @XmlElement(name = "VartnMrgnRcvdPreHrcut")
    protected ActiveOrHistoricCurrencyAnd20DecimalAmount vartnMrgnRcvdPreHrcut;
    @XmlElement(name = "VartnMrgnRcvdPstHrcut")
    protected ActiveOrHistoricCurrencyAnd20DecimalAmount vartnMrgnRcvdPstHrcut;
    @XmlElement(name = "XcssCollRcvd")
    protected ActiveOrHistoricCurrencyAnd20DecimalAmount xcssCollRcvd;

    /**
     * Gets the value of the initlMrgnRcvdPreHrcut property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd20DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd20DecimalAmount getInitlMrgnRcvdPreHrcut() {
        return initlMrgnRcvdPreHrcut;
    }

    /**
     * Sets the value of the initlMrgnRcvdPreHrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd20DecimalAmount }
     *     
     */
    public ReceivedMarginOrCollateral6 setInitlMrgnRcvdPreHrcut(ActiveOrHistoricCurrencyAnd20DecimalAmount value) {
        this.initlMrgnRcvdPreHrcut = value;
        return this;
    }

    /**
     * Gets the value of the initlMrgnRcvdPstHrcut property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd20DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd20DecimalAmount getInitlMrgnRcvdPstHrcut() {
        return initlMrgnRcvdPstHrcut;
    }

    /**
     * Sets the value of the initlMrgnRcvdPstHrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd20DecimalAmount }
     *     
     */
    public ReceivedMarginOrCollateral6 setInitlMrgnRcvdPstHrcut(ActiveOrHistoricCurrencyAnd20DecimalAmount value) {
        this.initlMrgnRcvdPstHrcut = value;
        return this;
    }

    /**
     * Gets the value of the vartnMrgnRcvdPreHrcut property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd20DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd20DecimalAmount getVartnMrgnRcvdPreHrcut() {
        return vartnMrgnRcvdPreHrcut;
    }

    /**
     * Sets the value of the vartnMrgnRcvdPreHrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd20DecimalAmount }
     *     
     */
    public ReceivedMarginOrCollateral6 setVartnMrgnRcvdPreHrcut(ActiveOrHistoricCurrencyAnd20DecimalAmount value) {
        this.vartnMrgnRcvdPreHrcut = value;
        return this;
    }

    /**
     * Gets the value of the vartnMrgnRcvdPstHrcut property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd20DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd20DecimalAmount getVartnMrgnRcvdPstHrcut() {
        return vartnMrgnRcvdPstHrcut;
    }

    /**
     * Sets the value of the vartnMrgnRcvdPstHrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd20DecimalAmount }
     *     
     */
    public ReceivedMarginOrCollateral6 setVartnMrgnRcvdPstHrcut(ActiveOrHistoricCurrencyAnd20DecimalAmount value) {
        this.vartnMrgnRcvdPstHrcut = value;
        return this;
    }

    /**
     * Gets the value of the xcssCollRcvd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd20DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd20DecimalAmount getXcssCollRcvd() {
        return xcssCollRcvd;
    }

    /**
     * Sets the value of the xcssCollRcvd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd20DecimalAmount }
     *     
     */
    public ReceivedMarginOrCollateral6 setXcssCollRcvd(ActiveOrHistoricCurrencyAnd20DecimalAmount value) {
        this.xcssCollRcvd = value;
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
