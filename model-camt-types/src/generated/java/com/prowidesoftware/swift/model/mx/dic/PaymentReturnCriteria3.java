
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
 * Defines the criteria used to report on the payment.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentReturnCriteria3", propOrder = {
    "msgIdInd",
    "reqdExctnDtInd",
    "instrInd",
    "instrStsRtrCrit",
    "instdAmtInd",
    "cdtDbtInd",
    "intrBkSttlmAmtInd",
    "prtyInd",
    "prcgVldtyTmInd",
    "purpInd",
    "instrCpyInd",
    "pmtMTInd",
    "pmtTpInd",
    "txIdInd",
    "intrBkSttlmDtInd",
    "endToEndIdInd",
    "pmtMtdInd",
    "dbtrInd",
    "dbtrAgtInd",
    "instgRmbrsmntAgtInd",
    "instdRmbrsmntAgtInd",
    "intrmyInd",
    "cdtrAgtInd",
    "cdtrInd"
})
public class PaymentReturnCriteria3 {

    @XmlElement(name = "MsgIdInd")
    protected Boolean msgIdInd;
    @XmlElement(name = "ReqdExctnDtInd")
    protected Boolean reqdExctnDtInd;
    @XmlElement(name = "InstrInd")
    protected Boolean instrInd;
    @XmlElement(name = "InstrStsRtrCrit")
    protected InstructionStatusReturnCriteria instrStsRtrCrit;
    @XmlElement(name = "InstdAmtInd")
    protected Boolean instdAmtInd;
    @XmlElement(name = "CdtDbtInd")
    protected Boolean cdtDbtInd;
    @XmlElement(name = "IntrBkSttlmAmtInd")
    protected Boolean intrBkSttlmAmtInd;
    @XmlElement(name = "PrtyInd")
    protected Boolean prtyInd;
    @XmlElement(name = "PrcgVldtyTmInd")
    protected Boolean prcgVldtyTmInd;
    @XmlElement(name = "PurpInd")
    protected Boolean purpInd;
    @XmlElement(name = "InstrCpyInd")
    protected Boolean instrCpyInd;
    @XmlElement(name = "PmtMTInd")
    protected Boolean pmtMTInd;
    @XmlElement(name = "PmtTpInd")
    protected Boolean pmtTpInd;
    @XmlElement(name = "TxIdInd")
    protected Boolean txIdInd;
    @XmlElement(name = "IntrBkSttlmDtInd")
    protected Boolean intrBkSttlmDtInd;
    @XmlElement(name = "EndToEndIdInd")
    protected Boolean endToEndIdInd;
    @XmlElement(name = "PmtMtdInd")
    protected Boolean pmtMtdInd;
    @XmlElement(name = "DbtrInd")
    protected Boolean dbtrInd;
    @XmlElement(name = "DbtrAgtInd")
    protected Boolean dbtrAgtInd;
    @XmlElement(name = "InstgRmbrsmntAgtInd")
    protected Boolean instgRmbrsmntAgtInd;
    @XmlElement(name = "InstdRmbrsmntAgtInd")
    protected Boolean instdRmbrsmntAgtInd;
    @XmlElement(name = "IntrmyInd")
    protected Boolean intrmyInd;
    @XmlElement(name = "CdtrAgtInd")
    protected Boolean cdtrAgtInd;
    @XmlElement(name = "CdtrInd")
    protected Boolean cdtrInd;

    /**
     * Gets the value of the msgIdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMsgIdInd() {
        return msgIdInd;
    }

    /**
     * Sets the value of the msgIdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentReturnCriteria3 setMsgIdInd(Boolean value) {
        this.msgIdInd = value;
        return this;
    }

    /**
     * Gets the value of the reqdExctnDtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReqdExctnDtInd() {
        return reqdExctnDtInd;
    }

    /**
     * Sets the value of the reqdExctnDtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentReturnCriteria3 setReqdExctnDtInd(Boolean value) {
        this.reqdExctnDtInd = value;
        return this;
    }

    /**
     * Gets the value of the instrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInstrInd() {
        return instrInd;
    }

    /**
     * Sets the value of the instrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentReturnCriteria3 setInstrInd(Boolean value) {
        this.instrInd = value;
        return this;
    }

    /**
     * Gets the value of the instrStsRtrCrit property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionStatusReturnCriteria }
     *     
     */
    public InstructionStatusReturnCriteria getInstrStsRtrCrit() {
        return instrStsRtrCrit;
    }

    /**
     * Sets the value of the instrStsRtrCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionStatusReturnCriteria }
     *     
     */
    public PaymentReturnCriteria3 setInstrStsRtrCrit(InstructionStatusReturnCriteria value) {
        this.instrStsRtrCrit = value;
        return this;
    }

    /**
     * Gets the value of the instdAmtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInstdAmtInd() {
        return instdAmtInd;
    }

    /**
     * Sets the value of the instdAmtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentReturnCriteria3 setInstdAmtInd(Boolean value) {
        this.instdAmtInd = value;
        return this;
    }

    /**
     * Gets the value of the cdtDbtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCdtDbtInd() {
        return cdtDbtInd;
    }

    /**
     * Sets the value of the cdtDbtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentReturnCriteria3 setCdtDbtInd(Boolean value) {
        this.cdtDbtInd = value;
        return this;
    }

    /**
     * Gets the value of the intrBkSttlmAmtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntrBkSttlmAmtInd() {
        return intrBkSttlmAmtInd;
    }

    /**
     * Sets the value of the intrBkSttlmAmtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentReturnCriteria3 setIntrBkSttlmAmtInd(Boolean value) {
        this.intrBkSttlmAmtInd = value;
        return this;
    }

    /**
     * Gets the value of the prtyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrtyInd() {
        return prtyInd;
    }

    /**
     * Sets the value of the prtyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentReturnCriteria3 setPrtyInd(Boolean value) {
        this.prtyInd = value;
        return this;
    }

    /**
     * Gets the value of the prcgVldtyTmInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrcgVldtyTmInd() {
        return prcgVldtyTmInd;
    }

    /**
     * Sets the value of the prcgVldtyTmInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentReturnCriteria3 setPrcgVldtyTmInd(Boolean value) {
        this.prcgVldtyTmInd = value;
        return this;
    }

    /**
     * Gets the value of the purpInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPurpInd() {
        return purpInd;
    }

    /**
     * Sets the value of the purpInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentReturnCriteria3 setPurpInd(Boolean value) {
        this.purpInd = value;
        return this;
    }

    /**
     * Gets the value of the instrCpyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInstrCpyInd() {
        return instrCpyInd;
    }

    /**
     * Sets the value of the instrCpyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentReturnCriteria3 setInstrCpyInd(Boolean value) {
        this.instrCpyInd = value;
        return this;
    }

    /**
     * Gets the value of the pmtMTInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPmtMTInd() {
        return pmtMTInd;
    }

    /**
     * Sets the value of the pmtMTInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentReturnCriteria3 setPmtMTInd(Boolean value) {
        this.pmtMTInd = value;
        return this;
    }

    /**
     * Gets the value of the pmtTpInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPmtTpInd() {
        return pmtTpInd;
    }

    /**
     * Sets the value of the pmtTpInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentReturnCriteria3 setPmtTpInd(Boolean value) {
        this.pmtTpInd = value;
        return this;
    }

    /**
     * Gets the value of the txIdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTxIdInd() {
        return txIdInd;
    }

    /**
     * Sets the value of the txIdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentReturnCriteria3 setTxIdInd(Boolean value) {
        this.txIdInd = value;
        return this;
    }

    /**
     * Gets the value of the intrBkSttlmDtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntrBkSttlmDtInd() {
        return intrBkSttlmDtInd;
    }

    /**
     * Sets the value of the intrBkSttlmDtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentReturnCriteria3 setIntrBkSttlmDtInd(Boolean value) {
        this.intrBkSttlmDtInd = value;
        return this;
    }

    /**
     * Gets the value of the endToEndIdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEndToEndIdInd() {
        return endToEndIdInd;
    }

    /**
     * Sets the value of the endToEndIdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentReturnCriteria3 setEndToEndIdInd(Boolean value) {
        this.endToEndIdInd = value;
        return this;
    }

    /**
     * Gets the value of the pmtMtdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPmtMtdInd() {
        return pmtMtdInd;
    }

    /**
     * Sets the value of the pmtMtdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentReturnCriteria3 setPmtMtdInd(Boolean value) {
        this.pmtMtdInd = value;
        return this;
    }

    /**
     * Gets the value of the dbtrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDbtrInd() {
        return dbtrInd;
    }

    /**
     * Sets the value of the dbtrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentReturnCriteria3 setDbtrInd(Boolean value) {
        this.dbtrInd = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAgtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDbtrAgtInd() {
        return dbtrAgtInd;
    }

    /**
     * Sets the value of the dbtrAgtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentReturnCriteria3 setDbtrAgtInd(Boolean value) {
        this.dbtrAgtInd = value;
        return this;
    }

    /**
     * Gets the value of the instgRmbrsmntAgtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInstgRmbrsmntAgtInd() {
        return instgRmbrsmntAgtInd;
    }

    /**
     * Sets the value of the instgRmbrsmntAgtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentReturnCriteria3 setInstgRmbrsmntAgtInd(Boolean value) {
        this.instgRmbrsmntAgtInd = value;
        return this;
    }

    /**
     * Gets the value of the instdRmbrsmntAgtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInstdRmbrsmntAgtInd() {
        return instdRmbrsmntAgtInd;
    }

    /**
     * Sets the value of the instdRmbrsmntAgtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentReturnCriteria3 setInstdRmbrsmntAgtInd(Boolean value) {
        this.instdRmbrsmntAgtInd = value;
        return this;
    }

    /**
     * Gets the value of the intrmyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntrmyInd() {
        return intrmyInd;
    }

    /**
     * Sets the value of the intrmyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentReturnCriteria3 setIntrmyInd(Boolean value) {
        this.intrmyInd = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAgtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCdtrAgtInd() {
        return cdtrAgtInd;
    }

    /**
     * Sets the value of the cdtrAgtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentReturnCriteria3 setCdtrAgtInd(Boolean value) {
        this.cdtrAgtInd = value;
        return this;
    }

    /**
     * Gets the value of the cdtrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCdtrInd() {
        return cdtrInd;
    }

    /**
     * Sets the value of the cdtrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentReturnCriteria3 setCdtrInd(Boolean value) {
        this.cdtrInd = value;
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
