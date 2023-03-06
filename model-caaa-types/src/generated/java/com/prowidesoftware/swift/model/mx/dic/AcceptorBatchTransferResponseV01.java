
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
 * The AcceptorBatchTransferResponse message is sent by the acquirer to the card acceptor to acknowledge the proper reception of the AcceptorBatchTransfer.
 * Usage
 * The AcceptorBatchTransferResponse message is used by an acquirer to inform the card acceptor of the card payment transactions that could not be captured in the AcceptorBatchTransfer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorBatchTransferResponseV01", propOrder = {
    "hdr",
    "dataSet",
    "sctyTrlr"
})
public class AcceptorBatchTransferResponseV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header3 hdr;
    @XmlElement(name = "DataSet", required = true)
    protected List<CardPaymentDataSet2> dataSet;
    @XmlElement(name = "SctyTrlr", required = true)
    protected ContentInformationType1 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header3 }
     *     
     */
    public Header3 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header3 }
     *     
     */
    public AcceptorBatchTransferResponseV01 setHdr(Header3 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the dataSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardPaymentDataSet2 }
     * 
     * 
     */
    public List<CardPaymentDataSet2> getDataSet() {
        if (dataSet == null) {
            dataSet = new ArrayList<CardPaymentDataSet2>();
        }
        return this.dataSet;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType1 }
     *     
     */
    public ContentInformationType1 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType1 }
     *     
     */
    public AcceptorBatchTransferResponseV01 setSctyTrlr(ContentInformationType1 value) {
        this.sctyTrlr = value;
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
     * Adds a new item to the dataSet list.
     * @see #getDataSet()
     * 
     */
    public AcceptorBatchTransferResponseV01 addDataSet(CardPaymentDataSet2 dataSet) {
        getDataSet().add(dataSet);
        return this;
    }

}
