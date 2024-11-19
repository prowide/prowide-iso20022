
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice of reference.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "References69Choice", propOrder = {
    "sctiesSttlmTxConfId",
    "intraPosMvmntConfId",
    "sctiesBalAcctgRptId",
    "sctiesBalCtdyRptId",
    "intraPosMvmntPstngRptId",
    "sctiesFincgConfId",
    "sctiesTxPdgRptId",
    "sctiesTxPstngRptId",
    "sctiesSttlmTxAllgmtRptId",
    "sctiesSttlmTxAllgmtNtfctnTxId",
    "prtflTrfNtfctnId",
    "sctiesSttlmTxGnrtnNtfctnId",
    "othrMsgId",
    "ttlPrtflValtnRptId",
    "trptyCollTxInstrPrcgStsAdvcId",
    "trptyCollStsAdvcId",
    "trptyCollAndXpsrRptId"
})
public class References69Choice {

    @XmlElement(name = "SctiesSttlmTxConfId")
    protected SettlementTypeAndIdentification18 sctiesSttlmTxConfId;
    @XmlElement(name = "IntraPosMvmntConfId")
    protected String intraPosMvmntConfId;
    @XmlElement(name = "SctiesBalAcctgRptId")
    protected String sctiesBalAcctgRptId;
    @XmlElement(name = "SctiesBalCtdyRptId")
    protected String sctiesBalCtdyRptId;
    @XmlElement(name = "IntraPosMvmntPstngRptId")
    protected String intraPosMvmntPstngRptId;
    @XmlElement(name = "SctiesFincgConfId")
    protected SettlementTypeAndIdentification18 sctiesFincgConfId;
    @XmlElement(name = "SctiesTxPdgRptId")
    protected String sctiesTxPdgRptId;
    @XmlElement(name = "SctiesTxPstngRptId")
    protected String sctiesTxPstngRptId;
    @XmlElement(name = "SctiesSttlmTxAllgmtRptId")
    protected String sctiesSttlmTxAllgmtRptId;
    @XmlElement(name = "SctiesSttlmTxAllgmtNtfctnTxId")
    protected SettlementTypeAndIdentification18 sctiesSttlmTxAllgmtNtfctnTxId;
    @XmlElement(name = "PrtflTrfNtfctnId")
    protected String prtflTrfNtfctnId;
    @XmlElement(name = "SctiesSttlmTxGnrtnNtfctnId")
    protected SettlementTypeAndIdentification18 sctiesSttlmTxGnrtnNtfctnId;
    @XmlElement(name = "OthrMsgId")
    protected String othrMsgId;
    @XmlElement(name = "TtlPrtflValtnRptId")
    protected String ttlPrtflValtnRptId;
    @XmlElement(name = "TrptyCollTxInstrPrcgStsAdvcId")
    protected String trptyCollTxInstrPrcgStsAdvcId;
    @XmlElement(name = "TrptyCollStsAdvcId")
    protected String trptyCollStsAdvcId;
    @XmlElement(name = "TrptyCollAndXpsrRptId")
    protected String trptyCollAndXpsrRptId;

    /**
     * Gets the value of the sctiesSttlmTxConfId property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTypeAndIdentification18 }
     *     
     */
    public SettlementTypeAndIdentification18 getSctiesSttlmTxConfId() {
        return sctiesSttlmTxConfId;
    }

    /**
     * Sets the value of the sctiesSttlmTxConfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTypeAndIdentification18 }
     *     
     */
    public References69Choice setSctiesSttlmTxConfId(SettlementTypeAndIdentification18 value) {
        this.sctiesSttlmTxConfId = value;
        return this;
    }

    /**
     * Gets the value of the intraPosMvmntConfId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntraPosMvmntConfId() {
        return intraPosMvmntConfId;
    }

    /**
     * Sets the value of the intraPosMvmntConfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public References69Choice setIntraPosMvmntConfId(String value) {
        this.intraPosMvmntConfId = value;
        return this;
    }

    /**
     * Gets the value of the sctiesBalAcctgRptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctiesBalAcctgRptId() {
        return sctiesBalAcctgRptId;
    }

    /**
     * Sets the value of the sctiesBalAcctgRptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public References69Choice setSctiesBalAcctgRptId(String value) {
        this.sctiesBalAcctgRptId = value;
        return this;
    }

    /**
     * Gets the value of the sctiesBalCtdyRptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctiesBalCtdyRptId() {
        return sctiesBalCtdyRptId;
    }

    /**
     * Sets the value of the sctiesBalCtdyRptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public References69Choice setSctiesBalCtdyRptId(String value) {
        this.sctiesBalCtdyRptId = value;
        return this;
    }

    /**
     * Gets the value of the intraPosMvmntPstngRptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntraPosMvmntPstngRptId() {
        return intraPosMvmntPstngRptId;
    }

    /**
     * Sets the value of the intraPosMvmntPstngRptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public References69Choice setIntraPosMvmntPstngRptId(String value) {
        this.intraPosMvmntPstngRptId = value;
        return this;
    }

    /**
     * Gets the value of the sctiesFincgConfId property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTypeAndIdentification18 }
     *     
     */
    public SettlementTypeAndIdentification18 getSctiesFincgConfId() {
        return sctiesFincgConfId;
    }

    /**
     * Sets the value of the sctiesFincgConfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTypeAndIdentification18 }
     *     
     */
    public References69Choice setSctiesFincgConfId(SettlementTypeAndIdentification18 value) {
        this.sctiesFincgConfId = value;
        return this;
    }

    /**
     * Gets the value of the sctiesTxPdgRptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctiesTxPdgRptId() {
        return sctiesTxPdgRptId;
    }

    /**
     * Sets the value of the sctiesTxPdgRptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public References69Choice setSctiesTxPdgRptId(String value) {
        this.sctiesTxPdgRptId = value;
        return this;
    }

    /**
     * Gets the value of the sctiesTxPstngRptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctiesTxPstngRptId() {
        return sctiesTxPstngRptId;
    }

    /**
     * Sets the value of the sctiesTxPstngRptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public References69Choice setSctiesTxPstngRptId(String value) {
        this.sctiesTxPstngRptId = value;
        return this;
    }

    /**
     * Gets the value of the sctiesSttlmTxAllgmtRptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctiesSttlmTxAllgmtRptId() {
        return sctiesSttlmTxAllgmtRptId;
    }

    /**
     * Sets the value of the sctiesSttlmTxAllgmtRptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public References69Choice setSctiesSttlmTxAllgmtRptId(String value) {
        this.sctiesSttlmTxAllgmtRptId = value;
        return this;
    }

    /**
     * Gets the value of the sctiesSttlmTxAllgmtNtfctnTxId property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTypeAndIdentification18 }
     *     
     */
    public SettlementTypeAndIdentification18 getSctiesSttlmTxAllgmtNtfctnTxId() {
        return sctiesSttlmTxAllgmtNtfctnTxId;
    }

    /**
     * Sets the value of the sctiesSttlmTxAllgmtNtfctnTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTypeAndIdentification18 }
     *     
     */
    public References69Choice setSctiesSttlmTxAllgmtNtfctnTxId(SettlementTypeAndIdentification18 value) {
        this.sctiesSttlmTxAllgmtNtfctnTxId = value;
        return this;
    }

    /**
     * Gets the value of the prtflTrfNtfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtflTrfNtfctnId() {
        return prtflTrfNtfctnId;
    }

    /**
     * Sets the value of the prtflTrfNtfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public References69Choice setPrtflTrfNtfctnId(String value) {
        this.prtflTrfNtfctnId = value;
        return this;
    }

    /**
     * Gets the value of the sctiesSttlmTxGnrtnNtfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTypeAndIdentification18 }
     *     
     */
    public SettlementTypeAndIdentification18 getSctiesSttlmTxGnrtnNtfctnId() {
        return sctiesSttlmTxGnrtnNtfctnId;
    }

    /**
     * Sets the value of the sctiesSttlmTxGnrtnNtfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTypeAndIdentification18 }
     *     
     */
    public References69Choice setSctiesSttlmTxGnrtnNtfctnId(SettlementTypeAndIdentification18 value) {
        this.sctiesSttlmTxGnrtnNtfctnId = value;
        return this;
    }

    /**
     * Gets the value of the othrMsgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrMsgId() {
        return othrMsgId;
    }

    /**
     * Sets the value of the othrMsgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public References69Choice setOthrMsgId(String value) {
        this.othrMsgId = value;
        return this;
    }

    /**
     * Gets the value of the ttlPrtflValtnRptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlPrtflValtnRptId() {
        return ttlPrtflValtnRptId;
    }

    /**
     * Sets the value of the ttlPrtflValtnRptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public References69Choice setTtlPrtflValtnRptId(String value) {
        this.ttlPrtflValtnRptId = value;
        return this;
    }

    /**
     * Gets the value of the trptyCollTxInstrPrcgStsAdvcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrptyCollTxInstrPrcgStsAdvcId() {
        return trptyCollTxInstrPrcgStsAdvcId;
    }

    /**
     * Sets the value of the trptyCollTxInstrPrcgStsAdvcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public References69Choice setTrptyCollTxInstrPrcgStsAdvcId(String value) {
        this.trptyCollTxInstrPrcgStsAdvcId = value;
        return this;
    }

    /**
     * Gets the value of the trptyCollStsAdvcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrptyCollStsAdvcId() {
        return trptyCollStsAdvcId;
    }

    /**
     * Sets the value of the trptyCollStsAdvcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public References69Choice setTrptyCollStsAdvcId(String value) {
        this.trptyCollStsAdvcId = value;
        return this;
    }

    /**
     * Gets the value of the trptyCollAndXpsrRptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrptyCollAndXpsrRptId() {
        return trptyCollAndXpsrRptId;
    }

    /**
     * Sets the value of the trptyCollAndXpsrRptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public References69Choice setTrptyCollAndXpsrRptId(String value) {
        this.trptyCollAndXpsrRptId = value;
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
