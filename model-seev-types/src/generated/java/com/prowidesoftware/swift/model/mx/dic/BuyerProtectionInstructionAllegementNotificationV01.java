
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
 * An account servicer sends a BuyerProtectionInstructionAllegementNotification to an account owner to advise the account owner that a counterparty has alleged a Buyer Protection Instruction against the account owner's account at the account servicer. An action may be required by the account owner.
 * 
 * Usage
 * The message may also be used to:
 * - re-send a message previously sent,
 * - provide a third party with a copy of a message for information,
 * - re-send to a third party a copy of a message for information using the relevant elements in the Business Application Header.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuyerProtectionInstructionAllegementNotificationV01", propOrder = {
    "prcrTxId",
    "corpActnGnlInf",
    "rltdSttlmInstr",
    "acctId",
    "corpActnElctn",
    "splmtryData"
})
public class BuyerProtectionInstructionAllegementNotificationV01 {

    @XmlElement(name = "PrcrTxId", required = true)
    protected String prcrTxId;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionGeneralInformation195 corpActnGnlInf;
    @XmlElement(name = "RltdSttlmInstr", required = true)
    protected RelatedSettlementInstruction3 rltdSttlmInstr;
    @XmlElement(name = "AcctId")
    protected SecuritiesAccountIdentification1Choice acctId;
    @XmlElement(name = "CorpActnElctn", required = true)
    protected CorporateActionElection4 corpActnElctn;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the prcrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcrTxId() {
        return prcrTxId;
    }

    /**
     * Sets the value of the prcrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BuyerProtectionInstructionAllegementNotificationV01 setPrcrTxId(String value) {
        this.prcrTxId = value;
        return this;
    }

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformation195 }
     *     
     */
    public CorporateActionGeneralInformation195 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformation195 }
     *     
     */
    public BuyerProtectionInstructionAllegementNotificationV01 setCorpActnGnlInf(CorporateActionGeneralInformation195 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the rltdSttlmInstr property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedSettlementInstruction3 }
     *     
     */
    public RelatedSettlementInstruction3 getRltdSttlmInstr() {
        return rltdSttlmInstr;
    }

    /**
     * Sets the value of the rltdSttlmInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedSettlementInstruction3 }
     *     
     */
    public BuyerProtectionInstructionAllegementNotificationV01 setRltdSttlmInstr(RelatedSettlementInstruction3 value) {
        this.rltdSttlmInstr = value;
        return this;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccountIdentification1Choice }
     *     
     */
    public SecuritiesAccountIdentification1Choice getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccountIdentification1Choice }
     *     
     */
    public BuyerProtectionInstructionAllegementNotificationV01 setAcctId(SecuritiesAccountIdentification1Choice value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the corpActnElctn property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionElection4 }
     *     
     */
    public CorporateActionElection4 getCorpActnElctn() {
        return corpActnElctn;
    }

    /**
     * Sets the value of the corpActnElctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionElection4 }
     *     
     */
    public BuyerProtectionInstructionAllegementNotificationV01 setCorpActnElctn(CorporateActionElection4 value) {
        this.corpActnElctn = value;
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public BuyerProtectionInstructionAllegementNotificationV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
