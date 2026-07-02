
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
 * Choice for identifying the underlying instruments that a derivative can consist of.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentIdentification7Choice", propOrder = {
    "sngl",
    "bskt"
})
public class FinancialInstrumentIdentification7Choice {

    @XmlElement(name = "Sngl")
    protected FinancialInstrumentIdentification6Choice sngl;
    @XmlElement(name = "Bskt")
    protected BasketDescription3 bskt;

    /**
     * Gets the value of the sngl property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentIdentification6Choice }
     *     
     */
    public FinancialInstrumentIdentification6Choice getSngl() {
        return sngl;
    }

    /**
     * Sets the value of the sngl property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentIdentification6Choice }
     *     
     */
    public FinancialInstrumentIdentification7Choice setSngl(FinancialInstrumentIdentification6Choice value) {
        this.sngl = value;
        return this;
    }

    /**
     * Gets the value of the bskt property.
     * 
     * @return
     *     possible object is
     *     {@link BasketDescription3 }
     *     
     */
    public BasketDescription3 getBskt() {
        return bskt;
    }

    /**
     * Sets the value of the bskt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasketDescription3 }
     *     
     */
    public FinancialInstrumentIdentification7Choice setBskt(BasketDescription3 value) {
        this.bskt = value;
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
