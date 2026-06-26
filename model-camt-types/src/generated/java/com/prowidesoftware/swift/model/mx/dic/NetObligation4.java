
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
 * Describes the amount, direction and parties involved in a payment obligation between two participants (and their netting group or trading party) of a netting service.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetObligation4", propOrder = {
    "oblgtnId",
    "prvsSpltInd",
    "amt",
    "ptcptNetgId",
    "oblgtnDrctn",
    "ctrPtyNetgId",
    "netSvcCtrPtyId",
    "ctrPtySttlmInstrs",
    "pmtClrCentr",
    "sttlmMtd",
    "txsNb",
    "spltInd",
    "ttlNbOfSplts",
    "spltOblgtnData"
})
public class NetObligation4 {

    @XmlElement(name = "OblgtnId", required = true)
    protected String oblgtnId;
    @XmlElement(name = "PrvsSpltInd")
    protected Boolean prvsSpltInd;
    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "PtcptNetgId", required = true)
    protected NettingIdentification2Choice ptcptNetgId;
    @XmlElement(name = "OblgtnDrctn", required = true)
    @XmlSchemaType(name = "string")
    protected PaymentReceipt1Code oblgtnDrctn;
    @XmlElement(name = "CtrPtyNetgId", required = true)
    protected NettingIdentification2Choice ctrPtyNetgId;
    @XmlElement(name = "NetSvcCtrPtyId")
    protected PartyIdentification242Choice netSvcCtrPtyId;
    @XmlElement(name = "CtrPtySttlmInstrs")
    protected SettlementParties120 ctrPtySttlmInstrs;
    @XmlElement(name = "PmtClrCentr")
    protected String pmtClrCentr;
    @XmlElement(name = "SttlmMtd")
    protected String sttlmMtd;
    @XmlElement(name = "TxsNb")
    protected String txsNb;
    @XmlElement(name = "SpltInd")
    protected Boolean spltInd;
    @XmlElement(name = "TtlNbOfSplts")
    protected String ttlNbOfSplts;
    @XmlElement(name = "SpltOblgtnData")
    protected List<SplitObligationAttributes1> spltOblgtnData;

    /**
     * Gets the value of the oblgtnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOblgtnId() {
        return oblgtnId;
    }

    /**
     * Sets the value of the oblgtnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NetObligation4 setOblgtnId(String value) {
        this.oblgtnId = value;
        return this;
    }

    /**
     * Gets the value of the prvsSpltInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrvsSpltInd() {
        return prvsSpltInd;
    }

    /**
     * Sets the value of the prvsSpltInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public NetObligation4 setPrvsSpltInd(Boolean value) {
        this.prvsSpltInd = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public NetObligation4 setAmt(ActiveCurrencyAndAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the ptcptNetgId property.
     * 
     * @return
     *     possible object is
     *     {@link NettingIdentification2Choice }
     *     
     */
    public NettingIdentification2Choice getPtcptNetgId() {
        return ptcptNetgId;
    }

    /**
     * Sets the value of the ptcptNetgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link NettingIdentification2Choice }
     *     
     */
    public NetObligation4 setPtcptNetgId(NettingIdentification2Choice value) {
        this.ptcptNetgId = value;
        return this;
    }

    /**
     * Gets the value of the oblgtnDrctn property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentReceipt1Code }
     *     
     */
    public PaymentReceipt1Code getOblgtnDrctn() {
        return oblgtnDrctn;
    }

    /**
     * Sets the value of the oblgtnDrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentReceipt1Code }
     *     
     */
    public NetObligation4 setOblgtnDrctn(PaymentReceipt1Code value) {
        this.oblgtnDrctn = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtyNetgId property.
     * 
     * @return
     *     possible object is
     *     {@link NettingIdentification2Choice }
     *     
     */
    public NettingIdentification2Choice getCtrPtyNetgId() {
        return ctrPtyNetgId;
    }

    /**
     * Sets the value of the ctrPtyNetgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link NettingIdentification2Choice }
     *     
     */
    public NetObligation4 setCtrPtyNetgId(NettingIdentification2Choice value) {
        this.ctrPtyNetgId = value;
        return this;
    }

    /**
     * Gets the value of the netSvcCtrPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public PartyIdentification242Choice getNetSvcCtrPtyId() {
        return netSvcCtrPtyId;
    }

    /**
     * Sets the value of the netSvcCtrPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public NetObligation4 setNetSvcCtrPtyId(PartyIdentification242Choice value) {
        this.netSvcCtrPtyId = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtySttlmInstrs property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties120 }
     *     
     */
    public SettlementParties120 getCtrPtySttlmInstrs() {
        return ctrPtySttlmInstrs;
    }

    /**
     * Sets the value of the ctrPtySttlmInstrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties120 }
     *     
     */
    public NetObligation4 setCtrPtySttlmInstrs(SettlementParties120 value) {
        this.ctrPtySttlmInstrs = value;
        return this;
    }

    /**
     * Gets the value of the pmtClrCentr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtClrCentr() {
        return pmtClrCentr;
    }

    /**
     * Sets the value of the pmtClrCentr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NetObligation4 setPmtClrCentr(String value) {
        this.pmtClrCentr = value;
        return this;
    }

    /**
     * Gets the value of the sttlmMtd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmMtd() {
        return sttlmMtd;
    }

    /**
     * Sets the value of the sttlmMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NetObligation4 setSttlmMtd(String value) {
        this.sttlmMtd = value;
        return this;
    }

    /**
     * Gets the value of the txsNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxsNb() {
        return txsNb;
    }

    /**
     * Sets the value of the txsNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NetObligation4 setTxsNb(String value) {
        this.txsNb = value;
        return this;
    }

    /**
     * Gets the value of the spltInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpltInd() {
        return spltInd;
    }

    /**
     * Sets the value of the spltInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public NetObligation4 setSpltInd(Boolean value) {
        this.spltInd = value;
        return this;
    }

    /**
     * Gets the value of the ttlNbOfSplts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlNbOfSplts() {
        return ttlNbOfSplts;
    }

    /**
     * Sets the value of the ttlNbOfSplts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NetObligation4 setTtlNbOfSplts(String value) {
        this.ttlNbOfSplts = value;
        return this;
    }

    /**
     * Gets the value of the spltOblgtnData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the spltOblgtnData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpltOblgtnData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SplitObligationAttributes1 }
     * 
     * 
     * @return
     *     The value of the spltOblgtnData property.
     */
    public List<SplitObligationAttributes1> getSpltOblgtnData() {
        if (spltOblgtnData == null) {
            spltOblgtnData = new ArrayList<>();
        }
        return this.spltOblgtnData;
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
     * Adds a new item to the spltOblgtnData list.
     * @see #getSpltOblgtnData()
     * 
     */
    public NetObligation4 addSpltOblgtnData(SplitObligationAttributes1 spltOblgtnData) {
        getSpltOblgtnData().add(spltOblgtnData);
        return this;
    }

}
