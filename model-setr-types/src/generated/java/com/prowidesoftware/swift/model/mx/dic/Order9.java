
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
@XmlType(name = "Order9", propOrder = {
    "clntOrdrId",
    "clntOrdrLkId",
    "scndryClntOrdrId",
    "cshMrgn",
    "tradOrgtnDt",
    "tradgCpcty",
    "posFct",
    "derivCvrd",
    "slctdOrdr",
    "cmplcId",
    "ordrRstrctns",
    "tradDt",
    "clrFeeTp",
    "sdTmInForce",
    "cstmrCpcty",
    "frgnXchgExctnReqd",
    "sttlmCcy",
    "ordrOrgtrElgblty",
    "plcOfExctn",
    "sdOrdrQtyDtls",
    "preAllcnDtls",
    "comssnDtls",
    "bookgDtls",
    "tradgPties",
    "sttlmDtls",
    "cshPties",
    "othrBizPties",
    "rcvgSttlmPties",
    "dlvrgSttlmPties",
    "amtsDtls"
})
public class Order9 {

    @XmlElement(name = "ClntOrdrId", required = true)
    protected String clntOrdrId;
    @XmlElement(name = "ClntOrdrLkId")
    protected String clntOrdrLkId;
    @XmlElement(name = "ScndryClntOrdrId")
    protected String scndryClntOrdrId;
    @XmlElement(name = "CshMrgn")
    @XmlSchemaType(name = "string")
    protected CashMarginOrder1Code cshMrgn;
    @XmlElement(name = "TradOrgtnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tradOrgtnDt;
    @XmlElement(name = "TradgCpcty")
    @XmlSchemaType(name = "string")
    protected TradingCapacity3Code tradgCpcty;
    @XmlElement(name = "PosFct")
    @XmlSchemaType(name = "string")
    protected PositionEffect1Code posFct;
    @XmlElement(name = "DerivCvrd")
    protected Boolean derivCvrd;
    @XmlElement(name = "SlctdOrdr")
    protected boolean slctdOrdr;
    @XmlElement(name = "CmplcId")
    protected String cmplcId;
    @XmlElement(name = "OrdrRstrctns")
    @XmlSchemaType(name = "string")
    protected List<OrderRestrictions1Code> ordrRstrctns;
    @XmlElement(name = "TradDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tradDt;
    @XmlElement(name = "ClrFeeTp")
    @XmlSchemaType(name = "string")
    protected ClearingFeeType1Code clrFeeTp;
    @XmlElement(name = "SdTmInForce", required = true)
    @XmlSchemaType(name = "string")
    protected ExecutionTimeLimit1Code sdTmInForce;
    @XmlElement(name = "CstmrCpcty")
    @XmlSchemaType(name = "string")
    protected CustomerOrderCapacity1Code cstmrCpcty;
    @XmlElement(name = "FrgnXchgExctnReqd")
    protected boolean frgnXchgExctnReqd;
    @XmlElement(name = "SttlmCcy")
    protected String sttlmCcy;
    @XmlElement(name = "OrdrOrgtrElgblty")
    @XmlSchemaType(name = "string")
    protected Eligibility1Code ordrOrgtrElgblty;
    @XmlElement(name = "PlcOfExctn")
    protected MarketIdentification1 plcOfExctn;
    @XmlElement(name = "SdOrdrQtyDtls")
    protected OrderQuantity1 sdOrdrQtyDtls;
    @XmlElement(name = "PreAllcnDtls")
    protected List<PreAllocation1> preAllcnDtls;
    @XmlElement(name = "ComssnDtls")
    protected List<Commission2> comssnDtls;
    @XmlElement(name = "BookgDtls")
    protected Booking1 bookgDtls;
    @XmlElement(name = "TradgPties")
    protected List<Intermediary14> tradgPties;
    @XmlElement(name = "SttlmDtls")
    protected SecuritiesSettlement1 sttlmDtls;
    @XmlElement(name = "CshPties", required = true)
    protected CashParties1 cshPties;
    @XmlElement(name = "OthrBizPties")
    protected OtherParties1 othrBizPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties3 rcvgSttlmPties;
    @XmlElement(name = "DlvrgSttlmPties", required = true)
    protected SettlementParties3 dlvrgSttlmPties;
    @XmlElement(name = "AmtsDtls")
    protected List<OtherAmounts1> amtsDtls;

    /**
     * Gets the value of the clntOrdrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntOrdrId() {
        return clntOrdrId;
    }

    /**
     * Sets the value of the clntOrdrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Order9 setClntOrdrId(String value) {
        this.clntOrdrId = value;
        return this;
    }

    /**
     * Gets the value of the clntOrdrLkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntOrdrLkId() {
        return clntOrdrLkId;
    }

    /**
     * Sets the value of the clntOrdrLkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Order9 setClntOrdrLkId(String value) {
        this.clntOrdrLkId = value;
        return this;
    }

    /**
     * Gets the value of the scndryClntOrdrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScndryClntOrdrId() {
        return scndryClntOrdrId;
    }

    /**
     * Sets the value of the scndryClntOrdrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Order9 setScndryClntOrdrId(String value) {
        this.scndryClntOrdrId = value;
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
    public Order9 setCshMrgn(CashMarginOrder1Code value) {
        this.cshMrgn = value;
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
    public XMLGregorianCalendar getTradOrgtnDt() {
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
    public Order9 setTradOrgtnDt(XMLGregorianCalendar value) {
        this.tradOrgtnDt = value;
        return this;
    }

    /**
     * Gets the value of the tradgCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link TradingCapacity3Code }
     *     
     */
    public TradingCapacity3Code getTradgCpcty() {
        return tradgCpcty;
    }

    /**
     * Sets the value of the tradgCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingCapacity3Code }
     *     
     */
    public Order9 setTradgCpcty(TradingCapacity3Code value) {
        this.tradgCpcty = value;
        return this;
    }

    /**
     * Gets the value of the posFct property.
     * 
     * @return
     *     possible object is
     *     {@link PositionEffect1Code }
     *     
     */
    public PositionEffect1Code getPosFct() {
        return posFct;
    }

    /**
     * Sets the value of the posFct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionEffect1Code }
     *     
     */
    public Order9 setPosFct(PositionEffect1Code value) {
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
    public Order9 setDerivCvrd(Boolean value) {
        this.derivCvrd = value;
        return this;
    }

    /**
     * Gets the value of the slctdOrdr property.
     * 
     */
    public boolean isSlctdOrdr() {
        return slctdOrdr;
    }

    /**
     * Sets the value of the slctdOrdr property.
     * 
     */
    public Order9 setSlctdOrdr(boolean value) {
        this.slctdOrdr = value;
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
    public Order9 setCmplcId(String value) {
        this.cmplcId = value;
        return this;
    }

    /**
     * Gets the value of the ordrRstrctns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ordrRstrctns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrdrRstrctns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderRestrictions1Code }
     * 
     * 
     */
    public List<OrderRestrictions1Code> getOrdrRstrctns() {
        if (ordrRstrctns == null) {
            ordrRstrctns = new ArrayList<OrderRestrictions1Code>();
        }
        return this.ordrRstrctns;
    }

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getTradDt() {
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
    public Order9 setTradDt(XMLGregorianCalendar value) {
        this.tradDt = value;
        return this;
    }

    /**
     * Gets the value of the clrFeeTp property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingFeeType1Code }
     *     
     */
    public ClearingFeeType1Code getClrFeeTp() {
        return clrFeeTp;
    }

    /**
     * Sets the value of the clrFeeTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingFeeType1Code }
     *     
     */
    public Order9 setClrFeeTp(ClearingFeeType1Code value) {
        this.clrFeeTp = value;
        return this;
    }

    /**
     * Gets the value of the sdTmInForce property.
     * 
     * @return
     *     possible object is
     *     {@link ExecutionTimeLimit1Code }
     *     
     */
    public ExecutionTimeLimit1Code getSdTmInForce() {
        return sdTmInForce;
    }

    /**
     * Sets the value of the sdTmInForce property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutionTimeLimit1Code }
     *     
     */
    public Order9 setSdTmInForce(ExecutionTimeLimit1Code value) {
        this.sdTmInForce = value;
        return this;
    }

    /**
     * Gets the value of the cstmrCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderCapacity1Code }
     *     
     */
    public CustomerOrderCapacity1Code getCstmrCpcty() {
        return cstmrCpcty;
    }

    /**
     * Sets the value of the cstmrCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderCapacity1Code }
     *     
     */
    public Order9 setCstmrCpcty(CustomerOrderCapacity1Code value) {
        this.cstmrCpcty = value;
        return this;
    }

    /**
     * Gets the value of the frgnXchgExctnReqd property.
     * 
     */
    public boolean isFrgnXchgExctnReqd() {
        return frgnXchgExctnReqd;
    }

    /**
     * Sets the value of the frgnXchgExctnReqd property.
     * 
     */
    public Order9 setFrgnXchgExctnReqd(boolean value) {
        this.frgnXchgExctnReqd = value;
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
    public Order9 setSttlmCcy(String value) {
        this.sttlmCcy = value;
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
    public Order9 setOrdrOrgtrElgblty(Eligibility1Code value) {
        this.ordrOrgtrElgblty = value;
        return this;
    }

    /**
     * Gets the value of the plcOfExctn property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification1 }
     *     
     */
    public MarketIdentification1 getPlcOfExctn() {
        return plcOfExctn;
    }

    /**
     * Sets the value of the plcOfExctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification1 }
     *     
     */
    public Order9 setPlcOfExctn(MarketIdentification1 value) {
        this.plcOfExctn = value;
        return this;
    }

    /**
     * Gets the value of the sdOrdrQtyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link OrderQuantity1 }
     *     
     */
    public OrderQuantity1 getSdOrdrQtyDtls() {
        return sdOrdrQtyDtls;
    }

    /**
     * Sets the value of the sdOrdrQtyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderQuantity1 }
     *     
     */
    public Order9 setSdOrdrQtyDtls(OrderQuantity1 value) {
        this.sdOrdrQtyDtls = value;
        return this;
    }

    /**
     * Gets the value of the preAllcnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preAllcnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreAllcnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreAllocation1 }
     * 
     * 
     */
    public List<PreAllocation1> getPreAllcnDtls() {
        if (preAllcnDtls == null) {
            preAllcnDtls = new ArrayList<PreAllocation1>();
        }
        return this.preAllcnDtls;
    }

    /**
     * Gets the value of the comssnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comssnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComssnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Commission2 }
     * 
     * 
     */
    public List<Commission2> getComssnDtls() {
        if (comssnDtls == null) {
            comssnDtls = new ArrayList<Commission2>();
        }
        return this.comssnDtls;
    }

    /**
     * Gets the value of the bookgDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Booking1 }
     *     
     */
    public Booking1 getBookgDtls() {
        return bookgDtls;
    }

    /**
     * Sets the value of the bookgDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Booking1 }
     *     
     */
    public Order9 setBookgDtls(Booking1 value) {
        this.bookgDtls = value;
        return this;
    }

    /**
     * Gets the value of the tradgPties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradgPties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradgPties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Intermediary14 }
     * 
     * 
     */
    public List<Intermediary14> getTradgPties() {
        if (tradgPties == null) {
            tradgPties = new ArrayList<Intermediary14>();
        }
        return this.tradgPties;
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
    public Order9 setSttlmDtls(SecuritiesSettlement1 value) {
        this.sttlmDtls = value;
        return this;
    }

    /**
     * Gets the value of the cshPties property.
     * 
     * @return
     *     possible object is
     *     {@link CashParties1 }
     *     
     */
    public CashParties1 getCshPties() {
        return cshPties;
    }

    /**
     * Sets the value of the cshPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashParties1 }
     *     
     */
    public Order9 setCshPties(CashParties1 value) {
        this.cshPties = value;
        return this;
    }

    /**
     * Gets the value of the othrBizPties property.
     * 
     * @return
     *     possible object is
     *     {@link OtherParties1 }
     *     
     */
    public OtherParties1 getOthrBizPties() {
        return othrBizPties;
    }

    /**
     * Sets the value of the othrBizPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherParties1 }
     *     
     */
    public Order9 setOthrBizPties(OtherParties1 value) {
        this.othrBizPties = value;
        return this;
    }

    /**
     * Gets the value of the rcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties3 }
     *     
     */
    public SettlementParties3 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Sets the value of the rcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties3 }
     *     
     */
    public Order9 setRcvgSttlmPties(SettlementParties3 value) {
        this.rcvgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties3 }
     *     
     */
    public SettlementParties3 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Sets the value of the dlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties3 }
     *     
     */
    public Order9 setDlvrgSttlmPties(SettlementParties3 value) {
        this.dlvrgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the amtsDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amtsDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmtsDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherAmounts1 }
     * 
     * 
     */
    public List<OtherAmounts1> getAmtsDtls() {
        if (amtsDtls == null) {
            amtsDtls = new ArrayList<OtherAmounts1>();
        }
        return this.amtsDtls;
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
     * Adds a new item to the ordrRstrctns list.
     * @see #getOrdrRstrctns()
     * 
     */
    public Order9 addOrdrRstrctns(OrderRestrictions1Code ordrRstrctns) {
        getOrdrRstrctns().add(ordrRstrctns);
        return this;
    }

    /**
     * Adds a new item to the preAllcnDtls list.
     * @see #getPreAllcnDtls()
     * 
     */
    public Order9 addPreAllcnDtls(PreAllocation1 preAllcnDtls) {
        getPreAllcnDtls().add(preAllcnDtls);
        return this;
    }

    /**
     * Adds a new item to the comssnDtls list.
     * @see #getComssnDtls()
     * 
     */
    public Order9 addComssnDtls(Commission2 comssnDtls) {
        getComssnDtls().add(comssnDtls);
        return this;
    }

    /**
     * Adds a new item to the tradgPties list.
     * @see #getTradgPties()
     * 
     */
    public Order9 addTradgPties(Intermediary14 tradgPties) {
        getTradgPties().add(tradgPties);
        return this;
    }

    /**
     * Adds a new item to the amtsDtls list.
     * @see #getAmtsDtls()
     * 
     */
    public Order9 addAmtsDtls(OtherAmounts1 amtsDtls) {
        getAmtsDtls().add(amtsDtls);
        return this;
    }

}
