
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
 * An account owner sends the CorporateActionInstructionCancellationRequest message to an account servicer to request cancellation of a previously sent corporate action election instruction.
 * Usage
 * The message may also be used to:
 * - re-send a message previously sent (the sub-function of the message is Duplicate),
 * - provide a third party with a copy of a message for information (the sub-function of the message is Copy),
 * - re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate),
 * using the relevant elements in the business application header (BAH).
 * ISO 15022 - 20022 COEXISTENCE
 * This ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionInstructionCancellationRequestV04", propOrder = {
    "chngInstrInd",
    "instrId",
    "corpActnGnlInf",
    "acctDtls",
    "corpActnInstr",
    "splmtryData"
})
public class CorporateActionInstructionCancellationRequestV04 {

    @XmlElement(name = "ChngInstrInd")
    protected Boolean chngInstrInd;
    @XmlElement(name = "InstrId", required = true)
    protected DocumentIdentification15 instrId;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionGeneralInformation49 corpActnGnlInf;
    @XmlElement(name = "AcctDtls", required = true)
    protected AccountIdentification17 acctDtls;
    @XmlElement(name = "CorpActnInstr", required = true)
    protected CorporateActionOption42 corpActnInstr;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the chngInstrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChngInstrInd() {
        return chngInstrInd;
    }

    /**
     * Sets the value of the chngInstrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionInstructionCancellationRequestV04 setChngInstrInd(Boolean value) {
        this.chngInstrInd = value;
        return this;
    }

    /**
     * Gets the value of the instrId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification15 }
     *     
     */
    public DocumentIdentification15 getInstrId() {
        return instrId;
    }

    /**
     * Sets the value of the instrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification15 }
     *     
     */
    public CorporateActionInstructionCancellationRequestV04 setInstrId(DocumentIdentification15 value) {
        this.instrId = value;
        return this;
    }

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformation49 }
     *     
     */
    public CorporateActionGeneralInformation49 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformation49 }
     *     
     */
    public CorporateActionInstructionCancellationRequestV04 setCorpActnGnlInf(CorporateActionGeneralInformation49 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the acctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification17 }
     *     
     */
    public AccountIdentification17 getAcctDtls() {
        return acctDtls;
    }

    /**
     * Sets the value of the acctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification17 }
     *     
     */
    public CorporateActionInstructionCancellationRequestV04 setAcctDtls(AccountIdentification17 value) {
        this.acctDtls = value;
        return this;
    }

    /**
     * Gets the value of the corpActnInstr property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption42 }
     *     
     */
    public CorporateActionOption42 getCorpActnInstr() {
        return corpActnInstr;
    }

    /**
     * Sets the value of the corpActnInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption42 }
     *     
     */
    public CorporateActionInstructionCancellationRequestV04 setCorpActnInstr(CorporateActionOption42 value) {
        this.corpActnInstr = value;
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
    public CorporateActionInstructionCancellationRequestV04 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
