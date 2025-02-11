
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
@XmlType(name = "BalanceFormat2Choice", propOrder = {
    "bal",
    "elgblBal",
    "notElgblBal"
})
public class BalanceFormat2Choice {

    @XmlElement(name = "Bal")
    protected SignedQuantityFormat3 bal;
    @XmlElement(name = "ElgblBal")
    protected SignedQuantityFormat4 elgblBal;
    @XmlElement(name = "NotElgblBal")
    protected SignedQuantityFormat4 notElgblBal;

    /**
     * Gets the value of the bal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat3 }
     *     
     */
    public SignedQuantityFormat3 getBal() {
        return bal;
    }

    /**
     * Sets the value of the bal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat3 }
     *     
     */
    public BalanceFormat2Choice setBal(SignedQuantityFormat3 value) {
        this.bal = value;
        return this;
    }

    /**
     * Gets the value of the elgblBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public SignedQuantityFormat4 getElgblBal() {
        return elgblBal;
    }

    /**
     * Sets the value of the elgblBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public BalanceFormat2Choice setElgblBal(SignedQuantityFormat4 value) {
        this.elgblBal = value;
        return this;
    }

    /**
     * Gets the value of the notElgblBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public SignedQuantityFormat4 getNotElgblBal() {
        return notElgblBal;
    }

    /**
     * Sets the value of the notElgblBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public BalanceFormat2Choice setNotElgblBal(SignedQuantityFormat4 value) {
        this.notElgblBal = value;
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
