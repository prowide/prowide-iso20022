
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
 * The CashObligationReport message is sent by the settlement system to a settlement member to report on the projeted or actual cash settlement obligations that will be submitted for settlement.
 * 
 * The message definition is intended for use with the ISO20022 Business Application Header.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashObligationReportV01", propOrder = {
    "pgntn",
    "rptHdr",
    "acctSvcr",
    "sttlmAgtNetPos",
    "sttlmAcctNetPos",
    "splmtryData"
})
public class CashObligationReportV01 {

    @XmlElement(name = "Pgntn")
    protected Pagination1 pgntn;
    @XmlElement(name = "RptHdr", required = true)
    protected CashObligationHeader1 rptHdr;
    @XmlElement(name = "AcctSvcr")
    protected BranchAndFinancialInstitutionIdentification5 acctSvcr;
    @XmlElement(name = "SttlmAgtNetPos")
    protected CashNetPosition1 sttlmAgtNetPos;
    @XmlElement(name = "SttlmAcctNetPos")
    protected List<CashNetPosition2> sttlmAcctNetPos;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the pgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination1 }
     *     
     */
    public Pagination1 getPgntn() {
        return pgntn;
    }

    /**
     * Sets the value of the pgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination1 }
     *     
     */
    public CashObligationReportV01 setPgntn(Pagination1 value) {
        this.pgntn = value;
        return this;
    }

    /**
     * Gets the value of the rptHdr property.
     * 
     * @return
     *     possible object is
     *     {@link CashObligationHeader1 }
     *     
     */
    public CashObligationHeader1 getRptHdr() {
        return rptHdr;
    }

    /**
     * Sets the value of the rptHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashObligationHeader1 }
     *     
     */
    public CashObligationReportV01 setRptHdr(CashObligationHeader1 value) {
        this.rptHdr = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification5 getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public CashObligationReportV01 setAcctSvcr(BranchAndFinancialInstitutionIdentification5 value) {
        this.acctSvcr = value;
        return this;
    }

    /**
     * Gets the value of the sttlmAgtNetPos property.
     * 
     * @return
     *     possible object is
     *     {@link CashNetPosition1 }
     *     
     */
    public CashNetPosition1 getSttlmAgtNetPos() {
        return sttlmAgtNetPos;
    }

    /**
     * Sets the value of the sttlmAgtNetPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashNetPosition1 }
     *     
     */
    public CashObligationReportV01 setSttlmAgtNetPos(CashNetPosition1 value) {
        this.sttlmAgtNetPos = value;
        return this;
    }

    /**
     * Gets the value of the sttlmAcctNetPos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sttlmAcctNetPos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttlmAcctNetPos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashNetPosition2 }
     * 
     * 
     */
    public List<CashNetPosition2> getSttlmAcctNetPos() {
        if (sttlmAcctNetPos == null) {
            sttlmAcctNetPos = new ArrayList<CashNetPosition2>();
        }
        return this.sttlmAcctNetPos;
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
     * Adds a new item to the sttlmAcctNetPos list.
     * @see #getSttlmAcctNetPos()
     * 
     */
    public CashObligationReportV01 addSttlmAcctNetPos(CashNetPosition2 sttlmAcctNetPos) {
        getSttlmAcctNetPos().add(sttlmAcctNetPos);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public CashObligationReportV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
