
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
 * Scope
 * An account servicer sends the CorporateActionMovementPreliminaryAdviceCancellationAdvice message to an account owner or its designated agent to cancel a previously announced CorporateActionMovementPreliminaryAdvice.
 * Usage
 * The message may also be used to:
 * - re-send a message previously sent (the sub-function of the message is Duplicate),
 * - provide a third party with a copy of a message for information (the sub-function of the message is Copy),
 * - re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate),
 * using the relevant elements in the business application header (BAH).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07", propOrder = {
    "mvmntPrlimryAdvcId",
    "corpActnGnlInf",
    "acctDtls",
    "corpActnDtls",
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
public class CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07 {

    @XmlElement(name = "MvmntPrlimryAdvcId", required = true)
    protected DocumentIdentification37 mvmntPrlimryAdvcId;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionGeneralInformation123 corpActnGnlInf;
    @XmlElement(name = "AcctDtls", required = true)
    protected AccountIdentification34Choice acctDtls;
    @XmlElement(name = "CorpActnDtls")
    protected CorporateAction35 corpActnDtls;
    @XmlElement(name = "IssrAgt")
    protected List<PartyIdentification104Choice> issrAgt;
    @XmlElement(name = "PngAgt")
    protected List<PartyIdentification104Choice> pngAgt;
    @XmlElement(name = "SubPngAgt")
    protected List<PartyIdentification104Choice> subPngAgt;
    @XmlElement(name = "Regar")
    protected PartyIdentification104Choice regar;
    @XmlElement(name = "RsellngAgt")
    protected List<PartyIdentification104Choice> rsellngAgt;
    @XmlElement(name = "PhysSctiesAgt")
    protected PartyIdentification104Choice physSctiesAgt;
    @XmlElement(name = "DrpAgt")
    protected PartyIdentification104Choice drpAgt;
    @XmlElement(name = "SlctnAgt")
    protected List<PartyIdentification104Choice> slctnAgt;
    @XmlElement(name = "InfAgt")
    protected PartyIdentification104Choice infAgt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the mvmntPrlimryAdvcId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification37 }
     *     
     */
    public DocumentIdentification37 getMvmntPrlimryAdvcId() {
        return mvmntPrlimryAdvcId;
    }

    /**
     * Sets the value of the mvmntPrlimryAdvcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification37 }
     *     
     */
    public CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07 setMvmntPrlimryAdvcId(DocumentIdentification37 value) {
        this.mvmntPrlimryAdvcId = value;
        return this;
    }

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformation123 }
     *     
     */
    public CorporateActionGeneralInformation123 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformation123 }
     *     
     */
    public CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07 setCorpActnGnlInf(CorporateActionGeneralInformation123 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the acctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification34Choice }
     *     
     */
    public AccountIdentification34Choice getAcctDtls() {
        return acctDtls;
    }

    /**
     * Sets the value of the acctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification34Choice }
     *     
     */
    public CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07 setAcctDtls(AccountIdentification34Choice value) {
        this.acctDtls = value;
        return this;
    }

    /**
     * Gets the value of the corpActnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateAction35 }
     *     
     */
    public CorporateAction35 getCorpActnDtls() {
        return corpActnDtls;
    }

    /**
     * Sets the value of the corpActnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateAction35 }
     *     
     */
    public CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07 setCorpActnDtls(CorporateAction35 value) {
        this.corpActnDtls = value;
        return this;
    }

    /**
     * Gets the value of the issrAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issrAgt property.
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
     * {@link PartyIdentification104Choice }
     * 
     * 
     */
    public List<PartyIdentification104Choice> getIssrAgt() {
        if (issrAgt == null) {
            issrAgt = new ArrayList<PartyIdentification104Choice>();
        }
        return this.issrAgt;
    }

    /**
     * Gets the value of the pngAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pngAgt property.
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
     * {@link PartyIdentification104Choice }
     * 
     * 
     */
    public List<PartyIdentification104Choice> getPngAgt() {
        if (pngAgt == null) {
            pngAgt = new ArrayList<PartyIdentification104Choice>();
        }
        return this.pngAgt;
    }

    /**
     * Gets the value of the subPngAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subPngAgt property.
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
     * {@link PartyIdentification104Choice }
     * 
     * 
     */
    public List<PartyIdentification104Choice> getSubPngAgt() {
        if (subPngAgt == null) {
            subPngAgt = new ArrayList<PartyIdentification104Choice>();
        }
        return this.subPngAgt;
    }

    /**
     * Gets the value of the regar property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification104Choice }
     *     
     */
    public PartyIdentification104Choice getRegar() {
        return regar;
    }

    /**
     * Sets the value of the regar property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification104Choice }
     *     
     */
    public CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07 setRegar(PartyIdentification104Choice value) {
        this.regar = value;
        return this;
    }

    /**
     * Gets the value of the rsellngAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rsellngAgt property.
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
     * {@link PartyIdentification104Choice }
     * 
     * 
     */
    public List<PartyIdentification104Choice> getRsellngAgt() {
        if (rsellngAgt == null) {
            rsellngAgt = new ArrayList<PartyIdentification104Choice>();
        }
        return this.rsellngAgt;
    }

    /**
     * Gets the value of the physSctiesAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification104Choice }
     *     
     */
    public PartyIdentification104Choice getPhysSctiesAgt() {
        return physSctiesAgt;
    }

    /**
     * Sets the value of the physSctiesAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification104Choice }
     *     
     */
    public CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07 setPhysSctiesAgt(PartyIdentification104Choice value) {
        this.physSctiesAgt = value;
        return this;
    }

    /**
     * Gets the value of the drpAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification104Choice }
     *     
     */
    public PartyIdentification104Choice getDrpAgt() {
        return drpAgt;
    }

    /**
     * Sets the value of the drpAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification104Choice }
     *     
     */
    public CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07 setDrpAgt(PartyIdentification104Choice value) {
        this.drpAgt = value;
        return this;
    }

    /**
     * Gets the value of the slctnAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the slctnAgt property.
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
     * {@link PartyIdentification104Choice }
     * 
     * 
     */
    public List<PartyIdentification104Choice> getSlctnAgt() {
        if (slctnAgt == null) {
            slctnAgt = new ArrayList<PartyIdentification104Choice>();
        }
        return this.slctnAgt;
    }

    /**
     * Gets the value of the infAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification104Choice }
     *     
     */
    public PartyIdentification104Choice getInfAgt() {
        return infAgt;
    }

    /**
     * Sets the value of the infAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification104Choice }
     *     
     */
    public CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07 setInfAgt(PartyIdentification104Choice value) {
        this.infAgt = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
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
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
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
     * Adds a new item to the issrAgt list.
     * @see #getIssrAgt()
     * 
     */
    public CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07 addIssrAgt(PartyIdentification104Choice issrAgt) {
        getIssrAgt().add(issrAgt);
        return this;
    }

    /**
     * Adds a new item to the pngAgt list.
     * @see #getPngAgt()
     * 
     */
    public CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07 addPngAgt(PartyIdentification104Choice pngAgt) {
        getPngAgt().add(pngAgt);
        return this;
    }

    /**
     * Adds a new item to the subPngAgt list.
     * @see #getSubPngAgt()
     * 
     */
    public CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07 addSubPngAgt(PartyIdentification104Choice subPngAgt) {
        getSubPngAgt().add(subPngAgt);
        return this;
    }

    /**
     * Adds a new item to the rsellngAgt list.
     * @see #getRsellngAgt()
     * 
     */
    public CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07 addRsellngAgt(PartyIdentification104Choice rsellngAgt) {
        getRsellngAgt().add(rsellngAgt);
        return this;
    }

    /**
     * Adds a new item to the slctnAgt list.
     * @see #getSlctnAgt()
     * 
     */
    public CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07 addSlctnAgt(PartyIdentification104Choice slctnAgt) {
        getSlctnAgt().add(slctnAgt);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public CorporateActionMovementPreliminaryAdviceCancellationAdvice002V07 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
