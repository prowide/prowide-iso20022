
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * Key elements used to identify the original transaction(s) that is being referred to.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackerPaymentTransaction3", propOrder = {
    "trckdMsgId",
    "trckrInfrmgPty",
    "pmtId",
    "sttlmInf",
    "instdAgt",
    "intrBkSttlmAmt",
    "xchgRateData",
    "chrgBr",
    "chrgsInf",
    "trckrData"
})
public class TrackerPaymentTransaction3 {

    @XmlElement(name = "TrckdMsgId")
    protected OriginalBusinessInstruction2 trckdMsgId;
    @XmlElement(name = "TrckrInfrmgPty", required = true)
    protected TrackerPartyIdentification1 trckrInfrmgPty;
    @XmlElement(name = "PmtId", required = true)
    protected PaymentIdentification11 pmtId;
    @XmlElement(name = "SttlmInf")
    protected SettlementInstruction10 sttlmInf;
    @XmlElement(name = "InstdAgt")
    protected TrackerFinancialInstitutionIdentification1 instdAgt;
    @XmlElement(name = "IntrBkSttlmAmt")
    protected RestrictedFINActiveCurrencyAndAmount intrBkSttlmAmt;
    @XmlElement(name = "XchgRateData")
    protected CurrencyExchange16 xchgRateData;
    @XmlElement(name = "ChrgBr")
    @XmlSchemaType(name = "string")
    protected ChargeBearerType4Code chrgBr;
    @XmlElement(name = "ChrgsInf")
    protected List<TrackerCharges1> chrgsInf;
    @XmlElement(name = "TrckrData")
    protected TrackerData3 trckrData;

    /**
     * Gets the value of the trckdMsgId property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalBusinessInstruction2 }
     *     
     */
    public OriginalBusinessInstruction2 getTrckdMsgId() {
        return trckdMsgId;
    }

    /**
     * Sets the value of the trckdMsgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalBusinessInstruction2 }
     *     
     */
    public TrackerPaymentTransaction3 setTrckdMsgId(OriginalBusinessInstruction2 value) {
        this.trckdMsgId = value;
        return this;
    }

    /**
     * Gets the value of the trckrInfrmgPty property.
     * 
     * @return
     *     possible object is
     *     {@link TrackerPartyIdentification1 }
     *     
     */
    public TrackerPartyIdentification1 getTrckrInfrmgPty() {
        return trckrInfrmgPty;
    }

    /**
     * Sets the value of the trckrInfrmgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackerPartyIdentification1 }
     *     
     */
    public TrackerPaymentTransaction3 setTrckrInfrmgPty(TrackerPartyIdentification1 value) {
        this.trckrInfrmgPty = value;
        return this;
    }

    /**
     * Gets the value of the pmtId property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentIdentification11 }
     *     
     */
    public PaymentIdentification11 getPmtId() {
        return pmtId;
    }

    /**
     * Sets the value of the pmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentIdentification11 }
     *     
     */
    public TrackerPaymentTransaction3 setPmtId(PaymentIdentification11 value) {
        this.pmtId = value;
        return this;
    }

    /**
     * Gets the value of the sttlmInf property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementInstruction10 }
     *     
     */
    public SettlementInstruction10 getSttlmInf() {
        return sttlmInf;
    }

    /**
     * Sets the value of the sttlmInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementInstruction10 }
     *     
     */
    public TrackerPaymentTransaction3 setSttlmInf(SettlementInstruction10 value) {
        this.sttlmInf = value;
        return this;
    }

    /**
     * Gets the value of the instdAgt property.
     * 
     * @return
     *     possible object is
     *     {@link TrackerFinancialInstitutionIdentification1 }
     *     
     */
    public TrackerFinancialInstitutionIdentification1 getInstdAgt() {
        return instdAgt;
    }

    /**
     * Sets the value of the instdAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackerFinancialInstitutionIdentification1 }
     *     
     */
    public TrackerPaymentTransaction3 setInstdAgt(TrackerFinancialInstitutionIdentification1 value) {
        this.instdAgt = value;
        return this;
    }

    /**
     * Gets the value of the intrBkSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getIntrBkSttlmAmt() {
        return intrBkSttlmAmt;
    }

    /**
     * Sets the value of the intrBkSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public TrackerPaymentTransaction3 setIntrBkSttlmAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.intrBkSttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the xchgRateData property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyExchange16 }
     *     
     */
    public CurrencyExchange16 getXchgRateData() {
        return xchgRateData;
    }

    /**
     * Sets the value of the xchgRateData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyExchange16 }
     *     
     */
    public TrackerPaymentTransaction3 setXchgRateData(CurrencyExchange16 value) {
        this.xchgRateData = value;
        return this;
    }

    /**
     * Gets the value of the chrgBr property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeBearerType4Code }
     *     
     */
    public ChargeBearerType4Code getChrgBr() {
        return chrgBr;
    }

    /**
     * Sets the value of the chrgBr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeBearerType4Code }
     *     
     */
    public TrackerPaymentTransaction3 setChrgBr(ChargeBearerType4Code value) {
        this.chrgBr = value;
        return this;
    }

    /**
     * Gets the value of the chrgsInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chrgsInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChrgsInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackerCharges1 }
     * 
     * 
     */
    public List<TrackerCharges1> getChrgsInf() {
        if (chrgsInf == null) {
            chrgsInf = new ArrayList<TrackerCharges1>();
        }
        return this.chrgsInf;
    }

    /**
     * Gets the value of the trckrData property.
     * 
     * @return
     *     possible object is
     *     {@link TrackerData3 }
     *     
     */
    public TrackerData3 getTrckrData() {
        return trckrData;
    }

    /**
     * Sets the value of the trckrData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackerData3 }
     *     
     */
    public TrackerPaymentTransaction3 setTrckrData(TrackerData3 value) {
        this.trckrData = value;
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
     * Adds a new item to the chrgsInf list.
     * @see #getChrgsInf()
     * 
     */
    public TrackerPaymentTransaction3 addChrgsInf(TrackerCharges1 chrgsInf) {
        getChrgsInf().add(chrgsInf);
        return this;
    }

}
