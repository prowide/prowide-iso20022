
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
@XmlType(name = "Mandate5", propOrder = {
    "mndtId",
    "mndtReqId",
    "tp",
    "ocrncs",
    "colltnAmt",
    "maxAmt",
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
    "rfrdDoc"
})
public class Mandate5 {

    @XmlElement(name = "MndtId", required = true)
    protected String mndtId;
    @XmlElement(name = "MndtReqId")
    protected String mndtReqId;
    @XmlElement(name = "Tp")
    protected MandateTypeInformation1 tp;
    @XmlElement(name = "Ocrncs")
    protected MandateOccurrences3 ocrncs;
    @XmlElement(name = "ColltnAmt")
    protected ActiveOrHistoricCurrencyAndAmount colltnAmt;
    @XmlElement(name = "MaxAmt")
    protected ActiveOrHistoricCurrencyAndAmount maxAmt;
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
    @XmlElement(name = "RfrdDoc")
    protected List<ReferredDocumentInformation6> rfrdDoc;

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
    public Mandate5 setMndtId(String value) {
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
    public Mandate5 setMndtReqId(String value) {
        this.mndtReqId = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link MandateTypeInformation1 }
     *     
     */
    public MandateTypeInformation1 getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateTypeInformation1 }
     *     
     */
    public Mandate5 setTp(MandateTypeInformation1 value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the ocrncs property.
     * 
     * @return
     *     possible object is
     *     {@link MandateOccurrences3 }
     *     
     */
    public MandateOccurrences3 getOcrncs() {
        return ocrncs;
    }

    /**
     * Sets the value of the ocrncs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateOccurrences3 }
     *     
     */
    public Mandate5 setOcrncs(MandateOccurrences3 value) {
        this.ocrncs = value;
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
    public Mandate5 setColltnAmt(ActiveOrHistoricCurrencyAndAmount value) {
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
    public Mandate5 setMaxAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.maxAmt = value;
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
    public Mandate5 setRsn(MandateSetupReason1Choice value) {
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
    public Mandate5 setCdtrSchmeId(PartyIdentification43 value) {
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
    public Mandate5 setCdtr(PartyIdentification43 value) {
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
    public Mandate5 setCdtrAcct(CashAccount24 value) {
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
    public Mandate5 setCdtrAgt(BranchAndFinancialInstitutionIdentification5 value) {
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
    public Mandate5 setUltmtCdtr(PartyIdentification43 value) {
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
    public Mandate5 setDbtr(PartyIdentification43 value) {
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
    public Mandate5 setDbtrAcct(CashAccount24 value) {
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
    public Mandate5 setDbtrAgt(BranchAndFinancialInstitutionIdentification5 value) {
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
    public Mandate5 setUltmtDbtr(PartyIdentification43 value) {
        this.ultmtDbtr = value;
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
     * {@link ReferredDocumentInformation6 }
     * 
     * 
     * @return
     *     The value of the rfrdDoc property.
     */
    public List<ReferredDocumentInformation6> getRfrdDoc() {
        if (rfrdDoc == null) {
            rfrdDoc = new ArrayList<>();
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
    public Mandate5 addRfrdDoc(ReferredDocumentInformation6 rfrdDoc) {
        getRfrdDoc().add(rfrdDoc);
        return this;
    }

}
