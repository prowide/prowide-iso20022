
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Context of the card payment transaction
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionContext4", propOrder = {
    "mrchntCtgyCd",
    "dfrrdDlvryInd",
    "txInitr",
    "cardPrgrmm",
    "sttlmSvc",
    "rcncltn",
    "captrDt"
})
public class TransactionContext4 {

    @XmlElement(name = "MrchntCtgyCd")
    protected String mrchntCtgyCd;
    @XmlElement(name = "DfrrdDlvryInd")
    protected Boolean dfrrdDlvryInd;
    @XmlElement(name = "TxInitr")
    @XmlSchemaType(name = "string")
    protected TransactionInitiator1Code txInitr;
    @XmlElement(name = "CardPrgrmm")
    protected CardProgramme1 cardPrgrmm;
    @XmlElement(name = "SttlmSvc")
    protected SettlementService1 sttlmSvc;
    @XmlElement(name = "Rcncltn")
    protected Reconciliation3 rcncltn;
    @XmlElement(name = "CaptrDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar captrDt;

    /**
     * Gets the value of the mrchntCtgyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrchntCtgyCd() {
        return mrchntCtgyCd;
    }

    /**
     * Sets the value of the mrchntCtgyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionContext4 setMrchntCtgyCd(String value) {
        this.mrchntCtgyCd = value;
        return this;
    }

    /**
     * Gets the value of the dfrrdDlvryInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDfrrdDlvryInd() {
        return dfrrdDlvryInd;
    }

    /**
     * Sets the value of the dfrrdDlvryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TransactionContext4 setDfrrdDlvryInd(Boolean value) {
        this.dfrrdDlvryInd = value;
        return this;
    }

    /**
     * Gets the value of the txInitr property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionInitiator1Code }
     *     
     */
    public TransactionInitiator1Code getTxInitr() {
        return txInitr;
    }

    /**
     * Sets the value of the txInitr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionInitiator1Code }
     *     
     */
    public TransactionContext4 setTxInitr(TransactionInitiator1Code value) {
        this.txInitr = value;
        return this;
    }

    /**
     * Gets the value of the cardPrgrmm property.
     * 
     * @return
     *     possible object is
     *     {@link CardProgramme1 }
     *     
     */
    public CardProgramme1 getCardPrgrmm() {
        return cardPrgrmm;
    }

    /**
     * Sets the value of the cardPrgrmm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardProgramme1 }
     *     
     */
    public TransactionContext4 setCardPrgrmm(CardProgramme1 value) {
        this.cardPrgrmm = value;
        return this;
    }

    /**
     * Gets the value of the sttlmSvc property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementService1 }
     *     
     */
    public SettlementService1 getSttlmSvc() {
        return sttlmSvc;
    }

    /**
     * Sets the value of the sttlmSvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementService1 }
     *     
     */
    public TransactionContext4 setSttlmSvc(SettlementService1 value) {
        this.sttlmSvc = value;
        return this;
    }

    /**
     * Gets the value of the rcncltn property.
     * 
     * @return
     *     possible object is
     *     {@link Reconciliation3 }
     *     
     */
    public Reconciliation3 getRcncltn() {
        return rcncltn;
    }

    /**
     * Sets the value of the rcncltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reconciliation3 }
     *     
     */
    public TransactionContext4 setRcncltn(Reconciliation3 value) {
        this.rcncltn = value;
        return this;
    }

    /**
     * Gets the value of the captrDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getCaptrDt() {
        return captrDt;
    }

    /**
     * Sets the value of the captrDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionContext4 setCaptrDt(XMLGregorianCalendar value) {
        this.captrDt = value;
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
