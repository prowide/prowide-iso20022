
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
 * Choice of financial instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrument103Choice", propOrder = {
    "scty",
    "cshAsst",
    "othrAsst"
})
public class FinancialInstrument103Choice {

    @XmlElement(name = "Scty")
    protected FinancialInstrumentIdentification11 scty;
    @XmlElement(name = "CshAsst")
    protected CashAsset3 cshAsst;
    @XmlElement(name = "OthrAsst")
    protected OtherAsset2 othrAsst;

    /**
     * Gets the value of the scty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentIdentification11 }
     *     
     */
    public FinancialInstrumentIdentification11 getScty() {
        return scty;
    }

    /**
     * Sets the value of the scty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentIdentification11 }
     *     
     */
    public FinancialInstrument103Choice setScty(FinancialInstrumentIdentification11 value) {
        this.scty = value;
        return this;
    }

    /**
     * Gets the value of the cshAsst property.
     * 
     * @return
     *     possible object is
     *     {@link CashAsset3 }
     *     
     */
    public CashAsset3 getCshAsst() {
        return cshAsst;
    }

    /**
     * Sets the value of the cshAsst property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAsset3 }
     *     
     */
    public FinancialInstrument103Choice setCshAsst(CashAsset3 value) {
        this.cshAsst = value;
        return this;
    }

    /**
     * Gets the value of the othrAsst property.
     * 
     * @return
     *     possible object is
     *     {@link OtherAsset2 }
     *     
     */
    public OtherAsset2 getOthrAsst() {
        return othrAsst;
    }

    /**
     * Sets the value of the othrAsst property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAsset2 }
     *     
     */
    public FinancialInstrument103Choice setOthrAsst(OtherAsset2 value) {
        this.othrAsst = value;
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
