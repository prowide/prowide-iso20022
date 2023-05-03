
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides details specific to the liquidity credit transfer, used to transfer an amount of money from the debtor to the creditor, where both are financial institutions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiquidityCreditTransfer3", propOrder = {
    "lqdtyTrfId",
    "cdtr",
    "cdtrAcct",
    "trfdAmt",
    "dbtr",
    "dbtrAcct",
    "sttlmDt"
})
public class LiquidityCreditTransfer3 {

    @XmlElement(name = "LqdtyTrfId")
    protected PaymentIdentification8 lqdtyTrfId;
    @XmlElement(name = "Cdtr")
    protected BranchAndFinancialInstitutionIdentification6 cdtr;
    @XmlElement(name = "CdtrAcct")
    protected CashAccount40 cdtrAcct;
    @XmlElement(name = "TrfdAmt", required = true)
    protected Amount2Choice trfdAmt;
    @XmlElement(name = "Dbtr")
    protected BranchAndFinancialInstitutionIdentification6 dbtr;
    @XmlElement(name = "DbtrAcct")
    protected CashAccount40 dbtrAcct;
    @XmlElement(name = "SttlmDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate sttlmDt;

    /**
     * Gets the value of the lqdtyTrfId property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentIdentification8 }
     *     
     */
    public PaymentIdentification8 getLqdtyTrfId() {
        return lqdtyTrfId;
    }

    /**
     * Sets the value of the lqdtyTrfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentIdentification8 }
     *     
     */
    public LiquidityCreditTransfer3 setLqdtyTrfId(PaymentIdentification8 value) {
        this.lqdtyTrfId = value;
        return this;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public LiquidityCreditTransfer3 setCdtr(BranchAndFinancialInstitutionIdentification6 value) {
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
    public LiquidityCreditTransfer3 setCdtrAcct(CashAccount40 value) {
        this.cdtrAcct = value;
        return this;
    }

    /**
     * Gets the value of the trfdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2Choice }
     *     
     */
    public Amount2Choice getTrfdAmt() {
        return trfdAmt;
    }

    /**
     * Sets the value of the trfdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2Choice }
     *     
     */
    public LiquidityCreditTransfer3 setTrfdAmt(Amount2Choice value) {
        this.trfdAmt = value;
        return this;
    }

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public LiquidityCreditTransfer3 setDbtr(BranchAndFinancialInstitutionIdentification6 value) {
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
    public LiquidityCreditTransfer3 setDbtrAcct(CashAccount40 value) {
        this.dbtrAcct = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LiquidityCreditTransfer3 setSttlmDt(LocalDate value) {
        this.sttlmDt = value;
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
