
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "ContractRegistrationStatement3", propOrder = {
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
public class ContractRegistrationStatement3 {

    @XmlElement(name = "StmtId")
    protected String stmtId;
    @XmlElement(name = "RptgPty", required = true)
    protected TradeParty5 rptgPty;
    @XmlElement(name = "RegnAgt", required = true)
    protected BranchAndFinancialInstitutionIdentification6 regnAgt;
    @XmlElement(name = "RptgPrd", required = true)
    protected ReportingPeriod4 rptgPrd;
    @XmlElement(name = "RegdCtrct", required = true)
    protected RegisteredContract12 regdCtrct;
    @XmlElement(name = "TxJrnl")
    protected List<TransactionCertificate4> txJrnl;
    @XmlElement(name = "SpprtgDocJrnl")
    protected List<SupportingDocument3> spprtgDocJrnl;
    @XmlElement(name = "AddtlSpprtgDocJrnl")
    protected List<SupportingDocument3> addtlSpprtgDocJrnl;
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
    public ContractRegistrationStatement3 setStmtId(String value) {
        this.stmtId = value;
        return this;
    }

    /**
     * Gets the value of the rptgPty property.
     * 
     * @return
     *     possible object is
     *     {@link TradeParty5 }
     *     
     */
    public TradeParty5 getRptgPty() {
        return rptgPty;
    }

    /**
     * Sets the value of the rptgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeParty5 }
     *     
     */
    public ContractRegistrationStatement3 setRptgPty(TradeParty5 value) {
        this.rptgPty = value;
        return this;
    }

    /**
     * Gets the value of the regnAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getRegnAgt() {
        return regnAgt;
    }

    /**
     * Sets the value of the regnAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public ContractRegistrationStatement3 setRegnAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.regnAgt = value;
        return this;
    }

    /**
     * Gets the value of the rptgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingPeriod4 }
     *     
     */
    public ReportingPeriod4 getRptgPrd() {
        return rptgPrd;
    }

    /**
     * Sets the value of the rptgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingPeriod4 }
     *     
     */
    public ContractRegistrationStatement3 setRptgPrd(ReportingPeriod4 value) {
        this.rptgPrd = value;
        return this;
    }

    /**
     * Gets the value of the regdCtrct property.
     * 
     * @return
     *     possible object is
     *     {@link RegisteredContract12 }
     *     
     */
    public RegisteredContract12 getRegdCtrct() {
        return regdCtrct;
    }

    /**
     * Sets the value of the regdCtrct property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisteredContract12 }
     *     
     */
    public ContractRegistrationStatement3 setRegdCtrct(RegisteredContract12 value) {
        this.regdCtrct = value;
        return this;
    }

    /**
     * Gets the value of the txJrnl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txJrnl property.
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
     * {@link TransactionCertificate4 }
     * 
     * 
     */
    public List<TransactionCertificate4> getTxJrnl() {
        if (txJrnl == null) {
            txJrnl = new ArrayList<TransactionCertificate4>();
        }
        return this.txJrnl;
    }

    /**
     * Gets the value of the spprtgDocJrnl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spprtgDocJrnl property.
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
     * {@link SupportingDocument3 }
     * 
     * 
     */
    public List<SupportingDocument3> getSpprtgDocJrnl() {
        if (spprtgDocJrnl == null) {
            spprtgDocJrnl = new ArrayList<SupportingDocument3>();
        }
        return this.spprtgDocJrnl;
    }

    /**
     * Gets the value of the addtlSpprtgDocJrnl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlSpprtgDocJrnl property.
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
     * {@link SupportingDocument3 }
     * 
     * 
     */
    public List<SupportingDocument3> getAddtlSpprtgDocJrnl() {
        if (addtlSpprtgDocJrnl == null) {
            addtlSpprtgDocJrnl = new ArrayList<SupportingDocument3>();
        }
        return this.addtlSpprtgDocJrnl;
    }

    /**
     * Gets the value of the rgltryRuleVldtn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rgltryRuleVldtn property.
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
     */
    public List<GenericValidationRuleIdentification1> getRgltryRuleVldtn() {
        if (rgltryRuleVldtn == null) {
            rgltryRuleVldtn = new ArrayList<GenericValidationRuleIdentification1>();
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
    public ContractRegistrationStatement3 setTtlCtrctTrnvrSum(ActiveCurrencyAndAmount value) {
        this.ttlCtrctTrnvrSum = value;
        return this;
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
     * Adds a new item to the txJrnl list.
     * @see #getTxJrnl()
     * 
     */
    public ContractRegistrationStatement3 addTxJrnl(TransactionCertificate4 txJrnl) {
        getTxJrnl().add(txJrnl);
        return this;
    }

    /**
     * Adds a new item to the spprtgDocJrnl list.
     * @see #getSpprtgDocJrnl()
     * 
     */
    public ContractRegistrationStatement3 addSpprtgDocJrnl(SupportingDocument3 spprtgDocJrnl) {
        getSpprtgDocJrnl().add(spprtgDocJrnl);
        return this;
    }

    /**
     * Adds a new item to the addtlSpprtgDocJrnl list.
     * @see #getAddtlSpprtgDocJrnl()
     * 
     */
    public ContractRegistrationStatement3 addAddtlSpprtgDocJrnl(SupportingDocument3 addtlSpprtgDocJrnl) {
        getAddtlSpprtgDocJrnl().add(addtlSpprtgDocJrnl);
        return this;
    }

    /**
     * Adds a new item to the rgltryRuleVldtn list.
     * @see #getRgltryRuleVldtn()
     * 
     */
    public ContractRegistrationStatement3 addRgltryRuleVldtn(GenericValidationRuleIdentification1 rgltryRuleVldtn) {
        getRgltryRuleVldtn().add(rgltryRuleVldtn);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public ContractRegistrationStatement3 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
