
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
 * Information on collateral used in the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionCollateralData8Choice", propOrder = {
    "rpTrad",
    "buySellBck",
    "sctiesLndg"
})
public class TransactionCollateralData8Choice {

    @XmlElement(name = "RpTrad")
    protected Collateral27 rpTrad;
    @XmlElement(name = "BuySellBck")
    protected Collateral27 buySellBck;
    @XmlElement(name = "SctiesLndg")
    protected CollateralFlag6Choice sctiesLndg;

    /**
     * Gets the value of the rpTrad property.
     * 
     * @return
     *     possible object is
     *     {@link Collateral27 }
     *     
     */
    public Collateral27 getRpTrad() {
        return rpTrad;
    }

    /**
     * Sets the value of the rpTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Collateral27 }
     *     
     */
    public TransactionCollateralData8Choice setRpTrad(Collateral27 value) {
        this.rpTrad = value;
        return this;
    }

    /**
     * Gets the value of the buySellBck property.
     * 
     * @return
     *     possible object is
     *     {@link Collateral27 }
     *     
     */
    public Collateral27 getBuySellBck() {
        return buySellBck;
    }

    /**
     * Sets the value of the buySellBck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Collateral27 }
     *     
     */
    public TransactionCollateralData8Choice setBuySellBck(Collateral27 value) {
        this.buySellBck = value;
        return this;
    }

    /**
     * Gets the value of the sctiesLndg property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralFlag6Choice }
     *     
     */
    public CollateralFlag6Choice getSctiesLndg() {
        return sctiesLndg;
    }

    /**
     * Sets the value of the sctiesLndg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralFlag6Choice }
     *     
     */
    public TransactionCollateralData8Choice setSctiesLndg(CollateralFlag6Choice value) {
        this.sctiesLndg = value;
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
