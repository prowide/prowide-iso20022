
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
@XmlType(name = "CorporateActionPrice9", propOrder = {
    "cshInLieuOfShrPric",
    "indctvOrMktPric"
})
public class CorporateActionPrice9 {

    @XmlElement(name = "CshInLieuOfShrPric")
    protected PriceFormat5Choice cshInLieuOfShrPric;
    @XmlElement(name = "IndctvOrMktPric")
    protected IndicativeOrMarketPrice2Choice indctvOrMktPric;

    /**
     * Gets the value of the cshInLieuOfShrPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat5Choice }
     *     
     */
    public PriceFormat5Choice getCshInLieuOfShrPric() {
        return cshInLieuOfShrPric;
    }

    /**
     * Sets the value of the cshInLieuOfShrPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat5Choice }
     *     
     */
    public CorporateActionPrice9 setCshInLieuOfShrPric(PriceFormat5Choice value) {
        this.cshInLieuOfShrPric = value;
        return this;
    }

    /**
     * Gets the value of the indctvOrMktPric property.
     * 
     * @return
     *     possible object is
     *     {@link IndicativeOrMarketPrice2Choice }
     *     
     */
    public IndicativeOrMarketPrice2Choice getIndctvOrMktPric() {
        return indctvOrMktPric;
    }

    /**
     * Sets the value of the indctvOrMktPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicativeOrMarketPrice2Choice }
     *     
     */
    public CorporateActionPrice9 setIndctvOrMktPric(IndicativeOrMarketPrice2Choice value) {
        this.indctvOrMktPric = value;
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
