
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Scope
 * The MisMatchRejection message is sent by the party requested to accept or reject data set mis-matches to the matching application.
 * This message is used to reject mis-matches between data sets and the related baseline.
 * Usage
 * The MisMatchRejection message can be sent by the party requested to accept or reject data set mis-match to inform that it rejects the data set(s).
 * The message can be sent in response to a DataSetMatchReport message conveying mis-matches.
 * The information about the rejection of the mis-matched data sets will be forwarded by the matching application to the submitter of the data sets by a MisMatchRejectionNotification message.
 * The acceptance of mis-matched data sets can be achieved by sending a MisMatchAcceptance message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tsmt.022.001.01", propOrder = {
    "rjctnId",
    "txId",
    "submitrTxRef",
    "dataSetMtchRptRef",
    "rjctnRsn"
})
public class Tsmt02200101 {

    @XmlElement(name = "RjctnId", required = true)
    protected MessageIdentification1 rjctnId;
    @XmlElement(name = "TxId", required = true)
    protected SimpleIdentificationInformation txId;
    @XmlElement(name = "SubmitrTxRef", required = true)
    protected DocumentIdentification5 submitrTxRef;
    @XmlElement(name = "DataSetMtchRptRef", required = true)
    protected MessageIdentification1 dataSetMtchRptRef;
    @XmlElement(name = "RjctnRsn", required = true)
    protected RejectionReason1Choice rjctnRsn;

    /**
     * Gets the value of the rjctnId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getRjctnId() {
        return rjctnId;
    }

    /**
     * Sets the value of the rjctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public Tsmt02200101 setRjctnId(MessageIdentification1 value) {
        this.rjctnId = value;
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
    public Tsmt02200101 setTxId(SimpleIdentificationInformation value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the submitrTxRef property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification5 }
     *     
     */
    public DocumentIdentification5 getSubmitrTxRef() {
        return submitrTxRef;
    }

    /**
     * Sets the value of the submitrTxRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification5 }
     *     
     */
    public Tsmt02200101 setSubmitrTxRef(DocumentIdentification5 value) {
        this.submitrTxRef = value;
        return this;
    }

    /**
     * Gets the value of the dataSetMtchRptRef property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getDataSetMtchRptRef() {
        return dataSetMtchRptRef;
    }

    /**
     * Sets the value of the dataSetMtchRptRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public Tsmt02200101 setDataSetMtchRptRef(MessageIdentification1 value) {
        this.dataSetMtchRptRef = value;
        return this;
    }

    /**
     * Gets the value of the rjctnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionReason1Choice }
     *     
     */
    public RejectionReason1Choice getRjctnRsn() {
        return rjctnRsn;
    }

    /**
     * Sets the value of the rjctnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionReason1Choice }
     *     
     */
    public Tsmt02200101 setRjctnRsn(RejectionReason1Choice value) {
        this.rjctnRsn = value;
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
