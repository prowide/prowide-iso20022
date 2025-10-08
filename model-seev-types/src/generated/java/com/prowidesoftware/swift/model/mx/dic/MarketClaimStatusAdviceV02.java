
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
 * Scope and Usage
 * The MarketClaimStatusAdvice message is sent by an account servicer to an account holder to provide the status of a market claim transaction.
 * This message definition is intended for use with the Business Application Header (BAH).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketClaimStatusAdviceV02", propOrder = {
    "mktClmCreId",
    "txRef",
    "corpActnGnlInf",
    "acctDtls",
    "mktClmPrcgSts",
    "mktClmDtls",
    "splmtryData"
})
public class MarketClaimStatusAdviceV02 {

    @XmlElement(name = "MktClmCreId")
    protected DocumentIdentification9 mktClmCreId;
    @XmlElement(name = "TxRef", required = true)
    protected References26 txRef;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionGeneralInformation157 corpActnGnlInf;
    @XmlElement(name = "AcctDtls")
    protected AccountIdentification46 acctDtls;
    @XmlElement(name = "MktClmPrcgSts", required = true)
    protected MarketClaimProcessingStatus1Choice mktClmPrcgSts;
    @XmlElement(name = "MktClmDtls")
    protected CorporateActionOption217 mktClmDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the mktClmCreId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification9 }
     *     
     */
    public DocumentIdentification9 getMktClmCreId() {
        return mktClmCreId;
    }

    /**
     * Sets the value of the mktClmCreId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification9 }
     *     
     */
    public MarketClaimStatusAdviceV02 setMktClmCreId(DocumentIdentification9 value) {
        this.mktClmCreId = value;
        return this;
    }

    /**
     * Gets the value of the txRef property.
     * 
     * @return
     *     possible object is
     *     {@link References26 }
     *     
     */
    public References26 getTxRef() {
        return txRef;
    }

    /**
     * Sets the value of the txRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link References26 }
     *     
     */
    public MarketClaimStatusAdviceV02 setTxRef(References26 value) {
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
    public MarketClaimStatusAdviceV02 setCorpActnGnlInf(CorporateActionGeneralInformation157 value) {
        this.corpActnGnlInf = value;
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
    public MarketClaimStatusAdviceV02 setAcctDtls(AccountIdentification46 value) {
        this.acctDtls = value;
        return this;
    }

    /**
     * Gets the value of the mktClmPrcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link MarketClaimProcessingStatus1Choice }
     *     
     */
    public MarketClaimProcessingStatus1Choice getMktClmPrcgSts() {
        return mktClmPrcgSts;
    }

    /**
     * Sets the value of the mktClmPrcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketClaimProcessingStatus1Choice }
     *     
     */
    public MarketClaimStatusAdviceV02 setMktClmPrcgSts(MarketClaimProcessingStatus1Choice value) {
        this.mktClmPrcgSts = value;
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
    public MarketClaimStatusAdviceV02 setMktClmDtls(CorporateActionOption217 value) {
        this.mktClmDtls = value;
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
    public MarketClaimStatusAdviceV02 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
