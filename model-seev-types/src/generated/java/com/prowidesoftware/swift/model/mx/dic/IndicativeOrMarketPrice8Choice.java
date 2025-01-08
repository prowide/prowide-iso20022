
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
 * Choice between an indicative price or a market price.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndicativeOrMarketPrice8Choice", propOrder = {
    "indctvPric",
    "mktPric"
})
public class IndicativeOrMarketPrice8Choice {

    @XmlElement(name = "IndctvPric")
    protected PriceFormat50Choice indctvPric;
    @XmlElement(name = "MktPric")
    protected PriceFormat50Choice mktPric;

    /**
     * Gets the value of the indctvPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat50Choice }
     *     
     */
    public PriceFormat50Choice getIndctvPric() {
        return indctvPric;
    }

    /**
     * Sets the value of the indctvPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat50Choice }
     *     
     */
    public IndicativeOrMarketPrice8Choice setIndctvPric(PriceFormat50Choice value) {
        this.indctvPric = value;
        return this;
    }

    /**
     * Gets the value of the mktPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat50Choice }
     *     
     */
    public PriceFormat50Choice getMktPric() {
        return mktPric;
    }

    /**
     * Sets the value of the mktPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat50Choice }
     *     
     */
    public IndicativeOrMarketPrice8Choice setMktPric(PriceFormat50Choice value) {
        this.mktPric = value;
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
