
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
 * Scope
 * The CorporateActionCancellationAdvice message is sent by an account servicer to an account owner or its designated agent to cancel a previously announced corporate action event in case of error from the account servicer or in case of withdrawal by the issuer.
 * Usage
 * The message may also be used to:
 * - re-send a message previously sent (the sub-function of the message is Duplicate),
 * - provide a third party with a copy of a message for information (the sub-function of the message is Copy),
 * - re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate), using the relevant elements in the business application header (BAH).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionCancellationAdvice002V11", propOrder = {
    "cxlAdvcGnlInf",
    "corpActnGnlInf",
    "acctsDtls",
    "corpActnDtls",
    "addtlTxt",
    "issrAgt",
    "pngAgt",
    "subPngAgt",
    "regar",
    "rsellngAgt",
    "physSctiesAgt",
    "drpAgt",
    "slctnAgt",
    "infAgt",
    "splmtryData"
})
public class CorporateActionCancellationAdvice002V11 {

    @XmlElement(name = "CxlAdvcGnlInf", required = true)
    protected CorporateActionCancellation4 cxlAdvcGnlInf;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionGeneralInformation143 corpActnGnlInf;
    @XmlElement(name = "AcctsDtls", required = true)
    protected AccountIdentification50Choice acctsDtls;
    @XmlElement(name = "CorpActnDtls")
    protected CorporateAction46 corpActnDtls;
    @XmlElement(name = "AddtlTxt")
    protected List<String> addtlTxt;
    @XmlElement(name = "IssrAgt")
    protected List<PartyIdentification137Choice> issrAgt;
    @XmlElement(name = "PngAgt")
    protected List<PartyIdentification137Choice> pngAgt;
    @XmlElement(name = "SubPngAgt")
    protected List<PartyIdentification137Choice> subPngAgt;
    @XmlElement(name = "Regar")
    protected PartyIdentification137Choice regar;
    @XmlElement(name = "RsellngAgt")
    protected List<PartyIdentification137Choice> rsellngAgt;
    @XmlElement(name = "PhysSctiesAgt")
    protected PartyIdentification137Choice physSctiesAgt;
    @XmlElement(name = "DrpAgt")
    protected PartyIdentification137Choice drpAgt;
    @XmlElement(name = "SlctnAgt")
    protected List<PartyIdentification137Choice> slctnAgt;
    @XmlElement(name = "InfAgt")
    protected PartyIdentification137Choice infAgt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the cxlAdvcGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionCancellation4 }
     *     
     */
    public CorporateActionCancellation4 getCxlAdvcGnlInf() {
        return cxlAdvcGnlInf;
    }

    /**
     * Sets the value of the cxlAdvcGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionCancellation4 }
     *     
     */
    public CorporateActionCancellationAdvice002V11 setCxlAdvcGnlInf(CorporateActionCancellation4 value) {
        this.cxlAdvcGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformation143 }
     *     
     */
    public CorporateActionGeneralInformation143 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformation143 }
     *     
     */
    public CorporateActionCancellationAdvice002V11 setCorpActnGnlInf(CorporateActionGeneralInformation143 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the acctsDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification50Choice }
     *     
     */
    public AccountIdentification50Choice getAcctsDtls() {
        return acctsDtls;
    }

    /**
     * Sets the value of the acctsDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification50Choice }
     *     
     */
    public CorporateActionCancellationAdvice002V11 setAcctsDtls(AccountIdentification50Choice value) {
        this.acctsDtls = value;
        return this;
    }

    /**
     * Gets the value of the corpActnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateAction46 }
     *     
     */
    public CorporateAction46 getCorpActnDtls() {
        return corpActnDtls;
    }

    /**
     * Sets the value of the corpActnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateAction46 }
     *     
     */
    public CorporateActionCancellationAdvice002V11 setCorpActnDtls(CorporateAction46 value) {
        this.corpActnDtls = value;
        return this;
    }

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
     * {@link String }
     * 
     * 
     * @return
     *     The value of the addtlTxt property.
     */
    public List<String> getAddtlTxt() {
        if (addtlTxt == null) {
            addtlTxt = new ArrayList<>();
        }
        return this.addtlTxt;
    }

    /**
     * Gets the value of the issrAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the issrAgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssrAgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification137Choice }
     * 
     * 
     * @return
     *     The value of the issrAgt property.
     */
    public List<PartyIdentification137Choice> getIssrAgt() {
        if (issrAgt == null) {
            issrAgt = new ArrayList<>();
        }
        return this.issrAgt;
    }

    /**
     * Gets the value of the pngAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pngAgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPngAgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification137Choice }
     * 
     * 
     * @return
     *     The value of the pngAgt property.
     */
    public List<PartyIdentification137Choice> getPngAgt() {
        if (pngAgt == null) {
            pngAgt = new ArrayList<>();
        }
        return this.pngAgt;
    }

    /**
     * Gets the value of the subPngAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the subPngAgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubPngAgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification137Choice }
     * 
     * 
     * @return
     *     The value of the subPngAgt property.
     */
    public List<PartyIdentification137Choice> getSubPngAgt() {
        if (subPngAgt == null) {
            subPngAgt = new ArrayList<>();
        }
        return this.subPngAgt;
    }

    /**
     * Gets the value of the regar property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification137Choice }
     *     
     */
    public PartyIdentification137Choice getRegar() {
        return regar;
    }

    /**
     * Sets the value of the regar property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification137Choice }
     *     
     */
    public CorporateActionCancellationAdvice002V11 setRegar(PartyIdentification137Choice value) {
        this.regar = value;
        return this;
    }

    /**
     * Gets the value of the rsellngAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rsellngAgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRsellngAgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification137Choice }
     * 
     * 
     * @return
     *     The value of the rsellngAgt property.
     */
    public List<PartyIdentification137Choice> getRsellngAgt() {
        if (rsellngAgt == null) {
            rsellngAgt = new ArrayList<>();
        }
        return this.rsellngAgt;
    }

    /**
     * Gets the value of the physSctiesAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification137Choice }
     *     
     */
    public PartyIdentification137Choice getPhysSctiesAgt() {
        return physSctiesAgt;
    }

    /**
     * Sets the value of the physSctiesAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification137Choice }
     *     
     */
    public CorporateActionCancellationAdvice002V11 setPhysSctiesAgt(PartyIdentification137Choice value) {
        this.physSctiesAgt = value;
        return this;
    }

    /**
     * Gets the value of the drpAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification137Choice }
     *     
     */
    public PartyIdentification137Choice getDrpAgt() {
        return drpAgt;
    }

    /**
     * Sets the value of the drpAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification137Choice }
     *     
     */
    public CorporateActionCancellationAdvice002V11 setDrpAgt(PartyIdentification137Choice value) {
        this.drpAgt = value;
        return this;
    }

    /**
     * Gets the value of the slctnAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the slctnAgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSlctnAgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification137Choice }
     * 
     * 
     * @return
     *     The value of the slctnAgt property.
     */
    public List<PartyIdentification137Choice> getSlctnAgt() {
        if (slctnAgt == null) {
            slctnAgt = new ArrayList<>();
        }
        return this.slctnAgt;
    }

    /**
     * Gets the value of the infAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification137Choice }
     *     
     */
    public PartyIdentification137Choice getInfAgt() {
        return infAgt;
    }

    /**
     * Sets the value of the infAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification137Choice }
     *     
     */
    public CorporateActionCancellationAdvice002V11 setInfAgt(PartyIdentification137Choice value) {
        this.infAgt = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
        }
        return this.splmtryData;
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
    public CorporateActionCancellationAdvice002V11 addAddtlTxt(String addtlTxt) {
        getAddtlTxt().add(addtlTxt);
        return this;
    }

    /**
     * Adds a new item to the issrAgt list.
     * @see #getIssrAgt()
     * 
     */
    public CorporateActionCancellationAdvice002V11 addIssrAgt(PartyIdentification137Choice issrAgt) {
        getIssrAgt().add(issrAgt);
        return this;
    }

    /**
     * Adds a new item to the pngAgt list.
     * @see #getPngAgt()
     * 
     */
    public CorporateActionCancellationAdvice002V11 addPngAgt(PartyIdentification137Choice pngAgt) {
        getPngAgt().add(pngAgt);
        return this;
    }

    /**
     * Adds a new item to the subPngAgt list.
     * @see #getSubPngAgt()
     * 
     */
    public CorporateActionCancellationAdvice002V11 addSubPngAgt(PartyIdentification137Choice subPngAgt) {
        getSubPngAgt().add(subPngAgt);
        return this;
    }

    /**
     * Adds a new item to the rsellngAgt list.
     * @see #getRsellngAgt()
     * 
     */
    public CorporateActionCancellationAdvice002V11 addRsellngAgt(PartyIdentification137Choice rsellngAgt) {
        getRsellngAgt().add(rsellngAgt);
        return this;
    }

    /**
     * Adds a new item to the slctnAgt list.
     * @see #getSlctnAgt()
     * 
     */
    public CorporateActionCancellationAdvice002V11 addSlctnAgt(PartyIdentification137Choice slctnAgt) {
        getSlctnAgt().add(slctnAgt);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public CorporateActionCancellationAdvice002V11 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
