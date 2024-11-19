
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Movements of cash.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashMovement7", propOrder = {
    "cshMvmnt",
    "cshAmt",
    "cshAcct",
    "mvmntSts",
    "collMvmnt",
    "cshMvmntApprvd",
    "posTp",
    "clntCshMvmntId",
    "trptyAgtSvcPrvdrCshMvmntId"
})
public class CashMovement7 {

    @XmlElement(name = "CshMvmnt", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebit3Code cshMvmnt;
    @XmlElement(name = "CshAmt", required = true)
    protected ActiveCurrencyAndAmount cshAmt;
    @XmlElement(name = "CshAcct")
    protected CashAccountIdentification5Choice cshAcct;
    @XmlElement(name = "MvmntSts")
    protected ProprietaryStatusAndReason6 mvmntSts;
    @XmlElement(name = "CollMvmnt")
    protected boolean collMvmnt;
    @XmlElement(name = "CshMvmntApprvd")
    protected Boolean cshMvmntApprvd;
    @XmlElement(name = "PosTp")
    protected Boolean posTp;
    @XmlElement(name = "ClntCshMvmntId")
    protected String clntCshMvmntId;
    @XmlElement(name = "TrptyAgtSvcPrvdrCshMvmntId")
    protected String trptyAgtSvcPrvdrCshMvmntId;

    /**
     * Gets the value of the cshMvmnt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebit3Code }
     *     
     */
    public CreditDebit3Code getCshMvmnt() {
        return cshMvmnt;
    }

    /**
     * Sets the value of the cshMvmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebit3Code }
     *     
     */
    public CashMovement7 setCshMvmnt(CreditDebit3Code value) {
        this.cshMvmnt = value;
        return this;
    }

    /**
     * Gets the value of the cshAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCshAmt() {
        return cshAmt;
    }

    /**
     * Sets the value of the cshAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CashMovement7 setCshAmt(ActiveCurrencyAndAmount value) {
        this.cshAmt = value;
        return this;
    }

    /**
     * Gets the value of the cshAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public CashAccountIdentification5Choice getCshAcct() {
        return cshAcct;
    }

    /**
     * Sets the value of the cshAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public CashMovement7 setCshAcct(CashAccountIdentification5Choice value) {
        this.cshAcct = value;
        return this;
    }

    /**
     * Gets the value of the mvmntSts property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public ProprietaryStatusAndReason6 getMvmntSts() {
        return mvmntSts;
    }

    /**
     * Sets the value of the mvmntSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public CashMovement7 setMvmntSts(ProprietaryStatusAndReason6 value) {
        this.mvmntSts = value;
        return this;
    }

    /**
     * Gets the value of the collMvmnt property.
     * 
     */
    public boolean isCollMvmnt() {
        return collMvmnt;
    }

    /**
     * Sets the value of the collMvmnt property.
     * 
     */
    public CashMovement7 setCollMvmnt(boolean value) {
        this.collMvmnt = value;
        return this;
    }

    /**
     * Gets the value of the cshMvmntApprvd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCshMvmntApprvd() {
        return cshMvmntApprvd;
    }

    /**
     * Sets the value of the cshMvmntApprvd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CashMovement7 setCshMvmntApprvd(Boolean value) {
        this.cshMvmntApprvd = value;
        return this;
    }

    /**
     * Gets the value of the posTp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPosTp() {
        return posTp;
    }

    /**
     * Sets the value of the posTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CashMovement7 setPosTp(Boolean value) {
        this.posTp = value;
        return this;
    }

    /**
     * Gets the value of the clntCshMvmntId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntCshMvmntId() {
        return clntCshMvmntId;
    }

    /**
     * Sets the value of the clntCshMvmntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashMovement7 setClntCshMvmntId(String value) {
        this.clntCshMvmntId = value;
        return this;
    }

    /**
     * Gets the value of the trptyAgtSvcPrvdrCshMvmntId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrptyAgtSvcPrvdrCshMvmntId() {
        return trptyAgtSvcPrvdrCshMvmntId;
    }

    /**
     * Sets the value of the trptyAgtSvcPrvdrCshMvmntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashMovement7 setTrptyAgtSvcPrvdrCshMvmntId(String value) {
        this.trptyAgtSvcPrvdrCshMvmntId = value;
        return this;
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

}
