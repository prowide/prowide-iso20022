
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides information on the settlement of a treasury trade.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementData2", propOrder = {
    "cshFlowUnqRef",
    "sttlmSysUnqRef",
    "sttlmAmt",
    "sttldAmt",
    "rjctdAmt",
    "pngPty",
    "rcvgPty",
    "sttlmDt",
    "sttlmSts",
    "xtndedSttlmSts",
    "sttlmStsSubTp",
    "sspd",
    "pdg"
})
public class SettlementData2 {

    @XmlElement(name = "CshFlowUnqRef")
    protected String cshFlowUnqRef;
    @XmlElement(name = "SttlmSysUnqRef")
    protected String sttlmSysUnqRef;
    @XmlElement(name = "SttlmAmt", required = true)
    protected ActiveOrHistoricCurrencyAndAmount sttlmAmt;
    @XmlElement(name = "SttldAmt")
    protected ActiveOrHistoricCurrencyAndAmount sttldAmt;
    @XmlElement(name = "RjctdAmt")
    protected ActiveOrHistoricCurrencyAndAmount rjctdAmt;
    @XmlElement(name = "PngPty", required = true)
    protected PartyIdentification8Choice pngPty;
    @XmlElement(name = "RcvgPty", required = true)
    protected PartyIdentification8Choice rcvgPty;
    @XmlElement(name = "SttlmDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sttlmDt;
    @XmlElement(name = "SttlmSts")
    @XmlSchemaType(name = "string")
    protected SettlementStatus1Code sttlmSts;
    @XmlElement(name = "XtndedSttlmSts")
    protected String xtndedSttlmSts;
    @XmlElement(name = "SttlmStsSubTp")
    protected String sttlmStsSubTp;
    @XmlElement(name = "Sspd")
    protected boolean sspd;
    @XmlElement(name = "Pdg")
    protected boolean pdg;

    /**
     * Gets the value of the cshFlowUnqRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCshFlowUnqRef() {
        return cshFlowUnqRef;
    }

    /**
     * Sets the value of the cshFlowUnqRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementData2 setCshFlowUnqRef(String value) {
        this.cshFlowUnqRef = value;
        return this;
    }

    /**
     * Gets the value of the sttlmSysUnqRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmSysUnqRef() {
        return sttlmSysUnqRef;
    }

    /**
     * Sets the value of the sttlmSysUnqRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementData2 setSttlmSysUnqRef(String value) {
        this.sttlmSysUnqRef = value;
        return this;
    }

    /**
     * Gets the value of the sttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Sets the value of the sttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public SettlementData2 setSttlmAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.sttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the sttldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getSttldAmt() {
        return sttldAmt;
    }

    /**
     * Sets the value of the sttldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public SettlementData2 setSttldAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.sttldAmt = value;
        return this;
    }

    /**
     * Gets the value of the rjctdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getRjctdAmt() {
        return rjctdAmt;
    }

    /**
     * Sets the value of the rjctdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public SettlementData2 setRjctdAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.rjctdAmt = value;
        return this;
    }

    /**
     * Gets the value of the pngPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification8Choice }
     *     
     */
    public PartyIdentification8Choice getPngPty() {
        return pngPty;
    }

    /**
     * Sets the value of the pngPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification8Choice }
     *     
     */
    public SettlementData2 setPngPty(PartyIdentification8Choice value) {
        this.pngPty = value;
        return this;
    }

    /**
     * Gets the value of the rcvgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification8Choice }
     *     
     */
    public PartyIdentification8Choice getRcvgPty() {
        return rcvgPty;
    }

    /**
     * Sets the value of the rcvgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification8Choice }
     *     
     */
    public SettlementData2 setRcvgPty(PartyIdentification8Choice value) {
        this.rcvgPty = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementData2 setSttlmDt(XMLGregorianCalendar value) {
        this.sttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmSts property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementStatus1Code }
     *     
     */
    public SettlementStatus1Code getSttlmSts() {
        return sttlmSts;
    }

    /**
     * Sets the value of the sttlmSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementStatus1Code }
     *     
     */
    public SettlementData2 setSttlmSts(SettlementStatus1Code value) {
        this.sttlmSts = value;
        return this;
    }

    /**
     * Gets the value of the xtndedSttlmSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedSttlmSts() {
        return xtndedSttlmSts;
    }

    /**
     * Sets the value of the xtndedSttlmSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementData2 setXtndedSttlmSts(String value) {
        this.xtndedSttlmSts = value;
        return this;
    }

    /**
     * Gets the value of the sttlmStsSubTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmStsSubTp() {
        return sttlmStsSubTp;
    }

    /**
     * Sets the value of the sttlmStsSubTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementData2 setSttlmStsSubTp(String value) {
        this.sttlmStsSubTp = value;
        return this;
    }

    /**
     * Gets the value of the sspd property.
     * 
     */
    public boolean isSspd() {
        return sspd;
    }

    /**
     * Sets the value of the sspd property.
     * 
     */
    public SettlementData2 setSspd(boolean value) {
        this.sspd = value;
        return this;
    }

    /**
     * Gets the value of the pdg property.
     * 
     */
    public boolean isPdg() {
        return pdg;
    }

    /**
     * Sets the value of the pdg property.
     * 
     */
    public SettlementData2 setPdg(boolean value) {
        this.pdg = value;
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
