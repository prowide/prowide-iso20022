
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
@XmlType(name = "CorporateActionNarrative61", propOrder = {
    "addtlTxt",
    "nrrtvVrsn",
    "infConds",
    "infToCmplyWth",
    "sctyRstrctn",
    "taxtnConds",
    "dsclmr",
    "certfctnBrkdwn"
})
public class CorporateActionNarrative61 {

    @XmlElement(name = "AddtlTxt")
    protected UpdatedAdditionalInformation22 addtlTxt;
    @XmlElement(name = "NrrtvVrsn")
    protected UpdatedAdditionalInformation22 nrrtvVrsn;
    @XmlElement(name = "InfConds")
    protected UpdatedAdditionalInformation23 infConds;
    @XmlElement(name = "InfToCmplyWth")
    protected UpdatedAdditionalInformation23 infToCmplyWth;
    @XmlElement(name = "SctyRstrctn")
    protected UpdatedAdditionalInformation23 sctyRstrctn;
    @XmlElement(name = "TaxtnConds")
    protected UpdatedAdditionalInformation23 taxtnConds;
    @XmlElement(name = "Dsclmr")
    protected UpdatedAdditionalInformation23 dsclmr;
    @XmlElement(name = "CertfctnBrkdwn")
    protected UpdatedAdditionalInformation23 certfctnBrkdwn;

    /**
     * Gets the value of the addtlTxt property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation22 }
     *     
     */
    public UpdatedAdditionalInformation22 getAddtlTxt() {
        return addtlTxt;
    }

    /**
     * Sets the value of the addtlTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation22 }
     *     
     */
    public CorporateActionNarrative61 setAddtlTxt(UpdatedAdditionalInformation22 value) {
        this.addtlTxt = value;
        return this;
    }

    /**
     * Gets the value of the nrrtvVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation22 }
     *     
     */
    public UpdatedAdditionalInformation22 getNrrtvVrsn() {
        return nrrtvVrsn;
    }

    /**
     * Sets the value of the nrrtvVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation22 }
     *     
     */
    public CorporateActionNarrative61 setNrrtvVrsn(UpdatedAdditionalInformation22 value) {
        this.nrrtvVrsn = value;
        return this;
    }

    /**
     * Gets the value of the infConds property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation23 }
     *     
     */
    public UpdatedAdditionalInformation23 getInfConds() {
        return infConds;
    }

    /**
     * Sets the value of the infConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation23 }
     *     
     */
    public CorporateActionNarrative61 setInfConds(UpdatedAdditionalInformation23 value) {
        this.infConds = value;
        return this;
    }

    /**
     * Gets the value of the infToCmplyWth property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation23 }
     *     
     */
    public UpdatedAdditionalInformation23 getInfToCmplyWth() {
        return infToCmplyWth;
    }

    /**
     * Sets the value of the infToCmplyWth property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation23 }
     *     
     */
    public CorporateActionNarrative61 setInfToCmplyWth(UpdatedAdditionalInformation23 value) {
        this.infToCmplyWth = value;
        return this;
    }

    /**
     * Gets the value of the sctyRstrctn property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation23 }
     *     
     */
    public UpdatedAdditionalInformation23 getSctyRstrctn() {
        return sctyRstrctn;
    }

    /**
     * Sets the value of the sctyRstrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation23 }
     *     
     */
    public CorporateActionNarrative61 setSctyRstrctn(UpdatedAdditionalInformation23 value) {
        this.sctyRstrctn = value;
        return this;
    }

    /**
     * Gets the value of the taxtnConds property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation23 }
     *     
     */
    public UpdatedAdditionalInformation23 getTaxtnConds() {
        return taxtnConds;
    }

    /**
     * Sets the value of the taxtnConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation23 }
     *     
     */
    public CorporateActionNarrative61 setTaxtnConds(UpdatedAdditionalInformation23 value) {
        this.taxtnConds = value;
        return this;
    }

    /**
     * Gets the value of the dsclmr property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation23 }
     *     
     */
    public UpdatedAdditionalInformation23 getDsclmr() {
        return dsclmr;
    }

    /**
     * Sets the value of the dsclmr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation23 }
     *     
     */
    public CorporateActionNarrative61 setDsclmr(UpdatedAdditionalInformation23 value) {
        this.dsclmr = value;
        return this;
    }

    /**
     * Gets the value of the certfctnBrkdwn property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation23 }
     *     
     */
    public UpdatedAdditionalInformation23 getCertfctnBrkdwn() {
        return certfctnBrkdwn;
    }

    /**
     * Sets the value of the certfctnBrkdwn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation23 }
     *     
     */
    public CorporateActionNarrative61 setCertfctnBrkdwn(UpdatedAdditionalInformation23 value) {
        this.certfctnBrkdwn = value;
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
