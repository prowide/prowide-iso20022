
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
 * Details of collateral agreement between counterparties.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeCollateralReport1", propOrder = {
    "collstn",
    "prtfl",
    "initlMrgnPstd",
    "vartnMrgnPstd",
    "initlMrgnRcvd",
    "vartnMrgnRcvd",
    "xcssCollPstd",
    "xcssCollRcvd"
})
public class TradeCollateralReport1 {

    @XmlElement(name = "Collstn", required = true)
    @XmlSchemaType(name = "string")
    protected CollateralisationType1Code collstn;
    @XmlElement(name = "Prtfl")
    protected String prtfl;
    @XmlElement(name = "InitlMrgnPstd")
    protected ActiveCurrencyAnd20Amount initlMrgnPstd;
    @XmlElement(name = "VartnMrgnPstd")
    protected ActiveCurrencyAnd20Amount vartnMrgnPstd;
    @XmlElement(name = "InitlMrgnRcvd")
    protected ActiveCurrencyAnd20Amount initlMrgnRcvd;
    @XmlElement(name = "VartnMrgnRcvd")
    protected ActiveCurrencyAnd20Amount vartnMrgnRcvd;
    @XmlElement(name = "XcssCollPstd")
    protected ActiveCurrencyAnd20Amount xcssCollPstd;
    @XmlElement(name = "XcssCollRcvd")
    protected ActiveCurrencyAnd20Amount xcssCollRcvd;

    /**
     * Gets the value of the collstn property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralisationType1Code }
     *     
     */
    public CollateralisationType1Code getCollstn() {
        return collstn;
    }

    /**
     * Sets the value of the collstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralisationType1Code }
     *     
     */
    public TradeCollateralReport1 setCollstn(CollateralisationType1Code value) {
        this.collstn = value;
        return this;
    }

    /**
     * Gets the value of the prtfl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtfl() {
        return prtfl;
    }

    /**
     * Sets the value of the prtfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeCollateralReport1 setPrtfl(String value) {
        this.prtfl = value;
        return this;
    }

    /**
     * Gets the value of the initlMrgnPstd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd20Amount }
     *     
     */
    public ActiveCurrencyAnd20Amount getInitlMrgnPstd() {
        return initlMrgnPstd;
    }

    /**
     * Sets the value of the initlMrgnPstd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd20Amount }
     *     
     */
    public TradeCollateralReport1 setInitlMrgnPstd(ActiveCurrencyAnd20Amount value) {
        this.initlMrgnPstd = value;
        return this;
    }

    /**
     * Gets the value of the vartnMrgnPstd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd20Amount }
     *     
     */
    public ActiveCurrencyAnd20Amount getVartnMrgnPstd() {
        return vartnMrgnPstd;
    }

    /**
     * Sets the value of the vartnMrgnPstd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd20Amount }
     *     
     */
    public TradeCollateralReport1 setVartnMrgnPstd(ActiveCurrencyAnd20Amount value) {
        this.vartnMrgnPstd = value;
        return this;
    }

    /**
     * Gets the value of the initlMrgnRcvd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd20Amount }
     *     
     */
    public ActiveCurrencyAnd20Amount getInitlMrgnRcvd() {
        return initlMrgnRcvd;
    }

    /**
     * Sets the value of the initlMrgnRcvd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd20Amount }
     *     
     */
    public TradeCollateralReport1 setInitlMrgnRcvd(ActiveCurrencyAnd20Amount value) {
        this.initlMrgnRcvd = value;
        return this;
    }

    /**
     * Gets the value of the vartnMrgnRcvd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd20Amount }
     *     
     */
    public ActiveCurrencyAnd20Amount getVartnMrgnRcvd() {
        return vartnMrgnRcvd;
    }

    /**
     * Sets the value of the vartnMrgnRcvd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd20Amount }
     *     
     */
    public TradeCollateralReport1 setVartnMrgnRcvd(ActiveCurrencyAnd20Amount value) {
        this.vartnMrgnRcvd = value;
        return this;
    }

    /**
     * Gets the value of the xcssCollPstd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd20Amount }
     *     
     */
    public ActiveCurrencyAnd20Amount getXcssCollPstd() {
        return xcssCollPstd;
    }

    /**
     * Sets the value of the xcssCollPstd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd20Amount }
     *     
     */
    public TradeCollateralReport1 setXcssCollPstd(ActiveCurrencyAnd20Amount value) {
        this.xcssCollPstd = value;
        return this;
    }

    /**
     * Gets the value of the xcssCollRcvd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd20Amount }
     *     
     */
    public ActiveCurrencyAnd20Amount getXcssCollRcvd() {
        return xcssCollRcvd;
    }

    /**
     * Sets the value of the xcssCollRcvd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd20Amount }
     *     
     */
    public TradeCollateralReport1 setXcssCollRcvd(ActiveCurrencyAnd20Amount value) {
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
