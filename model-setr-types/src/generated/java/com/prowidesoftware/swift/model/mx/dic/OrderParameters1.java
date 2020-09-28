
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Parameters of the transfer of a financial instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderParameters1", propOrder = {
    "tmInForce",
    "tp",
    "xpryDtAndTm",
    "fctvDtAndTm",
    "hdlgInstr",
    "stockLctReqrdInd",
    "mnyLndrgSts",
    "rptgInd",
    "prtyTp",
    "tradTxCondInd",
    "autoRtgInd",
    "pricPrtcnScp",
    "stopPric",
    "trgtStrtgy",
    "cmplcId",
    "preTradAnmtyInd",
    "goodTillBookg",
    "prcCd",
    "pegInstrsDtls"
})
public class OrderParameters1 {

    @XmlElement(name = "TmInForce")
    @XmlSchemaType(name = "string")
    protected ExecutionTimeLimit1Code tmInForce;
    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected OrderType1Code tp;
    @XmlElement(name = "XpryDtAndTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar xpryDtAndTm;
    @XmlElement(name = "FctvDtAndTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fctvDtAndTm;
    @XmlElement(name = "HdlgInstr")
    @XmlSchemaType(name = "string")
    protected TradingFloorOrderHandling1Code hdlgInstr;
    @XmlElement(name = "StockLctReqrdInd")
    protected Boolean stockLctReqrdInd;
    @XmlElement(name = "MnyLndrgSts")
    @XmlSchemaType(name = "string")
    protected MoneyLaunderingCheck1Code mnyLndrgSts;
    @XmlElement(name = "RptgInd")
    @XmlSchemaType(name = "string")
    protected Reporting1Code rptgInd;
    @XmlElement(name = "PrtyTp")
    @XmlSchemaType(name = "string")
    protected Priority1Code prtyTp;
    @XmlElement(name = "TradTxCondInd")
    @XmlSchemaType(name = "string")
    protected List<TradeTransactionCondition1Code> tradTxCondInd;
    @XmlElement(name = "AutoRtgInd")
    @XmlSchemaType(name = "string")
    protected AutoRouting1Code autoRtgInd;
    @XmlElement(name = "PricPrtcnScp")
    @XmlSchemaType(name = "string")
    protected PriceProtectionScope1Code pricPrtcnScp;
    @XmlElement(name = "StopPric")
    protected Price1 stopPric;
    @XmlElement(name = "TrgtStrtgy")
    protected String trgtStrtgy;
    @XmlElement(name = "CmplcId")
    protected String cmplcId;
    @XmlElement(name = "PreTradAnmtyInd")
    protected Boolean preTradAnmtyInd;
    @XmlElement(name = "GoodTillBookg")
    @XmlSchemaType(name = "string")
    protected GoodTillBookingInstruction1Code goodTillBookg;
    @XmlElement(name = "PrcCd")
    @XmlSchemaType(name = "string")
    protected CommissionType8Code prcCd;
    @XmlElement(name = "PegInstrsDtls")
    protected PegOrderInstructions1 pegInstrsDtls;

    /**
     * Gets the value of the tmInForce property.
     * 
     * @return
     *     possible object is
     *     {@link ExecutionTimeLimit1Code }
     *     
     */
    public ExecutionTimeLimit1Code getTmInForce() {
        return tmInForce;
    }

    /**
     * Sets the value of the tmInForce property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutionTimeLimit1Code }
     *     
     */
    public OrderParameters1 setTmInForce(ExecutionTimeLimit1Code value) {
        this.tmInForce = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link OrderType1Code }
     *     
     */
    public OrderType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderType1Code }
     *     
     */
    public OrderParameters1 setTp(OrderType1Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the xpryDtAndTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXpryDtAndTm() {
        return xpryDtAndTm;
    }

    /**
     * Sets the value of the xpryDtAndTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public OrderParameters1 setXpryDtAndTm(XMLGregorianCalendar value) {
        this.xpryDtAndTm = value;
        return this;
    }

    /**
     * Gets the value of the fctvDtAndTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFctvDtAndTm() {
        return fctvDtAndTm;
    }

    /**
     * Sets the value of the fctvDtAndTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public OrderParameters1 setFctvDtAndTm(XMLGregorianCalendar value) {
        this.fctvDtAndTm = value;
        return this;
    }

    /**
     * Gets the value of the hdlgInstr property.
     * 
     * @return
     *     possible object is
     *     {@link TradingFloorOrderHandling1Code }
     *     
     */
    public TradingFloorOrderHandling1Code getHdlgInstr() {
        return hdlgInstr;
    }

    /**
     * Sets the value of the hdlgInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingFloorOrderHandling1Code }
     *     
     */
    public OrderParameters1 setHdlgInstr(TradingFloorOrderHandling1Code value) {
        this.hdlgInstr = value;
        return this;
    }

    /**
     * Gets the value of the stockLctReqrdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStockLctReqrdInd() {
        return stockLctReqrdInd;
    }

    /**
     * Sets the value of the stockLctReqrdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public OrderParameters1 setStockLctReqrdInd(Boolean value) {
        this.stockLctReqrdInd = value;
        return this;
    }

    /**
     * Gets the value of the mnyLndrgSts property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyLaunderingCheck1Code }
     *     
     */
    public MoneyLaunderingCheck1Code getMnyLndrgSts() {
        return mnyLndrgSts;
    }

    /**
     * Sets the value of the mnyLndrgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyLaunderingCheck1Code }
     *     
     */
    public OrderParameters1 setMnyLndrgSts(MoneyLaunderingCheck1Code value) {
        this.mnyLndrgSts = value;
        return this;
    }

    /**
     * Gets the value of the rptgInd property.
     * 
     * @return
     *     possible object is
     *     {@link Reporting1Code }
     *     
     */
    public Reporting1Code getRptgInd() {
        return rptgInd;
    }

    /**
     * Sets the value of the rptgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reporting1Code }
     *     
     */
    public OrderParameters1 setRptgInd(Reporting1Code value) {
        this.rptgInd = value;
        return this;
    }

    /**
     * Gets the value of the prtyTp property.
     * 
     * @return
     *     possible object is
     *     {@link Priority1Code }
     *     
     */
    public Priority1Code getPrtyTp() {
        return prtyTp;
    }

    /**
     * Sets the value of the prtyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority1Code }
     *     
     */
    public OrderParameters1 setPrtyTp(Priority1Code value) {
        this.prtyTp = value;
        return this;
    }

    /**
     * Gets the value of the tradTxCondInd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradTxCondInd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradTxCondInd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeTransactionCondition1Code }
     * 
     * 
     */
    public List<TradeTransactionCondition1Code> getTradTxCondInd() {
        if (tradTxCondInd == null) {
            tradTxCondInd = new ArrayList<TradeTransactionCondition1Code>();
        }
        return this.tradTxCondInd;
    }

    /**
     * Gets the value of the autoRtgInd property.
     * 
     * @return
     *     possible object is
     *     {@link AutoRouting1Code }
     *     
     */
    public AutoRouting1Code getAutoRtgInd() {
        return autoRtgInd;
    }

    /**
     * Sets the value of the autoRtgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoRouting1Code }
     *     
     */
    public OrderParameters1 setAutoRtgInd(AutoRouting1Code value) {
        this.autoRtgInd = value;
        return this;
    }

    /**
     * Gets the value of the pricPrtcnScp property.
     * 
     * @return
     *     possible object is
     *     {@link PriceProtectionScope1Code }
     *     
     */
    public PriceProtectionScope1Code getPricPrtcnScp() {
        return pricPrtcnScp;
    }

    /**
     * Sets the value of the pricPrtcnScp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceProtectionScope1Code }
     *     
     */
    public OrderParameters1 setPricPrtcnScp(PriceProtectionScope1Code value) {
        this.pricPrtcnScp = value;
        return this;
    }

    /**
     * Gets the value of the stopPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price1 }
     *     
     */
    public Price1 getStopPric() {
        return stopPric;
    }

    /**
     * Sets the value of the stopPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price1 }
     *     
     */
    public OrderParameters1 setStopPric(Price1 value) {
        this.stopPric = value;
        return this;
    }

    /**
     * Gets the value of the trgtStrtgy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrgtStrtgy() {
        return trgtStrtgy;
    }

    /**
     * Sets the value of the trgtStrtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OrderParameters1 setTrgtStrtgy(String value) {
        this.trgtStrtgy = value;
        return this;
    }

    /**
     * Gets the value of the cmplcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmplcId() {
        return cmplcId;
    }

    /**
     * Sets the value of the cmplcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OrderParameters1 setCmplcId(String value) {
        this.cmplcId = value;
        return this;
    }

    /**
     * Gets the value of the preTradAnmtyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreTradAnmtyInd() {
        return preTradAnmtyInd;
    }

    /**
     * Sets the value of the preTradAnmtyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public OrderParameters1 setPreTradAnmtyInd(Boolean value) {
        this.preTradAnmtyInd = value;
        return this;
    }

    /**
     * Gets the value of the goodTillBookg property.
     * 
     * @return
     *     possible object is
     *     {@link GoodTillBookingInstruction1Code }
     *     
     */
    public GoodTillBookingInstruction1Code getGoodTillBookg() {
        return goodTillBookg;
    }

    /**
     * Sets the value of the goodTillBookg property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodTillBookingInstruction1Code }
     *     
     */
    public OrderParameters1 setGoodTillBookg(GoodTillBookingInstruction1Code value) {
        this.goodTillBookg = value;
        return this;
    }

    /**
     * Gets the value of the prcCd property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionType8Code }
     *     
     */
    public CommissionType8Code getPrcCd() {
        return prcCd;
    }

    /**
     * Sets the value of the prcCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionType8Code }
     *     
     */
    public OrderParameters1 setPrcCd(CommissionType8Code value) {
        this.prcCd = value;
        return this;
    }

    /**
     * Gets the value of the pegInstrsDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PegOrderInstructions1 }
     *     
     */
    public PegOrderInstructions1 getPegInstrsDtls() {
        return pegInstrsDtls;
    }

    /**
     * Sets the value of the pegInstrsDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PegOrderInstructions1 }
     *     
     */
    public OrderParameters1 setPegInstrsDtls(PegOrderInstructions1 value) {
        this.pegInstrsDtls = value;
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
     * Adds a new item to the tradTxCondInd list.
     * @see #getTradTxCondInd()
     * 
     */
    public OrderParameters1 addTradTxCondInd(TradeTransactionCondition1Code tradTxCondInd) {
        getTradTxCondInd().add(tradTxCondInd);
        return this;
    }

}
