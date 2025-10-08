
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Context of a credit transfer transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditTransferContext1", propOrder = {
    "automtcNtfctnOfCshMvmnt",
    "waitForNtfctnBfrEndg",
    "sysToNtfy",
    "dbtr",
    "dbtrAcct",
    "prtctdDbtrAcct",
    "cdtr",
    "cdtrAcct",
    "prtctdCdtrAcct"
})
public class CreditTransferContext1 {

    @XmlElement(name = "AutomtcNtfctnOfCshMvmnt")
    protected Boolean automtcNtfctnOfCshMvmnt;
    @XmlElement(name = "WaitForNtfctnBfrEndg")
    protected Boolean waitForNtfctnBfrEndg;
    @XmlElement(name = "SysToNtfy")
    protected String sysToNtfy;
    @XmlElement(name = "Dbtr")
    protected PartyIdentification272 dbtr;
    @XmlElement(name = "DbtrAcct")
    protected CashAccount40 dbtrAcct;
    @XmlElement(name = "PrtctdDbtrAcct")
    protected ContentInformationType39 prtctdDbtrAcct;
    @XmlElement(name = "Cdtr")
    protected PartyIdentification272 cdtr;
    @XmlElement(name = "CdtrAcct")
    protected CashAccount40 cdtrAcct;
    @XmlElement(name = "PrtctdCdtrAcct")
    protected ContentInformationType39 prtctdCdtrAcct;

    /**
     * Gets the value of the automtcNtfctnOfCshMvmnt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutomtcNtfctnOfCshMvmnt() {
        return automtcNtfctnOfCshMvmnt;
    }

    /**
     * Sets the value of the automtcNtfctnOfCshMvmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CreditTransferContext1 setAutomtcNtfctnOfCshMvmnt(Boolean value) {
        this.automtcNtfctnOfCshMvmnt = value;
        return this;
    }

    /**
     * Gets the value of the waitForNtfctnBfrEndg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWaitForNtfctnBfrEndg() {
        return waitForNtfctnBfrEndg;
    }

    /**
     * Sets the value of the waitForNtfctnBfrEndg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CreditTransferContext1 setWaitForNtfctnBfrEndg(Boolean value) {
        this.waitForNtfctnBfrEndg = value;
        return this;
    }

    /**
     * Gets the value of the sysToNtfy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysToNtfy() {
        return sysToNtfy;
    }

    /**
     * Sets the value of the sysToNtfy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CreditTransferContext1 setSysToNtfy(String value) {
        this.sysToNtfy = value;
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
    public CreditTransferContext1 setDbtr(PartyIdentification272 value) {
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
    public CreditTransferContext1 setDbtrAcct(CashAccount40 value) {
        this.dbtrAcct = value;
        return this;
    }

    /**
     * Gets the value of the prtctdDbtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType39 }
     *     
     */
    public ContentInformationType39 getPrtctdDbtrAcct() {
        return prtctdDbtrAcct;
    }

    /**
     * Sets the value of the prtctdDbtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType39 }
     *     
     */
    public CreditTransferContext1 setPrtctdDbtrAcct(ContentInformationType39 value) {
        this.prtctdDbtrAcct = value;
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
    public CreditTransferContext1 setCdtr(PartyIdentification272 value) {
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
    public CreditTransferContext1 setCdtrAcct(CashAccount40 value) {
        this.cdtrAcct = value;
        return this;
    }

    /**
     * Gets the value of the prtctdCdtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType39 }
     *     
     */
    public ContentInformationType39 getPrtctdCdtrAcct() {
        return prtctdCdtrAcct;
    }

    /**
     * Sets the value of the prtctdCdtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType39 }
     *     
     */
    public CreditTransferContext1 setPrtctdCdtrAcct(ContentInformationType39 value) {
        this.prtctdCdtrAcct = value;
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
