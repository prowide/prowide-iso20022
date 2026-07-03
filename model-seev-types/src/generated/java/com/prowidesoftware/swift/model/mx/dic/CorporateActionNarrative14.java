
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
@XmlType(name = "CorporateActionNarrative14", propOrder = {
    "dclrtnDtls",
    "addtlTxt",
    "nrrtvVrsn",
    "regnDtls",
    "infConds",
    "infToCmplyWth",
    "ptyCtctNrrtv",
    "taxtnConds",
    "bsktOrIndxInf"
})
public class CorporateActionNarrative14 {

    @XmlElement(name = "DclrtnDtls")
    protected List<String> dclrtnDtls;
    @XmlElement(name = "AddtlTxt")
    protected List<String> addtlTxt;
    @XmlElement(name = "NrrtvVrsn")
    protected List<String> nrrtvVrsn;
    @XmlElement(name = "RegnDtls")
    protected List<String> regnDtls;
    @XmlElement(name = "InfConds")
    protected List<String> infConds;
    @XmlElement(name = "InfToCmplyWth")
    protected List<String> infToCmplyWth;
    @XmlElement(name = "PtyCtctNrrtv")
    protected List<String> ptyCtctNrrtv;
    @XmlElement(name = "TaxtnConds")
    protected List<String> taxtnConds;
    @XmlElement(name = "BsktOrIndxInf")
    protected List<String> bsktOrIndxInf;

    /**
     * Gets the value of the dclrtnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dclrtnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDclrtnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDclrtnDtls() {
        if (dclrtnDtls == null) {
            dclrtnDtls = new ArrayList<String>();
        }
        return this.dclrtnDtls;
    }

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
     * {@link String }
     * 
     * 
     */
    public List<String> getAddtlTxt() {
        if (addtlTxt == null) {
            addtlTxt = new ArrayList<String>();
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
     * {@link String }
     * 
     * 
     */
    public List<String> getNrrtvVrsn() {
        if (nrrtvVrsn == null) {
            nrrtvVrsn = new ArrayList<String>();
        }
        return this.nrrtvVrsn;
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
     * {@link String }
     * 
     * 
     */
    public List<String> getRegnDtls() {
        if (regnDtls == null) {
            regnDtls = new ArrayList<String>();
        }
        return this.regnDtls;
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
     * {@link String }
     * 
     * 
     */
    public List<String> getInfConds() {
        if (infConds == null) {
            infConds = new ArrayList<String>();
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
     * {@link String }
     * 
     * 
     */
    public List<String> getInfToCmplyWth() {
        if (infToCmplyWth == null) {
            infToCmplyWth = new ArrayList<String>();
        }
        return this.infToCmplyWth;
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
     * {@link String }
     * 
     * 
     */
    public List<String> getPtyCtctNrrtv() {
        if (ptyCtctNrrtv == null) {
            ptyCtctNrrtv = new ArrayList<String>();
        }
        return this.ptyCtctNrrtv;
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
     * {@link String }
     * 
     * 
     */
    public List<String> getTaxtnConds() {
        if (taxtnConds == null) {
            taxtnConds = new ArrayList<String>();
        }
        return this.taxtnConds;
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
     * {@link String }
     * 
     * 
     */
    public List<String> getBsktOrIndxInf() {
        if (bsktOrIndxInf == null) {
            bsktOrIndxInf = new ArrayList<String>();
        }
        return this.bsktOrIndxInf;
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
     * Adds a new item to the dclrtnDtls list.
     * @see #getDclrtnDtls()
     * 
     */
    public CorporateActionNarrative14 addDclrtnDtls(String dclrtnDtls) {
        getDclrtnDtls().add(dclrtnDtls);
        return this;
    }

    /**
     * Adds a new item to the addtlTxt list.
     * @see #getAddtlTxt()
     * 
     */
    public CorporateActionNarrative14 addAddtlTxt(String addtlTxt) {
        getAddtlTxt().add(addtlTxt);
        return this;
    }

    /**
     * Adds a new item to the nrrtvVrsn list.
     * @see #getNrrtvVrsn()
     * 
     */
    public CorporateActionNarrative14 addNrrtvVrsn(String nrrtvVrsn) {
        getNrrtvVrsn().add(nrrtvVrsn);
        return this;
    }

    /**
     * Adds a new item to the regnDtls list.
     * @see #getRegnDtls()
     * 
     */
    public CorporateActionNarrative14 addRegnDtls(String regnDtls) {
        getRegnDtls().add(regnDtls);
        return this;
    }

    /**
     * Adds a new item to the infConds list.
     * @see #getInfConds()
     * 
     */
    public CorporateActionNarrative14 addInfConds(String infConds) {
        getInfConds().add(infConds);
        return this;
    }

    /**
     * Adds a new item to the infToCmplyWth list.
     * @see #getInfToCmplyWth()
     * 
     */
    public CorporateActionNarrative14 addInfToCmplyWth(String infToCmplyWth) {
        getInfToCmplyWth().add(infToCmplyWth);
        return this;
    }

    /**
     * Adds a new item to the ptyCtctNrrtv list.
     * @see #getPtyCtctNrrtv()
     * 
     */
    public CorporateActionNarrative14 addPtyCtctNrrtv(String ptyCtctNrrtv) {
        getPtyCtctNrrtv().add(ptyCtctNrrtv);
        return this;
    }

    /**
     * Adds a new item to the taxtnConds list.
     * @see #getTaxtnConds()
     * 
     */
    public CorporateActionNarrative14 addTaxtnConds(String taxtnConds) {
        getTaxtnConds().add(taxtnConds);
        return this;
    }

    /**
     * Adds a new item to the bsktOrIndxInf list.
     * @see #getBsktOrIndxInf()
     * 
     */
    public CorporateActionNarrative14 addBsktOrIndxInf(String bsktOrIndxInf) {
        getBsktOrIndxInf().add(bsktOrIndxInf);
        return this;
    }

}
