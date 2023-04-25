
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.Calendar;
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
 * Specifies the identification, order type, expiry date and if required, rejection reason, for a specific set of quotes.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteEntry2", propOrder = {
    "id",
    "ordrTp",
    "vldUntilDtTm",
    "ccy",
    "rjctRsn",
    "offerSd",
    "midSd",
    "bidSd",
    "finInstrmDtls",
    "finInstrmAttrbts",
    "instrmLegGrpDtls",
    "legFinInstrmAttrbts",
    "tradgSsnDtls",
    "sttlmDtls"
})
public class QuoteEntry2 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "OrdrTp")
    @XmlSchemaType(name = "string")
    protected OrderType1Code ordrTp;
    @XmlElement(name = "VldUntilDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar vldUntilDtTm;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "RjctRsn")
    @XmlSchemaType(name = "string")
    protected RejectionReason3Code rjctRsn;
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
    @XmlElement(name = "InstrmLegGrpDtls")
    protected List<InstrumentLeg2> instrmLegGrpDtls;
    @XmlElement(name = "LegFinInstrmAttrbts")
    protected List<FinancialInstrumentAttributes1> legFinInstrmAttrbts;
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
    public QuoteEntry2 setId(String value) {
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
    public QuoteEntry2 setOrdrTp(OrderType1Code value) {
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
    public Calendar getVldUntilDtTm() {
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
    public QuoteEntry2 setVldUntilDtTm(Calendar value) {
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
    public QuoteEntry2 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the rjctRsn property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionReason3Code }
     *     
     */
    public RejectionReason3Code getRjctRsn() {
        return rjctRsn;
    }

    /**
     * Sets the value of the rjctRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionReason3Code }
     *     
     */
    public QuoteEntry2 setRjctRsn(RejectionReason3Code value) {
        this.rjctRsn = value;
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
    public QuoteEntry2 setFinInstrmDtls(SecurityIdentification7 value) {
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
    public QuoteEntry2 setFinInstrmAttrbts(FinancialInstrumentAttributes1 value) {
        this.finInstrmAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the instrmLegGrpDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the instrmLegGrpDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrmLegGrpDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstrumentLeg2 }
     * 
     * 
     * @return
     *     The value of the instrmLegGrpDtls property.
     */
    public List<InstrumentLeg2> getInstrmLegGrpDtls() {
        if (instrmLegGrpDtls == null) {
            instrmLegGrpDtls = new ArrayList<>();
        }
        return this.instrmLegGrpDtls;
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
    public QuoteEntry2 setTradgSsnDtls(TradingSession1 value) {
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
    public QuoteEntry2 setSttlmDtls(SecuritiesSettlement1 value) {
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
    public QuoteEntry2 addOfferSd(QuoteSide1 offerSd) {
        getOfferSd().add(offerSd);
        return this;
    }

    /**
     * Adds a new item to the midSd list.
     * @see #getMidSd()
     * 
     */
    public QuoteEntry2 addMidSd(QuoteSide1 midSd) {
        getMidSd().add(midSd);
        return this;
    }

    /**
     * Adds a new item to the bidSd list.
     * @see #getBidSd()
     * 
     */
    public QuoteEntry2 addBidSd(QuoteSide1 bidSd) {
        getBidSd().add(bidSd);
        return this;
    }

    /**
     * Adds a new item to the instrmLegGrpDtls list.
     * @see #getInstrmLegGrpDtls()
     * 
     */
    public QuoteEntry2 addInstrmLegGrpDtls(InstrumentLeg2 instrmLegGrpDtls) {
        getInstrmLegGrpDtls().add(instrmLegGrpDtls);
        return this;
    }

    /**
     * Adds a new item to the legFinInstrmAttrbts list.
     * @see #getLegFinInstrmAttrbts()
     * 
     */
    public QuoteEntry2 addLegFinInstrmAttrbts(FinancialInstrumentAttributes1 legFinInstrmAttrbts) {
        getLegFinInstrmAttrbts().add(legFinInstrmAttrbts);
        return this;
    }

}
