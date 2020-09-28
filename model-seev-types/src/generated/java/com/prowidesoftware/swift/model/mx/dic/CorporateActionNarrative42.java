
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
@XmlType(name = "CorporateActionNarrative42", propOrder = {
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
public class CorporateActionNarrative42 {

    @XmlElement(name = "AddtlTxt")
    protected UpdatedAdditionalInformation8 addtlTxt;
    @XmlElement(name = "NrrtvVrsn")
    protected UpdatedAdditionalInformation8 nrrtvVrsn;
    @XmlElement(name = "InfConds")
    protected UpdatedAdditionalInformation8 infConds;
    @XmlElement(name = "InfToCmplyWth")
    protected UpdatedAdditionalInformation8 infToCmplyWth;
    @XmlElement(name = "TaxtnConds")
    protected UpdatedAdditionalInformation8 taxtnConds;
    @XmlElement(name = "Dsclmr")
    protected UpdatedAdditionalInformation8 dsclmr;
    @XmlElement(name = "PtyCtctNrrtv")
    protected UpdatedAdditionalInformation8 ptyCtctNrrtv;
    @XmlElement(name = "RegnDtls")
    protected UpdatedAdditionalInformation8 regnDtls;
    @XmlElement(name = "BsktOrIndxInf")
    protected UpdatedAdditionalInformation8 bsktOrIndxInf;
    @XmlElement(name = "CertfctnBrkdwn")
    protected UpdatedAdditionalInformation8 certfctnBrkdwn;
    @XmlElement(name = "URLAdr")
    protected List<String> urlAdr;

    /**
     * Gets the value of the addtlTxt property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation8 }
     *     
     */
    public UpdatedAdditionalInformation8 getAddtlTxt() {
        return addtlTxt;
    }

    /**
     * Sets the value of the addtlTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation8 }
     *     
     */
    public CorporateActionNarrative42 setAddtlTxt(UpdatedAdditionalInformation8 value) {
        this.addtlTxt = value;
        return this;
    }

    /**
     * Gets the value of the nrrtvVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation8 }
     *     
     */
    public UpdatedAdditionalInformation8 getNrrtvVrsn() {
        return nrrtvVrsn;
    }

    /**
     * Sets the value of the nrrtvVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation8 }
     *     
     */
    public CorporateActionNarrative42 setNrrtvVrsn(UpdatedAdditionalInformation8 value) {
        this.nrrtvVrsn = value;
        return this;
    }

    /**
     * Gets the value of the infConds property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation8 }
     *     
     */
    public UpdatedAdditionalInformation8 getInfConds() {
        return infConds;
    }

    /**
     * Sets the value of the infConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation8 }
     *     
     */
    public CorporateActionNarrative42 setInfConds(UpdatedAdditionalInformation8 value) {
        this.infConds = value;
        return this;
    }

    /**
     * Gets the value of the infToCmplyWth property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation8 }
     *     
     */
    public UpdatedAdditionalInformation8 getInfToCmplyWth() {
        return infToCmplyWth;
    }

    /**
     * Sets the value of the infToCmplyWth property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation8 }
     *     
     */
    public CorporateActionNarrative42 setInfToCmplyWth(UpdatedAdditionalInformation8 value) {
        this.infToCmplyWth = value;
        return this;
    }

    /**
     * Gets the value of the taxtnConds property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation8 }
     *     
     */
    public UpdatedAdditionalInformation8 getTaxtnConds() {
        return taxtnConds;
    }

    /**
     * Sets the value of the taxtnConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation8 }
     *     
     */
    public CorporateActionNarrative42 setTaxtnConds(UpdatedAdditionalInformation8 value) {
        this.taxtnConds = value;
        return this;
    }

    /**
     * Gets the value of the dsclmr property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation8 }
     *     
     */
    public UpdatedAdditionalInformation8 getDsclmr() {
        return dsclmr;
    }

    /**
     * Sets the value of the dsclmr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation8 }
     *     
     */
    public CorporateActionNarrative42 setDsclmr(UpdatedAdditionalInformation8 value) {
        this.dsclmr = value;
        return this;
    }

    /**
     * Gets the value of the ptyCtctNrrtv property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation8 }
     *     
     */
    public UpdatedAdditionalInformation8 getPtyCtctNrrtv() {
        return ptyCtctNrrtv;
    }

    /**
     * Sets the value of the ptyCtctNrrtv property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation8 }
     *     
     */
    public CorporateActionNarrative42 setPtyCtctNrrtv(UpdatedAdditionalInformation8 value) {
        this.ptyCtctNrrtv = value;
        return this;
    }

    /**
     * Gets the value of the regnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation8 }
     *     
     */
    public UpdatedAdditionalInformation8 getRegnDtls() {
        return regnDtls;
    }

    /**
     * Sets the value of the regnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation8 }
     *     
     */
    public CorporateActionNarrative42 setRegnDtls(UpdatedAdditionalInformation8 value) {
        this.regnDtls = value;
        return this;
    }

    /**
     * Gets the value of the bsktOrIndxInf property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation8 }
     *     
     */
    public UpdatedAdditionalInformation8 getBsktOrIndxInf() {
        return bsktOrIndxInf;
    }

    /**
     * Sets the value of the bsktOrIndxInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation8 }
     *     
     */
    public CorporateActionNarrative42 setBsktOrIndxInf(UpdatedAdditionalInformation8 value) {
        this.bsktOrIndxInf = value;
        return this;
    }

    /**
     * Gets the value of the certfctnBrkdwn property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedAdditionalInformation8 }
     *     
     */
    public UpdatedAdditionalInformation8 getCertfctnBrkdwn() {
        return certfctnBrkdwn;
    }

    /**
     * Sets the value of the certfctnBrkdwn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedAdditionalInformation8 }
     *     
     */
    public CorporateActionNarrative42 setCertfctnBrkdwn(UpdatedAdditionalInformation8 value) {
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
    public CorporateActionNarrative42 addURLAdr(String uRLAdr) {
        getURLAdr().add(uRLAdr);
        return this;
    }

}
