
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
 * Choice between formats for the identification of the financial instruments.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentIdentification9Choice", propOrder = {
    "isin",
    "indx"
})
public class FinancialInstrumentIdentification9Choice {

    @XmlElement(name = "ISIN")
    protected String isin;
    @XmlElement(name = "Indx")
    protected FinancialInstrument98 indx;

    /**
     * Gets the value of the isin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISIN() {
        return isin;
    }

    /**
     * Sets the value of the isin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentIdentification9Choice setISIN(String value) {
        this.isin = value;
        return this;
    }

    /**
     * Gets the value of the indx property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument98 }
     *     
     */
    public FinancialInstrument98 getIndx() {
        return indx;
    }

    /**
     * Sets the value of the indx property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument98 }
     *     
     */
    public FinancialInstrumentIdentification9Choice setIndx(FinancialInstrument98 value) {
        this.indx = value;
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
