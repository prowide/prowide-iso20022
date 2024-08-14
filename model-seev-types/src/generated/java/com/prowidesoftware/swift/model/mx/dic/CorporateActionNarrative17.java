
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
 * Provides additional information such as the taxation conditions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionNarrative17", propOrder = {
    "addtlTxt",
    "nrrtvVrsn",
    "infConds",
    "infToCmplyWth",
    "taxtnConds",
    "dsclmr",
    "ptyCtctNrrtv",
    "dclrtnDtls",
    "regnDtls",
    "bsktOrIndxInf"
})
public class CorporateActionNarrative17 {

    @XmlElement(name = "AddtlTxt")
    protected UpdatedAdditionalInformation4 addtlTxt;
    @XmlElement(name = "NrrtvVrsn")
    protected UpdatedAdditionalInformation4 nrrtvVrsn;
    @XmlElement(name = "InfConds")
    protected UpdatedAdditionalInformation4 infConds;
    @XmlElement(name = "InfToCmplyWth")
    protected UpdatedAdditionalInformation4 infToCmplyWth;
    @XmlElement(name = "TaxtnConds")
    protected UpdatedAdditionalInformation4 taxtnConds;
    @XmlElement(name = "Dsclmr")
    protected UpdatedAdditionalInformation4 dsclmr;
    @XmlElement(name = "PtyCtctNrrtv")
    protected UpdatedAdditionalInformation4 ptyCtctNrrtv;
    @XmlElement(name = "DclrtnDtls")
    protected UpdatedAdditionalInformation4 dclrtnDtls;
    @XmlElement(name = "RegnDtls")
    protected UpdatedAdditionalInformation4 regnDtls;
    @XmlElement(name = "BsktOrIndxInf")
    protected UpdatedAdditionalInformation4 bsktOrIndxInf;

    /**
     * Gets the value of the addtlTxt property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation4 }
     *     
     */
    public UpdatedAdditionalInformation4 getAddtlTxt() {
        return addtlTxt;
    }

    /**
     * Sets the value of the addtlTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation4 }
     *     
     */
    public CorporateActionNarrative17 setAddtlTxt(UpdatedAdditionalInformation4 value) {
        this.addtlTxt = value;
        return this;
    }

    /**
     * Gets the value of the nrrtvVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation4 }
     *     
     */
    public UpdatedAdditionalInformation4 getNrrtvVrsn() {
        return nrrtvVrsn;
    }

    /**
     * Sets the value of the nrrtvVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation4 }
     *     
     */
    public CorporateActionNarrative17 setNrrtvVrsn(UpdatedAdditionalInformation4 value) {
        this.nrrtvVrsn = value;
        return this;
    }

    /**
     * Gets the value of the infConds property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation4 }
     *     
     */
    public UpdatedAdditionalInformation4 getInfConds() {
        return infConds;
    }

    /**
     * Sets the value of the infConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation4 }
     *     
     */
    public CorporateActionNarrative17 setInfConds(UpdatedAdditionalInformation4 value) {
        this.infConds = value;
        return this;
    }

    /**
     * Gets the value of the infToCmplyWth property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation4 }
     *     
     */
    public UpdatedAdditionalInformation4 getInfToCmplyWth() {
        return infToCmplyWth;
    }

    /**
     * Sets the value of the infToCmplyWth property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation4 }
     *     
     */
    public CorporateActionNarrative17 setInfToCmplyWth(UpdatedAdditionalInformation4 value) {
        this.infToCmplyWth = value;
        return this;
    }

    /**
     * Gets the value of the taxtnConds property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation4 }
     *     
     */
    public UpdatedAdditionalInformation4 getTaxtnConds() {
        return taxtnConds;
    }

    /**
     * Sets the value of the taxtnConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation4 }
     *     
     */
    public CorporateActionNarrative17 setTaxtnConds(UpdatedAdditionalInformation4 value) {
        this.taxtnConds = value;
        return this;
    }

    /**
     * Gets the value of the dsclmr property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation4 }
     *     
     */
    public UpdatedAdditionalInformation4 getDsclmr() {
        return dsclmr;
    }

    /**
     * Sets the value of the dsclmr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation4 }
     *     
     */
    public CorporateActionNarrative17 setDsclmr(UpdatedAdditionalInformation4 value) {
        this.dsclmr = value;
        return this;
    }

    /**
     * Gets the value of the ptyCtctNrrtv property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation4 }
     *     
     */
    public UpdatedAdditionalInformation4 getPtyCtctNrrtv() {
        return ptyCtctNrrtv;
    }

    /**
     * Sets the value of the ptyCtctNrrtv property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation4 }
     *     
     */
    public CorporateActionNarrative17 setPtyCtctNrrtv(UpdatedAdditionalInformation4 value) {
        this.ptyCtctNrrtv = value;
        return this;
    }

    /**
     * Gets the value of the dclrtnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation4 }
     *     
     */
    public UpdatedAdditionalInformation4 getDclrtnDtls() {
        return dclrtnDtls;
    }

    /**
     * Sets the value of the dclrtnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation4 }
     *     
     */
    public CorporateActionNarrative17 setDclrtnDtls(UpdatedAdditionalInformation4 value) {
        this.dclrtnDtls = value;
        return this;
    }

    /**
     * Gets the value of the regnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation4 }
     *     
     */
    public UpdatedAdditionalInformation4 getRegnDtls() {
        return regnDtls;
    }

    /**
     * Sets the value of the regnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation4 }
     *     
     */
    public CorporateActionNarrative17 setRegnDtls(UpdatedAdditionalInformation4 value) {
        this.regnDtls = value;
        return this;
    }

    /**
     * Gets the value of the bsktOrIndxInf property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation4 }
     *     
     */
    public UpdatedAdditionalInformation4 getBsktOrIndxInf() {
        return bsktOrIndxInf;
    }

    /**
     * Sets the value of the bsktOrIndxInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation4 }
     *     
     */
    public CorporateActionNarrative17 setBsktOrIndxInf(UpdatedAdditionalInformation4 value) {
        this.bsktOrIndxInf = value;
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
