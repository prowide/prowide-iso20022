
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
 * Identification of market in which a trade transaction has been executed.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceOfTradeIdentification2", propOrder = {
    "mktTpAndId",
    "lei"
})
public class PlaceOfTradeIdentification2 {

    @XmlElement(name = "MktTpAndId")
    protected MarketIdentification90 mktTpAndId;
    @XmlElement(name = "LEI")
    protected String lei;

    /**
     * Gets the value of the mktTpAndId property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification90 }
     *     
     */
    public MarketIdentification90 getMktTpAndId() {
        return mktTpAndId;
    }

    /**
     * Sets the value of the mktTpAndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification90 }
     *     
     */
    public PlaceOfTradeIdentification2 setMktTpAndId(MarketIdentification90 value) {
        this.mktTpAndId = value;
        return this;
    }

    /**
     * Gets the value of the lei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEI() {
        return lei;
    }

    /**
     * Sets the value of the lei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PlaceOfTradeIdentification2 setLEI(String value) {
        this.lei = value;
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
