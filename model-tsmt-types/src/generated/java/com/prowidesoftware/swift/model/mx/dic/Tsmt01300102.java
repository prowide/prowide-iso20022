
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
 * Scope
 * The DataSetMatchReport message is sent by the matching application to the parties involved in a data set match.
 * This message is used to either
 * - inform about the successful match of data sets submitted with the instruction match or pre-match (DataSetSubmission message) and the related baseline,or
 * - inform about mis-matches found between data sets submitted with the instruction match or pre-match (DataSetSubmission message) and the related baseline.
 * Usage
 * The DataSetMatchReport message can be sent by the matching application to the party requesting a data set pre-match for a transaction established in the push-through mode. In the outlined scenario, the DataSetMatchReport message will either inform about the successful pre-match or list the mis-matches between the data set(s) conveyed with the DataSetSubmission message and the related baseline.
 * or
 * The DataSetMatchReport message can be sent by the matching application to the parties involved in a data set match for a transaction established in the push-through mode. In the outlined scenario, the DataSetMatchReport message will either inform about the successful match or list the mis-matches between the data set(s) conveyed with the DataSetSubmission message and the related baseline.
 * or
 * The DataSetMatchReport message can be sent by the matching application to the party requesting a data set match or pre-match for a transaction established in the lodge mode. In the outlined scenario, the DataSetMatchReport will either inform about the successful match or list the mis-matches between the data set(s) conveyed with the DataSetSubmission message and the related baseline.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tsmt.013.001.02", propOrder = {
    "rptId",
    "txId",
    "tsuBaselnId",
    "txSts",
    "usrTxRef",
    "buyr",
    "sellr",
    "buyrBk",
    "sellrBk",
    "cmpardDocRef",
    "submissnTp",
    "rpt",
    "reqForActn"
})
public class Tsmt01300102 {

    @XmlElement(name = "RptId", required = true)
    protected MessageIdentification1 rptId;
    @XmlElement(name = "TxId", required = true)
    protected SimpleIdentificationInformation txId;
    @XmlElement(name = "TSUBaselnId", required = true)
    protected DocumentIdentification3 tsuBaselnId;
    @XmlElement(name = "TxSts", required = true)
    protected TransactionStatus1 txSts;
    @XmlElement(name = "UsrTxRef", required = true)
    protected List<DocumentIdentification5> usrTxRef;
    @XmlElement(name = "Buyr", required = true)
    protected PartyIdentification9 buyr;
    @XmlElement(name = "Sellr", required = true)
    protected PartyIdentification9 sellr;
    @XmlElement(name = "BuyrBk", required = true)
    protected BICIdentification1 buyrBk;
    @XmlElement(name = "SellrBk", required = true)
    protected BICIdentification1 sellrBk;
    @XmlElement(name = "CmpardDocRef", required = true)
    protected List<DocumentIdentification2> cmpardDocRef;
    @XmlElement(name = "SubmissnTp", required = true)
    protected ReportType3 submissnTp;
    @XmlElement(name = "Rpt", required = true)
    protected MisMatchReport2 rpt;
    @XmlElement(name = "ReqForActn")
    protected PendingActivity1 reqForActn;

    /**
     * Gets the value of the rptId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getRptId() {
        return rptId;
    }

    /**
     * Sets the value of the rptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public Tsmt01300102 setRptId(MessageIdentification1 value) {
        this.rptId = value;
        return this;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleIdentificationInformation }
     *     
     */
    public SimpleIdentificationInformation getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleIdentificationInformation }
     *     
     */
    public Tsmt01300102 setTxId(SimpleIdentificationInformation value) {
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
    public Tsmt01300102 setTSUBaselnId(DocumentIdentification3 value) {
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
    public Tsmt01300102 setTxSts(TransactionStatus1 value) {
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
    public Tsmt01300102 setBuyr(PartyIdentification9 value) {
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
    public Tsmt01300102 setSellr(PartyIdentification9 value) {
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
    public Tsmt01300102 setBuyrBk(BICIdentification1 value) {
        this.buyrBk = value;
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
    public Tsmt01300102 setSellrBk(BICIdentification1 value) {
        this.sellrBk = value;
        return this;
    }

    /**
     * Gets the value of the cmpardDocRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cmpardDocRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCmpardDocRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentIdentification2 }
     * 
     * 
     * @return
     *     The value of the cmpardDocRef property.
     */
    public List<DocumentIdentification2> getCmpardDocRef() {
        if (cmpardDocRef == null) {
            cmpardDocRef = new ArrayList<>();
        }
        return this.cmpardDocRef;
    }

    /**
     * Gets the value of the submissnTp property.
     * 
     * @return
     *     possible object is
     *     {@link ReportType3 }
     *     
     */
    public ReportType3 getSubmissnTp() {
        return submissnTp;
    }

    /**
     * Sets the value of the submissnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportType3 }
     *     
     */
    public Tsmt01300102 setSubmissnTp(ReportType3 value) {
        this.submissnTp = value;
        return this;
    }

    /**
     * Gets the value of the rpt property.
     * 
     * @return
     *     possible object is
     *     {@link MisMatchReport2 }
     *     
     */
    public MisMatchReport2 getRpt() {
        return rpt;
    }

    /**
     * Sets the value of the rpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MisMatchReport2 }
     *     
     */
    public Tsmt01300102 setRpt(MisMatchReport2 value) {
        this.rpt = value;
        return this;
    }

    /**
     * Gets the value of the reqForActn property.
     * 
     * @return
     *     possible object is
     *     {@link PendingActivity1 }
     *     
     */
    public PendingActivity1 getReqForActn() {
        return reqForActn;
    }

    /**
     * Sets the value of the reqForActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingActivity1 }
     *     
     */
    public Tsmt01300102 setReqForActn(PendingActivity1 value) {
        this.reqForActn = value;
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
     * Adds a new item to the usrTxRef list.
     * @see #getUsrTxRef()
     * 
     */
    public Tsmt01300102 addUsrTxRef(DocumentIdentification5 usrTxRef) {
        getUsrTxRef().add(usrTxRef);
        return this;
    }

    /**
     * Adds a new item to the cmpardDocRef list.
     * @see #getCmpardDocRef()
     * 
     */
    public Tsmt01300102 addCmpardDocRef(DocumentIdentification2 cmpardDocRef) {
        getCmpardDocRef().add(cmpardDocRef);
        return this;
    }

}
