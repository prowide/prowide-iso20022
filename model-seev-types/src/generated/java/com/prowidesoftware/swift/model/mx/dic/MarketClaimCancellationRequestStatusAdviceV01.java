
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
 * The MarketClaimCancellationRequestStatusAdvice message is sent by an account servicer to an account holder to provide the status of a market claim transaction cancellation request.
 * This message definition is intended for use with the Business Application Header (BAH).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketClaimCancellationRequestStatusAdviceV01", propOrder = {
    "mktClmCxlReqId",
    "txRef",
    "corpActnGnlInf",
    "mktClmCxlReqSts",
    "mktClmDtls",
    "splmtryData"
})
public class MarketClaimCancellationRequestStatusAdviceV01 {

    @XmlElement(name = "MktClmCxlReqId", required = true)
    protected DocumentIdentification9 mktClmCxlReqId;
    @XmlElement(name = "TxRef", required = true)
    protected References26 txRef;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionGeneralInformation157 corpActnGnlInf;
    @XmlElement(name = "MktClmCxlReqSts", required = true)
    protected MarketClaimCancellationRequestStatus1Choice mktClmCxlReqSts;
    @XmlElement(name = "MktClmDtls")
    protected CorporateActionOption185 mktClmDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the mktClmCxlReqId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification9 }
     *     
     */
    public DocumentIdentification9 getMktClmCxlReqId() {
        return mktClmCxlReqId;
    }

    /**
     * Sets the value of the mktClmCxlReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification9 }
     *     
     */
    public MarketClaimCancellationRequestStatusAdviceV01 setMktClmCxlReqId(DocumentIdentification9 value) {
        this.mktClmCxlReqId = value;
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
    public MarketClaimCancellationRequestStatusAdviceV01 setTxRef(References26 value) {
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
    public MarketClaimCancellationRequestStatusAdviceV01 setCorpActnGnlInf(CorporateActionGeneralInformation157 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the mktClmCxlReqSts property.
     * 
     * @return
     *     possible object is
     *     {@link MarketClaimCancellationRequestStatus1Choice }
     *     
     */
    public MarketClaimCancellationRequestStatus1Choice getMktClmCxlReqSts() {
        return mktClmCxlReqSts;
    }

    /**
     * Sets the value of the mktClmCxlReqSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketClaimCancellationRequestStatus1Choice }
     *     
     */
    public MarketClaimCancellationRequestStatusAdviceV01 setMktClmCxlReqSts(MarketClaimCancellationRequestStatus1Choice value) {
        this.mktClmCxlReqSts = value;
        return this;
    }

    /**
     * Gets the value of the mktClmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption185 }
     *     
     */
    public CorporateActionOption185 getMktClmDtls() {
        return mktClmDtls;
    }

    /**
     * Sets the value of the mktClmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption185 }
     *     
     */
    public MarketClaimCancellationRequestStatusAdviceV01 setMktClmDtls(CorporateActionOption185 value) {
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
    public MarketClaimCancellationRequestStatusAdviceV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
