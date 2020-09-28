
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "NetObligation1", propOrder = {
    "oblgtnId",
    "amt",
    "ptcptNetgId",
    "oblgtnDrctn",
    "ctrPtyNetgId",
    "netSvcCtrPtyId",
    "ctrPtySttlmInstrs",
    "txsNb"
})
public class NetObligation1 {

    @XmlElement(name = "OblgtnId", required = true)
    protected String oblgtnId;
    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "PtcptNetgId", required = true)
    protected NettingIdentification1Choice ptcptNetgId;
    @XmlElement(name = "OblgtnDrctn", required = true)
    @XmlSchemaType(name = "string")
    protected PaymentReceipt1Code oblgtnDrctn;
    @XmlElement(name = "CtrPtyNetgId", required = true)
    protected NettingIdentification1Choice ctrPtyNetgId;
    @XmlElement(name = "NetSvcCtrPtyId")
    protected PartyIdentification73Choice netSvcCtrPtyId;
    @XmlElement(name = "CtrPtySttlmInstrs")
    protected SettlementParties29 ctrPtySttlmInstrs;
    @XmlElement(name = "TxsNb")
    protected String txsNb;

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
    public NetObligation1 setOblgtnId(String value) {
        this.oblgtnId = value;
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
    public NetObligation1 setAmt(ActiveCurrencyAndAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the ptcptNetgId property.
     * 
     * @return
     *     possible object is
     *     {@link NettingIdentification1Choice }
     *     
     */
    public NettingIdentification1Choice getPtcptNetgId() {
        return ptcptNetgId;
    }

    /**
     * Sets the value of the ptcptNetgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link NettingIdentification1Choice }
     *     
     */
    public NetObligation1 setPtcptNetgId(NettingIdentification1Choice value) {
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
    public NetObligation1 setOblgtnDrctn(PaymentReceipt1Code value) {
        this.oblgtnDrctn = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtyNetgId property.
     * 
     * @return
     *     possible object is
     *     {@link NettingIdentification1Choice }
     *     
     */
    public NettingIdentification1Choice getCtrPtyNetgId() {
        return ctrPtyNetgId;
    }

    /**
     * Sets the value of the ctrPtyNetgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link NettingIdentification1Choice }
     *     
     */
    public NetObligation1 setCtrPtyNetgId(NettingIdentification1Choice value) {
        this.ctrPtyNetgId = value;
        return this;
    }

    /**
     * Gets the value of the netSvcCtrPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public PartyIdentification73Choice getNetSvcCtrPtyId() {
        return netSvcCtrPtyId;
    }

    /**
     * Sets the value of the netSvcCtrPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public NetObligation1 setNetSvcCtrPtyId(PartyIdentification73Choice value) {
        this.netSvcCtrPtyId = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtySttlmInstrs property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties29 }
     *     
     */
    public SettlementParties29 getCtrPtySttlmInstrs() {
        return ctrPtySttlmInstrs;
    }

    /**
     * Sets the value of the ctrPtySttlmInstrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties29 }
     *     
     */
    public NetObligation1 setCtrPtySttlmInstrs(SettlementParties29 value) {
        this.ctrPtySttlmInstrs = value;
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
    public NetObligation1 setTxsNb(String value) {
        this.txsNb = value;
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

}
