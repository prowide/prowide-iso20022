
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
 * Specifies prices related to a corporate action option.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionPrice28", propOrder = {
    "cshInLieuOfShrPric",
    "overSbcptDpstPric"
})
public class CorporateActionPrice28 {

    @XmlElement(name = "CshInLieuOfShrPric")
    protected PriceFormat19Choice cshInLieuOfShrPric;
    @XmlElement(name = "OverSbcptDpstPric")
    protected PriceFormat19Choice overSbcptDpstPric;

    /**
     * Gets the value of the cshInLieuOfShrPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat19Choice }
     *     
     */
    public PriceFormat19Choice getCshInLieuOfShrPric() {
        return cshInLieuOfShrPric;
    }

    /**
     * Sets the value of the cshInLieuOfShrPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat19Choice }
     *     
     */
    public CorporateActionPrice28 setCshInLieuOfShrPric(PriceFormat19Choice value) {
        this.cshInLieuOfShrPric = value;
        return this;
    }

    /**
     * Gets the value of the overSbcptDpstPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat19Choice }
     *     
     */
    public PriceFormat19Choice getOverSbcptDpstPric() {
        return overSbcptDpstPric;
    }

    /**
     * Sets the value of the overSbcptDpstPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat19Choice }
     *     
     */
    public CorporateActionPrice28 setOverSbcptDpstPric(PriceFormat19Choice value) {
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
