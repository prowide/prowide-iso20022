
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * Defines the criteria used to search for a payment.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentSearch7", propOrder = {
    "msgId",
    "reqdExctnDt",
    "pmtId",
    "sts",
    "instdAmt",
    "instdAmtCcy",
    "cdtDbtInd",
    "intrBkSttlmAmt",
    "intrBkSttlmAmtCcy",
    "pmtMtd",
    "pmtTp",
    "prty",
    "prcgVldtyTm",
    "instr",
    "txId",
    "intrBkSttlmDt",
    "endToEndId",
    "pties"
})
public class PaymentSearch7 {

    @XmlElement(name = "MsgId")
    protected List<String> msgId;
    @XmlElement(name = "ReqdExctnDt")
    protected List<DateAndDateTimeSearch3Choice> reqdExctnDt;
    @XmlElement(name = "PmtId")
    protected List<PaymentIdentification5Choice> pmtId;
    @XmlElement(name = "Sts")
    protected List<InstructionStatusSearch4> sts;
    @XmlElement(name = "InstdAmt")
    protected List<ActiveOrHistoricAmountRange2Choice> instdAmt;
    @XmlElement(name = "InstdAmtCcy")
    protected List<String> instdAmtCcy;
    @XmlElement(name = "CdtDbtInd")
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "IntrBkSttlmAmt")
    protected List<ActiveAmountRange3Choice> intrBkSttlmAmt;
    @XmlElement(name = "IntrBkSttlmAmtCcy")
    protected List<String> intrBkSttlmAmtCcy;
    @XmlElement(name = "PmtMtd")
    protected List<PaymentOrigin1Choice> pmtMtd;
    @XmlElement(name = "PmtTp")
    protected List<PaymentType4Choice> pmtTp;
    @XmlElement(name = "Prty")
    protected List<PriorityCode3Choice> prty;
    @XmlElement(name = "PrcgVldtyTm")
    protected List<DateTimePeriod1Choice> prcgVldtyTm;
    @XmlElement(name = "Instr")
    @XmlSchemaType(name = "string")
    protected List<Instruction1Code> instr;
    @XmlElement(name = "TxId")
    protected List<String> txId;
    @XmlElement(name = "IntrBkSttlmDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected List<XMLGregorianCalendar> intrBkSttlmDt;
    @XmlElement(name = "EndToEndId")
    protected List<String> endToEndId;
    @XmlElement(name = "Pties")
    protected PaymentTransactionParty2 pties;

    /**
     * Gets the value of the msgId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the msgId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsgId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMsgId() {
        if (msgId == null) {
            msgId = new ArrayList<String>();
        }
        return this.msgId;
    }

    /**
     * Gets the value of the reqdExctnDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reqdExctnDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReqdExctnDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateAndDateTimeSearch3Choice }
     * 
     * 
     */
    public List<DateAndDateTimeSearch3Choice> getReqdExctnDt() {
        if (reqdExctnDt == null) {
            reqdExctnDt = new ArrayList<DateAndDateTimeSearch3Choice>();
        }
        return this.reqdExctnDt;
    }

    /**
     * Gets the value of the pmtId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentIdentification5Choice }
     * 
     * 
     */
    public List<PaymentIdentification5Choice> getPmtId() {
        if (pmtId == null) {
            pmtId = new ArrayList<PaymentIdentification5Choice>();
        }
        return this.pmtId;
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
     * {@link InstructionStatusSearch4 }
     * 
     * 
     */
    public List<InstructionStatusSearch4> getSts() {
        if (sts == null) {
            sts = new ArrayList<InstructionStatusSearch4>();
        }
        return this.sts;
    }

    /**
     * Gets the value of the instdAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instdAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstdAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActiveOrHistoricAmountRange2Choice }
     * 
     * 
     */
    public List<ActiveOrHistoricAmountRange2Choice> getInstdAmt() {
        if (instdAmt == null) {
            instdAmt = new ArrayList<ActiveOrHistoricAmountRange2Choice>();
        }
        return this.instdAmt;
    }

    /**
     * Gets the value of the instdAmtCcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instdAmtCcy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstdAmtCcy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInstdAmtCcy() {
        if (instdAmtCcy == null) {
            instdAmtCcy = new ArrayList<String>();
        }
        return this.instdAmtCcy;
    }

    /**
     * Gets the value of the cdtDbtInd property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *     
     */
    public CreditDebitCode getCdtDbtInd() {
        return cdtDbtInd;
    }

    /**
     * Sets the value of the cdtDbtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *     
     */
    public PaymentSearch7 setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
        return this;
    }

    /**
     * Gets the value of the intrBkSttlmAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intrBkSttlmAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrBkSttlmAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActiveAmountRange3Choice }
     * 
     * 
     */
    public List<ActiveAmountRange3Choice> getIntrBkSttlmAmt() {
        if (intrBkSttlmAmt == null) {
            intrBkSttlmAmt = new ArrayList<ActiveAmountRange3Choice>();
        }
        return this.intrBkSttlmAmt;
    }

    /**
     * Gets the value of the intrBkSttlmAmtCcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intrBkSttlmAmtCcy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrBkSttlmAmtCcy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIntrBkSttlmAmtCcy() {
        if (intrBkSttlmAmtCcy == null) {
            intrBkSttlmAmtCcy = new ArrayList<String>();
        }
        return this.intrBkSttlmAmtCcy;
    }

    /**
     * Gets the value of the pmtMtd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtMtd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtMtd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentOrigin1Choice }
     * 
     * 
     */
    public List<PaymentOrigin1Choice> getPmtMtd() {
        if (pmtMtd == null) {
            pmtMtd = new ArrayList<PaymentOrigin1Choice>();
        }
        return this.pmtMtd;
    }

    /**
     * Gets the value of the pmtTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentType4Choice }
     * 
     * 
     */
    public List<PaymentType4Choice> getPmtTp() {
        if (pmtTp == null) {
            pmtTp = new ArrayList<PaymentType4Choice>();
        }
        return this.pmtTp;
    }

    /**
     * Gets the value of the prty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriorityCode3Choice }
     * 
     * 
     */
    public List<PriorityCode3Choice> getPrty() {
        if (prty == null) {
            prty = new ArrayList<PriorityCode3Choice>();
        }
        return this.prty;
    }

    /**
     * Gets the value of the prcgVldtyTm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prcgVldtyTm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrcgVldtyTm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateTimePeriod1Choice }
     * 
     * 
     */
    public List<DateTimePeriod1Choice> getPrcgVldtyTm() {
        if (prcgVldtyTm == null) {
            prcgVldtyTm = new ArrayList<DateTimePeriod1Choice>();
        }
        return this.prcgVldtyTm;
    }

    /**
     * Gets the value of the instr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Instruction1Code }
     * 
     * 
     */
    public List<Instruction1Code> getInstr() {
        if (instr == null) {
            instr = new ArrayList<Instruction1Code>();
        }
        return this.instr;
    }

    /**
     * Gets the value of the txId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTxId() {
        if (txId == null) {
            txId = new ArrayList<String>();
        }
        return this.txId;
    }

    /**
     * Gets the value of the intrBkSttlmDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intrBkSttlmDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrBkSttlmDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getIntrBkSttlmDt() {
        if (intrBkSttlmDt == null) {
            intrBkSttlmDt = new ArrayList<XMLGregorianCalendar>();
        }
        return this.intrBkSttlmDt;
    }

    /**
     * Gets the value of the endToEndId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endToEndId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndToEndId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEndToEndId() {
        if (endToEndId == null) {
            endToEndId = new ArrayList<String>();
        }
        return this.endToEndId;
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
    public PaymentSearch7 setPties(PaymentTransactionParty2 value) {
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
     * Adds a new item to the msgId list.
     * @see #getMsgId()
     * 
     */
    public PaymentSearch7 addMsgId(String msgId) {
        getMsgId().add(msgId);
        return this;
    }

    /**
     * Adds a new item to the reqdExctnDt list.
     * @see #getReqdExctnDt()
     * 
     */
    public PaymentSearch7 addReqdExctnDt(DateAndDateTimeSearch3Choice reqdExctnDt) {
        getReqdExctnDt().add(reqdExctnDt);
        return this;
    }

    /**
     * Adds a new item to the pmtId list.
     * @see #getPmtId()
     * 
     */
    public PaymentSearch7 addPmtId(PaymentIdentification5Choice pmtId) {
        getPmtId().add(pmtId);
        return this;
    }

    /**
     * Adds a new item to the sts list.
     * @see #getSts()
     * 
     */
    public PaymentSearch7 addSts(InstructionStatusSearch4 sts) {
        getSts().add(sts);
        return this;
    }

    /**
     * Adds a new item to the instdAmt list.
     * @see #getInstdAmt()
     * 
     */
    public PaymentSearch7 addInstdAmt(ActiveOrHistoricAmountRange2Choice instdAmt) {
        getInstdAmt().add(instdAmt);
        return this;
    }

    /**
     * Adds a new item to the instdAmtCcy list.
     * @see #getInstdAmtCcy()
     * 
     */
    public PaymentSearch7 addInstdAmtCcy(String instdAmtCcy) {
        getInstdAmtCcy().add(instdAmtCcy);
        return this;
    }

    /**
     * Adds a new item to the intrBkSttlmAmt list.
     * @see #getIntrBkSttlmAmt()
     * 
     */
    public PaymentSearch7 addIntrBkSttlmAmt(ActiveAmountRange3Choice intrBkSttlmAmt) {
        getIntrBkSttlmAmt().add(intrBkSttlmAmt);
        return this;
    }

    /**
     * Adds a new item to the intrBkSttlmAmtCcy list.
     * @see #getIntrBkSttlmAmtCcy()
     * 
     */
    public PaymentSearch7 addIntrBkSttlmAmtCcy(String intrBkSttlmAmtCcy) {
        getIntrBkSttlmAmtCcy().add(intrBkSttlmAmtCcy);
        return this;
    }

    /**
     * Adds a new item to the pmtMtd list.
     * @see #getPmtMtd()
     * 
     */
    public PaymentSearch7 addPmtMtd(PaymentOrigin1Choice pmtMtd) {
        getPmtMtd().add(pmtMtd);
        return this;
    }

    /**
     * Adds a new item to the pmtTp list.
     * @see #getPmtTp()
     * 
     */
    public PaymentSearch7 addPmtTp(PaymentType4Choice pmtTp) {
        getPmtTp().add(pmtTp);
        return this;
    }

    /**
     * Adds a new item to the prty list.
     * @see #getPrty()
     * 
     */
    public PaymentSearch7 addPrty(PriorityCode3Choice prty) {
        getPrty().add(prty);
        return this;
    }

    /**
     * Adds a new item to the prcgVldtyTm list.
     * @see #getPrcgVldtyTm()
     * 
     */
    public PaymentSearch7 addPrcgVldtyTm(DateTimePeriod1Choice prcgVldtyTm) {
        getPrcgVldtyTm().add(prcgVldtyTm);
        return this;
    }

    /**
     * Adds a new item to the instr list.
     * @see #getInstr()
     * 
     */
    public PaymentSearch7 addInstr(Instruction1Code instr) {
        getInstr().add(instr);
        return this;
    }

    /**
     * Adds a new item to the txId list.
     * @see #getTxId()
     * 
     */
    public PaymentSearch7 addTxId(String txId) {
        getTxId().add(txId);
        return this;
    }

    /**
     * Adds a new item to the intrBkSttlmDt list.
     * @see #getIntrBkSttlmDt()
     * 
     */
    public PaymentSearch7 addIntrBkSttlmDt(XMLGregorianCalendar intrBkSttlmDt) {
        getIntrBkSttlmDt().add(intrBkSttlmDt);
        return this;
    }

    /**
     * Adds a new item to the endToEndId list.
     * @see #getEndToEndId()
     * 
     */
    public PaymentSearch7 addEndToEndId(String endToEndId) {
        getEndToEndId().add(endToEndId);
        return this;
    }

}
