
package com.prowidesoftware.swift.model.mx.dic;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
 * Specifies a number of quotes, order and settlement conditions for a specific set of quotes.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteEntry1", propOrder = {
    "id",
    "ordrTp",
    "vldUntilDtTm",
    "ccy",
    "instrmLegGrpDtls",
    "offerSd",
    "midSd",
    "bidSd",
    "finInstrmDtls",
    "finInstrmAttrbts",
    "instrmLegDtls",
    "legFinInstrmAttrbts",
    "legStiptns",
    "tradgSsnDtls",
    "sttlmDtls"
})
public class QuoteEntry1 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "OrdrTp")
    @XmlSchemaType(name = "string")
    protected OrderType1Code ordrTp;
    @XmlElement(name = "VldUntilDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime vldUntilDtTm;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "InstrmLegGrpDtls")
    protected InstrumentLeg2 instrmLegGrpDtls;
    @XmlElement(name = "OfferSd")
    protected List<QuoteSide1> offerSd;
    @XmlElement(name = "MidSd")
    protected List<QuoteSide1> midSd;
    @XmlElement(name = "BidSd")
    protected List<QuoteSide1> bidSd;
    @XmlElement(name = "FinInstrmDtls", required = true)
    protected SecurityIdentification7 finInstrmDtls;
    @XmlElement(name = "FinInstrmAttrbts")
    protected FinancialInstrumentAttributes1 finInstrmAttrbts;
    @XmlElement(name = "InstrmLegDtls")
    protected List<SecurityIdentification7> instrmLegDtls;
    @XmlElement(name = "LegFinInstrmAttrbts")
    protected List<FinancialInstrumentAttributes1> legFinInstrmAttrbts;
    @XmlElement(name = "LegStiptns")
    protected List<FinancialInstrumentStipulations> legStiptns;
    @XmlElement(name = "TradgSsnDtls")
    protected TradingSession1 tradgSsnDtls;
    @XmlElement(name = "SttlmDtls")
    protected SecuritiesSettlement1 sttlmDtls;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public QuoteEntry1 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the ordrTp property.
     * 
     * @return
     *     possible object is
     *     {@link OrderType1Code }
     *     
     */
    public OrderType1Code getOrdrTp() {
        return ordrTp;
    }

    /**
     * Sets the value of the ordrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderType1Code }
     *     
     */
    public QuoteEntry1 setOrdrTp(OrderType1Code value) {
        this.ordrTp = value;
        return this;
    }

    /**
     * Gets the value of the vldUntilDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getVldUntilDtTm() {
        return vldUntilDtTm;
    }

    /**
     * Sets the value of the vldUntilDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public QuoteEntry1 setVldUntilDtTm(OffsetDateTime value) {
        this.vldUntilDtTm = value;
        return this;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public QuoteEntry1 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the instrmLegGrpDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentLeg2 }
     *     
     */
    public InstrumentLeg2 getInstrmLegGrpDtls() {
        return instrmLegGrpDtls;
    }

    /**
     * Sets the value of the instrmLegGrpDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentLeg2 }
     *     
     */
    public QuoteEntry1 setInstrmLegGrpDtls(InstrumentLeg2 value) {
        this.instrmLegGrpDtls = value;
        return this;
    }

    /**
     * Gets the value of the offerSd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the offerSd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferSd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuoteSide1 }
     * 
     * 
     * @return
     *     The value of the offerSd property.
     */
    public List<QuoteSide1> getOfferSd() {
        if (offerSd == null) {
            offerSd = new ArrayList<>();
        }
        return this.offerSd;
    }

    /**
     * Gets the value of the midSd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the midSd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMidSd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuoteSide1 }
     * 
     * 
     * @return
     *     The value of the midSd property.
     */
    public List<QuoteSide1> getMidSd() {
        if (midSd == null) {
            midSd = new ArrayList<>();
        }
        return this.midSd;
    }

    /**
     * Gets the value of the bidSd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bidSd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBidSd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuoteSide1 }
     * 
     * 
     * @return
     *     The value of the bidSd property.
     */
    public List<QuoteSide1> getBidSd() {
        if (bidSd == null) {
            bidSd = new ArrayList<>();
        }
        return this.bidSd;
    }

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public SecurityIdentification7 getFinInstrmDtls() {
        return finInstrmDtls;
    }

    /**
     * Sets the value of the finInstrmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public QuoteEntry1 setFinInstrmDtls(SecurityIdentification7 value) {
        this.finInstrmDtls = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes1 }
     *     
     */
    public FinancialInstrumentAttributes1 getFinInstrmAttrbts() {
        return finInstrmAttrbts;
    }

    /**
     * Sets the value of the finInstrmAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes1 }
     *     
     */
    public QuoteEntry1 setFinInstrmAttrbts(FinancialInstrumentAttributes1 value) {
        this.finInstrmAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the instrmLegDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the instrmLegDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrmLegDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityIdentification7 }
     * 
     * 
     * @return
     *     The value of the instrmLegDtls property.
     */
    public List<SecurityIdentification7> getInstrmLegDtls() {
        if (instrmLegDtls == null) {
            instrmLegDtls = new ArrayList<>();
        }
        return this.instrmLegDtls;
    }

    /**
     * Gets the value of the legFinInstrmAttrbts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the legFinInstrmAttrbts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegFinInstrmAttrbts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrumentAttributes1 }
     * 
     * 
     * @return
     *     The value of the legFinInstrmAttrbts property.
     */
    public List<FinancialInstrumentAttributes1> getLegFinInstrmAttrbts() {
        if (legFinInstrmAttrbts == null) {
            legFinInstrmAttrbts = new ArrayList<>();
        }
        return this.legFinInstrmAttrbts;
    }

    /**
     * Gets the value of the legStiptns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the legStiptns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegStiptns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrumentStipulations }
     * 
     * 
     * @return
     *     The value of the legStiptns property.
     */
    public List<FinancialInstrumentStipulations> getLegStiptns() {
        if (legStiptns == null) {
            legStiptns = new ArrayList<>();
        }
        return this.legStiptns;
    }

    /**
     * Gets the value of the tradgSsnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TradingSession1 }
     *     
     */
    public TradingSession1 getTradgSsnDtls() {
        return tradgSsnDtls;
    }

    /**
     * Sets the value of the tradgSsnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingSession1 }
     *     
     */
    public QuoteEntry1 setTradgSsnDtls(TradingSession1 value) {
        this.tradgSsnDtls = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlement1 }
     *     
     */
    public SecuritiesSettlement1 getSttlmDtls() {
        return sttlmDtls;
    }

    /**
     * Sets the value of the sttlmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlement1 }
     *     
     */
    public QuoteEntry1 setSttlmDtls(SecuritiesSettlement1 value) {
        this.sttlmDtls = value;
        return this;
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
     * Adds a new item to the offerSd list.
     * @see #getOfferSd()
     * 
     */
    public QuoteEntry1 addOfferSd(QuoteSide1 offerSd) {
        getOfferSd().add(offerSd);
        return this;
    }

    /**
     * Adds a new item to the midSd list.
     * @see #getMidSd()
     * 
     */
    public QuoteEntry1 addMidSd(QuoteSide1 midSd) {
        getMidSd().add(midSd);
        return this;
    }

    /**
     * Adds a new item to the bidSd list.
     * @see #getBidSd()
     * 
     */
    public QuoteEntry1 addBidSd(QuoteSide1 bidSd) {
        getBidSd().add(bidSd);
        return this;
    }

    /**
     * Adds a new item to the instrmLegDtls list.
     * @see #getInstrmLegDtls()
     * 
     */
    public QuoteEntry1 addInstrmLegDtls(SecurityIdentification7 instrmLegDtls) {
        getInstrmLegDtls().add(instrmLegDtls);
        return this;
    }

    /**
     * Adds a new item to the legFinInstrmAttrbts list.
     * @see #getLegFinInstrmAttrbts()
     * 
     */
    public QuoteEntry1 addLegFinInstrmAttrbts(FinancialInstrumentAttributes1 legFinInstrmAttrbts) {
        getLegFinInstrmAttrbts().add(legFinInstrmAttrbts);
        return this;
    }

    /**
     * Adds a new item to the legStiptns list.
     * @see #getLegStiptns()
     * 
     */
    public QuoteEntry1 addLegStiptns(FinancialInstrumentStipulations legStiptns) {
        getLegStiptns().add(legStiptns);
        return this;
    }

}
