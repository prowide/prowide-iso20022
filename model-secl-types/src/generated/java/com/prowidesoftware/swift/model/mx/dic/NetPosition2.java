
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.Calendar;
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
 * Provides the net positions details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetPosition2", propOrder = {
    "clrAcct",
    "nonClrMmb",
    "dlvryAcct",
    "finInstrmId",
    "initlPosAmt",
    "netPosAmt",
    "acrdIntrstAmt",
    "avrgDealPric",
    "netQty",
    "sctiesMvmntTp",
    "dpstry",
    "tradgCpcty",
    "plcOfTrad",
    "tradDt",
    "sttlmDt",
    "tradLegDtls"
})
public class NetPosition2 {

    @XmlElement(name = "ClrAcct", required = true)
    protected SecuritiesAccount18 clrAcct;
    @XmlElement(name = "NonClrMmb")
    protected PartyIdentificationAndAccount31 nonClrMmb;
    @XmlElement(name = "DlvryAcct")
    protected SecuritiesAccount19 dlvryAcct;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification14 finInstrmId;
    @XmlElement(name = "InitlPosAmt")
    protected AmountAndDirection21 initlPosAmt;
    @XmlElement(name = "NetPosAmt", required = true)
    protected AmountAndDirection21 netPosAmt;
    @XmlElement(name = "AcrdIntrstAmt")
    protected AmountAndDirection21 acrdIntrstAmt;
    @XmlElement(name = "AvrgDealPric")
    protected Price4 avrgDealPric;
    @XmlElement(name = "NetQty", required = true)
    protected FinancialInstrumentQuantity1Choice netQty;
    @XmlElement(name = "SctiesMvmntTp", required = true)
    @XmlSchemaType(name = "string")
    protected ReceiveDelivery1Code sctiesMvmntTp;
    @XmlElement(name = "Dpstry", required = true)
    protected PartyIdentification34Choice dpstry;
    @XmlElement(name = "TradgCpcty")
    @XmlSchemaType(name = "string")
    protected TradingCapacity5Code tradgCpcty;
    @XmlElement(name = "PlcOfTrad")
    protected MarketIdentification20 plcOfTrad;
    @XmlElement(name = "TradDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar tradDt;
    @XmlElement(name = "SttlmDt")
    protected DateFormat15Choice sttlmDt;
    @XmlElement(name = "TradLegDtls")
    protected List<TradeLeg7> tradLegDtls;

    /**
     * Gets the value of the clrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount18 }
     *     
     */
    public SecuritiesAccount18 getClrAcct() {
        return clrAcct;
    }

    /**
     * Sets the value of the clrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount18 }
     *     
     */
    public NetPosition2 setClrAcct(SecuritiesAccount18 value) {
        this.clrAcct = value;
        return this;
    }

    /**
     * Gets the value of the nonClrMmb property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount31 }
     *     
     */
    public PartyIdentificationAndAccount31 getNonClrMmb() {
        return nonClrMmb;
    }

    /**
     * Sets the value of the nonClrMmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount31 }
     *     
     */
    public NetPosition2 setNonClrMmb(PartyIdentificationAndAccount31 value) {
        this.nonClrMmb = value;
        return this;
    }

    /**
     * Gets the value of the dlvryAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getDlvryAcct() {
        return dlvryAcct;
    }

    /**
     * Sets the value of the dlvryAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public NetPosition2 setDlvryAcct(SecuritiesAccount19 value) {
        this.dlvryAcct = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public SecurityIdentification14 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public NetPosition2 setFinInstrmId(SecurityIdentification14 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the initlPosAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection21 }
     *     
     */
    public AmountAndDirection21 getInitlPosAmt() {
        return initlPosAmt;
    }

    /**
     * Sets the value of the initlPosAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection21 }
     *     
     */
    public NetPosition2 setInitlPosAmt(AmountAndDirection21 value) {
        this.initlPosAmt = value;
        return this;
    }

    /**
     * Gets the value of the netPosAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection21 }
     *     
     */
    public AmountAndDirection21 getNetPosAmt() {
        return netPosAmt;
    }

    /**
     * Sets the value of the netPosAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection21 }
     *     
     */
    public NetPosition2 setNetPosAmt(AmountAndDirection21 value) {
        this.netPosAmt = value;
        return this;
    }

    /**
     * Gets the value of the acrdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection21 }
     *     
     */
    public AmountAndDirection21 getAcrdIntrstAmt() {
        return acrdIntrstAmt;
    }

    /**
     * Sets the value of the acrdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection21 }
     *     
     */
    public NetPosition2 setAcrdIntrstAmt(AmountAndDirection21 value) {
        this.acrdIntrstAmt = value;
        return this;
    }

    /**
     * Gets the value of the avrgDealPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price4 }
     *     
     */
    public Price4 getAvrgDealPric() {
        return avrgDealPric;
    }

    /**
     * Sets the value of the avrgDealPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price4 }
     *     
     */
    public NetPosition2 setAvrgDealPric(Price4 value) {
        this.avrgDealPric = value;
        return this;
    }

    /**
     * Gets the value of the netQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getNetQty() {
        return netQty;
    }

    /**
     * Sets the value of the netQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public NetPosition2 setNetQty(FinancialInstrumentQuantity1Choice value) {
        this.netQty = value;
        return this;
    }

    /**
     * Gets the value of the sctiesMvmntTp property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiveDelivery1Code }
     *     
     */
    public ReceiveDelivery1Code getSctiesMvmntTp() {
        return sctiesMvmntTp;
    }

    /**
     * Sets the value of the sctiesMvmntTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiveDelivery1Code }
     *     
     */
    public NetPosition2 setSctiesMvmntTp(ReceiveDelivery1Code value) {
        this.sctiesMvmntTp = value;
        return this;
    }

    /**
     * Gets the value of the dpstry property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification34Choice }
     *     
     */
    public PartyIdentification34Choice getDpstry() {
        return dpstry;
    }

    /**
     * Sets the value of the dpstry property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification34Choice }
     *     
     */
    public NetPosition2 setDpstry(PartyIdentification34Choice value) {
        this.dpstry = value;
        return this;
    }

    /**
     * Gets the value of the tradgCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link TradingCapacity5Code }
     *     
     */
    public TradingCapacity5Code getTradgCpcty() {
        return tradgCpcty;
    }

    /**
     * Sets the value of the tradgCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingCapacity5Code }
     *     
     */
    public NetPosition2 setTradgCpcty(TradingCapacity5Code value) {
        this.tradgCpcty = value;
        return this;
    }

    /**
     * Gets the value of the plcOfTrad property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification20 }
     *     
     */
    public MarketIdentification20 getPlcOfTrad() {
        return plcOfTrad;
    }

    /**
     * Sets the value of the plcOfTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification20 }
     *     
     */
    public NetPosition2 setPlcOfTrad(MarketIdentification20 value) {
        this.plcOfTrad = value;
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
    public Calendar getTradDt() {
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
    public NetPosition2 setTradDt(Calendar value) {
        this.tradDt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat15Choice }
     *     
     */
    public DateFormat15Choice getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat15Choice }
     *     
     */
    public NetPosition2 setSttlmDt(DateFormat15Choice value) {
        this.sttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the tradLegDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tradLegDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradLegDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeLeg7 }
     * 
     * 
     * @return
     *     The value of the tradLegDtls property.
     */
    public List<TradeLeg7> getTradLegDtls() {
        if (tradLegDtls == null) {
            tradLegDtls = new ArrayList<>();
        }
        return this.tradLegDtls;
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
     * Adds a new item to the tradLegDtls list.
     * @see #getTradLegDtls()
     * 
     */
    public NetPosition2 addTradLegDtls(TradeLeg7 tradLegDtls) {
        getTradLegDtls().add(tradLegDtls);
        return this;
    }

}
