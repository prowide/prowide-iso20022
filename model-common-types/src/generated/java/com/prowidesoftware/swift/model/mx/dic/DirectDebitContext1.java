
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
 * Element containing all information needed for a direct debit.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectDebitContext1", propOrder = {
    "dbtr",
    "dbtrAcct",
    "prtctdDbtrAcct",
    "cdtr",
    "cdtrAcct",
    "prtctdCdtrAcct",
    "mndtRltdInf"
})
public class DirectDebitContext1 {

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
    @XmlElement(name = "MndtRltdInf", required = true)
    protected MandateRelatedInformation17 mndtRltdInf;

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
    public DirectDebitContext1 setDbtr(PartyIdentification272 value) {
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
    public DirectDebitContext1 setDbtrAcct(CashAccount40 value) {
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
    public DirectDebitContext1 setPrtctdDbtrAcct(ContentInformationType39 value) {
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
    public DirectDebitContext1 setCdtr(PartyIdentification272 value) {
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
    public DirectDebitContext1 setCdtrAcct(CashAccount40 value) {
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
    public DirectDebitContext1 setPrtctdCdtrAcct(ContentInformationType39 value) {
        this.prtctdCdtrAcct = value;
        return this;
    }

    /**
     * Gets the value of the mndtRltdInf property.
     * 
     * @return
     *     possible object is
     *     {@link MandateRelatedInformation17 }
     *     
     */
    public MandateRelatedInformation17 getMndtRltdInf() {
        return mndtRltdInf;
    }

    /**
     * Sets the value of the mndtRltdInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateRelatedInformation17 }
     *     
     */
    public DirectDebitContext1 setMndtRltdInf(MandateRelatedInformation17 value) {
        this.mndtRltdInf = value;
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
