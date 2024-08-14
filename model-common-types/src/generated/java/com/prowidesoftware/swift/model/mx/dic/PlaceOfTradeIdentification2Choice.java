
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
 * Indicates whether the trade was executed on or off-market.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceOfTradeIdentification2Choice", propOrder = {
    "mktId",
    "offMkt"
})
public class PlaceOfTradeIdentification2Choice {

    @XmlElement(name = "MktId")
    protected String mktId;
    @XmlElement(name = "OffMkt")
    protected OffMarket1Choice offMkt;

    /**
     * Gets the value of the mktId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktId() {
        return mktId;
    }

    /**
     * Sets the value of the mktId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PlaceOfTradeIdentification2Choice setMktId(String value) {
        this.mktId = value;
        return this;
    }

    /**
     * Gets the value of the offMkt property.
     * 
     * @return
     *     possible object is
     *     {@link OffMarket1Choice }
     *     
     */
    public OffMarket1Choice getOffMkt() {
        return offMkt;
    }

    /**
     * Sets the value of the offMkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffMarket1Choice }
     *     
     */
    public PlaceOfTradeIdentification2Choice setOffMkt(OffMarket1Choice value) {
        this.offMkt = value;
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
