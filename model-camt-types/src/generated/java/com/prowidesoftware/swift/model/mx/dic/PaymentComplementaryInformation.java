
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
 * Additional information from the underlying payment instruction which cannot be transferred in a regular statement message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentComplementaryInformation", propOrder = {
    "rmtChc",
    "dbtr",
    "dbtrAcct",
    "frstAgt",
    "amt",
    "nstrVstrAcct",
    "intrmy",
    "frstSttlmAgt",
    "lastSttlmAgt",
    "intrmySttlmAgt",
    "cdtr",
    "cdtrAcct",
    "sndrToRcvrInf"
})
public class PaymentComplementaryInformation {

    @XmlElement(name = "RmtChc")
    protected RemittanceInformation3Choice rmtChc;
    @XmlElement(name = "Dbtr")
    protected PartyIdentification1 dbtr;
    @XmlElement(name = "DbtrAcct")
    protected CashAccount3 dbtrAcct;
    @XmlElement(name = "FrstAgt")
    protected BranchAndFinancialInstitutionIdentification frstAgt;
    @XmlElement(name = "Amt")
    protected AmountType1Choice amt;
    @XmlElement(name = "NstrVstrAcct")
    protected CashAccount3 nstrVstrAcct;
    @XmlElement(name = "Intrmy")
    protected Intermediary1 intrmy;
    @XmlElement(name = "FrstSttlmAgt")
    protected BranchAndFinancialInstitutionIdentification frstSttlmAgt;
    @XmlElement(name = "LastSttlmAgt")
    protected BranchAndFinancialInstitutionIdentification lastSttlmAgt;
    @XmlElement(name = "IntrmySttlmAgt")
    protected BranchAndFinancialInstitutionIdentification intrmySttlmAgt;
    @XmlElement(name = "Cdtr")
    protected PartyIdentification1 cdtr;
    @XmlElement(name = "CdtrAcct")
    protected CashAccount3 cdtrAcct;
    @XmlElement(name = "SndrToRcvrInf")
    protected List<String> sndrToRcvrInf;

    /**
     * Gets the value of the rmtChc property.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceInformation3Choice }
     *     
     */
    public RemittanceInformation3Choice getRmtChc() {
        return rmtChc;
    }

    /**
     * Sets the value of the rmtChc property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceInformation3Choice }
     *     
     */
    public PaymentComplementaryInformation setRmtChc(RemittanceInformation3Choice value) {
        this.rmtChc = value;
        return this;
    }

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification1 }
     *     
     */
    public PartyIdentification1 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification1 }
     *     
     */
    public PaymentComplementaryInformation setDbtr(PartyIdentification1 value) {
        this.dbtr = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount3 }
     *     
     */
    public CashAccount3 getDbtrAcct() {
        return dbtrAcct;
    }

    /**
     * Sets the value of the dbtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount3 }
     *     
     */
    public PaymentComplementaryInformation setDbtrAcct(CashAccount3 value) {
        this.dbtrAcct = value;
        return this;
    }

    /**
     * Gets the value of the frstAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification }
     *     
     */
    public BranchAndFinancialInstitutionIdentification getFrstAgt() {
        return frstAgt;
    }

    /**
     * Sets the value of the frstAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification }
     *     
     */
    public PaymentComplementaryInformation setFrstAgt(BranchAndFinancialInstitutionIdentification value) {
        this.frstAgt = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType1Choice }
     *     
     */
    public AmountType1Choice getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType1Choice }
     *     
     */
    public PaymentComplementaryInformation setAmt(AmountType1Choice value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the nstrVstrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount3 }
     *     
     */
    public CashAccount3 getNstrVstrAcct() {
        return nstrVstrAcct;
    }

    /**
     * Sets the value of the nstrVstrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount3 }
     *     
     */
    public PaymentComplementaryInformation setNstrVstrAcct(CashAccount3 value) {
        this.nstrVstrAcct = value;
        return this;
    }

    /**
     * Gets the value of the intrmy property.
     * 
     * @return
     *     possible object is
     *     {@link Intermediary1 }
     *     
     */
    public Intermediary1 getIntrmy() {
        return intrmy;
    }

    /**
     * Sets the value of the intrmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Intermediary1 }
     *     
     */
    public PaymentComplementaryInformation setIntrmy(Intermediary1 value) {
        this.intrmy = value;
        return this;
    }

    /**
     * Gets the value of the frstSttlmAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification }
     *     
     */
    public BranchAndFinancialInstitutionIdentification getFrstSttlmAgt() {
        return frstSttlmAgt;
    }

    /**
     * Sets the value of the frstSttlmAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification }
     *     
     */
    public PaymentComplementaryInformation setFrstSttlmAgt(BranchAndFinancialInstitutionIdentification value) {
        this.frstSttlmAgt = value;
        return this;
    }

    /**
     * Gets the value of the lastSttlmAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification }
     *     
     */
    public BranchAndFinancialInstitutionIdentification getLastSttlmAgt() {
        return lastSttlmAgt;
    }

    /**
     * Sets the value of the lastSttlmAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification }
     *     
     */
    public PaymentComplementaryInformation setLastSttlmAgt(BranchAndFinancialInstitutionIdentification value) {
        this.lastSttlmAgt = value;
        return this;
    }

    /**
     * Gets the value of the intrmySttlmAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification }
     *     
     */
    public BranchAndFinancialInstitutionIdentification getIntrmySttlmAgt() {
        return intrmySttlmAgt;
    }

    /**
     * Sets the value of the intrmySttlmAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification }
     *     
     */
    public PaymentComplementaryInformation setIntrmySttlmAgt(BranchAndFinancialInstitutionIdentification value) {
        this.intrmySttlmAgt = value;
        return this;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification1 }
     *     
     */
    public PartyIdentification1 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification1 }
     *     
     */
    public PaymentComplementaryInformation setCdtr(PartyIdentification1 value) {
        this.cdtr = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount3 }
     *     
     */
    public CashAccount3 getCdtrAcct() {
        return cdtrAcct;
    }

    /**
     * Sets the value of the cdtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount3 }
     *     
     */
    public PaymentComplementaryInformation setCdtrAcct(CashAccount3 value) {
        this.cdtrAcct = value;
        return this;
    }

    /**
     * Gets the value of the sndrToRcvrInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sndrToRcvrInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSndrToRcvrInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the sndrToRcvrInf property.
     */
    public List<String> getSndrToRcvrInf() {
        if (sndrToRcvrInf == null) {
            sndrToRcvrInf = new ArrayList<>();
        }
        return this.sndrToRcvrInf;
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
     * Adds a new item to the sndrToRcvrInf list.
     * @see #getSndrToRcvrInf()
     * 
     */
    public PaymentComplementaryInformation addSndrToRcvrInf(String sndrToRcvrInf) {
        getSndrToRcvrInf().add(sndrToRcvrInf);
        return this;
    }

}
