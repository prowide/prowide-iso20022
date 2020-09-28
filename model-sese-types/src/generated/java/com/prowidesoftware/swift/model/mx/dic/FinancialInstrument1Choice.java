
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
@XmlType(name = "FinancialInstrument1Choice", propOrder = {
    "scty",
    "cshAsst",
    "othrAsst"
})
public class FinancialInstrument1Choice {

    @XmlElement(name = "Scty")
    protected FinancialInstrumentIdentification1 scty;
    @XmlElement(name = "CshAsst")
    protected CashAsset1 cshAsst;
    @XmlElement(name = "OthrAsst")
    protected OtherAsset1 othrAsst;

    /**
     * Gets the value of the scty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentIdentification1 }
     *     
     */
    public FinancialInstrumentIdentification1 getScty() {
        return scty;
    }

    /**
     * Sets the value of the scty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentIdentification1 }
     *     
     */
    public FinancialInstrument1Choice setScty(FinancialInstrumentIdentification1 value) {
        this.scty = value;
        return this;
    }

    /**
     * Gets the value of the cshAsst property.
     * 
     * @return
     *     possible object is
     *     {@link CashAsset1 }
     *     
     */
    public CashAsset1 getCshAsst() {
        return cshAsst;
    }

    /**
     * Sets the value of the cshAsst property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAsset1 }
     *     
     */
    public FinancialInstrument1Choice setCshAsst(CashAsset1 value) {
        this.cshAsst = value;
        return this;
    }

    /**
     * Gets the value of the othrAsst property.
     * 
     * @return
     *     possible object is
     *     {@link OtherAsset1 }
     *     
     */
    public OtherAsset1 getOthrAsst() {
        return othrAsst;
    }

    /**
     * Sets the value of the othrAsst property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAsset1 }
     *     
     */
    public FinancialInstrument1Choice setOthrAsst(OtherAsset1 value) {
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
