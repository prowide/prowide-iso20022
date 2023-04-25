
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
 * The FullPushThroughReport message is sent by the matching application to a party involved in a transaction.
 * This message is used to pass on information that the matching application has received from the submitter. The forwarded information can originate from an InitialBaselineSubmission or BaselineReSubmission or BaselineAmendmentRequest message.
 * Usage
 * The FullPushThroughReport message can be sent by the matching application to a party to convey
 * - the details of an InitialBaselineSubmission message that it has obtained, or
 * - the details of a BaselineResubmission message that it has obtained, or
 * - the details of a BaselineAmendmentRequest message that it has obtained.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FullPushThroughReportV04", propOrder = {
    "rptId",
    "txId",
    "estblishdBaselnId",
    "txSts",
    "usrTxRef",
    "rptPurp",
    "pushdThrghBaseln",
    "buyrCtctPrsn",
    "sellrCtctPrsn",
    "buyrBkCtctPrsn",
    "sellrBkCtctPrsn",
    "othrBkCtctPrsn",
    "reqForActn"
})
public class FullPushThroughReportV04 {

    @XmlElement(name = "RptId", required = true)
    protected MessageIdentification1 rptId;
    @XmlElement(name = "TxId", required = true)
    protected SimpleIdentificationInformation txId;
    @XmlElement(name = "EstblishdBaselnId")
    protected DocumentIdentification3 estblishdBaselnId;
    @XmlElement(name = "TxSts", required = true)
    protected TransactionStatus4 txSts;
    @XmlElement(name = "UsrTxRef")
    protected List<DocumentIdentification5> usrTxRef;
    @XmlElement(name = "RptPurp", required = true)
    protected ReportType1 rptPurp;
    @XmlElement(name = "PushdThrghBaseln", required = true)
    protected Baseline4 pushdThrghBaseln;
    @XmlElement(name = "BuyrCtctPrsn")
    protected List<ContactIdentification1> buyrCtctPrsn;
    @XmlElement(name = "SellrCtctPrsn")
    protected List<ContactIdentification1> sellrCtctPrsn;
    @XmlElement(name = "BuyrBkCtctPrsn")
    protected List<ContactIdentification1> buyrBkCtctPrsn;
    @XmlElement(name = "SellrBkCtctPrsn")
    protected List<ContactIdentification1> sellrBkCtctPrsn;
    @XmlElement(name = "OthrBkCtctPrsn")
    protected List<ContactIdentification3> othrBkCtctPrsn;
    @XmlElement(name = "ReqForActn")
    protected PendingActivity2 reqForActn;

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
    public FullPushThroughReportV04 setRptId(MessageIdentification1 value) {
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
    public FullPushThroughReportV04 setTxId(SimpleIdentificationInformation value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the estblishdBaselnId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification3 }
     *     
     */
    public DocumentIdentification3 getEstblishdBaselnId() {
        return estblishdBaselnId;
    }

    /**
     * Sets the value of the estblishdBaselnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification3 }
     *     
     */
    public FullPushThroughReportV04 setEstblishdBaselnId(DocumentIdentification3 value) {
        this.estblishdBaselnId = value;
        return this;
    }

    /**
     * Gets the value of the txSts property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionStatus4 }
     *     
     */
    public TransactionStatus4 getTxSts() {
        return txSts;
    }

    /**
     * Sets the value of the txSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionStatus4 }
     *     
     */
    public FullPushThroughReportV04 setTxSts(TransactionStatus4 value) {
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
     * Gets the value of the rptPurp property.
     * 
     * @return
     *     possible object is
     *     {@link ReportType1 }
     *     
     */
    public ReportType1 getRptPurp() {
        return rptPurp;
    }

    /**
     * Sets the value of the rptPurp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportType1 }
     *     
     */
    public FullPushThroughReportV04 setRptPurp(ReportType1 value) {
        this.rptPurp = value;
        return this;
    }

    /**
     * Gets the value of the pushdThrghBaseln property.
     * 
     * @return
     *     possible object is
     *     {@link Baseline4 }
     *     
     */
    public Baseline4 getPushdThrghBaseln() {
        return pushdThrghBaseln;
    }

    /**
     * Sets the value of the pushdThrghBaseln property.
     * 
     * @param value
     *     allowed object is
     *     {@link Baseline4 }
     *     
     */
    public FullPushThroughReportV04 setPushdThrghBaseln(Baseline4 value) {
        this.pushdThrghBaseln = value;
        return this;
    }

    /**
     * Gets the value of the buyrCtctPrsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the buyrCtctPrsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyrCtctPrsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactIdentification1 }
     * 
     * 
     * @return
     *     The value of the buyrCtctPrsn property.
     */
    public List<ContactIdentification1> getBuyrCtctPrsn() {
        if (buyrCtctPrsn == null) {
            buyrCtctPrsn = new ArrayList<>();
        }
        return this.buyrCtctPrsn;
    }

    /**
     * Gets the value of the sellrCtctPrsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sellrCtctPrsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellrCtctPrsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactIdentification1 }
     * 
     * 
     * @return
     *     The value of the sellrCtctPrsn property.
     */
    public List<ContactIdentification1> getSellrCtctPrsn() {
        if (sellrCtctPrsn == null) {
            sellrCtctPrsn = new ArrayList<>();
        }
        return this.sellrCtctPrsn;
    }

    /**
     * Gets the value of the buyrBkCtctPrsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the buyrBkCtctPrsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyrBkCtctPrsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactIdentification1 }
     * 
     * 
     * @return
     *     The value of the buyrBkCtctPrsn property.
     */
    public List<ContactIdentification1> getBuyrBkCtctPrsn() {
        if (buyrBkCtctPrsn == null) {
            buyrBkCtctPrsn = new ArrayList<>();
        }
        return this.buyrBkCtctPrsn;
    }

    /**
     * Gets the value of the sellrBkCtctPrsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sellrBkCtctPrsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellrBkCtctPrsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactIdentification1 }
     * 
     * 
     * @return
     *     The value of the sellrBkCtctPrsn property.
     */
    public List<ContactIdentification1> getSellrBkCtctPrsn() {
        if (sellrBkCtctPrsn == null) {
            sellrBkCtctPrsn = new ArrayList<>();
        }
        return this.sellrBkCtctPrsn;
    }

    /**
     * Gets the value of the othrBkCtctPrsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrBkCtctPrsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrBkCtctPrsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactIdentification3 }
     * 
     * 
     * @return
     *     The value of the othrBkCtctPrsn property.
     */
    public List<ContactIdentification3> getOthrBkCtctPrsn() {
        if (othrBkCtctPrsn == null) {
            othrBkCtctPrsn = new ArrayList<>();
        }
        return this.othrBkCtctPrsn;
    }

    /**
     * Gets the value of the reqForActn property.
     * 
     * @return
     *     possible object is
     *     {@link PendingActivity2 }
     *     
     */
    public PendingActivity2 getReqForActn() {
        return reqForActn;
    }

    /**
     * Sets the value of the reqForActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingActivity2 }
     *     
     */
    public FullPushThroughReportV04 setReqForActn(PendingActivity2 value) {
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
    public FullPushThroughReportV04 addUsrTxRef(DocumentIdentification5 usrTxRef) {
        getUsrTxRef().add(usrTxRef);
        return this;
    }

    /**
     * Adds a new item to the buyrCtctPrsn list.
     * @see #getBuyrCtctPrsn()
     * 
     */
    public FullPushThroughReportV04 addBuyrCtctPrsn(ContactIdentification1 buyrCtctPrsn) {
        getBuyrCtctPrsn().add(buyrCtctPrsn);
        return this;
    }

    /**
     * Adds a new item to the sellrCtctPrsn list.
     * @see #getSellrCtctPrsn()
     * 
     */
    public FullPushThroughReportV04 addSellrCtctPrsn(ContactIdentification1 sellrCtctPrsn) {
        getSellrCtctPrsn().add(sellrCtctPrsn);
        return this;
    }

    /**
     * Adds a new item to the buyrBkCtctPrsn list.
     * @see #getBuyrBkCtctPrsn()
     * 
     */
    public FullPushThroughReportV04 addBuyrBkCtctPrsn(ContactIdentification1 buyrBkCtctPrsn) {
        getBuyrBkCtctPrsn().add(buyrBkCtctPrsn);
        return this;
    }

    /**
     * Adds a new item to the sellrBkCtctPrsn list.
     * @see #getSellrBkCtctPrsn()
     * 
     */
    public FullPushThroughReportV04 addSellrBkCtctPrsn(ContactIdentification1 sellrBkCtctPrsn) {
        getSellrBkCtctPrsn().add(sellrBkCtctPrsn);
        return this;
    }

    /**
     * Adds a new item to the othrBkCtctPrsn list.
     * @see #getOthrBkCtctPrsn()
     * 
     */
    public FullPushThroughReportV04 addOthrBkCtctPrsn(ContactIdentification3 othrBkCtctPrsn) {
        getOthrBkCtctPrsn().add(othrBkCtctPrsn);
        return this;
    }

}
