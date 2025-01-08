
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
@XmlType(name = "Mandate23", propOrder = {
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
public class Mandate23 {

    @XmlElement(name = "MndtId")
    protected List<String> mndtId;
    @XmlElement(name = "MndtReqId", required = true)
    protected String mndtReqId;
    @XmlElement(name = "Authntcn")
    protected MandateAuthentication1 authntcn;
    @XmlElement(name = "Tp")
    protected MandateTypeInformation2 tp;
    @XmlElement(name = "Ocrncs")
    protected MandateOccurrences5 ocrncs;
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
    protected PartyIdentification272 cdtrSchmeId;
    @XmlElement(name = "Cdtr", required = true)
    protected PartyIdentification272 cdtr;
    @XmlElement(name = "CdtrAcct")
    protected CashAccount40 cdtrAcct;
    @XmlElement(name = "CdtrAgt")
    protected BranchAndFinancialInstitutionIdentification8 cdtrAgt;
    @XmlElement(name = "UltmtCdtr")
    protected PartyIdentification272 ultmtCdtr;
    @XmlElement(name = "Dbtr", required = true)
    protected PartyIdentification272 dbtr;
    @XmlElement(name = "DbtrAcct")
    protected CashAccount40 dbtrAcct;
    @XmlElement(name = "DbtrAgt", required = true)
    protected BranchAndFinancialInstitutionIdentification8 dbtrAgt;
    @XmlElement(name = "UltmtDbtr")
    protected PartyIdentification272 ultmtDbtr;
    @XmlElement(name = "MndtRef")
    protected String mndtRef;
    @XmlElement(name = "RfrdDoc")
    protected List<ReferredMandateDocument2> rfrdDoc;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the mndtId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mndtId property.
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
     * @return
     *     The value of the mndtId property.
     */
    public List<String> getMndtId() {
        if (mndtId == null) {
            mndtId = new ArrayList<>();
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
    public Mandate23 setMndtReqId(String value) {
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
    public Mandate23 setAuthntcn(MandateAuthentication1 value) {
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
    public Mandate23 setTp(MandateTypeInformation2 value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the ocrncs property.
     * 
     * @return
     *     possible object is
     *     {@link MandateOccurrences5 }
     *     
     */
    public MandateOccurrences5 getOcrncs() {
        return ocrncs;
    }

    /**
     * Sets the value of the ocrncs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateOccurrences5 }
     *     
     */
    public Mandate23 setOcrncs(MandateOccurrences5 value) {
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
    public Mandate23 setTrckgInd(boolean value) {
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
    public Mandate23 setFrstColltnAmt(ActiveCurrencyAndAmount value) {
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
    public Mandate23 setColltnAmt(ActiveCurrencyAndAmount value) {
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
    public Mandate23 setMaxAmt(ActiveCurrencyAndAmount value) {
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
    public Mandate23 setAdjstmnt(MandateAdjustment1 value) {
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
    public Mandate23 setRsn(MandateSetupReason1Choice value) {
        this.rsn = value;
        return this;
    }

    /**
     * Gets the value of the cdtrSchmeId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification272 }
     *     
     */
    public PartyIdentification272 getCdtrSchmeId() {
        return cdtrSchmeId;
    }

    /**
     * Sets the value of the cdtrSchmeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification272 }
     *     
     */
    public Mandate23 setCdtrSchmeId(PartyIdentification272 value) {
        this.cdtrSchmeId = value;
        return this;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification272 }
     *     
     */
    public PartyIdentification272 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification272 }
     *     
     */
    public Mandate23 setCdtr(PartyIdentification272 value) {
        this.cdtr = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getCdtrAcct() {
        return cdtrAcct;
    }

    /**
     * Sets the value of the cdtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public Mandate23 setCdtrAcct(CashAccount40 value) {
        this.cdtrAcct = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Sets the value of the cdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public Mandate23 setCdtrAgt(BranchAndFinancialInstitutionIdentification8 value) {
        this.cdtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the ultmtCdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification272 }
     *     
     */
    public PartyIdentification272 getUltmtCdtr() {
        return ultmtCdtr;
    }

    /**
     * Sets the value of the ultmtCdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification272 }
     *     
     */
    public Mandate23 setUltmtCdtr(PartyIdentification272 value) {
        this.ultmtCdtr = value;
        return this;
    }

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification272 }
     *     
     */
    public PartyIdentification272 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification272 }
     *     
     */
    public Mandate23 setDbtr(PartyIdentification272 value) {
        this.dbtr = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getDbtrAcct() {
        return dbtrAcct;
    }

    /**
     * Sets the value of the dbtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public Mandate23 setDbtrAcct(CashAccount40 value) {
        this.dbtrAcct = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Sets the value of the dbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public Mandate23 setDbtrAgt(BranchAndFinancialInstitutionIdentification8 value) {
        this.dbtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the ultmtDbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification272 }
     *     
     */
    public PartyIdentification272 getUltmtDbtr() {
        return ultmtDbtr;
    }

    /**
     * Sets the value of the ultmtDbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification272 }
     *     
     */
    public Mandate23 setUltmtDbtr(PartyIdentification272 value) {
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
    public Mandate23 setMndtRef(String value) {
        this.mndtRef = value;
        return this;
    }

    /**
     * Gets the value of the rfrdDoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rfrdDoc property.
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
     * {@link ReferredMandateDocument2 }
     * 
     * 
     * @return
     *     The value of the rfrdDoc property.
     */
    public List<ReferredMandateDocument2> getRfrdDoc() {
        if (rfrdDoc == null) {
            rfrdDoc = new ArrayList<>();
        }
        return this.rfrdDoc;
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
     * Adds a new item to the mndtId list.
     * @see #getMndtId()
     * 
     */
    public Mandate23 addMndtId(String mndtId) {
        getMndtId().add(mndtId);
        return this;
    }

    /**
     * Adds a new item to the rfrdDoc list.
     * @see #getRfrdDoc()
     * 
     */
    public Mandate23 addRfrdDoc(ReferredMandateDocument2 rfrdDoc) {
        getRfrdDoc().add(rfrdDoc);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public Mandate23 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
