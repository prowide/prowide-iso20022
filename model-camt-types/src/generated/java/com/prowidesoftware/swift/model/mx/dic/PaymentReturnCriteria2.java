
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
@XmlType(name = "PaymentReturnCriteria2", propOrder = {
    "txRefInd",
    "trfValDtInd",
    "instrInd",
    "instrStsRtrCrit",
    "instdAmtInd",
    "cdtDbtInd",
    "intrBkSttlmAmtInd",
    "prtyInd",
    "prcgVldtyTmInd",
    "purpInd",
    "instrCpyInd",
    "pmtMsgTpInd",
    "pmtTpInd",
    "pmtInstrRefInd",
    "intrBkValDtInd",
    "rltdRefInd",
    "pmtMtdInd",
    "dbtrInd",
    "frstAgtInd",
    "instgAgtCrspdtInd",
    "instdAgtCrspdtInd",
    "intrmyInd",
    "fnlAgtInd",
    "cdtrInd"
})
public class PaymentReturnCriteria2 {

    @XmlElement(name = "TxRefInd")
    protected Boolean txRefInd;
    @XmlElement(name = "TrfValDtInd")
    protected Boolean trfValDtInd;
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
    @XmlElement(name = "PmtMsgTpInd")
    protected Boolean pmtMsgTpInd;
    @XmlElement(name = "PmtTpInd")
    protected Boolean pmtTpInd;
    @XmlElement(name = "PmtInstrRefInd")
    protected Boolean pmtInstrRefInd;
    @XmlElement(name = "IntrBkValDtInd")
    protected Boolean intrBkValDtInd;
    @XmlElement(name = "RltdRefInd")
    protected Boolean rltdRefInd;
    @XmlElement(name = "PmtMtdInd")
    protected Boolean pmtMtdInd;
    @XmlElement(name = "DbtrInd")
    protected Boolean dbtrInd;
    @XmlElement(name = "FrstAgtInd")
    protected Boolean frstAgtInd;
    @XmlElement(name = "InstgAgtCrspdtInd")
    protected Boolean instgAgtCrspdtInd;
    @XmlElement(name = "InstdAgtCrspdtInd")
    protected Boolean instdAgtCrspdtInd;
    @XmlElement(name = "IntrmyInd")
    protected Boolean intrmyInd;
    @XmlElement(name = "FnlAgtInd")
    protected Boolean fnlAgtInd;
    @XmlElement(name = "CdtrInd")
    protected Boolean cdtrInd;

    /**
     * Gets the value of the txRefInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTxRefInd() {
        return txRefInd;
    }

    /**
     * Sets the value of the txRefInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentReturnCriteria2 setTxRefInd(Boolean value) {
        this.txRefInd = value;
        return this;
    }

    /**
     * Gets the value of the trfValDtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrfValDtInd() {
        return trfValDtInd;
    }

    /**
     * Sets the value of the trfValDtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentReturnCriteria2 setTrfValDtInd(Boolean value) {
        this.trfValDtInd = value;
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
    public PaymentReturnCriteria2 setInstrInd(Boolean value) {
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
    public PaymentReturnCriteria2 setInstrStsRtrCrit(InstructionStatusReturnCriteria value) {
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
    public PaymentReturnCriteria2 setInstdAmtInd(Boolean value) {
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
    public PaymentReturnCriteria2 setCdtDbtInd(Boolean value) {
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
    public PaymentReturnCriteria2 setIntrBkSttlmAmtInd(Boolean value) {
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
    public PaymentReturnCriteria2 setPrtyInd(Boolean value) {
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
    public PaymentReturnCriteria2 setPrcgVldtyTmInd(Boolean value) {
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
    public PaymentReturnCriteria2 setPurpInd(Boolean value) {
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
    public PaymentReturnCriteria2 setInstrCpyInd(Boolean value) {
        this.instrCpyInd = value;
        return this;
    }

    /**
     * Gets the value of the pmtMsgTpInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPmtMsgTpInd() {
        return pmtMsgTpInd;
    }

    /**
     * Sets the value of the pmtMsgTpInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentReturnCriteria2 setPmtMsgTpInd(Boolean value) {
        this.pmtMsgTpInd = value;
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
    public PaymentReturnCriteria2 setPmtTpInd(Boolean value) {
        this.pmtTpInd = value;
        return this;
    }

    /**
     * Gets the value of the pmtInstrRefInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPmtInstrRefInd() {
        return pmtInstrRefInd;
    }

    /**
     * Sets the value of the pmtInstrRefInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentReturnCriteria2 setPmtInstrRefInd(Boolean value) {
        this.pmtInstrRefInd = value;
        return this;
    }

    /**
     * Gets the value of the intrBkValDtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntrBkValDtInd() {
        return intrBkValDtInd;
    }

    /**
     * Sets the value of the intrBkValDtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentReturnCriteria2 setIntrBkValDtInd(Boolean value) {
        this.intrBkValDtInd = value;
        return this;
    }

    /**
     * Gets the value of the rltdRefInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRltdRefInd() {
        return rltdRefInd;
    }

    /**
     * Sets the value of the rltdRefInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentReturnCriteria2 setRltdRefInd(Boolean value) {
        this.rltdRefInd = value;
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
    public PaymentReturnCriteria2 setPmtMtdInd(Boolean value) {
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
    public PaymentReturnCriteria2 setDbtrInd(Boolean value) {
        this.dbtrInd = value;
        return this;
    }

    /**
     * Gets the value of the frstAgtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFrstAgtInd() {
        return frstAgtInd;
    }

    /**
     * Sets the value of the frstAgtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentReturnCriteria2 setFrstAgtInd(Boolean value) {
        this.frstAgtInd = value;
        return this;
    }

    /**
     * Gets the value of the instgAgtCrspdtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInstgAgtCrspdtInd() {
        return instgAgtCrspdtInd;
    }

    /**
     * Sets the value of the instgAgtCrspdtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentReturnCriteria2 setInstgAgtCrspdtInd(Boolean value) {
        this.instgAgtCrspdtInd = value;
        return this;
    }

    /**
     * Gets the value of the instdAgtCrspdtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInstdAgtCrspdtInd() {
        return instdAgtCrspdtInd;
    }

    /**
     * Sets the value of the instdAgtCrspdtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentReturnCriteria2 setInstdAgtCrspdtInd(Boolean value) {
        this.instdAgtCrspdtInd = value;
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
    public PaymentReturnCriteria2 setIntrmyInd(Boolean value) {
        this.intrmyInd = value;
        return this;
    }

    /**
     * Gets the value of the fnlAgtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFnlAgtInd() {
        return fnlAgtInd;
    }

    /**
     * Sets the value of the fnlAgtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentReturnCriteria2 setFnlAgtInd(Boolean value) {
        this.fnlAgtInd = value;
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
    public PaymentReturnCriteria2 setCdtrInd(Boolean value) {
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
