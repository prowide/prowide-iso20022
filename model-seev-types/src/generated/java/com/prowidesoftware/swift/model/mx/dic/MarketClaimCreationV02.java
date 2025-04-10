
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
 * The MarketClaimCreation message is sent by an account servicer to an account holder to advise of the creation of a market claim transaction on a securities account, for example by a CSD that has automatically generated market claims on a mandatory distribution type of corporate action event. The MarketClaimCreation message may also be sent by an account holder to its account servicer, to instruct settlement of a bilaterally agreed (as opposed to centrally generated) market claim for a corporate action event.
 * This message definition is intended for use with the Business Application Header (BAH).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketClaimCreationV02", propOrder = {
    "txRef",
    "corpActnGnlInf",
    "rltdSttlmInstrDtls",
    "acctDtls",
    "corpActnDtls",
    "mktClmTp",
    "mktClmDtls",
    "dlvrgSttlmPties",
    "rcvgSttlmPties",
    "splmtryData"
})
public class MarketClaimCreationV02 {

    @XmlElement(name = "TxRef", required = true)
    protected References25 txRef;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionGeneralInformation157 corpActnGnlInf;
    @XmlElement(name = "RltdSttlmInstrDtls", required = true)
    protected RelatedSettlementInstruction1 rltdSttlmInstrDtls;
    @XmlElement(name = "AcctDtls", required = true)
    protected AccountIdentification46 acctDtls;
    @XmlElement(name = "CorpActnDtls")
    protected CorporateAction59 corpActnDtls;
    @XmlElement(name = "MktClmTp", required = true)
    @XmlSchemaType(name = "string")
    protected MarketClaimType1Code mktClmTp;
    @XmlElement(name = "MktClmDtls", required = true)
    protected CorporateActionOption217 mktClmDtls;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties122 dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties122 rcvgSttlmPties;
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
    public MarketClaimCreationV02 setTxRef(References25 value) {
        this.txRef = value;
        return this;
    }

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformation157 }
     *     
     */
    public CorporateActionGeneralInformation157 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformation157 }
     *     
     */
    public MarketClaimCreationV02 setCorpActnGnlInf(CorporateActionGeneralInformation157 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the rltdSttlmInstrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedSettlementInstruction1 }
     *     
     */
    public RelatedSettlementInstruction1 getRltdSttlmInstrDtls() {
        return rltdSttlmInstrDtls;
    }

    /**
     * Sets the value of the rltdSttlmInstrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedSettlementInstruction1 }
     *     
     */
    public MarketClaimCreationV02 setRltdSttlmInstrDtls(RelatedSettlementInstruction1 value) {
        this.rltdSttlmInstrDtls = value;
        return this;
    }

    /**
     * Gets the value of the acctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification46 }
     *     
     */
    public AccountIdentification46 getAcctDtls() {
        return acctDtls;
    }

    /**
     * Sets the value of the acctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification46 }
     *     
     */
    public MarketClaimCreationV02 setAcctDtls(AccountIdentification46 value) {
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
    public MarketClaimCreationV02 setCorpActnDtls(CorporateAction59 value) {
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
    public MarketClaimCreationV02 setMktClmTp(MarketClaimType1Code value) {
        this.mktClmTp = value;
        return this;
    }

    /**
     * Gets the value of the mktClmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption217 }
     *     
     */
    public CorporateActionOption217 getMktClmDtls() {
        return mktClmDtls;
    }

    /**
     * Sets the value of the mktClmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption217 }
     *     
     */
    public MarketClaimCreationV02 setMktClmDtls(CorporateActionOption217 value) {
        this.mktClmDtls = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties122 }
     *     
     */
    public SettlementParties122 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Sets the value of the dlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties122 }
     *     
     */
    public MarketClaimCreationV02 setDlvrgSttlmPties(SettlementParties122 value) {
        this.dlvrgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the rcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties122 }
     *     
     */
    public SettlementParties122 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Sets the value of the rcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties122 }
     *     
     */
    public MarketClaimCreationV02 setRcvgSttlmPties(SettlementParties122 value) {
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
    public MarketClaimCreationV02 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
