
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
 * Information on the posted margin or collateral of the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostedMarginOrCollateral1", propOrder = {
    "initlMrgnPstd",
    "vartnMrgnPstd",
    "xcssCollPstd"
})
public class PostedMarginOrCollateral1 {

    @XmlElement(name = "InitlMrgnPstd", required = true)
    protected ActiveOrHistoricCurrencyAndAmount initlMrgnPstd;
    @XmlElement(name = "VartnMrgnPstd", required = true)
    protected ActiveOrHistoricCurrencyAndAmount vartnMrgnPstd;
    @XmlElement(name = "XcssCollPstd", required = true)
    protected ActiveOrHistoricCurrencyAndAmount xcssCollPstd;

    /**
     * Gets the value of the initlMrgnPstd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getInitlMrgnPstd() {
        return initlMrgnPstd;
    }

    /**
     * Sets the value of the initlMrgnPstd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public PostedMarginOrCollateral1 setInitlMrgnPstd(ActiveOrHistoricCurrencyAndAmount value) {
        this.initlMrgnPstd = value;
        return this;
    }

    /**
     * Gets the value of the vartnMrgnPstd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getVartnMrgnPstd() {
        return vartnMrgnPstd;
    }

    /**
     * Sets the value of the vartnMrgnPstd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public PostedMarginOrCollateral1 setVartnMrgnPstd(ActiveOrHistoricCurrencyAndAmount value) {
        this.vartnMrgnPstd = value;
        return this;
    }

    /**
     * Gets the value of the xcssCollPstd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getXcssCollPstd() {
        return xcssCollPstd;
    }

    /**
     * Sets the value of the xcssCollPstd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public PostedMarginOrCollateral1 setXcssCollPstd(ActiveOrHistoricCurrencyAndAmount value) {
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
