
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
 * Financial instrument where the value of the instrument derives from another financial instrument, benchmark or index.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Derivative3", propOrder = {
    "derivClssfctn",
    "derivUndrlygLeg",
    "optnAttrbts"
})
public class Derivative3 {

    @XmlElement(name = "DerivClssfctn", required = true)
    protected DerivativeClassification1 derivClssfctn;
    @XmlElement(name = "DerivUndrlygLeg", required = true)
    protected List<DerivativeUnderlyingLeg1> derivUndrlygLeg;
    @XmlElement(name = "OptnAttrbts")
    protected Option14 optnAttrbts;

    /**
     * Gets the value of the derivClssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativeClassification1 }
     *     
     */
    public DerivativeClassification1 getDerivClssfctn() {
        return derivClssfctn;
    }

    /**
     * Sets the value of the derivClssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativeClassification1 }
     *     
     */
    public Derivative3 setDerivClssfctn(DerivativeClassification1 value) {
        this.derivClssfctn = value;
        return this;
    }

    /**
     * Gets the value of the derivUndrlygLeg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the derivUndrlygLeg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDerivUndrlygLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DerivativeUnderlyingLeg1 }
     * 
     * 
     */
    public List<DerivativeUnderlyingLeg1> getDerivUndrlygLeg() {
        if (derivUndrlygLeg == null) {
            derivUndrlygLeg = new ArrayList<DerivativeUnderlyingLeg1>();
        }
        return this.derivUndrlygLeg;
    }

    /**
     * Gets the value of the optnAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link Option14 }
     *     
     */
    public Option14 getOptnAttrbts() {
        return optnAttrbts;
    }

    /**
     * Sets the value of the optnAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Option14 }
     *     
     */
    public Derivative3 setOptnAttrbts(Option14 value) {
        this.optnAttrbts = value;
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

    /**
     * Adds a new item to the derivUndrlygLeg list.
     * @see #getDerivUndrlygLeg()
     * 
     */
    public Derivative3 addDerivUndrlygLeg(DerivativeUnderlyingLeg1 derivUndrlygLeg) {
        getDerivUndrlygLeg().add(derivUndrlygLeg);
        return this;
    }

}
