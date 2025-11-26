
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
 * Details of the treasury trade captured.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Trade7", propOrder = {
    "tradId",
    "dtAndTm",
    "fxTradPdct",
    "tradgCcy",
    "sttlmCcy",
    "tradgMtd",
    "tradgMd",
    "clrMtd",
    "exctnTp",
    "symb",
    "plcOfConf",
    "txTm",
    "fxDtls",
    "swpLeg",
    "optn",
    "pdctId",
    "contraCcy",
    "dealTcktId",
    "cmbntnDealTcktId",
    "baseCcyOrAmt",
    "trgtCcyOrAmt",
    "dtConfd"
})
public class Trade7 {

    @XmlElement(name = "TradId", required = true)
    protected String tradId;
    @XmlElement(name = "DtAndTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime dtAndTm;
    @XmlElement(name = "FXTradPdct")
    @XmlSchemaType(name = "string")
    protected UnderlyingProductIdentifier1Code fxTradPdct;
    @XmlElement(name = "TradgCcy")
    protected String tradgCcy;
    @XmlElement(name = "SttlmCcy")
    protected String sttlmCcy;
    @XmlElement(name = "TradgMtd", required = true)
    @XmlSchemaType(name = "string")
    protected TradingMethodType1Code tradgMtd;
    @XmlElement(name = "TradgMd")
    @XmlSchemaType(name = "string")
    protected TradingModeType1Code tradgMd;
    @XmlElement(name = "ClrMtd", required = true)
    @XmlSchemaType(name = "string")
    protected ClearingMethod1Code clrMtd;
    @XmlElement(name = "ExctnTp", required = true)
    @XmlSchemaType(name = "string")
    protected OrderStatus8Code exctnTp;
    @XmlElement(name = "Symb", required = true)
    protected String symb;
    @XmlElement(name = "PlcOfConf")
    protected String plcOfConf;
    @XmlElement(name = "TxTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime txTm;
    @XmlElement(name = "FXDtls")
    protected Trade10 fxDtls;
    @XmlElement(name = "SwpLeg")
    protected List<InstrumentLeg7> swpLeg;
    @XmlElement(name = "Optn")
    protected Option16 optn;
    @XmlElement(name = "PdctId")
    protected SecurityIdentification38Choice pdctId;
    @XmlElement(name = "ContraCcy")
    protected String contraCcy;
    @XmlElement(name = "DealTcktId")
    protected String dealTcktId;
    @XmlElement(name = "CmbntnDealTcktId")
    protected String cmbntnDealTcktId;
    @XmlElement(name = "BaseCcyOrAmt")
    protected AmountAndCurrency2 baseCcyOrAmt;
    @XmlElement(name = "TrgtCcyOrAmt")
    protected AmountAndCurrency2 trgtCcyOrAmt;
    @XmlElement(name = "DtConfd", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dtConfd;

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
    public Trade7 setTradId(String value) {
        this.tradId = value;
        return this;
    }

    /**
     * Gets the value of the dtAndTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getDtAndTm() {
        return dtAndTm;
    }

    /**
     * Sets the value of the dtAndTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Trade7 setDtAndTm(OffsetDateTime value) {
        this.dtAndTm = value;
        return this;
    }

    /**
     * Gets the value of the fxTradPdct property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingProductIdentifier1Code }
     *     
     */
    public UnderlyingProductIdentifier1Code getFXTradPdct() {
        return fxTradPdct;
    }

    /**
     * Sets the value of the fxTradPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingProductIdentifier1Code }
     *     
     */
    public Trade7 setFXTradPdct(UnderlyingProductIdentifier1Code value) {
        this.fxTradPdct = value;
        return this;
    }

    /**
     * Gets the value of the tradgCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradgCcy() {
        return tradgCcy;
    }

    /**
     * Sets the value of the tradgCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Trade7 setTradgCcy(String value) {
        this.tradgCcy = value;
        return this;
    }

    /**
     * Gets the value of the sttlmCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmCcy() {
        return sttlmCcy;
    }

    /**
     * Sets the value of the sttlmCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Trade7 setSttlmCcy(String value) {
        this.sttlmCcy = value;
        return this;
    }

    /**
     * Gets the value of the tradgMtd property.
     * 
     * @return
     *     possible object is
     *     {@link TradingMethodType1Code }
     *     
     */
    public TradingMethodType1Code getTradgMtd() {
        return tradgMtd;
    }

    /**
     * Sets the value of the tradgMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingMethodType1Code }
     *     
     */
    public Trade7 setTradgMtd(TradingMethodType1Code value) {
        this.tradgMtd = value;
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
    public Trade7 setTradgMd(TradingModeType1Code value) {
        this.tradgMd = value;
        return this;
    }

    /**
     * Gets the value of the clrMtd property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingMethod1Code }
     *     
     */
    public ClearingMethod1Code getClrMtd() {
        return clrMtd;
    }

    /**
     * Sets the value of the clrMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingMethod1Code }
     *     
     */
    public Trade7 setClrMtd(ClearingMethod1Code value) {
        this.clrMtd = value;
        return this;
    }

    /**
     * Gets the value of the exctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatus8Code }
     *     
     */
    public OrderStatus8Code getExctnTp() {
        return exctnTp;
    }

    /**
     * Sets the value of the exctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatus8Code }
     *     
     */
    public Trade7 setExctnTp(OrderStatus8Code value) {
        this.exctnTp = value;
        return this;
    }

    /**
     * Gets the value of the symb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymb() {
        return symb;
    }

    /**
     * Sets the value of the symb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Trade7 setSymb(String value) {
        this.symb = value;
        return this;
    }

    /**
     * Gets the value of the plcOfConf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcOfConf() {
        return plcOfConf;
    }

    /**
     * Sets the value of the plcOfConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Trade7 setPlcOfConf(String value) {
        this.plcOfConf = value;
        return this;
    }

    /**
     * Gets the value of the txTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getTxTm() {
        return txTm;
    }

    /**
     * Sets the value of the txTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Trade7 setTxTm(OffsetDateTime value) {
        this.txTm = value;
        return this;
    }

    /**
     * Gets the value of the fxDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Trade10 }
     *     
     */
    public Trade10 getFXDtls() {
        return fxDtls;
    }

    /**
     * Sets the value of the fxDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trade10 }
     *     
     */
    public Trade7 setFXDtls(Trade10 value) {
        this.fxDtls = value;
        return this;
    }

    /**
     * Gets the value of the swpLeg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the swpLeg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSwpLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstrumentLeg7 }
     * 
     * 
     * @return
     *     The value of the swpLeg property.
     */
    public List<InstrumentLeg7> getSwpLeg() {
        if (swpLeg == null) {
            swpLeg = new ArrayList<>();
        }
        return this.swpLeg;
    }

    /**
     * Gets the value of the optn property.
     * 
     * @return
     *     possible object is
     *     {@link Option16 }
     *     
     */
    public Option16 getOptn() {
        return optn;
    }

    /**
     * Sets the value of the optn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Option16 }
     *     
     */
    public Trade7 setOptn(Option16 value) {
        this.optn = value;
        return this;
    }

    /**
     * Gets the value of the pdctId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification38Choice }
     *     
     */
    public SecurityIdentification38Choice getPdctId() {
        return pdctId;
    }

    /**
     * Sets the value of the pdctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification38Choice }
     *     
     */
    public Trade7 setPdctId(SecurityIdentification38Choice value) {
        this.pdctId = value;
        return this;
    }

    /**
     * Gets the value of the contraCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContraCcy() {
        return contraCcy;
    }

    /**
     * Sets the value of the contraCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Trade7 setContraCcy(String value) {
        this.contraCcy = value;
        return this;
    }

    /**
     * Gets the value of the dealTcktId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealTcktId() {
        return dealTcktId;
    }

    /**
     * Sets the value of the dealTcktId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Trade7 setDealTcktId(String value) {
        this.dealTcktId = value;
        return this;
    }

    /**
     * Gets the value of the cmbntnDealTcktId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmbntnDealTcktId() {
        return cmbntnDealTcktId;
    }

    /**
     * Sets the value of the cmbntnDealTcktId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Trade7 setCmbntnDealTcktId(String value) {
        this.cmbntnDealTcktId = value;
        return this;
    }

    /**
     * Gets the value of the baseCcyOrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndCurrency2 }
     *     
     */
    public AmountAndCurrency2 getBaseCcyOrAmt() {
        return baseCcyOrAmt;
    }

    /**
     * Sets the value of the baseCcyOrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndCurrency2 }
     *     
     */
    public Trade7 setBaseCcyOrAmt(AmountAndCurrency2 value) {
        this.baseCcyOrAmt = value;
        return this;
    }

    /**
     * Gets the value of the trgtCcyOrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndCurrency2 }
     *     
     */
    public AmountAndCurrency2 getTrgtCcyOrAmt() {
        return trgtCcyOrAmt;
    }

    /**
     * Sets the value of the trgtCcyOrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndCurrency2 }
     *     
     */
    public Trade7 setTrgtCcyOrAmt(AmountAndCurrency2 value) {
        this.trgtCcyOrAmt = value;
        return this;
    }

    /**
     * Gets the value of the dtConfd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDtConfd() {
        return dtConfd;
    }

    /**
     * Sets the value of the dtConfd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Trade7 setDtConfd(LocalDate value) {
        this.dtConfd = value;
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
     * Adds a new item to the swpLeg list.
     * @see #getSwpLeg()
     * 
     */
    public Trade7 addSwpLeg(InstrumentLeg7 swpLeg) {
        getSwpLeg().add(swpLeg);
        return this;
    }

}
