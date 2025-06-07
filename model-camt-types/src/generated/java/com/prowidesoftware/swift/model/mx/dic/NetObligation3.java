
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
@XmlType(name = "NetObligation3", propOrder = {
    "oblgtnId",
    "amt",
    "ptcptNetgId",
    "oblgtnDrctn",
    "ctrPtyNetgId",
    "netSvcCtrPtyId",
    "ctrPtySttlmInstrs",
    "pmtClrCentr",
    "txsNb"
})
public class NetObligation3 {

    @XmlElement(name = "OblgtnId", required = true)
    protected String oblgtnId;
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
    public NetObligation3 setOblgtnId(String value) {
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
    public NetObligation3 setAmt(ActiveCurrencyAndAmount value) {
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
    public NetObligation3 setPtcptNetgId(NettingIdentification2Choice value) {
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
    public NetObligation3 setOblgtnDrctn(PaymentReceipt1Code value) {
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
    public NetObligation3 setCtrPtyNetgId(NettingIdentification2Choice value) {
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
    public NetObligation3 setNetSvcCtrPtyId(PartyIdentification242Choice value) {
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
    public NetObligation3 setCtrPtySttlmInstrs(SettlementParties120 value) {
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
    public NetObligation3 setPmtClrCentr(String value) {
        this.pmtClrCentr = value;
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
    public NetObligation3 setTxsNb(String value) {
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
