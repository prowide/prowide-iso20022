
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
 * Context of the card payment transaction
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionContext9", propOrder = {
    "mrchntCtgyCd",
    "mrchntCtgySpcfcData",
    "dfrrdDlvryInd",
    "prtlShipmntInd",
    "delydChrgsInd",
    "noShowInd",
    "reauthstnInd",
    "reSubmissnInd",
    "txInitr",
    "authntcnOutgInd",
    "cardPrgrmm",
    "jursdctn",
    "sttlmSvc",
    "rcncltn",
    "captrDt",
    "dtAntcptd",
    "addtlData"
})
public class TransactionContext9 {

    @XmlElement(name = "MrchntCtgyCd")
    protected String mrchntCtgyCd;
    @XmlElement(name = "MrchntCtgySpcfcData")
    protected String mrchntCtgySpcfcData;
    @XmlElement(name = "DfrrdDlvryInd")
    protected Boolean dfrrdDlvryInd;
    @XmlElement(name = "PrtlShipmntInd")
    protected Boolean prtlShipmntInd;
    @XmlElement(name = "DelydChrgsInd")
    protected Boolean delydChrgsInd;
    @XmlElement(name = "NoShowInd")
    protected Boolean noShowInd;
    @XmlElement(name = "ReauthstnInd")
    protected Boolean reauthstnInd;
    @XmlElement(name = "ReSubmissnInd")
    protected Boolean reSubmissnInd;
    @XmlElement(name = "TxInitr")
    @XmlSchemaType(name = "string")
    protected TransactionInitiator1Code txInitr;
    @XmlElement(name = "AuthntcnOutgInd")
    protected Boolean authntcnOutgInd;
    @XmlElement(name = "CardPrgrmm")
    protected CardProgramme2 cardPrgrmm;
    @XmlElement(name = "Jursdctn")
    protected Jurisdiction2 jursdctn;
    @XmlElement(name = "SttlmSvc")
    protected SettlementService3 sttlmSvc;
    @XmlElement(name = "Rcncltn")
    protected Reconciliation3 rcncltn;
    @XmlElement(name = "CaptrDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar captrDt;
    @XmlElement(name = "DtAntcptd", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtAntcptd;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

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
    public TransactionContext9 setMrchntCtgyCd(String value) {
        this.mrchntCtgyCd = value;
        return this;
    }

    /**
     * Gets the value of the mrchntCtgySpcfcData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrchntCtgySpcfcData() {
        return mrchntCtgySpcfcData;
    }

    /**
     * Sets the value of the mrchntCtgySpcfcData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionContext9 setMrchntCtgySpcfcData(String value) {
        this.mrchntCtgySpcfcData = value;
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
    public TransactionContext9 setDfrrdDlvryInd(Boolean value) {
        this.dfrrdDlvryInd = value;
        return this;
    }

    /**
     * Gets the value of the prtlShipmntInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrtlShipmntInd() {
        return prtlShipmntInd;
    }

    /**
     * Sets the value of the prtlShipmntInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TransactionContext9 setPrtlShipmntInd(Boolean value) {
        this.prtlShipmntInd = value;
        return this;
    }

    /**
     * Gets the value of the delydChrgsInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelydChrgsInd() {
        return delydChrgsInd;
    }

    /**
     * Sets the value of the delydChrgsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TransactionContext9 setDelydChrgsInd(Boolean value) {
        this.delydChrgsInd = value;
        return this;
    }

    /**
     * Gets the value of the noShowInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoShowInd() {
        return noShowInd;
    }

    /**
     * Sets the value of the noShowInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TransactionContext9 setNoShowInd(Boolean value) {
        this.noShowInd = value;
        return this;
    }

    /**
     * Gets the value of the reauthstnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReauthstnInd() {
        return reauthstnInd;
    }

    /**
     * Sets the value of the reauthstnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TransactionContext9 setReauthstnInd(Boolean value) {
        this.reauthstnInd = value;
        return this;
    }

    /**
     * Gets the value of the reSubmissnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReSubmissnInd() {
        return reSubmissnInd;
    }

    /**
     * Sets the value of the reSubmissnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TransactionContext9 setReSubmissnInd(Boolean value) {
        this.reSubmissnInd = value;
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
    public TransactionContext9 setTxInitr(TransactionInitiator1Code value) {
        this.txInitr = value;
        return this;
    }

    /**
     * Gets the value of the authntcnOutgInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthntcnOutgInd() {
        return authntcnOutgInd;
    }

    /**
     * Sets the value of the authntcnOutgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TransactionContext9 setAuthntcnOutgInd(Boolean value) {
        this.authntcnOutgInd = value;
        return this;
    }

    /**
     * Gets the value of the cardPrgrmm property.
     * 
     * @return
     *     possible object is
     *     {@link CardProgramme2 }
     *     
     */
    public CardProgramme2 getCardPrgrmm() {
        return cardPrgrmm;
    }

    /**
     * Sets the value of the cardPrgrmm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardProgramme2 }
     *     
     */
    public TransactionContext9 setCardPrgrmm(CardProgramme2 value) {
        this.cardPrgrmm = value;
        return this;
    }

    /**
     * Gets the value of the jursdctn property.
     * 
     * @return
     *     possible object is
     *     {@link Jurisdiction2 }
     *     
     */
    public Jurisdiction2 getJursdctn() {
        return jursdctn;
    }

    /**
     * Sets the value of the jursdctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Jurisdiction2 }
     *     
     */
    public TransactionContext9 setJursdctn(Jurisdiction2 value) {
        this.jursdctn = value;
        return this;
    }

    /**
     * Gets the value of the sttlmSvc property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementService3 }
     *     
     */
    public SettlementService3 getSttlmSvc() {
        return sttlmSvc;
    }

    /**
     * Sets the value of the sttlmSvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementService3 }
     *     
     */
    public TransactionContext9 setSttlmSvc(SettlementService3 value) {
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
    public TransactionContext9 setRcncltn(Reconciliation3 value) {
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
    public TransactionContext9 setCaptrDt(XMLGregorianCalendar value) {
        this.captrDt = value;
        return this;
    }

    /**
     * Gets the value of the dtAntcptd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getDtAntcptd() {
        return dtAntcptd;
    }

    /**
     * Sets the value of the dtAntcptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionContext9 setDtAntcptd(XMLGregorianCalendar value) {
        this.dtAntcptd = value;
        return this;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     */
    public List<AdditionalData1> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<AdditionalData1>();
        }
        return this.addtlData;
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
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public TransactionContext9 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
