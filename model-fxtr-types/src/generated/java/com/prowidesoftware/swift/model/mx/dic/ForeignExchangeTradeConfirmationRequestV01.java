
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
 * Scope
 *  The ForeignExchangeTradeConfirmationRequest message is sent from a market participant to a Central matching utility (CMU) to request a foreign exchange(spot/forward/swap) trade confirmation.
 * 
 * Usage
 * The confirmation request is sent by the market participants to the CMU after they receiving the capture reports.
 * Note that a confirmation request could be cancelled or amended.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignExchangeTradeConfirmationRequestV01", propOrder = {
    "hdr",
    "reqId",
    "tradDtl",
    "confTp",
    "qryPrd",
    "qryStartNb",
    "qryTradSts",
    "splmtryData"
})
public class ForeignExchangeTradeConfirmationRequestV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header23 hdr;
    @XmlElement(name = "ReqId", required = true)
    protected MessageIdentification1 reqId;
    @XmlElement(name = "TradDtl", required = true)
    protected Trade2 tradDtl;
    @XmlElement(name = "ConfTp", required = true)
    @XmlSchemaType(name = "string")
    protected ConfirmationRequest1Code confTp;
    @XmlElement(name = "QryPrd", required = true)
    protected Period4 qryPrd;
    @XmlElement(name = "QryStartNb", required = true)
    protected String qryStartNb;
    @XmlElement(name = "QryTradSts", required = true)
    @XmlSchemaType(name = "string")
    protected QueryTradeStatus1Code qryTradSts;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header23 }
     *     
     */
    public Header23 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header23 }
     *     
     */
    public ForeignExchangeTradeConfirmationRequestV01 setHdr(Header23 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the reqId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getReqId() {
        return reqId;
    }

    /**
     * Sets the value of the reqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public ForeignExchangeTradeConfirmationRequestV01 setReqId(MessageIdentification1 value) {
        this.reqId = value;
        return this;
    }

    /**
     * Gets the value of the tradDtl property.
     * 
     * @return
     *     possible object is
     *     {@link Trade2 }
     *     
     */
    public Trade2 getTradDtl() {
        return tradDtl;
    }

    /**
     * Sets the value of the tradDtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trade2 }
     *     
     */
    public ForeignExchangeTradeConfirmationRequestV01 setTradDtl(Trade2 value) {
        this.tradDtl = value;
        return this;
    }

    /**
     * Gets the value of the confTp property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationRequest1Code }
     *     
     */
    public ConfirmationRequest1Code getConfTp() {
        return confTp;
    }

    /**
     * Sets the value of the confTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationRequest1Code }
     *     
     */
    public ForeignExchangeTradeConfirmationRequestV01 setConfTp(ConfirmationRequest1Code value) {
        this.confTp = value;
        return this;
    }

    /**
     * Gets the value of the qryPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period4 }
     *     
     */
    public Period4 getQryPrd() {
        return qryPrd;
    }

    /**
     * Sets the value of the qryPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period4 }
     *     
     */
    public ForeignExchangeTradeConfirmationRequestV01 setQryPrd(Period4 value) {
        this.qryPrd = value;
        return this;
    }

    /**
     * Gets the value of the qryStartNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryStartNb() {
        return qryStartNb;
    }

    /**
     * Sets the value of the qryStartNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ForeignExchangeTradeConfirmationRequestV01 setQryStartNb(String value) {
        this.qryStartNb = value;
        return this;
    }

    /**
     * Gets the value of the qryTradSts property.
     * 
     * @return
     *     possible object is
     *     {@link QueryTradeStatus1Code }
     *     
     */
    public QueryTradeStatus1Code getQryTradSts() {
        return qryTradSts;
    }

    /**
     * Sets the value of the qryTradSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryTradeStatus1Code }
     *     
     */
    public ForeignExchangeTradeConfirmationRequestV01 setQryTradSts(QueryTradeStatus1Code value) {
        this.qryTradSts = value;
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
    public ForeignExchangeTradeConfirmationRequestV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
