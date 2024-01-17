
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
 * Choice for identifying the underlying instruments that a derivative can consist of.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentIdentification8Choice", propOrder = {
    "sngl",
    "bskt"
})
public class FinancialInstrumentIdentification8Choice {

    @XmlElement(name = "Sngl")
    protected FinancialInstrumentIdentification9Choice sngl;
    @XmlElement(name = "Bskt")
    protected BasketDescription4 bskt;

    /**
     * Gets the value of the sngl property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentIdentification9Choice }
     *     
     */
    public FinancialInstrumentIdentification9Choice getSngl() {
        return sngl;
    }

    /**
     * Sets the value of the sngl property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentIdentification9Choice }
     *     
     */
    public FinancialInstrumentIdentification8Choice setSngl(FinancialInstrumentIdentification9Choice value) {
        this.sngl = value;
        return this;
    }

    /**
     * Gets the value of the bskt property.
     * 
     * @return
     *     possible object is
     *     {@link BasketDescription4 }
     *     
     */
    public BasketDescription4 getBskt() {
        return bskt;
    }

    /**
     * Sets the value of the bskt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasketDescription4 }
     *     
     */
    public FinancialInstrumentIdentification8Choice setBskt(BasketDescription4 value) {
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
