
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
 * Choice between balance, eligible balance and not eligible balance formats.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceFormat10Choice", propOrder = {
    "bal",
    "elgblBal",
    "notElgblBal",
    "fullPrdUnits",
    "partWayPrdUnits"
})
public class BalanceFormat10Choice {

    @XmlElement(name = "Bal")
    protected SignedQuantityFormat8 bal;
    @XmlElement(name = "ElgblBal")
    protected SignedQuantityFormat9 elgblBal;
    @XmlElement(name = "NotElgblBal")
    protected SignedQuantityFormat9 notElgblBal;
    @XmlElement(name = "FullPrdUnits")
    protected SignedQuantityFormat9 fullPrdUnits;
    @XmlElement(name = "PartWayPrdUnits")
    protected SignedQuantityFormat9 partWayPrdUnits;

    /**
     * Gets the value of the bal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat8 }
     *     
     */
    public SignedQuantityFormat8 getBal() {
        return bal;
    }

    /**
     * Sets the value of the bal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat8 }
     *     
     */
    public BalanceFormat10Choice setBal(SignedQuantityFormat8 value) {
        this.bal = value;
        return this;
    }

    /**
     * Gets the value of the elgblBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getElgblBal() {
        return elgblBal;
    }

    /**
     * Sets the value of the elgblBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public BalanceFormat10Choice setElgblBal(SignedQuantityFormat9 value) {
        this.elgblBal = value;
        return this;
    }

    /**
     * Gets the value of the notElgblBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getNotElgblBal() {
        return notElgblBal;
    }

    /**
     * Sets the value of the notElgblBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public BalanceFormat10Choice setNotElgblBal(SignedQuantityFormat9 value) {
        this.notElgblBal = value;
        return this;
    }

    /**
     * Gets the value of the fullPrdUnits property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getFullPrdUnits() {
        return fullPrdUnits;
    }

    /**
     * Sets the value of the fullPrdUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public BalanceFormat10Choice setFullPrdUnits(SignedQuantityFormat9 value) {
        this.fullPrdUnits = value;
        return this;
    }

    /**
     * Gets the value of the partWayPrdUnits property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getPartWayPrdUnits() {
        return partWayPrdUnits;
    }

    /**
     * Sets the value of the partWayPrdUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public BalanceFormat10Choice setPartWayPrdUnits(SignedQuantityFormat9 value) {
        this.partWayPrdUnits = value;
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
