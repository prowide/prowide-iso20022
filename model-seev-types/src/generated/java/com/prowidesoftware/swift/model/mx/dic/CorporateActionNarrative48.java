
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
@XmlType(name = "CorporateActionNarrative48", propOrder = {
    "addtlTxt",
    "nrrtvVrsn",
    "infConds",
    "infToCmplyWth",
    "sctyRstrctn",
    "taxtnConds",
    "dsclmr",
    "certfctnBrkdwn"
})
public class CorporateActionNarrative48 {

    @XmlElement(name = "AddtlTxt")
    protected List<UpdatedAdditionalInformation14> addtlTxt;
    @XmlElement(name = "NrrtvVrsn")
    protected List<UpdatedAdditionalInformation14> nrrtvVrsn;
    @XmlElement(name = "InfConds")
    protected List<UpdatedAdditionalInformation15> infConds;
    @XmlElement(name = "InfToCmplyWth")
    protected List<UpdatedAdditionalInformation15> infToCmplyWth;
    @XmlElement(name = "SctyRstrctn")
    protected List<UpdatedAdditionalInformation15> sctyRstrctn;
    @XmlElement(name = "TaxtnConds")
    protected List<UpdatedAdditionalInformation15> taxtnConds;
    @XmlElement(name = "Dsclmr")
    protected List<UpdatedAdditionalInformation15> dsclmr;
    @XmlElement(name = "CertfctnBrkdwn")
    protected List<UpdatedAdditionalInformation15> certfctnBrkdwn;

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
     * {@link UpdatedAdditionalInformation14 }
     * 
     * 
     * @return
     *     The value of the addtlTxt property.
     */
    public List<UpdatedAdditionalInformation14> getAddtlTxt() {
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
     * {@link UpdatedAdditionalInformation14 }
     * 
     * 
     * @return
     *     The value of the nrrtvVrsn property.
     */
    public List<UpdatedAdditionalInformation14> getNrrtvVrsn() {
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
     * {@link UpdatedAdditionalInformation15 }
     * 
     * 
     * @return
     *     The value of the infConds property.
     */
    public List<UpdatedAdditionalInformation15> getInfConds() {
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
     * {@link UpdatedAdditionalInformation15 }
     * 
     * 
     * @return
     *     The value of the infToCmplyWth property.
     */
    public List<UpdatedAdditionalInformation15> getInfToCmplyWth() {
        if (infToCmplyWth == null) {
            infToCmplyWth = new ArrayList<>();
        }
        return this.infToCmplyWth;
    }

    /**
     * Gets the value of the sctyRstrctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctyRstrctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctyRstrctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdatedAdditionalInformation15 }
     * 
     * 
     * @return
     *     The value of the sctyRstrctn property.
     */
    public List<UpdatedAdditionalInformation15> getSctyRstrctn() {
        if (sctyRstrctn == null) {
            sctyRstrctn = new ArrayList<>();
        }
        return this.sctyRstrctn;
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
     * {@link UpdatedAdditionalInformation15 }
     * 
     * 
     * @return
     *     The value of the taxtnConds property.
     */
    public List<UpdatedAdditionalInformation15> getTaxtnConds() {
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
     * {@link UpdatedAdditionalInformation15 }
     * 
     * 
     * @return
     *     The value of the dsclmr property.
     */
    public List<UpdatedAdditionalInformation15> getDsclmr() {
        if (dsclmr == null) {
            dsclmr = new ArrayList<>();
        }
        return this.dsclmr;
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
     * {@link UpdatedAdditionalInformation15 }
     * 
     * 
     * @return
     *     The value of the certfctnBrkdwn property.
     */
    public List<UpdatedAdditionalInformation15> getCertfctnBrkdwn() {
        if (certfctnBrkdwn == null) {
            certfctnBrkdwn = new ArrayList<>();
        }
        return this.certfctnBrkdwn;
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
    public CorporateActionNarrative48 addAddtlTxt(UpdatedAdditionalInformation14 addtlTxt) {
        getAddtlTxt().add(addtlTxt);
        return this;
    }

    /**
     * Adds a new item to the nrrtvVrsn list.
     * @see #getNrrtvVrsn()
     * 
     */
    public CorporateActionNarrative48 addNrrtvVrsn(UpdatedAdditionalInformation14 nrrtvVrsn) {
        getNrrtvVrsn().add(nrrtvVrsn);
        return this;
    }

    /**
     * Adds a new item to the infConds list.
     * @see #getInfConds()
     * 
     */
    public CorporateActionNarrative48 addInfConds(UpdatedAdditionalInformation15 infConds) {
        getInfConds().add(infConds);
        return this;
    }

    /**
     * Adds a new item to the infToCmplyWth list.
     * @see #getInfToCmplyWth()
     * 
     */
    public CorporateActionNarrative48 addInfToCmplyWth(UpdatedAdditionalInformation15 infToCmplyWth) {
        getInfToCmplyWth().add(infToCmplyWth);
        return this;
    }

    /**
     * Adds a new item to the sctyRstrctn list.
     * @see #getSctyRstrctn()
     * 
     */
    public CorporateActionNarrative48 addSctyRstrctn(UpdatedAdditionalInformation15 sctyRstrctn) {
        getSctyRstrctn().add(sctyRstrctn);
        return this;
    }

    /**
     * Adds a new item to the taxtnConds list.
     * @see #getTaxtnConds()
     * 
     */
    public CorporateActionNarrative48 addTaxtnConds(UpdatedAdditionalInformation15 taxtnConds) {
        getTaxtnConds().add(taxtnConds);
        return this;
    }

    /**
     * Adds a new item to the dsclmr list.
     * @see #getDsclmr()
     * 
     */
    public CorporateActionNarrative48 addDsclmr(UpdatedAdditionalInformation15 dsclmr) {
        getDsclmr().add(dsclmr);
        return this;
    }

    /**
     * Adds a new item to the certfctnBrkdwn list.
     * @see #getCertfctnBrkdwn()
     * 
     */
    public CorporateActionNarrative48 addCertfctnBrkdwn(UpdatedAdditionalInformation15 certfctnBrkdwn) {
        getCertfctnBrkdwn().add(certfctnBrkdwn);
        return this;
    }

}
