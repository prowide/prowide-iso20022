
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
@XmlType(name = "CorporateActionNarrative55", propOrder = {
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
public class CorporateActionNarrative55 {

    @XmlElement(name = "AddtlTxt")
    protected List<UpdatedAdditionalInformation16> addtlTxt;
    @XmlElement(name = "NrrtvVrsn")
    protected List<UpdatedAdditionalInformation16> nrrtvVrsn;
    @XmlElement(name = "InfConds")
    protected List<UpdatedAdditionalInformation16> infConds;
    @XmlElement(name = "InfToCmplyWth")
    protected List<UpdatedAdditionalInformation16> infToCmplyWth;
    @XmlElement(name = "TaxtnConds")
    protected List<UpdatedAdditionalInformation16> taxtnConds;
    @XmlElement(name = "Dsclmr")
    protected List<UpdatedAdditionalInformation16> dsclmr;
    @XmlElement(name = "PtyCtctNrrtv")
    protected List<UpdatedAdditionalInformation16> ptyCtctNrrtv;
    @XmlElement(name = "RegnDtls")
    protected List<UpdatedAdditionalInformation16> regnDtls;
    @XmlElement(name = "BsktOrIndxInf")
    protected List<UpdatedAdditionalInformation16> bsktOrIndxInf;
    @XmlElement(name = "CertfctnBrkdwn")
    protected List<UpdatedAdditionalInformation16> certfctnBrkdwn;
    @XmlElement(name = "URLAdr")
    protected List<UpdatedURLlnformation5> urlAdr;
    @XmlElement(name = "PrcgTxtForNxtIntrmy")
    protected List<UpdatedAdditionalInformation16> prcgTxtForNxtIntrmy;

    /**
     * Gets the value of the addtlTxt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlTxt property.
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
     * {@link UpdatedAdditionalInformation16 }
     * 
     * 
     * @return
     *     The value of the addtlTxt property.
     */
    public List<UpdatedAdditionalInformation16> getAddtlTxt() {
        if (addtlTxt == null) {
            addtlTxt = new ArrayList<>();
        }
        return this.addtlTxt;
    }

    /**
     * Gets the value of the nrrtvVrsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the nrrtvVrsn property.
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
     * {@link UpdatedAdditionalInformation16 }
     * 
     * 
     * @return
     *     The value of the nrrtvVrsn property.
     */
    public List<UpdatedAdditionalInformation16> getNrrtvVrsn() {
        if (nrrtvVrsn == null) {
            nrrtvVrsn = new ArrayList<>();
        }
        return this.nrrtvVrsn;
    }

    /**
     * Gets the value of the infConds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the infConds property.
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
     * {@link UpdatedAdditionalInformation16 }
     * 
     * 
     * @return
     *     The value of the infConds property.
     */
    public List<UpdatedAdditionalInformation16> getInfConds() {
        if (infConds == null) {
            infConds = new ArrayList<>();
        }
        return this.infConds;
    }

    /**
     * Gets the value of the infToCmplyWth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the infToCmplyWth property.
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
     * {@link UpdatedAdditionalInformation16 }
     * 
     * 
     * @return
     *     The value of the infToCmplyWth property.
     */
    public List<UpdatedAdditionalInformation16> getInfToCmplyWth() {
        if (infToCmplyWth == null) {
            infToCmplyWth = new ArrayList<>();
        }
        return this.infToCmplyWth;
    }

    /**
     * Gets the value of the taxtnConds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taxtnConds property.
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
     * {@link UpdatedAdditionalInformation16 }
     * 
     * 
     * @return
     *     The value of the taxtnConds property.
     */
    public List<UpdatedAdditionalInformation16> getTaxtnConds() {
        if (taxtnConds == null) {
            taxtnConds = new ArrayList<>();
        }
        return this.taxtnConds;
    }

    /**
     * Gets the value of the dsclmr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dsclmr property.
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
     * {@link UpdatedAdditionalInformation16 }
     * 
     * 
     * @return
     *     The value of the dsclmr property.
     */
    public List<UpdatedAdditionalInformation16> getDsclmr() {
        if (dsclmr == null) {
            dsclmr = new ArrayList<>();
        }
        return this.dsclmr;
    }

    /**
     * Gets the value of the ptyCtctNrrtv property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ptyCtctNrrtv property.
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
     * {@link UpdatedAdditionalInformation16 }
     * 
     * 
     * @return
     *     The value of the ptyCtctNrrtv property.
     */
    public List<UpdatedAdditionalInformation16> getPtyCtctNrrtv() {
        if (ptyCtctNrrtv == null) {
            ptyCtctNrrtv = new ArrayList<>();
        }
        return this.ptyCtctNrrtv;
    }

    /**
     * Gets the value of the regnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the regnDtls property.
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
     * {@link UpdatedAdditionalInformation16 }
     * 
     * 
     * @return
     *     The value of the regnDtls property.
     */
    public List<UpdatedAdditionalInformation16> getRegnDtls() {
        if (regnDtls == null) {
            regnDtls = new ArrayList<>();
        }
        return this.regnDtls;
    }

    /**
     * Gets the value of the bsktOrIndxInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bsktOrIndxInf property.
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
     * {@link UpdatedAdditionalInformation16 }
     * 
     * 
     * @return
     *     The value of the bsktOrIndxInf property.
     */
    public List<UpdatedAdditionalInformation16> getBsktOrIndxInf() {
        if (bsktOrIndxInf == null) {
            bsktOrIndxInf = new ArrayList<>();
        }
        return this.bsktOrIndxInf;
    }

    /**
     * Gets the value of the certfctnBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the certfctnBrkdwn property.
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
     * {@link UpdatedAdditionalInformation16 }
     * 
     * 
     * @return
     *     The value of the certfctnBrkdwn property.
     */
    public List<UpdatedAdditionalInformation16> getCertfctnBrkdwn() {
        if (certfctnBrkdwn == null) {
            certfctnBrkdwn = new ArrayList<>();
        }
        return this.certfctnBrkdwn;
    }

    /**
     * Gets the value of the urlAdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the urlAdr property.
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
     * {@link UpdatedURLlnformation5 }
     * 
     * 
     * @return
     *     The value of the urlAdr property.
     */
    public List<UpdatedURLlnformation5> getURLAdr() {
        if (urlAdr == null) {
            urlAdr = new ArrayList<>();
        }
        return this.urlAdr;
    }

    /**
     * Gets the value of the prcgTxtForNxtIntrmy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prcgTxtForNxtIntrmy property.
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
     * {@link UpdatedAdditionalInformation16 }
     * 
     * 
     * @return
     *     The value of the prcgTxtForNxtIntrmy property.
     */
    public List<UpdatedAdditionalInformation16> getPrcgTxtForNxtIntrmy() {
        if (prcgTxtForNxtIntrmy == null) {
            prcgTxtForNxtIntrmy = new ArrayList<>();
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
    public CorporateActionNarrative55 addAddtlTxt(UpdatedAdditionalInformation16 addtlTxt) {
        getAddtlTxt().add(addtlTxt);
        return this;
    }

    /**
     * Adds a new item to the nrrtvVrsn list.
     * @see #getNrrtvVrsn()
     * 
     */
    public CorporateActionNarrative55 addNrrtvVrsn(UpdatedAdditionalInformation16 nrrtvVrsn) {
        getNrrtvVrsn().add(nrrtvVrsn);
        return this;
    }

    /**
     * Adds a new item to the infConds list.
     * @see #getInfConds()
     * 
     */
    public CorporateActionNarrative55 addInfConds(UpdatedAdditionalInformation16 infConds) {
        getInfConds().add(infConds);
        return this;
    }

    /**
     * Adds a new item to the infToCmplyWth list.
     * @see #getInfToCmplyWth()
     * 
     */
    public CorporateActionNarrative55 addInfToCmplyWth(UpdatedAdditionalInformation16 infToCmplyWth) {
        getInfToCmplyWth().add(infToCmplyWth);
        return this;
    }

    /**
     * Adds a new item to the taxtnConds list.
     * @see #getTaxtnConds()
     * 
     */
    public CorporateActionNarrative55 addTaxtnConds(UpdatedAdditionalInformation16 taxtnConds) {
        getTaxtnConds().add(taxtnConds);
        return this;
    }

    /**
     * Adds a new item to the dsclmr list.
     * @see #getDsclmr()
     * 
     */
    public CorporateActionNarrative55 addDsclmr(UpdatedAdditionalInformation16 dsclmr) {
        getDsclmr().add(dsclmr);
        return this;
    }

    /**
     * Adds a new item to the ptyCtctNrrtv list.
     * @see #getPtyCtctNrrtv()
     * 
     */
    public CorporateActionNarrative55 addPtyCtctNrrtv(UpdatedAdditionalInformation16 ptyCtctNrrtv) {
        getPtyCtctNrrtv().add(ptyCtctNrrtv);
        return this;
    }

    /**
     * Adds a new item to the regnDtls list.
     * @see #getRegnDtls()
     * 
     */
    public CorporateActionNarrative55 addRegnDtls(UpdatedAdditionalInformation16 regnDtls) {
        getRegnDtls().add(regnDtls);
        return this;
    }

    /**
     * Adds a new item to the bsktOrIndxInf list.
     * @see #getBsktOrIndxInf()
     * 
     */
    public CorporateActionNarrative55 addBsktOrIndxInf(UpdatedAdditionalInformation16 bsktOrIndxInf) {
        getBsktOrIndxInf().add(bsktOrIndxInf);
        return this;
    }

    /**
     * Adds a new item to the certfctnBrkdwn list.
     * @see #getCertfctnBrkdwn()
     * 
     */
    public CorporateActionNarrative55 addCertfctnBrkdwn(UpdatedAdditionalInformation16 certfctnBrkdwn) {
        getCertfctnBrkdwn().add(certfctnBrkdwn);
        return this;
    }

    /**
     * Adds a new item to the uRLAdr list.
     * @see #getURLAdr()
     * 
     */
    public CorporateActionNarrative55 addURLAdr(UpdatedURLlnformation5 uRLAdr) {
        getURLAdr().add(uRLAdr);
        return this;
    }

    /**
     * Adds a new item to the prcgTxtForNxtIntrmy list.
     * @see #getPrcgTxtForNxtIntrmy()
     * 
     */
    public CorporateActionNarrative55 addPrcgTxtForNxtIntrmy(UpdatedAdditionalInformation16 prcgTxtForNxtIntrmy) {
        getPrcgTxtForNxtIntrmy().add(prcgTxtForNxtIntrmy);
        return this;
    }

}
