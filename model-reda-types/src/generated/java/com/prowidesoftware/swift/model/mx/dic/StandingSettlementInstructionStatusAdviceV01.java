
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
 * Scope
 * The receiver of a StandingSettlementInstruction message sends the StandingSettlementInstructionStatusAdvice message to the instructing party (sender of the StandingSettlementInstruction message) to provide the status of a previously received StandingSettlementInstruction, StandingSettlementInstructionCancellation or StandingSettlementInstructionDeletion message.
 * 
 * Usage
 * The StandingSettlementInstructionStatusAdvice message is used to report one of the following statuses:
 * -	a received status, or, 
 * -	an accepted status, or,
 * -	a rejected status, or,
 * -	a pending processing status, or,
 * -	a proprietary status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandingSettlementInstructionStatusAdviceV01", propOrder = {
    "fctvDtDtls",
    "acctId",
    "mktId",
    "sttlmDtls",
    "rltdMsgRef",
    "prcgSts",
    "splmtryData"
})
public class StandingSettlementInstructionStatusAdviceV01 {

    @XmlElement(name = "FctvDtDtls")
    protected EffectiveDate1 fctvDtDtls;
    @XmlElement(name = "AcctId", required = true)
    protected List<AccountIdentification26> acctId;
    @XmlElement(name = "MktId", required = true)
    protected MarketIdentificationOrCashPurpose1Choice mktId;
    @XmlElement(name = "SttlmDtls", required = true)
    protected PartyOrCurrency1Choice sttlmDtls;
    @XmlElement(name = "RltdMsgRef", required = true)
    protected String rltdMsgRef;
    @XmlElement(name = "PrcgSts", required = true)
    protected ProcessingStatus43Choice prcgSts;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the fctvDtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link EffectiveDate1 }
     *     
     */
    public EffectiveDate1 getFctvDtDtls() {
        return fctvDtDtls;
    }

    /**
     * Sets the value of the fctvDtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectiveDate1 }
     *     
     */
    public StandingSettlementInstructionStatusAdviceV01 setFctvDtDtls(EffectiveDate1 value) {
        this.fctvDtDtls = value;
        return this;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountIdentification26 }
     * 
     * 
     */
    public List<AccountIdentification26> getAcctId() {
        if (acctId == null) {
            acctId = new ArrayList<AccountIdentification26>();
        }
        return this.acctId;
    }

    /**
     * Gets the value of the mktId property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentificationOrCashPurpose1Choice }
     *     
     */
    public MarketIdentificationOrCashPurpose1Choice getMktId() {
        return mktId;
    }

    /**
     * Sets the value of the mktId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentificationOrCashPurpose1Choice }
     *     
     */
    public StandingSettlementInstructionStatusAdviceV01 setMktId(MarketIdentificationOrCashPurpose1Choice value) {
        this.mktId = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyOrCurrency1Choice }
     *     
     */
    public PartyOrCurrency1Choice getSttlmDtls() {
        return sttlmDtls;
    }

    /**
     * Sets the value of the sttlmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyOrCurrency1Choice }
     *     
     */
    public StandingSettlementInstructionStatusAdviceV01 setSttlmDtls(PartyOrCurrency1Choice value) {
        this.sttlmDtls = value;
        return this;
    }

    /**
     * Gets the value of the rltdMsgRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRltdMsgRef() {
        return rltdMsgRef;
    }

    /**
     * Sets the value of the rltdMsgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StandingSettlementInstructionStatusAdviceV01 setRltdMsgRef(String value) {
        this.rltdMsgRef = value;
        return this;
    }

    /**
     * Gets the value of the prcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingStatus43Choice }
     *     
     */
    public ProcessingStatus43Choice getPrcgSts() {
        return prcgSts;
    }

    /**
     * Sets the value of the prcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingStatus43Choice }
     *     
     */
    public StandingSettlementInstructionStatusAdviceV01 setPrcgSts(ProcessingStatus43Choice value) {
        this.prcgSts = value;
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
     * Adds a new item to the acctId list.
     * @see #getAcctId()
     * 
     */
    public StandingSettlementInstructionStatusAdviceV01 addAcctId(AccountIdentification26 acctId) {
        getAcctId().add(acctId);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public StandingSettlementInstructionStatusAdviceV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
