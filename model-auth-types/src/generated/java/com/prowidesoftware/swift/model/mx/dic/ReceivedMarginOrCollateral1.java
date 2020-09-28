
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
 * Information on the received margin or collateral of the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceivedMarginOrCollateral1", propOrder = {
    "initlMrgnRcvd",
    "vartnMrgnRcvd",
    "xcssCollRcvd"
})
public class ReceivedMarginOrCollateral1 {

    @XmlElement(name = "InitlMrgnRcvd", required = true)
    protected ActiveOrHistoricCurrencyAndAmount initlMrgnRcvd;
    @XmlElement(name = "VartnMrgnRcvd", required = true)
    protected ActiveOrHistoricCurrencyAndAmount vartnMrgnRcvd;
    @XmlElement(name = "XcssCollRcvd", required = true)
    protected ActiveOrHistoricCurrencyAndAmount xcssCollRcvd;

    /**
     * Gets the value of the initlMrgnRcvd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getInitlMrgnRcvd() {
        return initlMrgnRcvd;
    }

    /**
     * Sets the value of the initlMrgnRcvd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ReceivedMarginOrCollateral1 setInitlMrgnRcvd(ActiveOrHistoricCurrencyAndAmount value) {
        this.initlMrgnRcvd = value;
        return this;
    }

    /**
     * Gets the value of the vartnMrgnRcvd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getVartnMrgnRcvd() {
        return vartnMrgnRcvd;
    }

    /**
     * Sets the value of the vartnMrgnRcvd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ReceivedMarginOrCollateral1 setVartnMrgnRcvd(ActiveOrHistoricCurrencyAndAmount value) {
        this.vartnMrgnRcvd = value;
        return this;
    }

    /**
     * Gets the value of the xcssCollRcvd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getXcssCollRcvd() {
        return xcssCollRcvd;
    }

    /**
     * Sets the value of the xcssCollRcvd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ReceivedMarginOrCollateral1 setXcssCollRcvd(ActiveOrHistoricCurrencyAndAmount value) {
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
