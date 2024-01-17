
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
@XmlType(name = "TradeReport6Choice", propOrder = {
    "_new",
    "err",
    "crrctn",
    "tradUpd"
})
public class TradeReport6Choice {

    @XmlElement(name = "New")
    protected CollateralMarginCorrection3 _new;
    @XmlElement(name = "Err")
    protected CollateralMarginError2 err;
    @XmlElement(name = "Crrctn")
    protected CollateralMarginCorrection3 crrctn;
    @XmlElement(name = "TradUpd")
    protected CollateralMarginMarginUpdate2 tradUpd;

    /**
     * Gets the value of the new property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralMarginCorrection3 }
     *     
     */
    public CollateralMarginCorrection3 getNew() {
        return _new;
    }

    /**
     * Sets the value of the new property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralMarginCorrection3 }
     *     
     */
    public TradeReport6Choice setNew(CollateralMarginCorrection3 value) {
        this._new = value;
        return this;
    }

    /**
     * Gets the value of the err property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralMarginError2 }
     *     
     */
    public CollateralMarginError2 getErr() {
        return err;
    }

    /**
     * Sets the value of the err property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralMarginError2 }
     *     
     */
    public TradeReport6Choice setErr(CollateralMarginError2 value) {
        this.err = value;
        return this;
    }

    /**
     * Gets the value of the crrctn property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralMarginCorrection3 }
     *     
     */
    public CollateralMarginCorrection3 getCrrctn() {
        return crrctn;
    }

    /**
     * Sets the value of the crrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralMarginCorrection3 }
     *     
     */
    public TradeReport6Choice setCrrctn(CollateralMarginCorrection3 value) {
        this.crrctn = value;
        return this;
    }

    /**
     * Gets the value of the tradUpd property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralMarginMarginUpdate2 }
     *     
     */
    public CollateralMarginMarginUpdate2 getTradUpd() {
        return tradUpd;
    }

    /**
     * Sets the value of the tradUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralMarginMarginUpdate2 }
     *     
     */
    public TradeReport6Choice setTradUpd(CollateralMarginMarginUpdate2 value) {
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
