
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
 * The BaselineReSubmission message is sent by either the counterparty or the initiator of a transaction (baseline) to the matching application.
 * This message is used by the counterparty to respond on the registration of a push-through transaction in the matching application or by the initiator or counterparty to re-send earlier mis-matched baseline information.
 * Usage
 * The BaselineReSubmission message can be sent by the counterparty of a transaction to the matching application in response to a FullPushThroughReport message received from the matching application conveying the details of an InitialBaselineSubmission message. The objective of the BaselineReSubmission message sent in the outlined scenario is to achieve a successful match of two baseline initiation messages in order to establish a transaction in the matching application.
 * or
 * The BaselineReSubmission message can be sent by the initiator of a transaction to the matching application in response to a BaselineMatchReport message indicating mis-matches. The objective of the BaselineReSubmission message sent in the outlined scenario is to correct an InitialBaselineSubmission or BaselineReSubmission message submitted earlier in order to achieve the establishment of a transaction in the matching application.
 * or
 * The BaselineReSubmission message can be sent by the counterparty of a transaction to the matching application in response to a BaselineMatchReport message indicating mis-matches. The objective of the BaselineReSubmission message sent in the outlined scenario is to correct a BaselineReSubmission message submitted earlier in order to achieve the establishment of a transaction in the matching application.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaselineReSubmissionV03", propOrder = {
    "submissnId",
    "txId",
    "submitrTxRef",
    "baseln",
    "buyrCtctPrsn",
    "sellrCtctPrsn",
    "buyrBkCtctPrsn",
    "sellrBkCtctPrsn",
    "othrBkCtctPrsn"
})
public class BaselineReSubmissionV03 {

    @XmlElement(name = "SubmissnId", required = true)
    protected MessageIdentification1 submissnId;
    @XmlElement(name = "TxId", required = true)
    protected SimpleIdentificationInformation txId;
    @XmlElement(name = "SubmitrTxRef")
    protected SimpleIdentificationInformation submitrTxRef;
    @XmlElement(name = "Baseln", required = true)
    protected Baseline3 baseln;
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

    /**
     * Gets the value of the submissnId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getSubmissnId() {
        return submissnId;
    }

    /**
     * Sets the value of the submissnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public BaselineReSubmissionV03 setSubmissnId(MessageIdentification1 value) {
        this.submissnId = value;
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
    public BaselineReSubmissionV03 setTxId(SimpleIdentificationInformation value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the submitrTxRef property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleIdentificationInformation }
     *     
     */
    public SimpleIdentificationInformation getSubmitrTxRef() {
        return submitrTxRef;
    }

    /**
     * Sets the value of the submitrTxRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleIdentificationInformation }
     *     
     */
    public BaselineReSubmissionV03 setSubmitrTxRef(SimpleIdentificationInformation value) {
        this.submitrTxRef = value;
        return this;
    }

    /**
     * Gets the value of the baseln property.
     * 
     * @return
     *     possible object is
     *     {@link Baseline3 }
     *     
     */
    public Baseline3 getBaseln() {
        return baseln;
    }

    /**
     * Sets the value of the baseln property.
     * 
     * @param value
     *     allowed object is
     *     {@link Baseline3 }
     *     
     */
    public BaselineReSubmissionV03 setBaseln(Baseline3 value) {
        this.baseln = value;
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
     * Adds a new item to the buyrCtctPrsn list.
     * @see #getBuyrCtctPrsn()
     * 
     */
    public BaselineReSubmissionV03 addBuyrCtctPrsn(ContactIdentification1 buyrCtctPrsn) {
        getBuyrCtctPrsn().add(buyrCtctPrsn);
        return this;
    }

    /**
     * Adds a new item to the sellrCtctPrsn list.
     * @see #getSellrCtctPrsn()
     * 
     */
    public BaselineReSubmissionV03 addSellrCtctPrsn(ContactIdentification1 sellrCtctPrsn) {
        getSellrCtctPrsn().add(sellrCtctPrsn);
        return this;
    }

    /**
     * Adds a new item to the buyrBkCtctPrsn list.
     * @see #getBuyrBkCtctPrsn()
     * 
     */
    public BaselineReSubmissionV03 addBuyrBkCtctPrsn(ContactIdentification1 buyrBkCtctPrsn) {
        getBuyrBkCtctPrsn().add(buyrBkCtctPrsn);
        return this;
    }

    /**
     * Adds a new item to the sellrBkCtctPrsn list.
     * @see #getSellrBkCtctPrsn()
     * 
     */
    public BaselineReSubmissionV03 addSellrBkCtctPrsn(ContactIdentification1 sellrBkCtctPrsn) {
        getSellrBkCtctPrsn().add(sellrBkCtctPrsn);
        return this;
    }

    /**
     * Adds a new item to the othrBkCtctPrsn list.
     * @see #getOthrBkCtctPrsn()
     * 
     */
    public BaselineReSubmissionV03 addOthrBkCtctPrsn(ContactIdentification3 othrBkCtctPrsn) {
        getOthrBkCtctPrsn().add(othrBkCtctPrsn);
        return this;
    }

}
