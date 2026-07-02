
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
 * Underlying financial instrument to which an trade confirmation is related.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderlyingFinancialInstrument7", propOrder = {
    "id",
    "attrbts"
})
public class UnderlyingFinancialInstrument7 {

    @XmlElement(name = "Id", required = true)
    protected SecurityIdentification19 id;
    @XmlElement(name = "Attrbts")
    protected FinancialInstrumentAttributes124 attrbts;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public UnderlyingFinancialInstrument7 setId(SecurityIdentification19 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the attrbts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes124 }
     *     
     */
    public FinancialInstrumentAttributes124 getAttrbts() {
        return attrbts;
    }

    /**
     * Sets the value of the attrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes124 }
     *     
     */
    public UnderlyingFinancialInstrument7 setAttrbts(FinancialInstrumentAttributes124 value) {
        this.attrbts = value;
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
