
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
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
 * Intention to transfer an ownership of a financial instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Order14", propOrder = {
    "bizPrcTp",
    "ordrId",
    "clntOrdrId",
    "scndryClntOrdrId",
    "listId",
    "sd",
    "pmt",
    "tradTxTp",
    "tradTxCond",
    "preAdvc",
    "plcOfTrad",
    "ordrBookgDt",
    "tradOrgtnDt",
    "tradDt",
    "prcgDt",
    "sttlmDt",
    "navDt",
    "prtlFillDtls",
    "confQty",
    "qtyBrkdwn",
    "grssTradAmt",
    "dealPric",
    "tpOfPric",
    "cshMrgn",
    "comssn",
    "nbOfDaysAcrd",
    "gvUpNbOfDays",
    "intrstTp",
    "acrdIntrstAmt",
    "acrdIntrstPctg",
    "tradRgltryCondsTp",
    "ccyToBuyOrSell",
    "ordrOrgtrElgblty",
    "posFct",
    "derivCvrd",
    "chrgTaxBsisTp",
    "cptlGnTp",
    "mtchSts",
    "callInTp",
    "yldTp",
    "rptg",
    "addtlPhysOrRegnDtls",
    "addtlTradInstrPrcgInf"
})
public class Order14 {

    @XmlElement(name = "BizPrcTp")
    protected BusinessProcessType1Choice bizPrcTp;
    @XmlElement(name = "OrdrId")
    protected List<String> ordrId;
    @XmlElement(name = "ClntOrdrId")
    protected List<String> clntOrdrId;
    @XmlElement(name = "ScndryClntOrdrId")
    protected List<String> scndryClntOrdrId;
    @XmlElement(name = "ListId")
    protected List<String> listId;
    @XmlElement(name = "Sd", required = true)
    @XmlSchemaType(name = "string")
    protected Side3Code sd;
    @XmlElement(name = "Pmt")
    @XmlSchemaType(name = "string")
    protected DeliveryReceiptType2Code pmt;
    @XmlElement(name = "TradTxTp")
    protected TradeType3Choice tradTxTp;
    @XmlElement(name = "TradTxCond")
    protected List<TradeTransactionCondition4Choice> tradTxCond;
    @XmlElement(name = "PreAdvc")
    protected Boolean preAdvc;
    @XmlElement(name = "PlcOfTrad")
    protected MarketIdentification77 plcOfTrad;
    @XmlElement(name = "OrdrBookgDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar ordrBookgDt;
    @XmlElement(name = "TradOrgtnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar tradOrgtnDt;
    @XmlElement(name = "TradDt", required = true)
    protected TradeDate4Choice tradDt;
    @XmlElement(name = "PrcgDt")
    protected TradeDate4Choice prcgDt;
    @XmlElement(name = "SttlmDt", required = true)
    protected SettlementDate8Choice sttlmDt;
    @XmlElement(name = "NAVDt")
    protected DateAndDateTime1Choice navDt;
    @XmlElement(name = "PrtlFillDtls")
    protected List<PartialFill1> prtlFillDtls;
    @XmlElement(name = "ConfQty", required = true)
    protected Quantity6Choice confQty;
    @XmlElement(name = "QtyBrkdwn")
    protected List<QuantityBreakdown11> qtyBrkdwn;
    @XmlElement(name = "GrssTradAmt")
    protected AmountAndDirection29 grssTradAmt;
    @XmlElement(name = "DealPric", required = true)
    protected Price4 dealPric;
    @XmlElement(name = "TpOfPric")
    protected TypeOfPrice10Choice tpOfPric;
    @XmlElement(name = "CshMrgn")
    @XmlSchemaType(name = "string")
    protected CashMarginOrder1Code cshMrgn;
    @XmlElement(name = "Comssn")
    protected Commission16 comssn;
    @XmlElement(name = "NbOfDaysAcrd")
    protected BigDecimal nbOfDaysAcrd;
    @XmlElement(name = "GvUpNbOfDays")
    protected BigDecimal gvUpNbOfDays;
    @XmlElement(name = "IntrstTp")
    @XmlSchemaType(name = "string")
    protected InterestType2Code intrstTp;
    @XmlElement(name = "AcrdIntrstAmt")
    protected AmountAndDirection29 acrdIntrstAmt;
    @XmlElement(name = "AcrdIntrstPctg")
    protected BigDecimal acrdIntrstPctg;
    @XmlElement(name = "TradRgltryCondsTp")
    @XmlSchemaType(name = "string")
    protected TradeRegulatoryConditions1Code tradRgltryCondsTp;
    @XmlElement(name = "CcyToBuyOrSell")
    protected CurrencyToBuyOrSell1Choice ccyToBuyOrSell;
    @XmlElement(name = "OrdrOrgtrElgblty")
    @XmlSchemaType(name = "string")
    protected Eligibility1Code ordrOrgtrElgblty;
    @XmlElement(name = "PosFct")
    @XmlSchemaType(name = "string")
    protected PositionEffect2Code posFct;
    @XmlElement(name = "DerivCvrd")
    protected Boolean derivCvrd;
    @XmlElement(name = "ChrgTaxBsisTp")
    protected ChargeTaxBasisType1Choice chrgTaxBsisTp;
    @XmlElement(name = "CptlGnTp")
    protected EUCapitalGainType2Choice cptlGnTp;
    @XmlElement(name = "MtchSts")
    protected MatchingStatus8Choice mtchSts;
    @XmlElement(name = "CallInTp")
    @XmlSchemaType(name = "string")
    protected CallIn1Code callInTp;
    @XmlElement(name = "YldTp")
    protected YieldCalculation2 yldTp;
    @XmlElement(name = "Rptg")
    protected List<Reporting5Choice> rptg;
    @XmlElement(name = "AddtlPhysOrRegnDtls")
    protected RegistrationParameters3 addtlPhysOrRegnDtls;
    @XmlElement(name = "AddtlTradInstrPrcgInf")
    protected String addtlTradInstrPrcgInf;

    /**
     * Gets the value of the bizPrcTp property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessProcessType1Choice }
     *     
     */
    public BusinessProcessType1Choice getBizPrcTp() {
        return bizPrcTp;
    }

    /**
     * Sets the value of the bizPrcTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessProcessType1Choice }
     *     
     */
    public Order14 setBizPrcTp(BusinessProcessType1Choice value) {
        this.bizPrcTp = value;
        return this;
    }

    /**
     * Gets the value of the ordrId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ordrId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrdrId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the ordrId property.
     */
    public List<String> getOrdrId() {
        if (ordrId == null) {
            ordrId = new ArrayList<>();
        }
        return this.ordrId;
    }

    /**
     * Gets the value of the clntOrdrId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the clntOrdrId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClntOrdrId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the clntOrdrId property.
     */
    public List<String> getClntOrdrId() {
        if (clntOrdrId == null) {
            clntOrdrId = new ArrayList<>();
        }
        return this.clntOrdrId;
    }

    /**
     * Gets the value of the scndryClntOrdrId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the scndryClntOrdrId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScndryClntOrdrId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the scndryClntOrdrId property.
     */
    public List<String> getScndryClntOrdrId() {
        if (scndryClntOrdrId == null) {
            scndryClntOrdrId = new ArrayList<>();
        }
        return this.scndryClntOrdrId;
    }

    /**
     * Gets the value of the listId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the listId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the listId property.
     */
    public List<String> getListId() {
        if (listId == null) {
            listId = new ArrayList<>();
        }
        return this.listId;
    }

    /**
     * Gets the value of the sd property.
     * 
     * @return
     *     possible object is
     *     {@link Side3Code }
     *     
     */
    public Side3Code getSd() {
        return sd;
    }

    /**
     * Sets the value of the sd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Side3Code }
     *     
     */
    public Order14 setSd(Side3Code value) {
        this.sd = value;
        return this;
    }

    /**
     * Gets the value of the pmt property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryReceiptType2Code }
     *     
     */
    public DeliveryReceiptType2Code getPmt() {
        return pmt;
    }

    /**
     * Sets the value of the pmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryReceiptType2Code }
     *     
     */
    public Order14 setPmt(DeliveryReceiptType2Code value) {
        this.pmt = value;
        return this;
    }

    /**
     * Gets the value of the tradTxTp property.
     * 
     * @return
     *     possible object is
     *     {@link TradeType3Choice }
     *     
     */
    public TradeType3Choice getTradTxTp() {
        return tradTxTp;
    }

    /**
     * Sets the value of the tradTxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeType3Choice }
     *     
     */
    public Order14 setTradTxTp(TradeType3Choice value) {
        this.tradTxTp = value;
        return this;
    }

    /**
     * Gets the value of the tradTxCond property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tradTxCond property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradTxCond().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeTransactionCondition4Choice }
     * 
     * 
     * @return
     *     The value of the tradTxCond property.
     */
    public List<TradeTransactionCondition4Choice> getTradTxCond() {
        if (tradTxCond == null) {
            tradTxCond = new ArrayList<>();
        }
        return this.tradTxCond;
    }

    /**
     * Gets the value of the preAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreAdvc() {
        return preAdvc;
    }

    /**
     * Sets the value of the preAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Order14 setPreAdvc(Boolean value) {
        this.preAdvc = value;
        return this;
    }

    /**
     * Gets the value of the plcOfTrad property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification77 }
     *     
     */
    public MarketIdentification77 getPlcOfTrad() {
        return plcOfTrad;
    }

    /**
     * Sets the value of the plcOfTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification77 }
     *     
     */
    public Order14 setPlcOfTrad(MarketIdentification77 value) {
        this.plcOfTrad = value;
        return this;
    }

    /**
     * Gets the value of the ordrBookgDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getOrdrBookgDt() {
        return ordrBookgDt;
    }

    /**
     * Sets the value of the ordrBookgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Order14 setOrdrBookgDt(Calendar value) {
        this.ordrBookgDt = value;
        return this;
    }

    /**
     * Gets the value of the tradOrgtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getTradOrgtnDt() {
        return tradOrgtnDt;
    }

    /**
     * Sets the value of the tradOrgtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Order14 setTradOrgtnDt(Calendar value) {
        this.tradOrgtnDt = value;
        return this;
    }

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDate4Choice }
     *     
     */
    public TradeDate4Choice getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDate4Choice }
     *     
     */
    public Order14 setTradDt(TradeDate4Choice value) {
        this.tradDt = value;
        return this;
    }

    /**
     * Gets the value of the prcgDt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDate4Choice }
     *     
     */
    public TradeDate4Choice getPrcgDt() {
        return prcgDt;
    }

    /**
     * Sets the value of the prcgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDate4Choice }
     *     
     */
    public Order14 setPrcgDt(TradeDate4Choice value) {
        this.prcgDt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDate8Choice }
     *     
     */
    public SettlementDate8Choice getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDate8Choice }
     *     
     */
    public Order14 setSttlmDt(SettlementDate8Choice value) {
        this.sttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the navDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime1Choice }
     *     
     */
    public DateAndDateTime1Choice getNAVDt() {
        return navDt;
    }

    /**
     * Sets the value of the navDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime1Choice }
     *     
     */
    public Order14 setNAVDt(DateAndDateTime1Choice value) {
        this.navDt = value;
        return this;
    }

    /**
     * Gets the value of the prtlFillDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prtlFillDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrtlFillDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartialFill1 }
     * 
     * 
     * @return
     *     The value of the prtlFillDtls property.
     */
    public List<PartialFill1> getPrtlFillDtls() {
        if (prtlFillDtls == null) {
            prtlFillDtls = new ArrayList<>();
        }
        return this.prtlFillDtls;
    }

    /**
     * Gets the value of the confQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity6Choice }
     *     
     */
    public Quantity6Choice getConfQty() {
        return confQty;
    }

    /**
     * Sets the value of the confQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity6Choice }
     *     
     */
    public Order14 setConfQty(Quantity6Choice value) {
        this.confQty = value;
        return this;
    }

    /**
     * Gets the value of the qtyBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the qtyBrkdwn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQtyBrkdwn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuantityBreakdown11 }
     * 
     * 
     * @return
     *     The value of the qtyBrkdwn property.
     */
    public List<QuantityBreakdown11> getQtyBrkdwn() {
        if (qtyBrkdwn == null) {
            qtyBrkdwn = new ArrayList<>();
        }
        return this.qtyBrkdwn;
    }

    /**
     * Gets the value of the grssTradAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getGrssTradAmt() {
        return grssTradAmt;
    }

    /**
     * Sets the value of the grssTradAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public Order14 setGrssTradAmt(AmountAndDirection29 value) {
        this.grssTradAmt = value;
        return this;
    }

    /**
     * Gets the value of the dealPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price4 }
     *     
     */
    public Price4 getDealPric() {
        return dealPric;
    }

    /**
     * Sets the value of the dealPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price4 }
     *     
     */
    public Order14 setDealPric(Price4 value) {
        this.dealPric = value;
        return this;
    }

    /**
     * Gets the value of the tpOfPric property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPrice10Choice }
     *     
     */
    public TypeOfPrice10Choice getTpOfPric() {
        return tpOfPric;
    }

    /**
     * Sets the value of the tpOfPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPrice10Choice }
     *     
     */
    public Order14 setTpOfPric(TypeOfPrice10Choice value) {
        this.tpOfPric = value;
        return this;
    }

    /**
     * Gets the value of the cshMrgn property.
     * 
     * @return
     *     possible object is
     *     {@link CashMarginOrder1Code }
     *     
     */
    public CashMarginOrder1Code getCshMrgn() {
        return cshMrgn;
    }

    /**
     * Sets the value of the cshMrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashMarginOrder1Code }
     *     
     */
    public Order14 setCshMrgn(CashMarginOrder1Code value) {
        this.cshMrgn = value;
        return this;
    }

    /**
     * Gets the value of the comssn property.
     * 
     * @return
     *     possible object is
     *     {@link Commission16 }
     *     
     */
    public Commission16 getComssn() {
        return comssn;
    }

    /**
     * Sets the value of the comssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Commission16 }
     *     
     */
    public Order14 setComssn(Commission16 value) {
        this.comssn = value;
        return this;
    }

    /**
     * Gets the value of the nbOfDaysAcrd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfDaysAcrd() {
        return nbOfDaysAcrd;
    }

    /**
     * Sets the value of the nbOfDaysAcrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Order14 setNbOfDaysAcrd(BigDecimal value) {
        this.nbOfDaysAcrd = value;
        return this;
    }

    /**
     * Gets the value of the gvUpNbOfDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGvUpNbOfDays() {
        return gvUpNbOfDays;
    }

    /**
     * Sets the value of the gvUpNbOfDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Order14 setGvUpNbOfDays(BigDecimal value) {
        this.gvUpNbOfDays = value;
        return this;
    }

    /**
     * Gets the value of the intrstTp property.
     * 
     * @return
     *     possible object is
     *     {@link InterestType2Code }
     *     
     */
    public InterestType2Code getIntrstTp() {
        return intrstTp;
    }

    /**
     * Sets the value of the intrstTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestType2Code }
     *     
     */
    public Order14 setIntrstTp(InterestType2Code value) {
        this.intrstTp = value;
        return this;
    }

    /**
     * Gets the value of the acrdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getAcrdIntrstAmt() {
        return acrdIntrstAmt;
    }

    /**
     * Sets the value of the acrdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public Order14 setAcrdIntrstAmt(AmountAndDirection29 value) {
        this.acrdIntrstAmt = value;
        return this;
    }

    /**
     * Gets the value of the acrdIntrstPctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcrdIntrstPctg() {
        return acrdIntrstPctg;
    }

    /**
     * Sets the value of the acrdIntrstPctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Order14 setAcrdIntrstPctg(BigDecimal value) {
        this.acrdIntrstPctg = value;
        return this;
    }

    /**
     * Gets the value of the tradRgltryCondsTp property.
     * 
     * @return
     *     possible object is
     *     {@link TradeRegulatoryConditions1Code }
     *     
     */
    public TradeRegulatoryConditions1Code getTradRgltryCondsTp() {
        return tradRgltryCondsTp;
    }

    /**
     * Sets the value of the tradRgltryCondsTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeRegulatoryConditions1Code }
     *     
     */
    public Order14 setTradRgltryCondsTp(TradeRegulatoryConditions1Code value) {
        this.tradRgltryCondsTp = value;
        return this;
    }

    /**
     * Gets the value of the ccyToBuyOrSell property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyToBuyOrSell1Choice }
     *     
     */
    public CurrencyToBuyOrSell1Choice getCcyToBuyOrSell() {
        return ccyToBuyOrSell;
    }

    /**
     * Sets the value of the ccyToBuyOrSell property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyToBuyOrSell1Choice }
     *     
     */
    public Order14 setCcyToBuyOrSell(CurrencyToBuyOrSell1Choice value) {
        this.ccyToBuyOrSell = value;
        return this;
    }

    /**
     * Gets the value of the ordrOrgtrElgblty property.
     * 
     * @return
     *     possible object is
     *     {@link Eligibility1Code }
     *     
     */
    public Eligibility1Code getOrdrOrgtrElgblty() {
        return ordrOrgtrElgblty;
    }

    /**
     * Sets the value of the ordrOrgtrElgblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Eligibility1Code }
     *     
     */
    public Order14 setOrdrOrgtrElgblty(Eligibility1Code value) {
        this.ordrOrgtrElgblty = value;
        return this;
    }

    /**
     * Gets the value of the posFct property.
     * 
     * @return
     *     possible object is
     *     {@link PositionEffect2Code }
     *     
     */
    public PositionEffect2Code getPosFct() {
        return posFct;
    }

    /**
     * Sets the value of the posFct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionEffect2Code }
     *     
     */
    public Order14 setPosFct(PositionEffect2Code value) {
        this.posFct = value;
        return this;
    }

    /**
     * Gets the value of the derivCvrd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDerivCvrd() {
        return derivCvrd;
    }

    /**
     * Sets the value of the derivCvrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Order14 setDerivCvrd(Boolean value) {
        this.derivCvrd = value;
        return this;
    }

    /**
     * Gets the value of the chrgTaxBsisTp property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeTaxBasisType1Choice }
     *     
     */
    public ChargeTaxBasisType1Choice getChrgTaxBsisTp() {
        return chrgTaxBsisTp;
    }

    /**
     * Sets the value of the chrgTaxBsisTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeTaxBasisType1Choice }
     *     
     */
    public Order14 setChrgTaxBsisTp(ChargeTaxBasisType1Choice value) {
        this.chrgTaxBsisTp = value;
        return this;
    }

    /**
     * Gets the value of the cptlGnTp property.
     * 
     * @return
     *     possible object is
     *     {@link EUCapitalGainType2Choice }
     *     
     */
    public EUCapitalGainType2Choice getCptlGnTp() {
        return cptlGnTp;
    }

    /**
     * Sets the value of the cptlGnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link EUCapitalGainType2Choice }
     *     
     */
    public Order14 setCptlGnTp(EUCapitalGainType2Choice value) {
        this.cptlGnTp = value;
        return this;
    }

    /**
     * Gets the value of the mtchSts property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus8Choice }
     *     
     */
    public MatchingStatus8Choice getMtchSts() {
        return mtchSts;
    }

    /**
     * Sets the value of the mtchSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus8Choice }
     *     
     */
    public Order14 setMtchSts(MatchingStatus8Choice value) {
        this.mtchSts = value;
        return this;
    }

    /**
     * Gets the value of the callInTp property.
     * 
     * @return
     *     possible object is
     *     {@link CallIn1Code }
     *     
     */
    public CallIn1Code getCallInTp() {
        return callInTp;
    }

    /**
     * Sets the value of the callInTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallIn1Code }
     *     
     */
    public Order14 setCallInTp(CallIn1Code value) {
        this.callInTp = value;
        return this;
    }

    /**
     * Gets the value of the yldTp property.
     * 
     * @return
     *     possible object is
     *     {@link YieldCalculation2 }
     *     
     */
    public YieldCalculation2 getYldTp() {
        return yldTp;
    }

    /**
     * Sets the value of the yldTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link YieldCalculation2 }
     *     
     */
    public Order14 setYldTp(YieldCalculation2 value) {
        this.yldTp = value;
        return this;
    }

    /**
     * Gets the value of the rptg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rptg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRptg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reporting5Choice }
     * 
     * 
     * @return
     *     The value of the rptg property.
     */
    public List<Reporting5Choice> getRptg() {
        if (rptg == null) {
            rptg = new ArrayList<>();
        }
        return this.rptg;
    }

    /**
     * Gets the value of the addtlPhysOrRegnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationParameters3 }
     *     
     */
    public RegistrationParameters3 getAddtlPhysOrRegnDtls() {
        return addtlPhysOrRegnDtls;
    }

    /**
     * Sets the value of the addtlPhysOrRegnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationParameters3 }
     *     
     */
    public Order14 setAddtlPhysOrRegnDtls(RegistrationParameters3 value) {
        this.addtlPhysOrRegnDtls = value;
        return this;
    }

    /**
     * Gets the value of the addtlTradInstrPrcgInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlTradInstrPrcgInf() {
        return addtlTradInstrPrcgInf;
    }

    /**
     * Sets the value of the addtlTradInstrPrcgInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Order14 setAddtlTradInstrPrcgInf(String value) {
        this.addtlTradInstrPrcgInf = value;
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
     * Adds a new item to the ordrId list.
     * @see #getOrdrId()
     * 
     */
    public Order14 addOrdrId(String ordrId) {
        getOrdrId().add(ordrId);
        return this;
    }

    /**
     * Adds a new item to the clntOrdrId list.
     * @see #getClntOrdrId()
     * 
     */
    public Order14 addClntOrdrId(String clntOrdrId) {
        getClntOrdrId().add(clntOrdrId);
        return this;
    }

    /**
     * Adds a new item to the scndryClntOrdrId list.
     * @see #getScndryClntOrdrId()
     * 
     */
    public Order14 addScndryClntOrdrId(String scndryClntOrdrId) {
        getScndryClntOrdrId().add(scndryClntOrdrId);
        return this;
    }

    /**
     * Adds a new item to the listId list.
     * @see #getListId()
     * 
     */
    public Order14 addListId(String listId) {
        getListId().add(listId);
        return this;
    }

    /**
     * Adds a new item to the tradTxCond list.
     * @see #getTradTxCond()
     * 
     */
    public Order14 addTradTxCond(TradeTransactionCondition4Choice tradTxCond) {
        getTradTxCond().add(tradTxCond);
        return this;
    }

    /**
     * Adds a new item to the prtlFillDtls list.
     * @see #getPrtlFillDtls()
     * 
     */
    public Order14 addPrtlFillDtls(PartialFill1 prtlFillDtls) {
        getPrtlFillDtls().add(prtlFillDtls);
        return this;
    }

    /**
     * Adds a new item to the qtyBrkdwn list.
     * @see #getQtyBrkdwn()
     * 
     */
    public Order14 addQtyBrkdwn(QuantityBreakdown11 qtyBrkdwn) {
        getQtyBrkdwn().add(qtyBrkdwn);
        return this;
    }

    /**
     * Adds a new item to the rptg list.
     * @see #getRptg()
     * 
     */
    public Order14 addRptg(Reporting5Choice rptg) {
        getRptg().add(rptg);
        return this;
    }

}
