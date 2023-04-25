
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
 * Statement of the journal entries for all activities related to the registered currency control contract.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractRegistrationStatement1", propOrder = {
    "stmtId",
    "rptgPty",
    "regnAgt",
    "rptgPrd",
    "regdCtrct",
    "txJrnl",
    "spprtgDocJrnl",
    "addtlSpprtgDocJrnl",
    "rgltryRuleVldtn",
    "ttlCtrctTrnvrSum",
    "splmtryData"
})
public class ContractRegistrationStatement1 {

    @XmlElement(name = "StmtId")
    protected String stmtId;
    @XmlElement(name = "RptgPty", required = true)
    protected TradeParty2 rptgPty;
    @XmlElement(name = "RegnAgt", required = true)
    protected BranchAndFinancialInstitutionIdentification5 regnAgt;
    @XmlElement(name = "RptgPrd", required = true)
    protected ReportingPeriod1 rptgPrd;
    @XmlElement(name = "RegdCtrct", required = true)
    protected RegisteredContract5 regdCtrct;
    @XmlElement(name = "TxJrnl")
    protected List<TransactionCertificate1> txJrnl;
    @XmlElement(name = "SpprtgDocJrnl")
    protected List<SupportingDocument1> spprtgDocJrnl;
    @XmlElement(name = "AddtlSpprtgDocJrnl")
    protected List<SupportingDocument1> addtlSpprtgDocJrnl;
    @XmlElement(name = "RgltryRuleVldtn")
    protected List<GenericValidationRuleIdentification1> rgltryRuleVldtn;
    @XmlElement(name = "TtlCtrctTrnvrSum", required = true)
    protected ActiveCurrencyAndAmount ttlCtrctTrnvrSum;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the stmtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmtId() {
        return stmtId;
    }

    /**
     * Sets the value of the stmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ContractRegistrationStatement1 setStmtId(String value) {
        this.stmtId = value;
        return this;
    }

    /**
     * Gets the value of the rptgPty property.
     * 
     * @return
     *     possible object is
     *     {@link TradeParty2 }
     *     
     */
    public TradeParty2 getRptgPty() {
        return rptgPty;
    }

    /**
     * Sets the value of the rptgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeParty2 }
     *     
     */
    public ContractRegistrationStatement1 setRptgPty(TradeParty2 value) {
        this.rptgPty = value;
        return this;
    }

    /**
     * Gets the value of the regnAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification5 getRegnAgt() {
        return regnAgt;
    }

    /**
     * Sets the value of the regnAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public ContractRegistrationStatement1 setRegnAgt(BranchAndFinancialInstitutionIdentification5 value) {
        this.regnAgt = value;
        return this;
    }

    /**
     * Gets the value of the rptgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingPeriod1 }
     *     
     */
    public ReportingPeriod1 getRptgPrd() {
        return rptgPrd;
    }

    /**
     * Sets the value of the rptgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingPeriod1 }
     *     
     */
    public ContractRegistrationStatement1 setRptgPrd(ReportingPeriod1 value) {
        this.rptgPrd = value;
        return this;
    }

    /**
     * Gets the value of the regdCtrct property.
     * 
     * @return
     *     possible object is
     *     {@link RegisteredContract5 }
     *     
     */
    public RegisteredContract5 getRegdCtrct() {
        return regdCtrct;
    }

    /**
     * Sets the value of the regdCtrct property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisteredContract5 }
     *     
     */
    public ContractRegistrationStatement1 setRegdCtrct(RegisteredContract5 value) {
        this.regdCtrct = value;
        return this;
    }

    /**
     * Gets the value of the txJrnl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txJrnl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxJrnl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionCertificate1 }
     * 
     * 
     * @return
     *     The value of the txJrnl property.
     */
    public List<TransactionCertificate1> getTxJrnl() {
        if (txJrnl == null) {
            txJrnl = new ArrayList<>();
        }
        return this.txJrnl;
    }

    /**
     * Gets the value of the spprtgDocJrnl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the spprtgDocJrnl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpprtgDocJrnl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupportingDocument1 }
     * 
     * 
     * @return
     *     The value of the spprtgDocJrnl property.
     */
    public List<SupportingDocument1> getSpprtgDocJrnl() {
        if (spprtgDocJrnl == null) {
            spprtgDocJrnl = new ArrayList<>();
        }
        return this.spprtgDocJrnl;
    }

    /**
     * Gets the value of the addtlSpprtgDocJrnl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlSpprtgDocJrnl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlSpprtgDocJrnl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupportingDocument1 }
     * 
     * 
     * @return
     *     The value of the addtlSpprtgDocJrnl property.
     */
    public List<SupportingDocument1> getAddtlSpprtgDocJrnl() {
        if (addtlSpprtgDocJrnl == null) {
            addtlSpprtgDocJrnl = new ArrayList<>();
        }
        return this.addtlSpprtgDocJrnl;
    }

    /**
     * Gets the value of the rgltryRuleVldtn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rgltryRuleVldtn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRgltryRuleVldtn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericValidationRuleIdentification1 }
     * 
     * 
     * @return
     *     The value of the rgltryRuleVldtn property.
     */
    public List<GenericValidationRuleIdentification1> getRgltryRuleVldtn() {
        if (rgltryRuleVldtn == null) {
            rgltryRuleVldtn = new ArrayList<>();
        }
        return this.rgltryRuleVldtn;
    }

    /**
     * Gets the value of the ttlCtrctTrnvrSum property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlCtrctTrnvrSum() {
        return ttlCtrctTrnvrSum;
    }

    /**
     * Sets the value of the ttlCtrctTrnvrSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ContractRegistrationStatement1 setTtlCtrctTrnvrSum(ActiveCurrencyAndAmount value) {
        this.ttlCtrctTrnvrSum = value;
        return this;
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
     * Adds a new item to the txJrnl list.
     * @see #getTxJrnl()
     * 
     */
    public ContractRegistrationStatement1 addTxJrnl(TransactionCertificate1 txJrnl) {
        getTxJrnl().add(txJrnl);
        return this;
    }

    /**
     * Adds a new item to the spprtgDocJrnl list.
     * @see #getSpprtgDocJrnl()
     * 
     */
    public ContractRegistrationStatement1 addSpprtgDocJrnl(SupportingDocument1 spprtgDocJrnl) {
        getSpprtgDocJrnl().add(spprtgDocJrnl);
        return this;
    }

    /**
     * Adds a new item to the addtlSpprtgDocJrnl list.
     * @see #getAddtlSpprtgDocJrnl()
     * 
     */
    public ContractRegistrationStatement1 addAddtlSpprtgDocJrnl(SupportingDocument1 addtlSpprtgDocJrnl) {
        getAddtlSpprtgDocJrnl().add(addtlSpprtgDocJrnl);
        return this;
    }

    /**
     * Adds a new item to the rgltryRuleVldtn list.
     * @see #getRgltryRuleVldtn()
     * 
     */
    public ContractRegistrationStatement1 addRgltryRuleVldtn(GenericValidationRuleIdentification1 rgltryRuleVldtn) {
        getRgltryRuleVldtn().add(rgltryRuleVldtn);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public ContractRegistrationStatement1 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
