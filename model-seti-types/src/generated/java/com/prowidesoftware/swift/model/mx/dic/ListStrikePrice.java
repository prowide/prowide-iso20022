
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
 * Scope
 * An instructing party, eg, an investment manager, sends the ListStrikePrice message to an executing party, eg, a broker, to exchange strike price information for principal trades. The ListStrikePrice may also be used to exchange reference prices for agency trades.
 * Usage
 * No additional information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListStrikePrice", propOrder = {
    "id",
    "listIdAndNbOfStrks"
})
public class ListStrikePrice {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification11 id;
    @XmlElement(name = "ListIdAndNbOfStrks", required = true)
    protected List3 listIdAndNbOfStrks;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification11 }
     *     
     */
    public DocumentIdentification11 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification11 }
     *     
     */
    public ListStrikePrice setId(DocumentIdentification11 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the listIdAndNbOfStrks property.
     * 
     * @return
     *     possible object is
     *     {@link List3 }
     *     
     */
    public List3 getListIdAndNbOfStrks() {
        return listIdAndNbOfStrks;
    }

    /**
     * Sets the value of the listIdAndNbOfStrks property.
     * 
     * @param value
     *     allowed object is
     *     {@link List3 }
     *     
     */
    public ListStrikePrice setListIdAndNbOfStrks(List3 value) {
        this.listIdAndNbOfStrks = value;
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
