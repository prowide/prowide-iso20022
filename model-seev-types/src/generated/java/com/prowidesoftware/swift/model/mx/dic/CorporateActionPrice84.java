
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
 * Specifies prices.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionPrice84", propOrder = {
    "cshInLieuOfShrPric",
    "overSbcptDpstPric"
})
public class CorporateActionPrice84 {

    @XmlElement(name = "CshInLieuOfShrPric")
    protected PriceFormat77Choice cshInLieuOfShrPric;
    @XmlElement(name = "OverSbcptDpstPric")
    protected PriceFormat77Choice overSbcptDpstPric;

    /**
     * Gets the value of the cshInLieuOfShrPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat77Choice }
     *     
     */
    public PriceFormat77Choice getCshInLieuOfShrPric() {
        return cshInLieuOfShrPric;
    }

    /**
     * Sets the value of the cshInLieuOfShrPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat77Choice }
     *     
     */
    public CorporateActionPrice84 setCshInLieuOfShrPric(PriceFormat77Choice value) {
        this.cshInLieuOfShrPric = value;
        return this;
    }

    /**
     * Gets the value of the overSbcptDpstPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat77Choice }
     *     
     */
    public PriceFormat77Choice getOverSbcptDpstPric() {
        return overSbcptDpstPric;
    }

    /**
     * Sets the value of the overSbcptDpstPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat77Choice }
     *     
     */
    public CorporateActionPrice84 setOverSbcptDpstPric(PriceFormat77Choice value) {
        this.overSbcptDpstPric = value;
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
