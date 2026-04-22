
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Scope and Usage
 * The MarketClaimCreation message is sent by an account servicer to an account holder to advise the creation of a market claim transaction on a securities account, that has been automatically generated (for example by a CSD) on a mandatory distribution type of corporate action event. 
 * This message definition is intended for use with the Business Application Header (BAH).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketClaimCreationV04", propOrder = {
    "txRef",
    "corpActnGnlInf",
    "rltdSttlmInstrDtls",
    "acctDtls",
    "corpActnDtls",
    "mktClmTp",
    "mktClmSttlmInd",
    "mktClmDtls",
    "dlvrgSttlmPties",
    "rcvgSttlmPties",
    "splmtryData"
})
public class MarketClaimCreationV04 {

    @XmlElement(name = "TxRef", required = true)
    protected References25 txRef;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionGeneralInformation181 corpActnGnlInf;
    @XmlElement(name = "RltdSttlmInstrDtls", required = true)
    protected RelatedSettlementInstruction2 rltdSttlmInstrDtls;
    @XmlElement(name = "AcctDtls", required = true)
    protected AccountIdentification70 acctDtls;
    @XmlElement(name = "CorpActnDtls")
    protected CorporateAction59 corpActnDtls;
    @XmlElement(name = "MktClmTp", required = true)
    @XmlSchemaType(name = "string")
    protected MarketClaimType1Code mktClmTp;
    @XmlElement(name = "MktClmSttlmInd")
    protected Boolean mktClmSttlmInd;
    @XmlElement(name = "MktClmDtls", required = true)
    protected CorporateActionOption234 mktClmDtls;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties123 dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties124 rcvgSttlmPties;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the txRef property.
     * 
     * @return
     *     possible object is
     *     {@link References25 }
     *     
     */
    public References25 getTxRef() {
        return txRef;
    }

    /**
     * Sets the value of the txRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link References25 }
     *     
     */
    public MarketClaimCreationV04 setTxRef(References25 value) {
        this.txRef = value;
        return this;
    }

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformation181 }
     *     
     */
    public CorporateActionGeneralInformation181 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformation181 }
     *     
     */
    public MarketClaimCreationV04 setCorpActnGnlInf(CorporateActionGeneralInformation181 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the rltdSttlmInstrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedSettlementInstruction2 }
     *     
     */
    public RelatedSettlementInstruction2 getRltdSttlmInstrDtls() {
        return rltdSttlmInstrDtls;
    }

    /**
     * Sets the value of the rltdSttlmInstrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedSettlementInstruction2 }
     *     
     */
    public MarketClaimCreationV04 setRltdSttlmInstrDtls(RelatedSettlementInstruction2 value) {
        this.rltdSttlmInstrDtls = value;
        return this;
    }

    /**
     * Gets the value of the acctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification70 }
     *     
     */
    public AccountIdentification70 getAcctDtls() {
        return acctDtls;
    }

    /**
     * Sets the value of the acctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification70 }
     *     
     */
    public MarketClaimCreationV04 setAcctDtls(AccountIdentification70 value) {
        this.acctDtls = value;
        return this;
    }

    /**
     * Gets the value of the corpActnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateAction59 }
     *     
     */
    public CorporateAction59 getCorpActnDtls() {
        return corpActnDtls;
    }

    /**
     * Sets the value of the corpActnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateAction59 }
     *     
     */
    public MarketClaimCreationV04 setCorpActnDtls(CorporateAction59 value) {
        this.corpActnDtls = value;
        return this;
    }

    /**
     * Gets the value of the mktClmTp property.
     * 
     * @return
     *     possible object is
     *     {@link MarketClaimType1Code }
     *     
     */
    public MarketClaimType1Code getMktClmTp() {
        return mktClmTp;
    }

    /**
     * Sets the value of the mktClmTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketClaimType1Code }
     *     
     */
    public MarketClaimCreationV04 setMktClmTp(MarketClaimType1Code value) {
        this.mktClmTp = value;
        return this;
    }

    /**
     * Gets the value of the mktClmSttlmInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMktClmSttlmInd() {
        return mktClmSttlmInd;
    }

    /**
     * Sets the value of the mktClmSttlmInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public MarketClaimCreationV04 setMktClmSttlmInd(Boolean value) {
        this.mktClmSttlmInd = value;
        return this;
    }

    /**
     * Gets the value of the mktClmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption234 }
     *     
     */
    public CorporateActionOption234 getMktClmDtls() {
        return mktClmDtls;
    }

    /**
     * Sets the value of the mktClmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption234 }
     *     
     */
    public MarketClaimCreationV04 setMktClmDtls(CorporateActionOption234 value) {
        this.mktClmDtls = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties123 }
     *     
     */
    public SettlementParties123 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Sets the value of the dlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties123 }
     *     
     */
    public MarketClaimCreationV04 setDlvrgSttlmPties(SettlementParties123 value) {
        this.dlvrgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the rcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties124 }
     *     
     */
    public SettlementParties124 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Sets the value of the rcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties124 }
     *     
     */
    public MarketClaimCreationV04 setRcvgSttlmPties(SettlementParties124 value) {
        this.rcvgSttlmPties = value;
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
    public MarketClaimCreationV04 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
