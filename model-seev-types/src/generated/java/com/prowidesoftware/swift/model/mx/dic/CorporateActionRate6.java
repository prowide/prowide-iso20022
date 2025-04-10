
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
 * Specifies rate details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionRate6", propOrder = {
    "addtlQtyForSbcbdRsltntScties",
    "addtlQtyForExstgScties",
    "newToOd",
    "newSctiesToUndrlygScties"
})
public class CorporateActionRate6 {

    @XmlElement(name = "AddtlQtyForSbcbdRsltntScties")
    protected RatioFormat3Choice addtlQtyForSbcbdRsltntScties;
    @XmlElement(name = "AddtlQtyForExstgScties")
    protected RatioFormat3Choice addtlQtyForExstgScties;
    @XmlElement(name = "NewToOd")
    protected RatioFormat4Choice newToOd;
    @XmlElement(name = "NewSctiesToUndrlygScties")
    protected RatioFormat4Choice newSctiesToUndrlygScties;

    /**
     * Gets the value of the addtlQtyForSbcbdRsltntScties property.
     * 
     * @return
     *     possible object is
     *     {@link RatioFormat3Choice }
     *     
     */
    public RatioFormat3Choice getAddtlQtyForSbcbdRsltntScties() {
        return addtlQtyForSbcbdRsltntScties;
    }

    /**
     * Sets the value of the addtlQtyForSbcbdRsltntScties property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatioFormat3Choice }
     *     
     */
    public CorporateActionRate6 setAddtlQtyForSbcbdRsltntScties(RatioFormat3Choice value) {
        this.addtlQtyForSbcbdRsltntScties = value;
        return this;
    }

    /**
     * Gets the value of the addtlQtyForExstgScties property.
     * 
     * @return
     *     possible object is
     *     {@link RatioFormat3Choice }
     *     
     */
    public RatioFormat3Choice getAddtlQtyForExstgScties() {
        return addtlQtyForExstgScties;
    }

    /**
     * Sets the value of the addtlQtyForExstgScties property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatioFormat3Choice }
     *     
     */
    public CorporateActionRate6 setAddtlQtyForExstgScties(RatioFormat3Choice value) {
        this.addtlQtyForExstgScties = value;
        return this;
    }

    /**
     * Gets the value of the newToOd property.
     * 
     * @return
     *     possible object is
     *     {@link RatioFormat4Choice }
     *     
     */
    public RatioFormat4Choice getNewToOd() {
        return newToOd;
    }

    /**
     * Sets the value of the newToOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatioFormat4Choice }
     *     
     */
    public CorporateActionRate6 setNewToOd(RatioFormat4Choice value) {
        this.newToOd = value;
        return this;
    }

    /**
     * Gets the value of the newSctiesToUndrlygScties property.
     * 
     * @return
     *     possible object is
     *     {@link RatioFormat4Choice }
     *     
     */
    public RatioFormat4Choice getNewSctiesToUndrlygScties() {
        return newSctiesToUndrlygScties;
    }

    /**
     * Sets the value of the newSctiesToUndrlygScties property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatioFormat4Choice }
     *     
     */
    public CorporateActionRate6 setNewSctiesToUndrlygScties(RatioFormat4Choice value) {
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
