
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
@XmlType(name = "TransactionCollateralData1Choice", propOrder = {
    "rpTrad",
    "buySellBck",
    "sctiesLndg",
    "mrgnLndg"
})
public class TransactionCollateralData1Choice {

    @XmlElement(name = "RpTrad")
    protected Collateral15 rpTrad;
    @XmlElement(name = "BuySellBck")
    protected Collateral15 buySellBck;
    @XmlElement(name = "SctiesLndg")
    protected CollateralFlag6Choice sctiesLndg;
    @XmlElement(name = "MrgnLndg")
    protected Security3 mrgnLndg;

    /**
     * Gets the value of the rpTrad property.
     * 
     * @return
     *     possible object is
     *     {@link Collateral15 }
     *     
     */
    public Collateral15 getRpTrad() {
        return rpTrad;
    }

    /**
     * Sets the value of the rpTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Collateral15 }
     *     
     */
    public TransactionCollateralData1Choice setRpTrad(Collateral15 value) {
        this.rpTrad = value;
        return this;
    }

    /**
     * Gets the value of the buySellBck property.
     * 
     * @return
     *     possible object is
     *     {@link Collateral15 }
     *     
     */
    public Collateral15 getBuySellBck() {
        return buySellBck;
    }

    /**
     * Sets the value of the buySellBck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Collateral15 }
     *     
     */
    public TransactionCollateralData1Choice setBuySellBck(Collateral15 value) {
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
    public TransactionCollateralData1Choice setSctiesLndg(CollateralFlag6Choice value) {
        this.sctiesLndg = value;
        return this;
    }

    /**
     * Gets the value of the mrgnLndg property.
     * 
     * @return
     *     possible object is
     *     {@link Security3 }
     *     
     */
    public Security3 getMrgnLndg() {
        return mrgnLndg;
    }

    /**
     * Sets the value of the mrgnLndg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Security3 }
     *     
     */
    public TransactionCollateralData1Choice setMrgnLndg(Security3 value) {
        this.mrgnLndg = value;
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
