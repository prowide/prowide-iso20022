
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
@XmlType(name = "CancellationStatusAndReason2", propOrder = {
    "mstrRef",
    "trfRef",
    "clntRef",
    "cxlRef",
    "sts",
    "rjctd",
    "cmplt",
    "pdg",
    "stsInitr"
})
public class CancellationStatusAndReason2 {

    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "TrfRef", required = true)
    protected String trfRef;
    @XmlElement(name = "ClntRef")
    protected String clntRef;
    @XmlElement(name = "CxlRef")
    protected String cxlRef;
    @XmlElement(name = "Sts")
    protected TransferCancellationStatus2 sts;
    @XmlElement(name = "Rjctd")
    protected TransferCancellationRejectedStatus1 rjctd;
    @XmlElement(name = "Cmplt")
    protected TransferCancellationCompleteStatusAndReason1 cmplt;
    @XmlElement(name = "Pdg")
    protected TransferCancellationPendingStatus1 pdg;
    @XmlElement(name = "StsInitr")
    protected PartyIdentification2Choice stsInitr;

    /**
     * Gets the value of the mstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMstrRef() {
        return mstrRef;
    }

    /**
     * Sets the value of the mstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CancellationStatusAndReason2 setMstrRef(String value) {
        this.mstrRef = value;
        return this;
    }

    /**
     * Gets the value of the trfRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrfRef() {
        return trfRef;
    }

    /**
     * Sets the value of the trfRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CancellationStatusAndReason2 setTrfRef(String value) {
        this.trfRef = value;
        return this;
    }

    /**
     * Gets the value of the clntRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntRef() {
        return clntRef;
    }

    /**
     * Sets the value of the clntRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CancellationStatusAndReason2 setClntRef(String value) {
        this.clntRef = value;
        return this;
    }

    /**
     * Gets the value of the cxlRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCxlRef() {
        return cxlRef;
    }

    /**
     * Sets the value of the cxlRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CancellationStatusAndReason2 setCxlRef(String value) {
        this.cxlRef = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link TransferCancellationStatus2 }
     *     
     */
    public TransferCancellationStatus2 getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferCancellationStatus2 }
     *     
     */
    public CancellationStatusAndReason2 setSts(TransferCancellationStatus2 value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link TransferCancellationRejectedStatus1 }
     *     
     */
    public TransferCancellationRejectedStatus1 getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferCancellationRejectedStatus1 }
     *     
     */
    public CancellationStatusAndReason2 setRjctd(TransferCancellationRejectedStatus1 value) {
        this.rjctd = value;
        return this;
    }

    /**
     * Gets the value of the cmplt property.
     * 
     * @return
     *     possible object is
     *     {@link TransferCancellationCompleteStatusAndReason1 }
     *     
     */
    public TransferCancellationCompleteStatusAndReason1 getCmplt() {
        return cmplt;
    }

    /**
     * Sets the value of the cmplt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferCancellationCompleteStatusAndReason1 }
     *     
     */
    public CancellationStatusAndReason2 setCmplt(TransferCancellationCompleteStatusAndReason1 value) {
        this.cmplt = value;
        return this;
    }

    /**
     * Gets the value of the pdg property.
     * 
     * @return
     *     possible object is
     *     {@link TransferCancellationPendingStatus1 }
     *     
     */
    public TransferCancellationPendingStatus1 getPdg() {
        return pdg;
    }

    /**
     * Sets the value of the pdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferCancellationPendingStatus1 }
     *     
     */
    public CancellationStatusAndReason2 setPdg(TransferCancellationPendingStatus1 value) {
        this.pdg = value;
        return this;
    }

    /**
     * Gets the value of the stsInitr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getStsInitr() {
        return stsInitr;
    }

    /**
     * Sets the value of the stsInitr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public CancellationStatusAndReason2 setStsInitr(PartyIdentification2Choice value) {
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
