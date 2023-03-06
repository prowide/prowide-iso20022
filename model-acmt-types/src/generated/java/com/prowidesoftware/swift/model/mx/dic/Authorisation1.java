
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Autorisation of the mandate holder.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Authorisation1", propOrder = {
    "minAmtPerTx",
    "maxAmtPerTx",
    "maxAmtByPrd"
})
public class Authorisation1 {

    @XmlElement(name = "MinAmtPerTx", required = true)
    protected ActiveCurrencyAndAmount minAmtPerTx;
    @XmlElement(name = "MaxAmtPerTx", required = true)
    protected ActiveCurrencyAndAmount maxAmtPerTx;
    @XmlElement(name = "MaxAmtByPrd")
    protected List<MaximumAmountByPeriod1> maxAmtByPrd;

    /**
     * Gets the value of the minAmtPerTx property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getMinAmtPerTx() {
        return minAmtPerTx;
    }

    /**
     * Sets the value of the minAmtPerTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Authorisation1 setMinAmtPerTx(ActiveCurrencyAndAmount value) {
        this.minAmtPerTx = value;
        return this;
    }

    /**
     * Gets the value of the maxAmtPerTx property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getMaxAmtPerTx() {
        return maxAmtPerTx;
    }

    /**
     * Sets the value of the maxAmtPerTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Authorisation1 setMaxAmtPerTx(ActiveCurrencyAndAmount value) {
        this.maxAmtPerTx = value;
        return this;
    }

    /**
     * Gets the value of the maxAmtByPrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maxAmtByPrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaxAmtByPrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaximumAmountByPeriod1 }
     * 
     * 
     */
    public List<MaximumAmountByPeriod1> getMaxAmtByPrd() {
        if (maxAmtByPrd == null) {
            maxAmtByPrd = new ArrayList<MaximumAmountByPeriod1>();
        }
        return this.maxAmtByPrd;
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

    /**
     * Adds a new item to the maxAmtByPrd list.
     * @see #getMaxAmtByPrd()
     * 
     */
    public Authorisation1 addMaxAmtByPrd(MaximumAmountByPeriod1 maxAmtByPrd) {
        getMaxAmtByPrd().add(maxAmtByPrd);
        return this;
    }

}
