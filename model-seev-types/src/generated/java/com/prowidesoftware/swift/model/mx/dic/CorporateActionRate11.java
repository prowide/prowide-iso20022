
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
 * Specifies rate details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionRate11", propOrder = {
    "addtlQtyForSbcbdRsltntScties",
    "addtlQtyForExstgScties",
    "newToOd",
    "newSctiesToUndrlygScties"
})
public class CorporateActionRate11 {

    @XmlElement(name = "AddtlQtyForSbcbdRsltntScties")
    protected RatioFormat7Choice addtlQtyForSbcbdRsltntScties;
    @XmlElement(name = "AddtlQtyForExstgScties")
    protected RatioFormat7Choice addtlQtyForExstgScties;
    @XmlElement(name = "NewToOd")
    protected RatioFormat8Choice newToOd;
    @XmlElement(name = "NewSctiesToUndrlygScties")
    protected RatioFormat8Choice newSctiesToUndrlygScties;

    /**
     * Gets the value of the addtlQtyForSbcbdRsltntScties property.
     * 
     * @return
     *     possible object is
     *     {@link RatioFormat7Choice }
     *     
     */
    public RatioFormat7Choice getAddtlQtyForSbcbdRsltntScties() {
        return addtlQtyForSbcbdRsltntScties;
    }

    /**
     * Sets the value of the addtlQtyForSbcbdRsltntScties property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatioFormat7Choice }
     *     
     */
    public CorporateActionRate11 setAddtlQtyForSbcbdRsltntScties(RatioFormat7Choice value) {
        this.addtlQtyForSbcbdRsltntScties = value;
        return this;
    }

    /**
     * Gets the value of the addtlQtyForExstgScties property.
     * 
     * @return
     *     possible object is
     *     {@link RatioFormat7Choice }
     *     
     */
    public RatioFormat7Choice getAddtlQtyForExstgScties() {
        return addtlQtyForExstgScties;
    }

    /**
     * Sets the value of the addtlQtyForExstgScties property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatioFormat7Choice }
     *     
     */
    public CorporateActionRate11 setAddtlQtyForExstgScties(RatioFormat7Choice value) {
        this.addtlQtyForExstgScties = value;
        return this;
    }

    /**
     * Gets the value of the newToOd property.
     * 
     * @return
     *     possible object is
     *     {@link RatioFormat8Choice }
     *     
     */
    public RatioFormat8Choice getNewToOd() {
        return newToOd;
    }

    /**
     * Sets the value of the newToOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatioFormat8Choice }
     *     
     */
    public CorporateActionRate11 setNewToOd(RatioFormat8Choice value) {
        this.newToOd = value;
        return this;
    }

    /**
     * Gets the value of the newSctiesToUndrlygScties property.
     * 
     * @return
     *     possible object is
     *     {@link RatioFormat8Choice }
     *     
     */
    public RatioFormat8Choice getNewSctiesToUndrlygScties() {
        return newSctiesToUndrlygScties;
    }

    /**
     * Sets the value of the newSctiesToUndrlygScties property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatioFormat8Choice }
     *     
     */
    public CorporateActionRate11 setNewSctiesToUndrlygScties(RatioFormat8Choice value) {
        this.newSctiesToUndrlygScties = value;
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
