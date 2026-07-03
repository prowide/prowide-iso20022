
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
 * Indicates the form of the financial Instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentForm2", propOrder = {
    "bookgApprnc",
    "lglForm"
})
public class FinancialInstrumentForm2 {

    @XmlElement(name = "BookgApprnc")
    protected Appearance3Choice bookgApprnc;
    @XmlElement(name = "LglForm")
    protected FormOfSecurity8Choice lglForm;

    /**
     * Gets the value of the bookgApprnc property.
     * 
     * @return
     *     possible object is
     *     {@link Appearance3Choice }
     *     
     */
    public Appearance3Choice getBookgApprnc() {
        return bookgApprnc;
    }

    /**
     * Sets the value of the bookgApprnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Appearance3Choice }
     *     
     */
    public FinancialInstrumentForm2 setBookgApprnc(Appearance3Choice value) {
        this.bookgApprnc = value;
        return this;
    }

    /**
     * Gets the value of the lglForm property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfSecurity8Choice }
     *     
     */
    public FormOfSecurity8Choice getLglForm() {
        return lglForm;
    }

    /**
     * Sets the value of the lglForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfSecurity8Choice }
     *     
     */
    public FinancialInstrumentForm2 setLglForm(FormOfSecurity8Choice value) {
        this.lglForm = value;
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
