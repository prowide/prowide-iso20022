
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
@XmlType(name = "PlaceOfTradeIdentification1__1", propOrder = {
    "mktTpAndId"
})
public class PlaceOfTradeIdentification11 {

    @XmlElement(name = "MktTpAndId")
    protected MarketIdentification841 mktTpAndId;

    /**
     * Gets the value of the mktTpAndId property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification841 }
     *     
     */
    public MarketIdentification841 getMktTpAndId() {
        return mktTpAndId;
    }

    /**
     * Sets the value of the mktTpAndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification841 }
     *     
     */
    public PlaceOfTradeIdentification11 setMktTpAndId(MarketIdentification841 value) {
        this.mktTpAndId = value;
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
