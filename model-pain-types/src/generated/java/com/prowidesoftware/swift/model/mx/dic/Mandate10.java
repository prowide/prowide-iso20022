
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
 * Information that serves as a basis to debit an account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mandate10", propOrder = {
    "mndtId",
    "mndtReqId",
    "authntcn",
    "tp",
    "ocrncs",
    "trckgInd",
    "frstColltnAmt",
    "colltnAmt",
    "maxAmt",
    "adjstmnt",
    "rsn",
    "cdtrSchmeId",
    "cdtr",
    "cdtrAcct",
    "cdtrAgt",
    "ultmtCdtr",
    "dbtr",
    "dbtrAcct",
    "dbtrAgt",
    "ultmtDbtr",
    "mndtRef",
    "rfrdDoc",
    "splmtryData"
})
public class Mandate10 {

    @XmlElement(name = "MndtId")
    protected List<String> mndtId;
    @XmlElement(name = "MndtReqId", required = true)
    protected String mndtReqId;
    @XmlElement(name = "Authntcn")
    protected MandateAuthentication1 authntcn;
    @XmlElement(name = "Tp")
    protected MandateTypeInformation2 tp;
    @XmlElement(name = "Ocrncs")
    protected MandateOccurrences4 ocrncs;
    @XmlElement(name = "TrckgInd")
    protected boolean trckgInd;
    @XmlElement(name = "FrstColltnAmt")
    protected ActiveCurrencyAndAmount frstColltnAmt;
    @XmlElement(name = "ColltnAmt")
    protected ActiveCurrencyAndAmount colltnAmt;
    @XmlElement(name = "MaxAmt")
    protected ActiveCurrencyAndAmount maxAmt;
    @XmlElement(name = "Adjstmnt")
    protected MandateAdjustment1 adjstmnt;
    @XmlElement(name = "Rsn")
    protected MandateSetupReason1Choice rsn;
    @XmlElement(name = "CdtrSchmeId")
    protected PartyIdentification43 cdtrSchmeId;
    @XmlElement(name = "Cdtr", required = true)
    protected PartyIdentification43 cdtr;
    @XmlElement(name = "CdtrAcct")
    protected CashAccount24 cdtrAcct;
    @XmlElement(name = "CdtrAgt")
    protected BranchAndFinancialInstitutionIdentification5 cdtrAgt;
    @XmlElement(name = "UltmtCdtr")
    protected PartyIdentification43 ultmtCdtr;
    @XmlElement(name = "Dbtr", required = true)
    protected PartyIdentification43 dbtr;
    @XmlElement(name = "DbtrAcct")
    protected CashAccount24 dbtrAcct;
    @XmlElement(name = "DbtrAgt", required = true)
    protected BranchAndFinancialInstitutionIdentification5 dbtrAgt;
    @XmlElement(name = "UltmtDbtr")
    protected PartyIdentification43 ultmtDbtr;
    @XmlElement(name = "MndtRef")
    protected String mndtRef;
    @XmlElement(name = "RfrdDoc")
    protected List<ReferredMandateDocument1> rfrdDoc;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the mndtId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mndtId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMndtId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMndtId() {
        if (mndtId == null) {
            mndtId = new ArrayList<String>();
        }
        return this.mndtId;
    }

    /**
     * Gets the value of the mndtReqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMndtReqId() {
        return mndtReqId;
    }

    /**
     * Sets the value of the mndtReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Mandate10 setMndtReqId(String value) {
        this.mndtReqId = value;
        return this;
    }

    /**
     * Gets the value of the authntcn property.
     * 
     * @return
     *     possible object is
     *     {@link MandateAuthentication1 }
     *     
     */
    public MandateAuthentication1 getAuthntcn() {
        return authntcn;
    }

    /**
     * Sets the value of the authntcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateAuthentication1 }
     *     
     */
    public Mandate10 setAuthntcn(MandateAuthentication1 value) {
        this.authntcn = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link MandateTypeInformation2 }
     *     
     */
    public MandateTypeInformation2 getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateTypeInformation2 }
     *     
     */
    public Mandate10 setTp(MandateTypeInformation2 value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the ocrncs property.
     * 
     * @return
     *     possible object is
     *     {@link MandateOccurrences4 }
     *     
     */
    public MandateOccurrences4 getOcrncs() {
        return ocrncs;
    }

    /**
     * Sets the value of the ocrncs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateOccurrences4 }
     *     
     */
    public Mandate10 setOcrncs(MandateOccurrences4 value) {
        this.ocrncs = value;
        return this;
    }

    /**
     * Gets the value of the trckgInd property.
     * 
     */
    public boolean isTrckgInd() {
        return trckgInd;
    }

    /**
     * Sets the value of the trckgInd property.
     * 
     */
    public Mandate10 setTrckgInd(boolean value) {
        this.trckgInd = value;
        return this;
    }

    /**
     * Gets the value of the frstColltnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getFrstColltnAmt() {
        return frstColltnAmt;
    }

    /**
     * Sets the value of the frstColltnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Mandate10 setFrstColltnAmt(ActiveCurrencyAndAmount value) {
        this.frstColltnAmt = value;
        return this;
    }

    /**
     * Gets the value of the colltnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getColltnAmt() {
        return colltnAmt;
    }

    /**
     * Sets the value of the colltnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Mandate10 setColltnAmt(ActiveCurrencyAndAmount value) {
        this.colltnAmt = value;
        return this;
    }

    /**
     * Gets the value of the maxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getMaxAmt() {
        return maxAmt;
    }

    /**
     * Sets the value of the maxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Mandate10 setMaxAmt(ActiveCurrencyAndAmount value) {
        this.maxAmt = value;
        return this;
    }

    /**
     * Gets the value of the adjstmnt property.
     * 
     * @return
     *     possible object is
     *     {@link MandateAdjustment1 }
     *     
     */
    public MandateAdjustment1 getAdjstmnt() {
        return adjstmnt;
    }

    /**
     * Sets the value of the adjstmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateAdjustment1 }
     *     
     */
    public Mandate10 setAdjstmnt(MandateAdjustment1 value) {
        this.adjstmnt = value;
        return this;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link MandateSetupReason1Choice }
     *     
     */
    public MandateSetupReason1Choice getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateSetupReason1Choice }
     *     
     */
    public Mandate10 setRsn(MandateSetupReason1Choice value) {
        this.rsn = value;
        return this;
    }

    /**
     * Gets the value of the cdtrSchmeId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getCdtrSchmeId() {
        return cdtrSchmeId;
    }

    /**
     * Sets the value of the cdtrSchmeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public Mandate10 setCdtrSchmeId(PartyIdentification43 value) {
        this.cdtrSchmeId = value;
        return this;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public Mandate10 setCdtr(PartyIdentification43 value) {
        this.cdtr = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount24 }
     *     
     */
    public CashAccount24 getCdtrAcct() {
        return cdtrAcct;
    }

    /**
     * Sets the value of the cdtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount24 }
     *     
     */
    public Mandate10 setCdtrAcct(CashAccount24 value) {
        this.cdtrAcct = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification5 getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Sets the value of the cdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public Mandate10 setCdtrAgt(BranchAndFinancialInstitutionIdentification5 value) {
        this.cdtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the ultmtCdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getUltmtCdtr() {
        return ultmtCdtr;
    }

    /**
     * Sets the value of the ultmtCdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public Mandate10 setUltmtCdtr(PartyIdentification43 value) {
        this.ultmtCdtr = value;
        return this;
    }

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public Mandate10 setDbtr(PartyIdentification43 value) {
        this.dbtr = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount24 }
     *     
     */
    public CashAccount24 getDbtrAcct() {
        return dbtrAcct;
    }

    /**
     * Sets the value of the dbtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount24 }
     *     
     */
    public Mandate10 setDbtrAcct(CashAccount24 value) {
        this.dbtrAcct = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification5 getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Sets the value of the dbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public Mandate10 setDbtrAgt(BranchAndFinancialInstitutionIdentification5 value) {
        this.dbtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the ultmtDbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getUltmtDbtr() {
        return ultmtDbtr;
    }

    /**
     * Sets the value of the ultmtDbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public Mandate10 setUltmtDbtr(PartyIdentification43 value) {
        this.ultmtDbtr = value;
        return this;
    }

    /**
     * Gets the value of the mndtRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMndtRef() {
        return mndtRef;
    }

    /**
     * Sets the value of the mndtRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Mandate10 setMndtRef(String value) {
        this.mndtRef = value;
        return this;
    }

    /**
     * Gets the value of the rfrdDoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rfrdDoc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRfrdDoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferredMandateDocument1 }
     * 
     * 
     */
    public List<ReferredMandateDocument1> getRfrdDoc() {
        if (rfrdDoc == null) {
            rfrdDoc = new ArrayList<ReferredMandateDocument1>();
        }
        return this.rfrdDoc;
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
     * Adds a new item to the mndtId list.
     * @see #getMndtId()
     * 
     */
    public Mandate10 addMndtId(String mndtId) {
        getMndtId().add(mndtId);
        return this;
    }

    /**
     * Adds a new item to the rfrdDoc list.
     * @see #getRfrdDoc()
     * 
     */
    public Mandate10 addRfrdDoc(ReferredMandateDocument1 rfrdDoc) {
        getRfrdDoc().add(rfrdDoc);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public Mandate10 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
