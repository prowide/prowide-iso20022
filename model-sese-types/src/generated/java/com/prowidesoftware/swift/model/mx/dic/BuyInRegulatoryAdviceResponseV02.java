
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
 * Scope
 * 
 * An account servicer sends a BuyInRegulatoryAdviceResponse to an account owner to advise the status of a buy-in report previously instructed by the account owner.
 * 
 * The account servicer/owner relationship may be:
 * 
 * - a central securities depository or another settlement market infrastructure acting on behalf of their participants
 * 
 * - an agent (sub-custodian) acting on behalf of their global custodian customer, or
 * 
 * - a custodian acting on behalf of an investment management institution or a broker/dealer.
 * 
 * 
 * 
 * Usage
 * 
 * A BuyInRegulatpryReport may contain reports on multiple transactions. However, one BuyInRegulatoryReportStatusAdvice must be sent per transaction reported  unless the BuyInRegulatoryReport is rejected as a whole.
 * 
 * 
 * The message may also be used to:
 * - re-send a message previously sent,
 * 
 * - provide a third party with a copy of a message for information,
 * 
 * - re-send to a third party a copy of a message for information using the relevant elements in the Business Application Header.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuyInRegulatoryAdviceResponseV02", propOrder = {
    "advcRef",
    "acctOwnr",
    "sfkpgAcct",
    "buyInAttrbts",
    "prcgSts",
    "splmtryData"
})
public class BuyInRegulatoryAdviceResponseV02 {

    @XmlElement(name = "AdvcRef", required = true)
    protected Identification14 advcRef;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification144 acctOwnr;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount19 sfkpgAcct;
    @XmlElement(name = "BuyInAttrbts")
    protected List<BuyInAdviceDetails2> buyInAttrbts;
    @XmlElement(name = "PrcgSts", required = true)
    protected ProcessingStatus79Choice prcgSts;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the advcRef property.
     * 
     * @return
     *     possible object is
     *     {@link Identification14 }
     *     
     */
    public Identification14 getAdvcRef() {
        return advcRef;
    }

    /**
     * Sets the value of the advcRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identification14 }
     *     
     */
    public BuyInRegulatoryAdviceResponseV02 setAdvcRef(Identification14 value) {
        this.advcRef = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification144 }
     *     
     */
    public PartyIdentification144 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification144 }
     *     
     */
    public BuyInRegulatoryAdviceResponseV02 setAcctOwnr(PartyIdentification144 value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public BuyInRegulatoryAdviceResponseV02 setSfkpgAcct(SecuritiesAccount19 value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the buyInAttrbts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buyInAttrbts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyInAttrbts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BuyInAdviceDetails2 }
     * 
     * 
     */
    public List<BuyInAdviceDetails2> getBuyInAttrbts() {
        if (buyInAttrbts == null) {
            buyInAttrbts = new ArrayList<BuyInAdviceDetails2>();
        }
        return this.buyInAttrbts;
    }

    /**
     * Gets the value of the prcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingStatus79Choice }
     *     
     */
    public ProcessingStatus79Choice getPrcgSts() {
        return prcgSts;
    }

    /**
     * Sets the value of the prcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingStatus79Choice }
     *     
     */
    public BuyInRegulatoryAdviceResponseV02 setPrcgSts(ProcessingStatus79Choice value) {
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
     * Adds a new item to the buyInAttrbts list.
     * @see #getBuyInAttrbts()
     * 
     */
    public BuyInRegulatoryAdviceResponseV02 addBuyInAttrbts(BuyInAdviceDetails2 buyInAttrbts) {
        getBuyInAttrbts().add(buyInAttrbts);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public BuyInRegulatoryAdviceResponseV02 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
