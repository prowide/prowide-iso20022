
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
 * Document that a user must file with an authorised servicer for each contract that involves foreign currency transactions with non residents.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisteredContract8", propOrder = {
    "orgnlCtrctRegnReq",
    "issrFI",
    "ctrct",
    "ctrctBal",
    "pmtSchdlTp",
    "regdCtrctId",
    "prvsRegdCtrctId",
    "regdCtrctJrnl",
    "amdmnt",
    "submissn",
    "dlvry",
    "lnPrncplAmt",
    "estmtdDtInd",
    "intrCpnyLn",
    "addtlInf"
})
public class RegisteredContract8 {

    @XmlElement(name = "OrgnlCtrctRegnReq")
    protected String orgnlCtrctRegnReq;
    @XmlElement(name = "IssrFI", required = true)
    protected BranchAndFinancialInstitutionIdentification6 issrFI;
    @XmlElement(name = "Ctrct", required = true)
    protected UnderlyingContract2Choice ctrct;
    @XmlElement(name = "CtrctBal")
    protected List<ContractBalance1> ctrctBal;
    @XmlElement(name = "PmtSchdlTp")
    protected PaymentScheduleType1Choice pmtSchdlTp;
    @XmlElement(name = "RegdCtrctId", required = true)
    protected DocumentIdentification29 regdCtrctId;
    @XmlElement(name = "PrvsRegdCtrctId")
    protected DocumentIdentification22 prvsRegdCtrctId;
    @XmlElement(name = "RegdCtrctJrnl")
    protected List<RegisteredContractJournal2> regdCtrctJrnl;
    @XmlElement(name = "Amdmnt")
    protected List<RegisteredContractAmendment1> amdmnt;
    @XmlElement(name = "Submissn", required = true)
    protected RegisteredContractCommunication1 submissn;
    @XmlElement(name = "Dlvry", required = true)
    protected RegisteredContractCommunication1 dlvry;
    @XmlElement(name = "LnPrncplAmt")
    protected ActiveCurrencyAndAmount lnPrncplAmt;
    @XmlElement(name = "EstmtdDtInd")
    protected boolean estmtdDtInd;
    @XmlElement(name = "IntrCpnyLn")
    protected boolean intrCpnyLn;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Gets the value of the orgnlCtrctRegnReq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlCtrctRegnReq() {
        return orgnlCtrctRegnReq;
    }

    /**
     * Sets the value of the orgnlCtrctRegnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RegisteredContract8 setOrgnlCtrctRegnReq(String value) {
        this.orgnlCtrctRegnReq = value;
        return this;
    }

    /**
     * Gets the value of the issrFI property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getIssrFI() {
        return issrFI;
    }

    /**
     * Sets the value of the issrFI property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public RegisteredContract8 setIssrFI(BranchAndFinancialInstitutionIdentification6 value) {
        this.issrFI = value;
        return this;
    }

    /**
     * Gets the value of the ctrct property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingContract2Choice }
     *     
     */
    public UnderlyingContract2Choice getCtrct() {
        return ctrct;
    }

    /**
     * Sets the value of the ctrct property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingContract2Choice }
     *     
     */
    public RegisteredContract8 setCtrct(UnderlyingContract2Choice value) {
        this.ctrct = value;
        return this;
    }

    /**
     * Gets the value of the ctrctBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ctrctBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtrctBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractBalance1 }
     * 
     * 
     */
    public List<ContractBalance1> getCtrctBal() {
        if (ctrctBal == null) {
            ctrctBal = new ArrayList<ContractBalance1>();
        }
        return this.ctrctBal;
    }

    /**
     * Gets the value of the pmtSchdlTp property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentScheduleType1Choice }
     *     
     */
    public PaymentScheduleType1Choice getPmtSchdlTp() {
        return pmtSchdlTp;
    }

    /**
     * Sets the value of the pmtSchdlTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentScheduleType1Choice }
     *     
     */
    public RegisteredContract8 setPmtSchdlTp(PaymentScheduleType1Choice value) {
        this.pmtSchdlTp = value;
        return this;
    }

    /**
     * Gets the value of the regdCtrctId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification29 }
     *     
     */
    public DocumentIdentification29 getRegdCtrctId() {
        return regdCtrctId;
    }

    /**
     * Sets the value of the regdCtrctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification29 }
     *     
     */
    public RegisteredContract8 setRegdCtrctId(DocumentIdentification29 value) {
        this.regdCtrctId = value;
        return this;
    }

    /**
     * Gets the value of the prvsRegdCtrctId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification22 }
     *     
     */
    public DocumentIdentification22 getPrvsRegdCtrctId() {
        return prvsRegdCtrctId;
    }

    /**
     * Sets the value of the prvsRegdCtrctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification22 }
     *     
     */
    public RegisteredContract8 setPrvsRegdCtrctId(DocumentIdentification22 value) {
        this.prvsRegdCtrctId = value;
        return this;
    }

    /**
     * Gets the value of the regdCtrctJrnl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regdCtrctJrnl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegdCtrctJrnl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegisteredContractJournal2 }
     * 
     * 
     */
    public List<RegisteredContractJournal2> getRegdCtrctJrnl() {
        if (regdCtrctJrnl == null) {
            regdCtrctJrnl = new ArrayList<RegisteredContractJournal2>();
        }
        return this.regdCtrctJrnl;
    }

    /**
     * Gets the value of the amdmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amdmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmdmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegisteredContractAmendment1 }
     * 
     * 
     */
    public List<RegisteredContractAmendment1> getAmdmnt() {
        if (amdmnt == null) {
            amdmnt = new ArrayList<RegisteredContractAmendment1>();
        }
        return this.amdmnt;
    }

    /**
     * Gets the value of the submissn property.
     * 
     * @return
     *     possible object is
     *     {@link RegisteredContractCommunication1 }
     *     
     */
    public RegisteredContractCommunication1 getSubmissn() {
        return submissn;
    }

    /**
     * Sets the value of the submissn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisteredContractCommunication1 }
     *     
     */
    public RegisteredContract8 setSubmissn(RegisteredContractCommunication1 value) {
        this.submissn = value;
        return this;
    }

    /**
     * Gets the value of the dlvry property.
     * 
     * @return
     *     possible object is
     *     {@link RegisteredContractCommunication1 }
     *     
     */
    public RegisteredContractCommunication1 getDlvry() {
        return dlvry;
    }

    /**
     * Sets the value of the dlvry property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisteredContractCommunication1 }
     *     
     */
    public RegisteredContract8 setDlvry(RegisteredContractCommunication1 value) {
        this.dlvry = value;
        return this;
    }

    /**
     * Gets the value of the lnPrncplAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getLnPrncplAmt() {
        return lnPrncplAmt;
    }

    /**
     * Sets the value of the lnPrncplAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public RegisteredContract8 setLnPrncplAmt(ActiveCurrencyAndAmount value) {
        this.lnPrncplAmt = value;
        return this;
    }

    /**
     * Gets the value of the estmtdDtInd property.
     * 
     */
    public boolean isEstmtdDtInd() {
        return estmtdDtInd;
    }

    /**
     * Sets the value of the estmtdDtInd property.
     * 
     */
    public RegisteredContract8 setEstmtdDtInd(boolean value) {
        this.estmtdDtInd = value;
        return this;
    }

    /**
     * Gets the value of the intrCpnyLn property.
     * 
     */
    public boolean isIntrCpnyLn() {
        return intrCpnyLn;
    }

    /**
     * Sets the value of the intrCpnyLn property.
     * 
     */
    public RegisteredContract8 setIntrCpnyLn(boolean value) {
        this.intrCpnyLn = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RegisteredContract8 setAddtlInf(String value) {
        this.addtlInf = value;
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

    /**
     * Adds a new item to the ctrctBal list.
     * @see #getCtrctBal()
     * 
     */
    public RegisteredContract8 addCtrctBal(ContractBalance1 ctrctBal) {
        getCtrctBal().add(ctrctBal);
        return this;
    }

    /**
     * Adds a new item to the regdCtrctJrnl list.
     * @see #getRegdCtrctJrnl()
     * 
     */
    public RegisteredContract8 addRegdCtrctJrnl(RegisteredContractJournal2 regdCtrctJrnl) {
        getRegdCtrctJrnl().add(regdCtrctJrnl);
        return this;
    }

    /**
     * Adds a new item to the amdmnt list.
     * @see #getAmdmnt()
     * 
     */
    public RegisteredContract8 addAmdmnt(RegisteredContractAmendment1 amdmnt) {
        getAmdmnt().add(amdmnt);
        return this;
    }

}
