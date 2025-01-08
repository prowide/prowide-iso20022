
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
 * Provides additional information regarding underlying security details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentAttributesSD6", propOrder = {
    "plcAndNm",
    "ctryOfListg",
    "incmSrcCtry",
    "dtcAsstClss",
    "dtcAsstTp",
    "sctyElgbltyInd",
    "tckrSymb",
    "lkdScty"
})
public class FinancialInstrumentAttributesSD6 {

    @XmlElement(name = "PlcAndNm", required = true)
    protected String plcAndNm;
    @XmlElement(name = "CtryOfListg")
    protected String ctryOfListg;
    @XmlElement(name = "IncmSrcCtry")
    protected String incmSrcCtry;
    @XmlElement(name = "DTCAsstClss")
    @XmlSchemaType(name = "string")
    protected AssetClass1Code dtcAsstClss;
    @XmlElement(name = "DTCAsstTp")
    @XmlSchemaType(name = "string")
    protected DTCAssetType1Code dtcAsstTp;
    @XmlElement(name = "SctyElgbltyInd")
    protected Boolean sctyElgbltyInd;
    @XmlElement(name = "TckrSymb")
    protected String tckrSymb;
    @XmlElement(name = "LkdScty")
    protected SecurityIdentification15 lkdScty;

    /**
     * Gets the value of the plcAndNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcAndNm() {
        return plcAndNm;
    }

    /**
     * Sets the value of the plcAndNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentAttributesSD6 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the ctryOfListg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfListg() {
        return ctryOfListg;
    }

    /**
     * Sets the value of the ctryOfListg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentAttributesSD6 setCtryOfListg(String value) {
        this.ctryOfListg = value;
        return this;
    }

    /**
     * Gets the value of the incmSrcCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncmSrcCtry() {
        return incmSrcCtry;
    }

    /**
     * Sets the value of the incmSrcCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentAttributesSD6 setIncmSrcCtry(String value) {
        this.incmSrcCtry = value;
        return this;
    }

    /**
     * Gets the value of the dtcAsstClss property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClass1Code }
     *     
     */
    public AssetClass1Code getDTCAsstClss() {
        return dtcAsstClss;
    }

    /**
     * Sets the value of the dtcAsstClss property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClass1Code }
     *     
     */
    public FinancialInstrumentAttributesSD6 setDTCAsstClss(AssetClass1Code value) {
        this.dtcAsstClss = value;
        return this;
    }

    /**
     * Gets the value of the dtcAsstTp property.
     * 
     * @return
     *     possible object is
     *     {@link DTCAssetType1Code }
     *     
     */
    public DTCAssetType1Code getDTCAsstTp() {
        return dtcAsstTp;
    }

    /**
     * Sets the value of the dtcAsstTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCAssetType1Code }
     *     
     */
    public FinancialInstrumentAttributesSD6 setDTCAsstTp(DTCAssetType1Code value) {
        this.dtcAsstTp = value;
        return this;
    }

    /**
     * Gets the value of the sctyElgbltyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSctyElgbltyInd() {
        return sctyElgbltyInd;
    }

    /**
     * Sets the value of the sctyElgbltyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrumentAttributesSD6 setSctyElgbltyInd(Boolean value) {
        this.sctyElgbltyInd = value;
        return this;
    }

    /**
     * Gets the value of the tckrSymb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTckrSymb() {
        return tckrSymb;
    }

    /**
     * Sets the value of the tckrSymb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentAttributesSD6 setTckrSymb(String value) {
        this.tckrSymb = value;
        return this;
    }

    /**
     * Gets the value of the lkdScty property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification15 }
     *     
     */
    public SecurityIdentification15 getLkdScty() {
        return lkdScty;
    }

    /**
     * Sets the value of the lkdScty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification15 }
     *     
     */
    public FinancialInstrumentAttributesSD6 setLkdScty(SecurityIdentification15 value) {
        this.lkdScty = value;
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
