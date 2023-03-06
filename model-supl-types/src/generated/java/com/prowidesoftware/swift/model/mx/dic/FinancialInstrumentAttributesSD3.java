
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Provides additional information regarding corporate action option securities movement security details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentAttributesSD3", propOrder = {
    "plcAndNm",
    "dtcSctyTrfblFlg",
    "csdDsbrsdSctyDtls",
    "dtcDsbrsdSctyAsstTp",
    "dtcDsbrsdSctyAsstClss",
    "babyBdDnmtn",
    "dsbrsdSctyElgbltyFlg"
})
public class FinancialInstrumentAttributesSD3 {

    @XmlElement(name = "PlcAndNm", required = true)
    protected String plcAndNm;
    @XmlElement(name = "DTCSctyTrfblFlg")
    protected Boolean dtcSctyTrfblFlg;
    @XmlElement(name = "CSDDsbrsdSctyDtls")
    protected FinancialInstrumentAttributesSD4 csdDsbrsdSctyDtls;
    @XmlElement(name = "DTCDsbrsdSctyAsstTp")
    @XmlSchemaType(name = "string")
    protected DTCAssetType1Code dtcDsbrsdSctyAsstTp;
    @XmlElement(name = "DTCDsbrsdSctyAsstClss")
    @XmlSchemaType(name = "string")
    protected AssetClass1Code dtcDsbrsdSctyAsstClss;
    @XmlElement(name = "BabyBdDnmtn")
    protected BigDecimal babyBdDnmtn;
    @XmlElement(name = "DsbrsdSctyElgbltyFlg")
    protected Boolean dsbrsdSctyElgbltyFlg;

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
    public FinancialInstrumentAttributesSD3 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the dtcSctyTrfblFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDTCSctyTrfblFlg() {
        return dtcSctyTrfblFlg;
    }

    /**
     * Sets the value of the dtcSctyTrfblFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrumentAttributesSD3 setDTCSctyTrfblFlg(Boolean value) {
        this.dtcSctyTrfblFlg = value;
        return this;
    }

    /**
     * Gets the value of the csdDsbrsdSctyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributesSD4 }
     *     
     */
    public FinancialInstrumentAttributesSD4 getCSDDsbrsdSctyDtls() {
        return csdDsbrsdSctyDtls;
    }

    /**
     * Sets the value of the csdDsbrsdSctyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributesSD4 }
     *     
     */
    public FinancialInstrumentAttributesSD3 setCSDDsbrsdSctyDtls(FinancialInstrumentAttributesSD4 value) {
        this.csdDsbrsdSctyDtls = value;
        return this;
    }

    /**
     * Gets the value of the dtcDsbrsdSctyAsstTp property.
     * 
     * @return
     *     possible object is
     *     {@link DTCAssetType1Code }
     *     
     */
    public DTCAssetType1Code getDTCDsbrsdSctyAsstTp() {
        return dtcDsbrsdSctyAsstTp;
    }

    /**
     * Sets the value of the dtcDsbrsdSctyAsstTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCAssetType1Code }
     *     
     */
    public FinancialInstrumentAttributesSD3 setDTCDsbrsdSctyAsstTp(DTCAssetType1Code value) {
        this.dtcDsbrsdSctyAsstTp = value;
        return this;
    }

    /**
     * Gets the value of the dtcDsbrsdSctyAsstClss property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClass1Code }
     *     
     */
    public AssetClass1Code getDTCDsbrsdSctyAsstClss() {
        return dtcDsbrsdSctyAsstClss;
    }

    /**
     * Sets the value of the dtcDsbrsdSctyAsstClss property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClass1Code }
     *     
     */
    public FinancialInstrumentAttributesSD3 setDTCDsbrsdSctyAsstClss(AssetClass1Code value) {
        this.dtcDsbrsdSctyAsstClss = value;
        return this;
    }

    /**
     * Gets the value of the babyBdDnmtn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBabyBdDnmtn() {
        return babyBdDnmtn;
    }

    /**
     * Sets the value of the babyBdDnmtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FinancialInstrumentAttributesSD3 setBabyBdDnmtn(BigDecimal value) {
        this.babyBdDnmtn = value;
        return this;
    }

    /**
     * Gets the value of the dsbrsdSctyElgbltyFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDsbrsdSctyElgbltyFlg() {
        return dsbrsdSctyElgbltyFlg;
    }

    /**
     * Sets the value of the dsbrsdSctyElgbltyFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrumentAttributesSD3 setDsbrsdSctyElgbltyFlg(Boolean value) {
        this.dsbrsdSctyElgbltyFlg = value;
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
