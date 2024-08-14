
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
@XmlType(name = "CorporateActionNarrative65", propOrder = {
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
    "urlAdr",
    "prcgTxtForNxtIntrmy"
})
public class CorporateActionNarrative65 {

    @XmlElement(name = "AddtlTxt")
    protected List<UpdatedAdditionalInformation26> addtlTxt;
    @XmlElement(name = "NrrtvVrsn")
    protected List<UpdatedAdditionalInformation26> nrrtvVrsn;
    @XmlElement(name = "InfConds")
    protected List<UpdatedAdditionalInformation26> infConds;
    @XmlElement(name = "InfToCmplyWth")
    protected List<UpdatedAdditionalInformation26> infToCmplyWth;
    @XmlElement(name = "TaxtnConds")
    protected List<UpdatedAdditionalInformation26> taxtnConds;
    @XmlElement(name = "Dsclmr")
    protected List<UpdatedAdditionalInformation26> dsclmr;
    @XmlElement(name = "PtyCtctNrrtv")
    protected List<UpdatedAdditionalInformation26> ptyCtctNrrtv;
    @XmlElement(name = "RegnDtls")
    protected List<UpdatedAdditionalInformation26> regnDtls;
    @XmlElement(name = "BsktOrIndxInf")
    protected List<UpdatedAdditionalInformation26> bsktOrIndxInf;
    @XmlElement(name = "CertfctnBrkdwn")
    protected List<UpdatedAdditionalInformation26> certfctnBrkdwn;
    @XmlElement(name = "URLAdr")
    protected List<UpdatedURLlnformation7> urlAdr;
    @XmlElement(name = "PrcgTxtForNxtIntrmy")
    protected List<UpdatedAdditionalInformation26> prcgTxtForNxtIntrmy;

    /**
     * Gets the value of the addtlTxt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlTxt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlTxt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdatedAdditionalInformation26 }
     * 
     * 
     */
    public List<UpdatedAdditionalInformation26> getAddtlTxt() {
        if (addtlTxt == null) {
            addtlTxt = new ArrayList<UpdatedAdditionalInformation26>();
        }
        return this.addtlTxt;
    }

    /**
     * Gets the value of the nrrtvVrsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nrrtvVrsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNrrtvVrsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdatedAdditionalInformation26 }
     * 
     * 
     */
    public List<UpdatedAdditionalInformation26> getNrrtvVrsn() {
        if (nrrtvVrsn == null) {
            nrrtvVrsn = new ArrayList<UpdatedAdditionalInformation26>();
        }
        return this.nrrtvVrsn;
    }

    /**
     * Gets the value of the infConds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infConds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfConds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdatedAdditionalInformation26 }
     * 
     * 
     */
    public List<UpdatedAdditionalInformation26> getInfConds() {
        if (infConds == null) {
            infConds = new ArrayList<UpdatedAdditionalInformation26>();
        }
        return this.infConds;
    }

    /**
     * Gets the value of the infToCmplyWth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infToCmplyWth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfToCmplyWth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdatedAdditionalInformation26 }
     * 
     * 
     */
    public List<UpdatedAdditionalInformation26> getInfToCmplyWth() {
        if (infToCmplyWth == null) {
            infToCmplyWth = new ArrayList<UpdatedAdditionalInformation26>();
        }
        return this.infToCmplyWth;
    }

    /**
     * Gets the value of the taxtnConds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxtnConds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxtnConds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdatedAdditionalInformation26 }
     * 
     * 
     */
    public List<UpdatedAdditionalInformation26> getTaxtnConds() {
        if (taxtnConds == null) {
            taxtnConds = new ArrayList<UpdatedAdditionalInformation26>();
        }
        return this.taxtnConds;
    }

    /**
     * Gets the value of the dsclmr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dsclmr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDsclmr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdatedAdditionalInformation26 }
     * 
     * 
     */
    public List<UpdatedAdditionalInformation26> getDsclmr() {
        if (dsclmr == null) {
            dsclmr = new ArrayList<UpdatedAdditionalInformation26>();
        }
        return this.dsclmr;
    }

    /**
     * Gets the value of the ptyCtctNrrtv property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ptyCtctNrrtv property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPtyCtctNrrtv().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdatedAdditionalInformation26 }
     * 
     * 
     */
    public List<UpdatedAdditionalInformation26> getPtyCtctNrrtv() {
        if (ptyCtctNrrtv == null) {
            ptyCtctNrrtv = new ArrayList<UpdatedAdditionalInformation26>();
        }
        return this.ptyCtctNrrtv;
    }

    /**
     * Gets the value of the regnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdatedAdditionalInformation26 }
     * 
     * 
     */
    public List<UpdatedAdditionalInformation26> getRegnDtls() {
        if (regnDtls == null) {
            regnDtls = new ArrayList<UpdatedAdditionalInformation26>();
        }
        return this.regnDtls;
    }

    /**
     * Gets the value of the bsktOrIndxInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bsktOrIndxInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBsktOrIndxInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdatedAdditionalInformation26 }
     * 
     * 
     */
    public List<UpdatedAdditionalInformation26> getBsktOrIndxInf() {
        if (bsktOrIndxInf == null) {
            bsktOrIndxInf = new ArrayList<UpdatedAdditionalInformation26>();
        }
        return this.bsktOrIndxInf;
    }

    /**
     * Gets the value of the certfctnBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certfctnBrkdwn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertfctnBrkdwn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdatedAdditionalInformation26 }
     * 
     * 
     */
    public List<UpdatedAdditionalInformation26> getCertfctnBrkdwn() {
        if (certfctnBrkdwn == null) {
            certfctnBrkdwn = new ArrayList<UpdatedAdditionalInformation26>();
        }
        return this.certfctnBrkdwn;
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
     * {@link UpdatedURLlnformation7 }
     * 
     * 
     */
    public List<UpdatedURLlnformation7> getURLAdr() {
        if (urlAdr == null) {
            urlAdr = new ArrayList<UpdatedURLlnformation7>();
        }
        return this.urlAdr;
    }

    /**
     * Gets the value of the prcgTxtForNxtIntrmy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prcgTxtForNxtIntrmy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrcgTxtForNxtIntrmy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdatedAdditionalInformation26 }
     * 
     * 
     */
    public List<UpdatedAdditionalInformation26> getPrcgTxtForNxtIntrmy() {
        if (prcgTxtForNxtIntrmy == null) {
            prcgTxtForNxtIntrmy = new ArrayList<UpdatedAdditionalInformation26>();
        }
        return this.prcgTxtForNxtIntrmy;
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
     * Adds a new item to the addtlTxt list.
     * @see #getAddtlTxt()
     * 
     */
    public CorporateActionNarrative65 addAddtlTxt(UpdatedAdditionalInformation26 addtlTxt) {
        getAddtlTxt().add(addtlTxt);
        return this;
    }

    /**
     * Adds a new item to the nrrtvVrsn list.
     * @see #getNrrtvVrsn()
     * 
     */
    public CorporateActionNarrative65 addNrrtvVrsn(UpdatedAdditionalInformation26 nrrtvVrsn) {
        getNrrtvVrsn().add(nrrtvVrsn);
        return this;
    }

    /**
     * Adds a new item to the infConds list.
     * @see #getInfConds()
     * 
     */
    public CorporateActionNarrative65 addInfConds(UpdatedAdditionalInformation26 infConds) {
        getInfConds().add(infConds);
        return this;
    }

    /**
     * Adds a new item to the infToCmplyWth list.
     * @see #getInfToCmplyWth()
     * 
     */
    public CorporateActionNarrative65 addInfToCmplyWth(UpdatedAdditionalInformation26 infToCmplyWth) {
        getInfToCmplyWth().add(infToCmplyWth);
        return this;
    }

    /**
     * Adds a new item to the taxtnConds list.
     * @see #getTaxtnConds()
     * 
     */
    public CorporateActionNarrative65 addTaxtnConds(UpdatedAdditionalInformation26 taxtnConds) {
        getTaxtnConds().add(taxtnConds);
        return this;
    }

    /**
     * Adds a new item to the dsclmr list.
     * @see #getDsclmr()
     * 
     */
    public CorporateActionNarrative65 addDsclmr(UpdatedAdditionalInformation26 dsclmr) {
        getDsclmr().add(dsclmr);
        return this;
    }

    /**
     * Adds a new item to the ptyCtctNrrtv list.
     * @see #getPtyCtctNrrtv()
     * 
     */
    public CorporateActionNarrative65 addPtyCtctNrrtv(UpdatedAdditionalInformation26 ptyCtctNrrtv) {
        getPtyCtctNrrtv().add(ptyCtctNrrtv);
        return this;
    }

    /**
     * Adds a new item to the regnDtls list.
     * @see #getRegnDtls()
     * 
     */
    public CorporateActionNarrative65 addRegnDtls(UpdatedAdditionalInformation26 regnDtls) {
        getRegnDtls().add(regnDtls);
        return this;
    }

    /**
     * Adds a new item to the bsktOrIndxInf list.
     * @see #getBsktOrIndxInf()
     * 
     */
    public CorporateActionNarrative65 addBsktOrIndxInf(UpdatedAdditionalInformation26 bsktOrIndxInf) {
        getBsktOrIndxInf().add(bsktOrIndxInf);
        return this;
    }

    /**
     * Adds a new item to the certfctnBrkdwn list.
     * @see #getCertfctnBrkdwn()
     * 
     */
    public CorporateActionNarrative65 addCertfctnBrkdwn(UpdatedAdditionalInformation26 certfctnBrkdwn) {
        getCertfctnBrkdwn().add(certfctnBrkdwn);
        return this;
    }

    /**
     * Adds a new item to the uRLAdr list.
     * @see #getURLAdr()
     * 
     */
    public CorporateActionNarrative65 addURLAdr(UpdatedURLlnformation7 uRLAdr) {
        getURLAdr().add(uRLAdr);
        return this;
    }

    /**
     * Adds a new item to the prcgTxtForNxtIntrmy list.
     * @see #getPrcgTxtForNxtIntrmy()
     * 
     */
    public CorporateActionNarrative65 addPrcgTxtForNxtIntrmy(UpdatedAdditionalInformation26 prcgTxtForNxtIntrmy) {
        getPrcgTxtForNxtIntrmy().add(prcgTxtForNxtIntrmy);
        return this;
    }

}
