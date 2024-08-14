
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
@XmlType(name = "CorporateActionNarrative6", propOrder = {
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
public class CorporateActionNarrative6 {

    @XmlElement(name = "AddtlTxt")
    protected UpdatedAdditionalInformation1 addtlTxt;
    @XmlElement(name = "NrrtvVrsn")
    protected UpdatedAdditionalInformation1 nrrtvVrsn;
    @XmlElement(name = "InfConds")
    protected UpdatedAdditionalInformation1 infConds;
    @XmlElement(name = "InfToCmplyWth")
    protected UpdatedAdditionalInformation1 infToCmplyWth;
    @XmlElement(name = "TaxtnConds")
    protected UpdatedAdditionalInformation1 taxtnConds;
    @XmlElement(name = "Dsclmr")
    protected UpdatedAdditionalInformation1 dsclmr;
    @XmlElement(name = "PtyCtctNrrtv")
    protected UpdatedAdditionalInformation1 ptyCtctNrrtv;
    @XmlElement(name = "DclrtnDtls")
    protected UpdatedAdditionalInformation1 dclrtnDtls;
    @XmlElement(name = "RegnDtls")
    protected UpdatedAdditionalInformation1 regnDtls;
    @XmlElement(name = "BsktOrIndxInf")
    protected UpdatedAdditionalInformation1 bsktOrIndxInf;

    /**
     * Gets the value of the addtlTxt property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation1 }
     *     
     */
    public UpdatedAdditionalInformation1 getAddtlTxt() {
        return addtlTxt;
    }

    /**
     * Sets the value of the addtlTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation1 }
     *     
     */
    public CorporateActionNarrative6 setAddtlTxt(UpdatedAdditionalInformation1 value) {
        this.addtlTxt = value;
        return this;
    }

    /**
     * Gets the value of the nrrtvVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation1 }
     *     
     */
    public UpdatedAdditionalInformation1 getNrrtvVrsn() {
        return nrrtvVrsn;
    }

    /**
     * Sets the value of the nrrtvVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation1 }
     *     
     */
    public CorporateActionNarrative6 setNrrtvVrsn(UpdatedAdditionalInformation1 value) {
        this.nrrtvVrsn = value;
        return this;
    }

    /**
     * Gets the value of the infConds property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation1 }
     *     
     */
    public UpdatedAdditionalInformation1 getInfConds() {
        return infConds;
    }

    /**
     * Sets the value of the infConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation1 }
     *     
     */
    public CorporateActionNarrative6 setInfConds(UpdatedAdditionalInformation1 value) {
        this.infConds = value;
        return this;
    }

    /**
     * Gets the value of the infToCmplyWth property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation1 }
     *     
     */
    public UpdatedAdditionalInformation1 getInfToCmplyWth() {
        return infToCmplyWth;
    }

    /**
     * Sets the value of the infToCmplyWth property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation1 }
     *     
     */
    public CorporateActionNarrative6 setInfToCmplyWth(UpdatedAdditionalInformation1 value) {
        this.infToCmplyWth = value;
        return this;
    }

    /**
     * Gets the value of the taxtnConds property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation1 }
     *     
     */
    public UpdatedAdditionalInformation1 getTaxtnConds() {
        return taxtnConds;
    }

    /**
     * Sets the value of the taxtnConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation1 }
     *     
     */
    public CorporateActionNarrative6 setTaxtnConds(UpdatedAdditionalInformation1 value) {
        this.taxtnConds = value;
        return this;
    }

    /**
     * Gets the value of the dsclmr property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation1 }
     *     
     */
    public UpdatedAdditionalInformation1 getDsclmr() {
        return dsclmr;
    }

    /**
     * Sets the value of the dsclmr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation1 }
     *     
     */
    public CorporateActionNarrative6 setDsclmr(UpdatedAdditionalInformation1 value) {
        this.dsclmr = value;
        return this;
    }

    /**
     * Gets the value of the ptyCtctNrrtv property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation1 }
     *     
     */
    public UpdatedAdditionalInformation1 getPtyCtctNrrtv() {
        return ptyCtctNrrtv;
    }

    /**
     * Sets the value of the ptyCtctNrrtv property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation1 }
     *     
     */
    public CorporateActionNarrative6 setPtyCtctNrrtv(UpdatedAdditionalInformation1 value) {
        this.ptyCtctNrrtv = value;
        return this;
    }

    /**
     * Gets the value of the dclrtnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation1 }
     *     
     */
    public UpdatedAdditionalInformation1 getDclrtnDtls() {
        return dclrtnDtls;
    }

    /**
     * Sets the value of the dclrtnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation1 }
     *     
     */
    public CorporateActionNarrative6 setDclrtnDtls(UpdatedAdditionalInformation1 value) {
        this.dclrtnDtls = value;
        return this;
    }

    /**
     * Gets the value of the regnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation1 }
     *     
     */
    public UpdatedAdditionalInformation1 getRegnDtls() {
        return regnDtls;
    }

    /**
     * Sets the value of the regnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation1 }
     *     
     */
    public CorporateActionNarrative6 setRegnDtls(UpdatedAdditionalInformation1 value) {
        this.regnDtls = value;
        return this;
    }

    /**
     * Gets the value of the bsktOrIndxInf property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation1 }
     *     
     */
    public UpdatedAdditionalInformation1 getBsktOrIndxInf() {
        return bsktOrIndxInf;
    }

    /**
     * Sets the value of the bsktOrIndxInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation1 }
     *     
     */
    public CorporateActionNarrative6 setBsktOrIndxInf(UpdatedAdditionalInformation1 value) {
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
