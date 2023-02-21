
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
 * The CashSettlementInitiationRequest messages is sent by the settlement system to the cash settlement participant to direct it to initiate a request for the irrevocable transfer of an mount of monay to or from the settlement sytem clearing account and the payment to or from each participant client's accounts.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashSettlementInitiationRequestV01", propOrder = {
    "reqHdr",
    "acctSvcr",
    "sttlmInstr",
    "splmtryData"
})
public class CashSettlementInitiationRequestV01 {

    @XmlElement(name = "ReqHdr", required = true)
    protected CashSettlementInitiationHeader1 reqHdr;
    @XmlElement(name = "AcctSvcr")
    protected BranchAndFinancialInstitutionIdentification5 acctSvcr;
    @XmlElement(name = "SttlmInstr", required = true)
    protected CashSettlementInitiation1 sttlmInstr;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the reqHdr property.
     * 
     * @return
     *     possible object is
     *     {@link CashSettlementInitiationHeader1 }
     *     
     */
    public CashSettlementInitiationHeader1 getReqHdr() {
        return reqHdr;
    }

    /**
     * Sets the value of the reqHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashSettlementInitiationHeader1 }
     *     
     */
    public CashSettlementInitiationRequestV01 setReqHdr(CashSettlementInitiationHeader1 value) {
        this.reqHdr = value;
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
    public CashSettlementInitiationRequestV01 setAcctSvcr(BranchAndFinancialInstitutionIdentification5 value) {
        this.acctSvcr = value;
        return this;
    }

    /**
     * Gets the value of the sttlmInstr property.
     * 
     * @return
     *     possible object is
     *     {@link CashSettlementInitiation1 }
     *     
     */
    public CashSettlementInitiation1 getSttlmInstr() {
        return sttlmInstr;
    }

    /**
     * Sets the value of the sttlmInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashSettlementInitiation1 }
     *     
     */
    public CashSettlementInitiationRequestV01 setSttlmInstr(CashSettlementInitiation1 value) {
        this.sttlmInstr = value;
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public CashSettlementInitiationRequestV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
