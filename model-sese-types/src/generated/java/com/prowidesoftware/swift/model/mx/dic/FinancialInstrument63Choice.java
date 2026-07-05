
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
 * Choice of financial instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrument63Choice", propOrder = {
    "scty",
    "cshAsst",
    "othrAsst"
})
public class FinancialInstrument63Choice {

    @XmlElement(name = "Scty")
    protected FinancialInstrumentIdentification2 scty;
    @XmlElement(name = "CshAsst")
    protected CashAsset3 cshAsst;
    @XmlElement(name = "OthrAsst")
    protected OtherAsset2 othrAsst;

    /**
     * Gets the value of the scty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentIdentification2 }
     *     
     */
    public FinancialInstrumentIdentification2 getScty() {
        return scty;
    }

    /**
     * Sets the value of the scty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentIdentification2 }
     *     
     */
    public FinancialInstrument63Choice setScty(FinancialInstrumentIdentification2 value) {
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
    public FinancialInstrument63Choice setCshAsst(CashAsset3 value) {
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
    public FinancialInstrument63Choice setOthrAsst(OtherAsset2 value) {
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
