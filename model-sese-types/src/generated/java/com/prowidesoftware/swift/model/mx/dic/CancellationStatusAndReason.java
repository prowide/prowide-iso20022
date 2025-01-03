
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Status of a transfer cancellation instruction and the reason for the status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancellationStatusAndReason", propOrder = {
    "sts",
    "rjctd",
    "cmplt",
    "stsInitr"
})
public class CancellationStatusAndReason {

    @XmlElement(name = "Sts")
    protected TransferCancellationStatus sts;
    @XmlElement(name = "Rjctd")
    protected TransferCancellationRejectedStatus1Choice rjctd;
    @XmlElement(name = "Cmplt")
    protected TransferCancellationCompleteStatusChoice cmplt;
    @XmlElement(name = "StsInitr")
    protected PartyIdentification1Choice stsInitr;

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link TransferCancellationStatus }
     *     
     */
    public TransferCancellationStatus getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferCancellationStatus }
     *     
     */
    public CancellationStatusAndReason setSts(TransferCancellationStatus value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link TransferCancellationRejectedStatus1Choice }
     *     
     */
    public TransferCancellationRejectedStatus1Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferCancellationRejectedStatus1Choice }
     *     
     */
    public CancellationStatusAndReason setRjctd(TransferCancellationRejectedStatus1Choice value) {
        this.rjctd = value;
        return this;
    }

    /**
     * Gets the value of the cmplt property.
     * 
     * @return
     *     possible object is
     *     {@link TransferCancellationCompleteStatusChoice }
     *     
     */
    public TransferCancellationCompleteStatusChoice getCmplt() {
        return cmplt;
    }

    /**
     * Sets the value of the cmplt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferCancellationCompleteStatusChoice }
     *     
     */
    public CancellationStatusAndReason setCmplt(TransferCancellationCompleteStatusChoice value) {
        this.cmplt = value;
        return this;
    }

    /**
     * Gets the value of the stsInitr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification1Choice }
     *     
     */
    public PartyIdentification1Choice getStsInitr() {
        return stsInitr;
    }

    /**
     * Sets the value of the stsInitr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification1Choice }
     *     
     */
    public CancellationStatusAndReason setStsInitr(PartyIdentification1Choice value) {
        this.stsInitr = value;
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
