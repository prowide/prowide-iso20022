
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
 * Transfer from one investment fund/fund class to another investment fund or investment fund class by the investor. A switch is composed of one or several subscription legs, and one or several redemption legs.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwitchOrder3", propOrder = {
    "mstrRef",
    "ordrDtTm",
    "ordrRef",
    "clntRef",
    "cxlRef",
    "invstmtAcctDtls",
    "ttlRedAmt",
    "ttlSbcptAmt",
    "reqdFutrTradDt",
    "sttlmAmt",
    "cshSttlmDt",
    "sttlmMtd",
    "xpryDtTm",
    "addtlCshIn",
    "rsltgCshOut",
    "rltdPtyDtls",
    "cxlRght",
    "xtndedCxlRght",
    "redLegDtls",
    "sbcptLegDtls",
    "cshSttlmDtls",
    "fxDtls",
    "finAdvc",
    "ngtdTrad"
})
public class SwitchOrder3 {

    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "OrdrDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ordrDtTm;
    @XmlElement(name = "OrdrRef", required = true)
    protected String ordrRef;
    @XmlElement(name = "ClntRef")
    protected String clntRef;
    @XmlElement(name = "CxlRef")
    protected String cxlRef;
    @XmlElement(name = "InvstmtAcctDtls")
    protected InvestmentAccount21 invstmtAcctDtls;
    @XmlElement(name = "TtlRedAmt")
    protected ActiveOrHistoricCurrencyAndAmount ttlRedAmt;
    @XmlElement(name = "TtlSbcptAmt")
    protected ActiveOrHistoricCurrencyAndAmount ttlSbcptAmt;
    @XmlElement(name = "ReqdFutrTradDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reqdFutrTradDt;
    @XmlElement(name = "SttlmAmt")
    protected ActiveCurrencyAndAmount sttlmAmt;
    @XmlElement(name = "CshSttlmDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cshSttlmDt;
    @XmlElement(name = "SttlmMtd")
    @XmlSchemaType(name = "string")
    protected DeliveryReceiptType2Code sttlmMtd;
    @XmlElement(name = "XpryDtTm")
    protected DateAndDateTimeChoice xpryDtTm;
    @XmlElement(name = "AddtlCshIn")
    protected ActiveOrHistoricCurrencyAndAmount addtlCshIn;
    @XmlElement(name = "RsltgCshOut")
    protected ActiveOrHistoricCurrencyAndAmount rsltgCshOut;
    @XmlElement(name = "RltdPtyDtls")
    protected List<Intermediary8> rltdPtyDtls;
    @XmlElement(name = "CxlRght")
    @XmlSchemaType(name = "string")
    protected CancellationRight1Code cxlRght;
    @XmlElement(name = "XtndedCxlRght")
    protected String xtndedCxlRght;
    @XmlElement(name = "RedLegDtls", required = true)
    protected List<SwitchRedemptionLegOrder3> redLegDtls;
    @XmlElement(name = "SbcptLegDtls", required = true)
    protected List<SwitchSubscriptionLegOrder3> sbcptLegDtls;
    @XmlElement(name = "CshSttlmDtls")
    protected PaymentTransaction25 cshSttlmDtls;
    @XmlElement(name = "FXDtls")
    protected ForeignExchangeTerms6 fxDtls;
    @XmlElement(name = "FinAdvc")
    @XmlSchemaType(name = "string")
    protected FinancialAdvice1Code finAdvc;
    @XmlElement(name = "NgtdTrad")
    @XmlSchemaType(name = "string")
    protected NegotiatedTrade1Code ngtdTrad;

    /**
     * Gets the value of the mstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMstrRef() {
        return mstrRef;
    }

    /**
     * Sets the value of the mstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwitchOrder3 setMstrRef(String value) {
        this.mstrRef = value;
        return this;
    }

    /**
     * Gets the value of the ordrDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrdrDtTm() {
        return ordrDtTm;
    }

    /**
     * Sets the value of the ordrDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public SwitchOrder3 setOrdrDtTm(XMLGregorianCalendar value) {
        this.ordrDtTm = value;
        return this;
    }

    /**
     * Gets the value of the ordrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdrRef() {
        return ordrRef;
    }

    /**
     * Sets the value of the ordrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwitchOrder3 setOrdrRef(String value) {
        this.ordrRef = value;
        return this;
    }

    /**
     * Gets the value of the clntRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntRef() {
        return clntRef;
    }

    /**
     * Sets the value of the clntRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwitchOrder3 setClntRef(String value) {
        this.clntRef = value;
        return this;
    }

    /**
     * Gets the value of the cxlRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCxlRef() {
        return cxlRef;
    }

    /**
     * Sets the value of the cxlRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwitchOrder3 setCxlRef(String value) {
        this.cxlRef = value;
        return this;
    }

    /**
     * Gets the value of the invstmtAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount21 }
     *     
     */
    public InvestmentAccount21 getInvstmtAcctDtls() {
        return invstmtAcctDtls;
    }

    /**
     * Sets the value of the invstmtAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount21 }
     *     
     */
    public SwitchOrder3 setInvstmtAcctDtls(InvestmentAccount21 value) {
        this.invstmtAcctDtls = value;
        return this;
    }

    /**
     * Gets the value of the ttlRedAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlRedAmt() {
        return ttlRedAmt;
    }

    /**
     * Sets the value of the ttlRedAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public SwitchOrder3 setTtlRedAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlRedAmt = value;
        return this;
    }

    /**
     * Gets the value of the ttlSbcptAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlSbcptAmt() {
        return ttlSbcptAmt;
    }

    /**
     * Sets the value of the ttlSbcptAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public SwitchOrder3 setTtlSbcptAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlSbcptAmt = value;
        return this;
    }

    /**
     * Gets the value of the reqdFutrTradDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqdFutrTradDt() {
        return reqdFutrTradDt;
    }

    /**
     * Sets the value of the reqdFutrTradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public SwitchOrder3 setReqdFutrTradDt(XMLGregorianCalendar value) {
        this.reqdFutrTradDt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Sets the value of the sttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public SwitchOrder3 setSttlmAmt(ActiveCurrencyAndAmount value) {
        this.sttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the cshSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCshSttlmDt() {
        return cshSttlmDt;
    }

    /**
     * Sets the value of the cshSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public SwitchOrder3 setCshSttlmDt(XMLGregorianCalendar value) {
        this.cshSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmMtd property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryReceiptType2Code }
     *     
     */
    public DeliveryReceiptType2Code getSttlmMtd() {
        return sttlmMtd;
    }

    /**
     * Sets the value of the sttlmMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryReceiptType2Code }
     *     
     */
    public SwitchOrder3 setSttlmMtd(DeliveryReceiptType2Code value) {
        this.sttlmMtd = value;
        return this;
    }

    /**
     * Gets the value of the xpryDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getXpryDtTm() {
        return xpryDtTm;
    }

    /**
     * Sets the value of the xpryDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public SwitchOrder3 setXpryDtTm(DateAndDateTimeChoice value) {
        this.xpryDtTm = value;
        return this;
    }

    /**
     * Gets the value of the addtlCshIn property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getAddtlCshIn() {
        return addtlCshIn;
    }

    /**
     * Sets the value of the addtlCshIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public SwitchOrder3 setAddtlCshIn(ActiveOrHistoricCurrencyAndAmount value) {
        this.addtlCshIn = value;
        return this;
    }

    /**
     * Gets the value of the rsltgCshOut property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getRsltgCshOut() {
        return rsltgCshOut;
    }

    /**
     * Sets the value of the rsltgCshOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public SwitchOrder3 setRsltgCshOut(ActiveOrHistoricCurrencyAndAmount value) {
        this.rsltgCshOut = value;
        return this;
    }

    /**
     * Gets the value of the rltdPtyDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rltdPtyDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdPtyDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Intermediary8 }
     * 
     * 
     */
    public List<Intermediary8> getRltdPtyDtls() {
        if (rltdPtyDtls == null) {
            rltdPtyDtls = new ArrayList<Intermediary8>();
        }
        return this.rltdPtyDtls;
    }

    /**
     * Gets the value of the cxlRght property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationRight1Code }
     *     
     */
    public CancellationRight1Code getCxlRght() {
        return cxlRght;
    }

    /**
     * Sets the value of the cxlRght property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationRight1Code }
     *     
     */
    public SwitchOrder3 setCxlRght(CancellationRight1Code value) {
        this.cxlRght = value;
        return this;
    }

    /**
     * Gets the value of the xtndedCxlRght property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedCxlRght() {
        return xtndedCxlRght;
    }

    /**
     * Sets the value of the xtndedCxlRght property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwitchOrder3 setXtndedCxlRght(String value) {
        this.xtndedCxlRght = value;
        return this;
    }

    /**
     * Gets the value of the redLegDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the redLegDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRedLegDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwitchRedemptionLegOrder3 }
     * 
     * 
     */
    public List<SwitchRedemptionLegOrder3> getRedLegDtls() {
        if (redLegDtls == null) {
            redLegDtls = new ArrayList<SwitchRedemptionLegOrder3>();
        }
        return this.redLegDtls;
    }

    /**
     * Gets the value of the sbcptLegDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sbcptLegDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSbcptLegDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwitchSubscriptionLegOrder3 }
     * 
     * 
     */
    public List<SwitchSubscriptionLegOrder3> getSbcptLegDtls() {
        if (sbcptLegDtls == null) {
            sbcptLegDtls = new ArrayList<SwitchSubscriptionLegOrder3>();
        }
        return this.sbcptLegDtls;
    }

    /**
     * Gets the value of the cshSttlmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransaction25 }
     *     
     */
    public PaymentTransaction25 getCshSttlmDtls() {
        return cshSttlmDtls;
    }

    /**
     * Sets the value of the cshSttlmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransaction25 }
     *     
     */
    public SwitchOrder3 setCshSttlmDtls(PaymentTransaction25 value) {
        this.cshSttlmDtls = value;
        return this;
    }

    /**
     * Gets the value of the fxDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTerms6 }
     *     
     */
    public ForeignExchangeTerms6 getFXDtls() {
        return fxDtls;
    }

    /**
     * Sets the value of the fxDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTerms6 }
     *     
     */
    public SwitchOrder3 setFXDtls(ForeignExchangeTerms6 value) {
        this.fxDtls = value;
        return this;
    }

    /**
     * Gets the value of the finAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAdvice1Code }
     *     
     */
    public FinancialAdvice1Code getFinAdvc() {
        return finAdvc;
    }

    /**
     * Sets the value of the finAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAdvice1Code }
     *     
     */
    public SwitchOrder3 setFinAdvc(FinancialAdvice1Code value) {
        this.finAdvc = value;
        return this;
    }

    /**
     * Gets the value of the ngtdTrad property.
     * 
     * @return
     *     possible object is
     *     {@link NegotiatedTrade1Code }
     *     
     */
    public NegotiatedTrade1Code getNgtdTrad() {
        return ngtdTrad;
    }

    /**
     * Sets the value of the ngtdTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link NegotiatedTrade1Code }
     *     
     */
    public SwitchOrder3 setNgtdTrad(NegotiatedTrade1Code value) {
        this.ngtdTrad = value;
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
     * Adds a new item to the rltdPtyDtls list.
     * @see #getRltdPtyDtls()
     * 
     */
    public SwitchOrder3 addRltdPtyDtls(Intermediary8 rltdPtyDtls) {
        getRltdPtyDtls().add(rltdPtyDtls);
        return this;
    }

    /**
     * Adds a new item to the redLegDtls list.
     * @see #getRedLegDtls()
     * 
     */
    public SwitchOrder3 addRedLegDtls(SwitchRedemptionLegOrder3 redLegDtls) {
        getRedLegDtls().add(redLegDtls);
        return this;
    }

    /**
     * Adds a new item to the sbcptLegDtls list.
     * @see #getSbcptLegDtls()
     * 
     */
    public SwitchOrder3 addSbcptLegDtls(SwitchSubscriptionLegOrder3 sbcptLegDtls) {
        getSbcptLegDtls().add(sbcptLegDtls);
        return this;
    }

}
