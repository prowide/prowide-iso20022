
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Identification of a financial instrument and of the non-equity sub-class of the financial instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstrumentAndSubClassIdentification2", propOrder = {
    "isin",
    "derivSubClss",
    "finInstrmClssfctn"
})
public class InstrumentAndSubClassIdentification2 {

    @XmlElement(name = "ISIN", required = true)
    protected String isin;
    @XmlElement(name = "DerivSubClss")
    protected NonEquitySubClass1 derivSubClss;
    @XmlElement(name = "FinInstrmClssfctn")
    @XmlSchemaType(name = "string")
    protected NonEquityInstrumentReportingClassification1Code finInstrmClssfctn;

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
    public InstrumentAndSubClassIdentification2 setISIN(String value) {
        this.isin = value;
        return this;
    }

    /**
     * Gets the value of the derivSubClss property.
     * 
     * @return
     *     possible object is
     *     {@link NonEquitySubClass1 }
     *     
     */
    public NonEquitySubClass1 getDerivSubClss() {
        return derivSubClss;
    }

    /**
     * Sets the value of the derivSubClss property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEquitySubClass1 }
     *     
     */
    public InstrumentAndSubClassIdentification2 setDerivSubClss(NonEquitySubClass1 value) {
        this.derivSubClss = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmClssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link NonEquityInstrumentReportingClassification1Code }
     *     
     */
    public NonEquityInstrumentReportingClassification1Code getFinInstrmClssfctn() {
        return finInstrmClssfctn;
    }

    /**
     * Sets the value of the finInstrmClssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEquityInstrumentReportingClassification1Code }
     *     
     */
    public InstrumentAndSubClassIdentification2 setFinInstrmClssfctn(NonEquityInstrumentReportingClassification1Code value) {
        this.finInstrmClssfctn = value;
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
