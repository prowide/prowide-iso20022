
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
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
@XmlType(name = "PaymentInstruction32", propOrder = {
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
public class PaymentInstruction32 {

    @XmlElement(name = "MsgId")
    protected String msgId;
    @XmlElement(name = "ReqdExctnDt")
    protected DateAndDateTime2Choice reqdExctnDt;
    @XmlElement(name = "Sts")
    protected List<PaymentStatus6> sts;
    @XmlElement(name = "InstdAmt")
    protected Amount3Choice instdAmt;
    @XmlElement(name = "IntrBkSttlmAmt")
    protected Amount2Choice intrBkSttlmAmt;
    @XmlElement(name = "Purp")
    protected String purp;
    @XmlElement(name = "PmtMtd")
    protected PaymentOrigin1Choice pmtMtd;
    @XmlElement(name = "Prty")
    protected Priority1Choice prty;
    @XmlElement(name = "PrcgVldtyTm")
    protected DateTimePeriod1Choice prcgVldtyTm;
    @XmlElement(name = "InstrCpy")
    protected String instrCpy;
    @XmlElement(name = "Tp")
    protected PaymentType4Choice tp;
    @XmlElement(name = "GnrtdOrdr")
    protected Boolean gnrtdOrdr;
    @XmlElement(name = "TxId")
    protected String txId;
    @XmlElement(name = "IntrBkSttlmDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar intrBkSttlmDt;
    @XmlElement(name = "EndToEndId")
    protected String endToEndId;
    @XmlElement(name = "Pties")
    protected PaymentTransactionParty3 pties;

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
    public PaymentInstruction32 setMsgId(String value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the reqdExctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getReqdExctnDt() {
        return reqdExctnDt;
    }

    /**
     * Sets the value of the reqdExctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public PaymentInstruction32 setReqdExctnDt(DateAndDateTime2Choice value) {
        this.reqdExctnDt = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sts property.
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
     * {@link PaymentStatus6 }
     * 
     * 
     */
    public List<PaymentStatus6> getSts() {
        if (sts == null) {
            sts = new ArrayList<PaymentStatus6>();
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
    public PaymentInstruction32 setInstdAmt(Amount3Choice value) {
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
    public PaymentInstruction32 setIntrBkSttlmAmt(Amount2Choice value) {
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
    public PaymentInstruction32 setPurp(String value) {
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
    public PaymentInstruction32 setPmtMtd(PaymentOrigin1Choice value) {
        this.pmtMtd = value;
        return this;
    }

    /**
     * Gets the value of the prty property.
     * 
     * @return
     *     possible object is
     *     {@link Priority1Choice }
     *     
     */
    public Priority1Choice getPrty() {
        return prty;
    }

    /**
     * Sets the value of the prty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority1Choice }
     *     
     */
    public PaymentInstruction32 setPrty(Priority1Choice value) {
        this.prty = value;
        return this;
    }

    /**
     * Gets the value of the prcgVldtyTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod1Choice }
     *     
     */
    public DateTimePeriod1Choice getPrcgVldtyTm() {
        return prcgVldtyTm;
    }

    /**
     * Sets the value of the prcgVldtyTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod1Choice }
     *     
     */
    public PaymentInstruction32 setPrcgVldtyTm(DateTimePeriod1Choice value) {
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
    public PaymentInstruction32 setInstrCpy(String value) {
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
    public PaymentInstruction32 setTp(PaymentType4Choice value) {
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
    public PaymentInstruction32 setGnrtdOrdr(Boolean value) {
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
    public PaymentInstruction32 setTxId(String value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the intrBkSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIntrBkSttlmDt() {
        return intrBkSttlmDt;
    }

    /**
     * Sets the value of the intrBkSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public PaymentInstruction32 setIntrBkSttlmDt(XMLGregorianCalendar value) {
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
    public PaymentInstruction32 setEndToEndId(String value) {
        this.endToEndId = value;
        return this;
    }

    /**
     * Gets the value of the pties property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransactionParty3 }
     *     
     */
    public PaymentTransactionParty3 getPties() {
        return pties;
    }

    /**
     * Sets the value of the pties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransactionParty3 }
     *     
     */
    public PaymentInstruction32 setPties(PaymentTransactionParty3 value) {
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
    public PaymentInstruction32 addSts(PaymentStatus6 sts) {
        getSts().add(sts);
        return this;
    }

}
