
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
@XmlType(name = "FinancialInstrumentAttributesSD19", propOrder = {
    "plcAndNm",
    "incmSrcCtry",
    "dtcAsstClss",
    "dtcAsstTp",
    "sctyElgbltyInd",
    "tckrSymb",
    "lkdScty",
    "orgtgSctyId",
    "divannSctyDesc",
    "frgnIsseFlg",
    "mnyMktInstrmFlg"
})
public class FinancialInstrumentAttributesSD19 {

    @XmlElement(name = "PlcAndNm")
    protected String plcAndNm;
    @XmlElement(name = "IncmSrcCtry")
    protected String incmSrcCtry;
    @XmlElement(name = "DTCAsstClss")
    @XmlSchemaType(name = "string")
    protected AssetClass1Code dtcAsstClss;
    @XmlElement(name = "DTCAsstTp")
    @XmlSchemaType(name = "string")
    protected DTCAssetType3Code dtcAsstTp;
    @XmlElement(name = "SctyElgbltyInd")
    protected Boolean sctyElgbltyInd;
    @XmlElement(name = "TckrSymb")
    protected String tckrSymb;
    @XmlElement(name = "LkdScty")
    protected SecurityIdentification20 lkdScty;
    @XmlElement(name = "OrgtgSctyId")
    protected OtherIdentification2 orgtgSctyId;
    @XmlElement(name = "DIVANNSctyDesc")
    protected String divannSctyDesc;
    @XmlElement(name = "FrgnIsseFlg")
    protected Boolean frgnIsseFlg;
    @XmlElement(name = "MnyMktInstrmFlg")
    protected Boolean mnyMktInstrmFlg;

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
    public FinancialInstrumentAttributesSD19 setPlcAndNm(String value) {
        this.plcAndNm = value;
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
    public FinancialInstrumentAttributesSD19 setIncmSrcCtry(String value) {
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
    public FinancialInstrumentAttributesSD19 setDTCAsstClss(AssetClass1Code value) {
        this.dtcAsstClss = value;
        return this;
    }

    /**
     * Gets the value of the dtcAsstTp property.
     * 
     * @return
     *     possible object is
     *     {@link DTCAssetType3Code }
     *     
     */
    public DTCAssetType3Code getDTCAsstTp() {
        return dtcAsstTp;
    }

    /**
     * Sets the value of the dtcAsstTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCAssetType3Code }
     *     
     */
    public FinancialInstrumentAttributesSD19 setDTCAsstTp(DTCAssetType3Code value) {
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
    public FinancialInstrumentAttributesSD19 setSctyElgbltyInd(Boolean value) {
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
    public FinancialInstrumentAttributesSD19 setTckrSymb(String value) {
        this.tckrSymb = value;
        return this;
    }

    /**
     * Gets the value of the lkdScty property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification20 }
     *     
     */
    public SecurityIdentification20 getLkdScty() {
        return lkdScty;
    }

    /**
     * Sets the value of the lkdScty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification20 }
     *     
     */
    public FinancialInstrumentAttributesSD19 setLkdScty(SecurityIdentification20 value) {
        this.lkdScty = value;
        return this;
    }

    /**
     * Gets the value of the orgtgSctyId property.
     * 
     * @return
     *     possible object is
     *     {@link OtherIdentification2 }
     *     
     */
    public OtherIdentification2 getOrgtgSctyId() {
        return orgtgSctyId;
    }

    /**
     * Sets the value of the orgtgSctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherIdentification2 }
     *     
     */
    public FinancialInstrumentAttributesSD19 setOrgtgSctyId(OtherIdentification2 value) {
        this.orgtgSctyId = value;
        return this;
    }

    /**
     * Gets the value of the divannSctyDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIVANNSctyDesc() {
        return divannSctyDesc;
    }

    /**
     * Sets the value of the divannSctyDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentAttributesSD19 setDIVANNSctyDesc(String value) {
        this.divannSctyDesc = value;
        return this;
    }

    /**
     * Gets the value of the frgnIsseFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFrgnIsseFlg() {
        return frgnIsseFlg;
    }

    /**
     * Sets the value of the frgnIsseFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrumentAttributesSD19 setFrgnIsseFlg(Boolean value) {
        this.frgnIsseFlg = value;
        return this;
    }

    /**
     * Gets the value of the mnyMktInstrmFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMnyMktInstrmFlg() {
        return mnyMktInstrmFlg;
    }

    /**
     * Sets the value of the mnyMktInstrmFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrumentAttributesSD19 setMnyMktInstrmFlg(Boolean value) {
        this.mnyMktInstrmFlg = value;
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
