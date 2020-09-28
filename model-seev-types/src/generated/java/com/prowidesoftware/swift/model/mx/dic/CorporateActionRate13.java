
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies security rate details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionRate13", propOrder = {
    "addtlQtyForSbcbdRsltntScties",
    "addtlQtyForExstgScties",
    "newToOd",
    "newSctiesToUndrlygScties",
    "trfrmatnRate"
})
public class CorporateActionRate13 {

    @XmlElement(name = "AddtlQtyForSbcbdRsltntScties")
    protected RatioFormat9Choice addtlQtyForSbcbdRsltntScties;
    @XmlElement(name = "AddtlQtyForExstgScties")
    protected RatioFormat9Choice addtlQtyForExstgScties;
    @XmlElement(name = "NewToOd")
    protected RatioFormat10Choice newToOd;
    @XmlElement(name = "NewSctiesToUndrlygScties")
    protected RatioFormat10Choice newSctiesToUndrlygScties;
    @XmlElement(name = "TrfrmatnRate")
    protected BigDecimal trfrmatnRate;

    /**
     * Gets the value of the addtlQtyForSbcbdRsltntScties property.
     * 
     * @return
     *     possible object is
     *     {@link RatioFormat9Choice }
     *     
     */
    public RatioFormat9Choice getAddtlQtyForSbcbdRsltntScties() {
        return addtlQtyForSbcbdRsltntScties;
    }

    /**
     * Sets the value of the addtlQtyForSbcbdRsltntScties property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatioFormat9Choice }
     *     
     */
    public CorporateActionRate13 setAddtlQtyForSbcbdRsltntScties(RatioFormat9Choice value) {
        this.addtlQtyForSbcbdRsltntScties = value;
        return this;
    }

    /**
     * Gets the value of the addtlQtyForExstgScties property.
     * 
     * @return
     *     possible object is
     *     {@link RatioFormat9Choice }
     *     
     */
    public RatioFormat9Choice getAddtlQtyForExstgScties() {
        return addtlQtyForExstgScties;
    }

    /**
     * Sets the value of the addtlQtyForExstgScties property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatioFormat9Choice }
     *     
     */
    public CorporateActionRate13 setAddtlQtyForExstgScties(RatioFormat9Choice value) {
        this.addtlQtyForExstgScties = value;
        return this;
    }

    /**
     * Gets the value of the newToOd property.
     * 
     * @return
     *     possible object is
     *     {@link RatioFormat10Choice }
     *     
     */
    public RatioFormat10Choice getNewToOd() {
        return newToOd;
    }

    /**
     * Sets the value of the newToOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatioFormat10Choice }
     *     
     */
    public CorporateActionRate13 setNewToOd(RatioFormat10Choice value) {
        this.newToOd = value;
        return this;
    }

    /**
     * Gets the value of the newSctiesToUndrlygScties property.
     * 
     * @return
     *     possible object is
     *     {@link RatioFormat10Choice }
     *     
     */
    public RatioFormat10Choice getNewSctiesToUndrlygScties() {
        return newSctiesToUndrlygScties;
    }

    /**
     * Sets the value of the newSctiesToUndrlygScties property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatioFormat10Choice }
     *     
     */
    public CorporateActionRate13 setNewSctiesToUndrlygScties(RatioFormat10Choice value) {
        this.newSctiesToUndrlygScties = value;
        return this;
    }

    /**
     * Gets the value of the trfrmatnRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTrfrmatnRate() {
        return trfrmatnRate;
    }

    /**
     * Sets the value of the trfrmatnRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CorporateActionRate13 setTrfrmatnRate(BigDecimal value) {
        this.trfrmatnRate = value;
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
