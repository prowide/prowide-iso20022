
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
 * Provides additional information such as the taxation conditions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionNarrative57", propOrder = {
    "addtlTxt",
    "nrrtvVrsn",
    "infConds",
    "infToCmplyWth",
    "sctyRstrctn",
    "taxtnConds",
    "dsclmr",
    "certfctnBrkdwn"
})
public class CorporateActionNarrative57 {

    @XmlElement(name = "AddtlTxt")
    protected UpdatedAdditionalInformation18 addtlTxt;
    @XmlElement(name = "NrrtvVrsn")
    protected UpdatedAdditionalInformation18 nrrtvVrsn;
    @XmlElement(name = "InfConds")
    protected UpdatedAdditionalInformation17 infConds;
    @XmlElement(name = "InfToCmplyWth")
    protected UpdatedAdditionalInformation17 infToCmplyWth;
    @XmlElement(name = "SctyRstrctn")
    protected UpdatedAdditionalInformation17 sctyRstrctn;
    @XmlElement(name = "TaxtnConds")
    protected UpdatedAdditionalInformation17 taxtnConds;
    @XmlElement(name = "Dsclmr")
    protected UpdatedAdditionalInformation17 dsclmr;
    @XmlElement(name = "CertfctnBrkdwn")
    protected UpdatedAdditionalInformation17 certfctnBrkdwn;

    /**
     * Gets the value of the addtlTxt property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation18 }
     *     
     */
    public UpdatedAdditionalInformation18 getAddtlTxt() {
        return addtlTxt;
    }

    /**
     * Sets the value of the addtlTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation18 }
     *     
     */
    public CorporateActionNarrative57 setAddtlTxt(UpdatedAdditionalInformation18 value) {
        this.addtlTxt = value;
        return this;
    }

    /**
     * Gets the value of the nrrtvVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation18 }
     *     
     */
    public UpdatedAdditionalInformation18 getNrrtvVrsn() {
        return nrrtvVrsn;
    }

    /**
     * Sets the value of the nrrtvVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation18 }
     *     
     */
    public CorporateActionNarrative57 setNrrtvVrsn(UpdatedAdditionalInformation18 value) {
        this.nrrtvVrsn = value;
        return this;
    }

    /**
     * Gets the value of the infConds property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation17 }
     *     
     */
    public UpdatedAdditionalInformation17 getInfConds() {
        return infConds;
    }

    /**
     * Sets the value of the infConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation17 }
     *     
     */
    public CorporateActionNarrative57 setInfConds(UpdatedAdditionalInformation17 value) {
        this.infConds = value;
        return this;
    }

    /**
     * Gets the value of the infToCmplyWth property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation17 }
     *     
     */
    public UpdatedAdditionalInformation17 getInfToCmplyWth() {
        return infToCmplyWth;
    }

    /**
     * Sets the value of the infToCmplyWth property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation17 }
     *     
     */
    public CorporateActionNarrative57 setInfToCmplyWth(UpdatedAdditionalInformation17 value) {
        this.infToCmplyWth = value;
        return this;
    }

    /**
     * Gets the value of the sctyRstrctn property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation17 }
     *     
     */
    public UpdatedAdditionalInformation17 getSctyRstrctn() {
        return sctyRstrctn;
    }

    /**
     * Sets the value of the sctyRstrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation17 }
     *     
     */
    public CorporateActionNarrative57 setSctyRstrctn(UpdatedAdditionalInformation17 value) {
        this.sctyRstrctn = value;
        return this;
    }

    /**
     * Gets the value of the taxtnConds property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation17 }
     *     
     */
    public UpdatedAdditionalInformation17 getTaxtnConds() {
        return taxtnConds;
    }

    /**
     * Sets the value of the taxtnConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation17 }
     *     
     */
    public CorporateActionNarrative57 setTaxtnConds(UpdatedAdditionalInformation17 value) {
        this.taxtnConds = value;
        return this;
    }

    /**
     * Gets the value of the dsclmr property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation17 }
     *     
     */
    public UpdatedAdditionalInformation17 getDsclmr() {
        return dsclmr;
    }

    /**
     * Sets the value of the dsclmr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation17 }
     *     
     */
    public CorporateActionNarrative57 setDsclmr(UpdatedAdditionalInformation17 value) {
        this.dsclmr = value;
        return this;
    }

    /**
     * Gets the value of the certfctnBrkdwn property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation17 }
     *     
     */
    public UpdatedAdditionalInformation17 getCertfctnBrkdwn() {
        return certfctnBrkdwn;
    }

    /**
     * Sets the value of the certfctnBrkdwn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation17 }
     *     
     */
    public CorporateActionNarrative57 setCertfctnBrkdwn(UpdatedAdditionalInformation17 value) {
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
