
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
@XmlType(name = "CorporateActionNarrative43", propOrder = {
    "addtlTxt",
    "nrrtvVrsn",
    "infConds",
    "infToCmplyWth",
    "taxtnConds",
    "dsclmr",
    "ptyCtctNrrtv",
    "regnDtls",
    "bsktOrIndxInf",
    "certfctnBrkdwn",
    "urlAdr"
})
public class CorporateActionNarrative43 {

    @XmlElement(name = "AddtlTxt")
    protected UpdatedAdditionalInformation10 addtlTxt;
    @XmlElement(name = "NrrtvVrsn")
    protected UpdatedAdditionalInformation10 nrrtvVrsn;
    @XmlElement(name = "InfConds")
    protected UpdatedAdditionalInformation10 infConds;
    @XmlElement(name = "InfToCmplyWth")
    protected UpdatedAdditionalInformation10 infToCmplyWth;
    @XmlElement(name = "TaxtnConds")
    protected UpdatedAdditionalInformation10 taxtnConds;
    @XmlElement(name = "Dsclmr")
    protected UpdatedAdditionalInformation10 dsclmr;
    @XmlElement(name = "PtyCtctNrrtv")
    protected UpdatedAdditionalInformation10 ptyCtctNrrtv;
    @XmlElement(name = "RegnDtls")
    protected UpdatedAdditionalInformation10 regnDtls;
    @XmlElement(name = "BsktOrIndxInf")
    protected UpdatedAdditionalInformation10 bsktOrIndxInf;
    @XmlElement(name = "CertfctnBrkdwn")
    protected UpdatedAdditionalInformation10 certfctnBrkdwn;
    @XmlElement(name = "URLAdr")
    protected List<String> urlAdr;

    /**
     * Gets the value of the addtlTxt property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation10 }
     *     
     */
    public UpdatedAdditionalInformation10 getAddtlTxt() {
        return addtlTxt;
    }

    /**
     * Sets the value of the addtlTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation10 }
     *     
     */
    public CorporateActionNarrative43 setAddtlTxt(UpdatedAdditionalInformation10 value) {
        this.addtlTxt = value;
        return this;
    }

    /**
     * Gets the value of the nrrtvVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation10 }
     *     
     */
    public UpdatedAdditionalInformation10 getNrrtvVrsn() {
        return nrrtvVrsn;
    }

    /**
     * Sets the value of the nrrtvVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation10 }
     *     
     */
    public CorporateActionNarrative43 setNrrtvVrsn(UpdatedAdditionalInformation10 value) {
        this.nrrtvVrsn = value;
        return this;
    }

    /**
     * Gets the value of the infConds property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation10 }
     *     
     */
    public UpdatedAdditionalInformation10 getInfConds() {
        return infConds;
    }

    /**
     * Sets the value of the infConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation10 }
     *     
     */
    public CorporateActionNarrative43 setInfConds(UpdatedAdditionalInformation10 value) {
        this.infConds = value;
        return this;
    }

    /**
     * Gets the value of the infToCmplyWth property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation10 }
     *     
     */
    public UpdatedAdditionalInformation10 getInfToCmplyWth() {
        return infToCmplyWth;
    }

    /**
     * Sets the value of the infToCmplyWth property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation10 }
     *     
     */
    public CorporateActionNarrative43 setInfToCmplyWth(UpdatedAdditionalInformation10 value) {
        this.infToCmplyWth = value;
        return this;
    }

    /**
     * Gets the value of the taxtnConds property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation10 }
     *     
     */
    public UpdatedAdditionalInformation10 getTaxtnConds() {
        return taxtnConds;
    }

    /**
     * Sets the value of the taxtnConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation10 }
     *     
     */
    public CorporateActionNarrative43 setTaxtnConds(UpdatedAdditionalInformation10 value) {
        this.taxtnConds = value;
        return this;
    }

    /**
     * Gets the value of the dsclmr property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation10 }
     *     
     */
    public UpdatedAdditionalInformation10 getDsclmr() {
        return dsclmr;
    }

    /**
     * Sets the value of the dsclmr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation10 }
     *     
     */
    public CorporateActionNarrative43 setDsclmr(UpdatedAdditionalInformation10 value) {
        this.dsclmr = value;
        return this;
    }

    /**
     * Gets the value of the ptyCtctNrrtv property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation10 }
     *     
     */
    public UpdatedAdditionalInformation10 getPtyCtctNrrtv() {
        return ptyCtctNrrtv;
    }

    /**
     * Sets the value of the ptyCtctNrrtv property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation10 }
     *     
     */
    public CorporateActionNarrative43 setPtyCtctNrrtv(UpdatedAdditionalInformation10 value) {
        this.ptyCtctNrrtv = value;
        return this;
    }

    /**
     * Gets the value of the regnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation10 }
     *     
     */
    public UpdatedAdditionalInformation10 getRegnDtls() {
        return regnDtls;
    }

    /**
     * Sets the value of the regnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation10 }
     *     
     */
    public CorporateActionNarrative43 setRegnDtls(UpdatedAdditionalInformation10 value) {
        this.regnDtls = value;
        return this;
    }

    /**
     * Gets the value of the bsktOrIndxInf property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation10 }
     *     
     */
    public UpdatedAdditionalInformation10 getBsktOrIndxInf() {
        return bsktOrIndxInf;
    }

    /**
     * Sets the value of the bsktOrIndxInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation10 }
     *     
     */
    public CorporateActionNarrative43 setBsktOrIndxInf(UpdatedAdditionalInformation10 value) {
        this.bsktOrIndxInf = value;
        return this;
    }

    /**
     * Gets the value of the certfctnBrkdwn property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation10 }
     *     
     */
    public UpdatedAdditionalInformation10 getCertfctnBrkdwn() {
        return certfctnBrkdwn;
    }

    /**
     * Sets the value of the certfctnBrkdwn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation10 }
     *     
     */
    public CorporateActionNarrative43 setCertfctnBrkdwn(UpdatedAdditionalInformation10 value) {
        this.certfctnBrkdwn = value;
        return this;
    }

    /**
     * Gets the value of the urlAdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the urlAdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getURLAdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getURLAdr() {
        if (urlAdr == null) {
            urlAdr = new ArrayList<String>();
        }
        return this.urlAdr;
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

    /**
     * Adds a new item to the uRLAdr list.
     * @see #getURLAdr()
     * 
     */
    public CorporateActionNarrative43 addURLAdr(String uRLAdr) {
        getURLAdr().add(uRLAdr);
        return this;
    }

}
