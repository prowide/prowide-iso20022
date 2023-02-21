
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
@XmlType(name = "Mandate15", propOrder = {
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
    "rfrdDoc"
})
public class Mandate15 {

    @XmlElement(name = "MndtId")
    protected String mndtId;
    @XmlElement(name = "MndtReqId")
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
    protected ActiveOrHistoricCurrencyAndAmount frstColltnAmt;
    @XmlElement(name = "ColltnAmt")
    protected ActiveOrHistoricCurrencyAndAmount colltnAmt;
    @XmlElement(name = "MaxAmt")
    protected ActiveOrHistoricCurrencyAndAmount maxAmt;
    @XmlElement(name = "Adjstmnt")
    protected MandateAdjustment1 adjstmnt;
    @XmlElement(name = "Rsn")
    protected MandateSetupReason1Choice rsn;
    @XmlElement(name = "CdtrSchmeId")
    protected PartyIdentification135 cdtrSchmeId;
    @XmlElement(name = "Cdtr", required = true)
    protected PartyIdentification135 cdtr;
    @XmlElement(name = "CdtrAcct")
    protected CashAccount38 cdtrAcct;
    @XmlElement(name = "CdtrAgt")
    protected BranchAndFinancialInstitutionIdentification6 cdtrAgt;
    @XmlElement(name = "UltmtCdtr")
    protected PartyIdentification135 ultmtCdtr;
    @XmlElement(name = "Dbtr", required = true)
    protected PartyIdentification135 dbtr;
    @XmlElement(name = "DbtrAcct")
    protected CashAccount38 dbtrAcct;
    @XmlElement(name = "DbtrAgt", required = true)
    protected BranchAndFinancialInstitutionIdentification6 dbtrAgt;
    @XmlElement(name = "UltmtDbtr")
    protected PartyIdentification135 ultmtDbtr;
    @XmlElement(name = "MndtRef")
    protected String mndtRef;
    @XmlElement(name = "RfrdDoc")
    protected List<ReferredMandateDocument1> rfrdDoc;

    /**
     * Gets the value of the mndtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMndtId() {
        return mndtId;
    }

    /**
     * Sets the value of the mndtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Mandate15 setMndtId(String value) {
        this.mndtId = value;
        return this;
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
    public Mandate15 setMndtReqId(String value) {
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
    public Mandate15 setAuthntcn(MandateAuthentication1 value) {
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
    public Mandate15 setTp(MandateTypeInformation2 value) {
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
    public Mandate15 setOcrncs(MandateOccurrences4 value) {
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
    public Mandate15 setTrckgInd(boolean value) {
        this.trckgInd = value;
        return this;
    }

    /**
     * Gets the value of the frstColltnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getFrstColltnAmt() {
        return frstColltnAmt;
    }

    /**
     * Sets the value of the frstColltnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public Mandate15 setFrstColltnAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.frstColltnAmt = value;
        return this;
    }

    /**
     * Gets the value of the colltnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getColltnAmt() {
        return colltnAmt;
    }

    /**
     * Sets the value of the colltnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public Mandate15 setColltnAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.colltnAmt = value;
        return this;
    }

    /**
     * Gets the value of the maxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getMaxAmt() {
        return maxAmt;
    }

    /**
     * Sets the value of the maxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public Mandate15 setMaxAmt(ActiveOrHistoricCurrencyAndAmount value) {
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
    public Mandate15 setAdjstmnt(MandateAdjustment1 value) {
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
    public Mandate15 setRsn(MandateSetupReason1Choice value) {
        this.rsn = value;
        return this;
    }

    /**
     * Gets the value of the cdtrSchmeId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getCdtrSchmeId() {
        return cdtrSchmeId;
    }

    /**
     * Sets the value of the cdtrSchmeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public Mandate15 setCdtrSchmeId(PartyIdentification135 value) {
        this.cdtrSchmeId = value;
        return this;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public Mandate15 setCdtr(PartyIdentification135 value) {
        this.cdtr = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount38 }
     *     
     */
    public CashAccount38 getCdtrAcct() {
        return cdtrAcct;
    }

    /**
     * Sets the value of the cdtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount38 }
     *     
     */
    public Mandate15 setCdtrAcct(CashAccount38 value) {
        this.cdtrAcct = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Sets the value of the cdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public Mandate15 setCdtrAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.cdtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the ultmtCdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getUltmtCdtr() {
        return ultmtCdtr;
    }

    /**
     * Sets the value of the ultmtCdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public Mandate15 setUltmtCdtr(PartyIdentification135 value) {
        this.ultmtCdtr = value;
        return this;
    }

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public Mandate15 setDbtr(PartyIdentification135 value) {
        this.dbtr = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount38 }
     *     
     */
    public CashAccount38 getDbtrAcct() {
        return dbtrAcct;
    }

    /**
     * Sets the value of the dbtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount38 }
     *     
     */
    public Mandate15 setDbtrAcct(CashAccount38 value) {
        this.dbtrAcct = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Sets the value of the dbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public Mandate15 setDbtrAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.dbtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the ultmtDbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getUltmtDbtr() {
        return ultmtDbtr;
    }

    /**
     * Sets the value of the ultmtDbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public Mandate15 setUltmtDbtr(PartyIdentification135 value) {
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
    public Mandate15 setMndtRef(String value) {
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
     * Adds a new item to the rfrdDoc list.
     * @see #getRfrdDoc()
     * 
     */
    public Mandate15 addRfrdDoc(ReferredMandateDocument1 rfrdDoc) {
        getRfrdDoc().add(rfrdDoc);
        return this;
    }

}
