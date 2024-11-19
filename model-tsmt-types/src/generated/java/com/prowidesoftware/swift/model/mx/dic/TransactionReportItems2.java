
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Detailed description of the items that correspond to the parameters set in a request and for which a report has been generated.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionReportItems2", propOrder = {
    "txId",
    "tsuBaselnId",
    "txSts",
    "usrTxRef",
    "purchsOrdrRef",
    "buyr",
    "sellr",
    "buyrBk",
    "buyrBkCtry",
    "sellrBk",
    "sellrBkCtry",
    "outsdngAmt",
    "pdgReqForActn"
})
public class TransactionReportItems2 {

    @XmlElement(name = "TxId", required = true)
    protected String txId;
    @XmlElement(name = "TSUBaselnId")
    protected DocumentIdentification3 tsuBaselnId;
    @XmlElement(name = "TxSts", required = true)
    protected TransactionStatus1 txSts;
    @XmlElement(name = "UsrTxRef", required = true)
    protected List<DocumentIdentification5> usrTxRef;
    @XmlElement(name = "PurchsOrdrRef", required = true)
    protected DocumentIdentification7 purchsOrdrRef;
    @XmlElement(name = "Buyr", required = true)
    protected PartyIdentification9 buyr;
    @XmlElement(name = "Sellr", required = true)
    protected PartyIdentification9 sellr;
    @XmlElement(name = "BuyrBk", required = true)
    protected BICIdentification1 buyrBk;
    @XmlElement(name = "BuyrBkCtry", required = true)
    protected String buyrBkCtry;
    @XmlElement(name = "SellrBk", required = true)
    protected BICIdentification1 sellrBk;
    @XmlElement(name = "SellrBkCtry", required = true)
    protected String sellrBkCtry;
    @XmlElement(name = "OutsdngAmt", required = true)
    protected CurrencyAndAmount outsdngAmt;
    @XmlElement(name = "PdgReqForActn")
    protected List<PendingActivity1> pdgReqForActn;

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
    public TransactionReportItems2 setTxId(String value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the tsuBaselnId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification3 }
     *     
     */
    public DocumentIdentification3 getTSUBaselnId() {
        return tsuBaselnId;
    }

    /**
     * Sets the value of the tsuBaselnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification3 }
     *     
     */
    public TransactionReportItems2 setTSUBaselnId(DocumentIdentification3 value) {
        this.tsuBaselnId = value;
        return this;
    }

    /**
     * Gets the value of the txSts property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionStatus1 }
     *     
     */
    public TransactionStatus1 getTxSts() {
        return txSts;
    }

    /**
     * Sets the value of the txSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionStatus1 }
     *     
     */
    public TransactionReportItems2 setTxSts(TransactionStatus1 value) {
        this.txSts = value;
        return this;
    }

    /**
     * Gets the value of the usrTxRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the usrTxRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsrTxRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentIdentification5 }
     * 
     * 
     * @return
     *     The value of the usrTxRef property.
     */
    public List<DocumentIdentification5> getUsrTxRef() {
        if (usrTxRef == null) {
            usrTxRef = new ArrayList<>();
        }
        return this.usrTxRef;
    }

    /**
     * Gets the value of the purchsOrdrRef property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification7 }
     *     
     */
    public DocumentIdentification7 getPurchsOrdrRef() {
        return purchsOrdrRef;
    }

    /**
     * Sets the value of the purchsOrdrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification7 }
     *     
     */
    public TransactionReportItems2 setPurchsOrdrRef(DocumentIdentification7 value) {
        this.purchsOrdrRef = value;
        return this;
    }

    /**
     * Gets the value of the buyr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification9 }
     *     
     */
    public PartyIdentification9 getBuyr() {
        return buyr;
    }

    /**
     * Sets the value of the buyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification9 }
     *     
     */
    public TransactionReportItems2 setBuyr(PartyIdentification9 value) {
        this.buyr = value;
        return this;
    }

    /**
     * Gets the value of the sellr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification9 }
     *     
     */
    public PartyIdentification9 getSellr() {
        return sellr;
    }

    /**
     * Sets the value of the sellr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification9 }
     *     
     */
    public TransactionReportItems2 setSellr(PartyIdentification9 value) {
        this.sellr = value;
        return this;
    }

    /**
     * Gets the value of the buyrBk property.
     * 
     * @return
     *     possible object is
     *     {@link BICIdentification1 }
     *     
     */
    public BICIdentification1 getBuyrBk() {
        return buyrBk;
    }

    /**
     * Sets the value of the buyrBk property.
     * 
     * @param value
     *     allowed object is
     *     {@link BICIdentification1 }
     *     
     */
    public TransactionReportItems2 setBuyrBk(BICIdentification1 value) {
        this.buyrBk = value;
        return this;
    }

    /**
     * Gets the value of the buyrBkCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyrBkCtry() {
        return buyrBkCtry;
    }

    /**
     * Sets the value of the buyrBkCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionReportItems2 setBuyrBkCtry(String value) {
        this.buyrBkCtry = value;
        return this;
    }

    /**
     * Gets the value of the sellrBk property.
     * 
     * @return
     *     possible object is
     *     {@link BICIdentification1 }
     *     
     */
    public BICIdentification1 getSellrBk() {
        return sellrBk;
    }

    /**
     * Sets the value of the sellrBk property.
     * 
     * @param value
     *     allowed object is
     *     {@link BICIdentification1 }
     *     
     */
    public TransactionReportItems2 setSellrBk(BICIdentification1 value) {
        this.sellrBk = value;
        return this;
    }

    /**
     * Gets the value of the sellrBkCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellrBkCtry() {
        return sellrBkCtry;
    }

    /**
     * Sets the value of the sellrBkCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionReportItems2 setSellrBkCtry(String value) {
        this.sellrBkCtry = value;
        return this;
    }

    /**
     * Gets the value of the outsdngAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getOutsdngAmt() {
        return outsdngAmt;
    }

    /**
     * Sets the value of the outsdngAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public TransactionReportItems2 setOutsdngAmt(CurrencyAndAmount value) {
        this.outsdngAmt = value;
        return this;
    }

    /**
     * Gets the value of the pdgReqForActn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pdgReqForActn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdgReqForActn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PendingActivity1 }
     * 
     * 
     * @return
     *     The value of the pdgReqForActn property.
     */
    public List<PendingActivity1> getPdgReqForActn() {
        if (pdgReqForActn == null) {
            pdgReqForActn = new ArrayList<>();
        }
        return this.pdgReqForActn;
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
     * Adds a new item to the usrTxRef list.
     * @see #getUsrTxRef()
     * 
     */
    public TransactionReportItems2 addUsrTxRef(DocumentIdentification5 usrTxRef) {
        getUsrTxRef().add(usrTxRef);
        return this;
    }

    /**
     * Adds a new item to the pdgReqForActn list.
     * @see #getPdgReqForActn()
     * 
     */
    public TransactionReportItems2 addPdgReqForActn(PendingActivity1 pdgReqForActn) {
        getPdgReqForActn().add(pdgReqForActn);
        return this;
    }

}
