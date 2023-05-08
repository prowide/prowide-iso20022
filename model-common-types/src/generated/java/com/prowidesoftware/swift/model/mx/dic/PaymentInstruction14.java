
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
 * Provides details on the payment instruction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInstruction14", propOrder = {
    "msgId",
    "reqdExctnDt",
    "sts",
    "instdAmt",
    "intrBkSttlmAmt",
    "purp",
    "pmtMtd",
    "prty",
    "prcgVldtyTm",
    "instrCpy",
    "tp",
    "gnrtdOrdr",
    "txId",
    "intrBkSttlmDt",
    "endToEndId",
    "pties"
})
public class PaymentInstruction14 {

    @XmlElement(name = "MsgId")
    protected String msgId;
    @XmlElement(name = "ReqdExctnDt")
    protected DateAndDateTimeChoice reqdExctnDt;
    @XmlElement(name = "Sts")
    protected List<PaymentStatus2> sts;
    @XmlElement(name = "InstdAmt")
    protected Amount3Choice instdAmt;
    @XmlElement(name = "IntrBkSttlmAmt")
    protected Amount2Choice intrBkSttlmAmt;
    @XmlElement(name = "Purp")
    protected String purp;
    @XmlElement(name = "PmtMtd")
    protected PaymentOrigin1Choice pmtMtd;
    @XmlElement(name = "Prty")
    protected PriorityCode3Choice prty;
    @XmlElement(name = "PrcgVldtyTm")
    protected DateTimePeriodChoice prcgVldtyTm;
    @XmlElement(name = "InstrCpy")
    protected String instrCpy;
    @XmlElement(name = "Tp")
    protected PaymentType4Choice tp;
    @XmlElement(name = "GnrtdOrdr")
    protected Boolean gnrtdOrdr;
    @XmlElement(name = "TxId")
    protected String txId;
    @XmlElement(name = "IntrBkSttlmDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar intrBkSttlmDt;
    @XmlElement(name = "EndToEndId")
    protected String endToEndId;
    @XmlElement(name = "Pties")
    protected PaymentTransactionParty2 pties;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentInstruction14 setMsgId(String value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the reqdExctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getReqdExctnDt() {
        return reqdExctnDt;
    }

    /**
     * Sets the value of the reqdExctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public PaymentInstruction14 setReqdExctnDt(DateAndDateTimeChoice value) {
        this.reqdExctnDt = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentStatus2 }
     * 
     * 
     * @return
     *     The value of the sts property.
     */
    public List<PaymentStatus2> getSts() {
        if (sts == null) {
            sts = new ArrayList<>();
        }
        return this.sts;
    }

    /**
     * Gets the value of the instdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount3Choice }
     *     
     */
    public Amount3Choice getInstdAmt() {
        return instdAmt;
    }

    /**
     * Sets the value of the instdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount3Choice }
     *     
     */
    public PaymentInstruction14 setInstdAmt(Amount3Choice value) {
        this.instdAmt = value;
        return this;
    }

    /**
     * Gets the value of the intrBkSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2Choice }
     *     
     */
    public Amount2Choice getIntrBkSttlmAmt() {
        return intrBkSttlmAmt;
    }

    /**
     * Sets the value of the intrBkSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2Choice }
     *     
     */
    public PaymentInstruction14 setIntrBkSttlmAmt(Amount2Choice value) {
        this.intrBkSttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the purp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurp() {
        return purp;
    }

    /**
     * Sets the value of the purp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentInstruction14 setPurp(String value) {
        this.purp = value;
        return this;
    }

    /**
     * Gets the value of the pmtMtd property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentOrigin1Choice }
     *     
     */
    public PaymentOrigin1Choice getPmtMtd() {
        return pmtMtd;
    }

    /**
     * Sets the value of the pmtMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentOrigin1Choice }
     *     
     */
    public PaymentInstruction14 setPmtMtd(PaymentOrigin1Choice value) {
        this.pmtMtd = value;
        return this;
    }

    /**
     * Gets the value of the prty property.
     * 
     * @return
     *     possible object is
     *     {@link PriorityCode3Choice }
     *     
     */
    public PriorityCode3Choice getPrty() {
        return prty;
    }

    /**
     * Sets the value of the prty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityCode3Choice }
     *     
     */
    public PaymentInstruction14 setPrty(PriorityCode3Choice value) {
        this.prty = value;
        return this;
    }

    /**
     * Gets the value of the prcgVldtyTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriodChoice }
     *     
     */
    public DateTimePeriodChoice getPrcgVldtyTm() {
        return prcgVldtyTm;
    }

    /**
     * Sets the value of the prcgVldtyTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriodChoice }
     *     
     */
    public PaymentInstruction14 setPrcgVldtyTm(DateTimePeriodChoice value) {
        this.prcgVldtyTm = value;
        return this;
    }

    /**
     * Gets the value of the instrCpy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrCpy() {
        return instrCpy;
    }

    /**
     * Sets the value of the instrCpy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentInstruction14 setInstrCpy(String value) {
        this.instrCpy = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentType4Choice }
     *     
     */
    public PaymentType4Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType4Choice }
     *     
     */
    public PaymentInstruction14 setTp(PaymentType4Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the gnrtdOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGnrtdOrdr() {
        return gnrtdOrdr;
    }

    /**
     * Sets the value of the gnrtdOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentInstruction14 setGnrtdOrdr(Boolean value) {
        this.gnrtdOrdr = value;
        return this;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentInstruction14 setTxId(String value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the intrBkSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getIntrBkSttlmDt() {
        return intrBkSttlmDt;
    }

    /**
     * Sets the value of the intrBkSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentInstruction14 setIntrBkSttlmDt(Calendar value) {
        this.intrBkSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the endToEndId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndToEndId() {
        return endToEndId;
    }

    /**
     * Sets the value of the endToEndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentInstruction14 setEndToEndId(String value) {
        this.endToEndId = value;
        return this;
    }

    /**
     * Gets the value of the pties property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransactionParty2 }
     *     
     */
    public PaymentTransactionParty2 getPties() {
        return pties;
    }

    /**
     * Sets the value of the pties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransactionParty2 }
     *     
     */
    public PaymentInstruction14 setPties(PaymentTransactionParty2 value) {
        this.pties = value;
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
     * Adds a new item to the sts list.
     * @see #getSts()
     * 
     */
    public PaymentInstruction14 addSts(PaymentStatus2 sts) {
        getSts().add(sts);
        return this;
    }

}
