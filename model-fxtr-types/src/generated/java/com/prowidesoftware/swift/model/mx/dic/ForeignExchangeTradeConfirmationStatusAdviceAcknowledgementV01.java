
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Scope
 * The ForeignExchangeTradeConfirmationStatusAdviceAcknowledgement message is sent from a market participant to a Central matching utility (CMU) in response to the FXTradeConfirmationStatusAdvice previously sent by the CMU in the scenario of trades matched by both participants.
 * 
 * Usage
 * The acknowledgement is sent by the trading member to the CMU after they received the confirmation status advice. 
 * Note that one confirmation status advice acknowledgement responds to one confirmation status advice.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01", propOrder = {
    "advcAckId",
    "reqId",
    "tradDt",
    "tradId",
    "tradgMd",
    "affirmSts",
    "confSts",
    "mktId",
    "addtlInf",
    "splmtryData"
})
public class ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 {

    @XmlElement(name = "AdvcAckId")
    protected MessageIdentification1 advcAckId;
    @XmlElement(name = "ReqId", required = true)
    protected MessageIdentification1 reqId;
    @XmlElement(name = "TradDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate tradDt;
    @XmlElement(name = "TradId", required = true)
    protected String tradId;
    @XmlElement(name = "TradgMd", required = true)
    @XmlSchemaType(name = "string")
    protected TradingModeType1Code tradgMd;
    @XmlElement(name = "AffirmSts", required = true)
    @XmlSchemaType(name = "string")
    protected AffirmStatus1Code affirmSts;
    @XmlElement(name = "ConfSts", required = true)
    @XmlSchemaType(name = "string")
    protected TradeConfirmationStatus1Code confSts;
    @XmlElement(name = "MktId", required = true)
    protected MarketIdentification88 mktId;
    @XmlElement(name = "AddtlInf")
    protected AdditionalInformation5 addtlInf;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the advcAckId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getAdvcAckId() {
        return advcAckId;
    }

    /**
     * Sets the value of the advcAckId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 setAdvcAckId(MessageIdentification1 value) {
        this.advcAckId = value;
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
    public ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 setReqId(MessageIdentification1 value) {
        this.reqId = value;
        return this;
    }

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 setTradDt(LocalDate value) {
        this.tradDt = value;
        return this;
    }

    /**
     * Gets the value of the tradId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradId() {
        return tradId;
    }

    /**
     * Sets the value of the tradId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 setTradId(String value) {
        this.tradId = value;
        return this;
    }

    /**
     * Gets the value of the tradgMd property.
     * 
     * @return
     *     possible object is
     *     {@link TradingModeType1Code }
     *     
     */
    public TradingModeType1Code getTradgMd() {
        return tradgMd;
    }

    /**
     * Sets the value of the tradgMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingModeType1Code }
     *     
     */
    public ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 setTradgMd(TradingModeType1Code value) {
        this.tradgMd = value;
        return this;
    }

    /**
     * Gets the value of the affirmSts property.
     * 
     * @return
     *     possible object is
     *     {@link AffirmStatus1Code }
     *     
     */
    public AffirmStatus1Code getAffirmSts() {
        return affirmSts;
    }

    /**
     * Sets the value of the affirmSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffirmStatus1Code }
     *     
     */
    public ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 setAffirmSts(AffirmStatus1Code value) {
        this.affirmSts = value;
        return this;
    }

    /**
     * Gets the value of the confSts property.
     * 
     * @return
     *     possible object is
     *     {@link TradeConfirmationStatus1Code }
     *     
     */
    public TradeConfirmationStatus1Code getConfSts() {
        return confSts;
    }

    /**
     * Sets the value of the confSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeConfirmationStatus1Code }
     *     
     */
    public ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 setConfSts(TradeConfirmationStatus1Code value) {
        this.confSts = value;
        return this;
    }

    /**
     * Gets the value of the mktId property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification88 }
     *     
     */
    public MarketIdentification88 getMktId() {
        return mktId;
    }

    /**
     * Sets the value of the mktId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification88 }
     *     
     */
    public ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 setMktId(MarketIdentification88 value) {
        this.mktId = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInformation5 }
     *     
     */
    public AdditionalInformation5 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInformation5 }
     *     
     */
    public ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 setAddtlInf(AdditionalInformation5 value) {
        this.addtlInf = value;
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
    public ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
