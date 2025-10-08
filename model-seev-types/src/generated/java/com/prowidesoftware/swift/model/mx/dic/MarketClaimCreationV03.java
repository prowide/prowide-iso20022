
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "MarketClaimCreationV03", propOrder = {
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
public class MarketClaimCreationV03 {

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
    public MarketClaimCreationV03 setTxRef(References25 value) {
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
    public MarketClaimCreationV03 setCorpActnGnlInf(CorporateActionGeneralInformation181 value) {
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
    public MarketClaimCreationV03 setRltdSttlmInstrDtls(RelatedSettlementInstruction2 value) {
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
    public MarketClaimCreationV03 setAcctDtls(AccountIdentification70 value) {
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
    public MarketClaimCreationV03 setCorpActnDtls(CorporateAction59 value) {
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
    public MarketClaimCreationV03 setMktClmTp(MarketClaimType1Code value) {
        this.mktClmTp = value;
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
    public MarketClaimCreationV03 setMktClmDtls(CorporateActionOption234 value) {
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
    public MarketClaimCreationV03 setDlvrgSttlmPties(SettlementParties123 value) {
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
    public MarketClaimCreationV03 setRcvgSttlmPties(SettlementParties124 value) {
        this.rcvgSttlmPties = value;
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
    public MarketClaimCreationV03 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
