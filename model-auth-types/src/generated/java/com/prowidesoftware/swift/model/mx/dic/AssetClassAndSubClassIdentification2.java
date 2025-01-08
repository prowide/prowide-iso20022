
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
 * Identification of a non-equity asset-class and sub-class.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassAndSubClassIdentification2", propOrder = {
    "asstClss",
    "derivSubClss",
    "finInstrmClssfctn"
})
public class AssetClassAndSubClassIdentification2 {

    @XmlElement(name = "AsstClss", required = true)
    @XmlSchemaType(name = "string")
    protected NonEquityAssetClass1Code asstClss;
    @XmlElement(name = "DerivSubClss")
    protected NonEquitySubClass1 derivSubClss;
    @XmlElement(name = "FinInstrmClssfctn")
    @XmlSchemaType(name = "string")
    protected NonEquityInstrumentReportingClassification1Code finInstrmClssfctn;

    /**
     * Gets the value of the asstClss property.
     * 
     * @return
     *     possible object is
     *     {@link NonEquityAssetClass1Code }
     *     
     */
    public NonEquityAssetClass1Code getAsstClss() {
        return asstClss;
    }

    /**
     * Sets the value of the asstClss property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEquityAssetClass1Code }
     *     
     */
    public AssetClassAndSubClassIdentification2 setAsstClss(NonEquityAssetClass1Code value) {
        this.asstClss = value;
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
    public AssetClassAndSubClassIdentification2 setDerivSubClss(NonEquitySubClass1 value) {
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
    public AssetClassAndSubClassIdentification2 setFinInstrmClssfctn(NonEquityInstrumentReportingClassification1Code value) {
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
