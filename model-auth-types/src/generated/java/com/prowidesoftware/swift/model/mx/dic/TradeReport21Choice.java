
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
 * Provides details on the reported trade transactions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeReport21Choice", propOrder = {
    "_new",
    "err",
    "crrctn",
    "tradUpd"
})
public class TradeReport21Choice {

    @XmlElement(name = "New")
    protected CollateralMarginCorrection6 _new;
    @XmlElement(name = "Err")
    protected CollateralMarginError4 err;
    @XmlElement(name = "Crrctn")
    protected CollateralMarginCorrection6 crrctn;
    @XmlElement(name = "TradUpd")
    protected CollateralMarginMarginUpdate5 tradUpd;

    /**
     * Gets the value of the new property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralMarginCorrection6 }
     *     
     */
    public CollateralMarginCorrection6 getNew() {
        return _new;
    }

    /**
     * Sets the value of the new property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralMarginCorrection6 }
     *     
     */
    public TradeReport21Choice setNew(CollateralMarginCorrection6 value) {
        this._new = value;
        return this;
    }

    /**
     * Gets the value of the err property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralMarginError4 }
     *     
     */
    public CollateralMarginError4 getErr() {
        return err;
    }

    /**
     * Sets the value of the err property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralMarginError4 }
     *     
     */
    public TradeReport21Choice setErr(CollateralMarginError4 value) {
        this.err = value;
        return this;
    }

    /**
     * Gets the value of the crrctn property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralMarginCorrection6 }
     *     
     */
    public CollateralMarginCorrection6 getCrrctn() {
        return crrctn;
    }

    /**
     * Sets the value of the crrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralMarginCorrection6 }
     *     
     */
    public TradeReport21Choice setCrrctn(CollateralMarginCorrection6 value) {
        this.crrctn = value;
        return this;
    }

    /**
     * Gets the value of the tradUpd property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralMarginMarginUpdate5 }
     *     
     */
    public CollateralMarginMarginUpdate5 getTradUpd() {
        return tradUpd;
    }

    /**
     * Sets the value of the tradUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralMarginMarginUpdate5 }
     *     
     */
    public TradeReport21Choice setTradUpd(CollateralMarginMarginUpdate5 value) {
        this.tradUpd = value;
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
