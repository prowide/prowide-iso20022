
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
 * Scope
 * The ReversalOfTransferInConfirmation message is sent by an executing party to the instructing party or the instructing party's designated agent.
 * This message is used to reverse a TransferInConfirmation that was previously sent by the instructing party.
 * Usage
 * The ReversalOfTransferInConfirmation message is sent by an executing party to reverse a previously sent TransferInConfirmation.
 * This message must contain the reference of the message to be reversed. The message may also contain all the details of the reversed message, but this is not recommended.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sese.008.001.01", propOrder = {
    "prvsRef",
    "poolRef",
    "rltdRef",
    "trfInConfToBeRvsd"
})
public class Sese00800101 {

    @XmlElement(name = "PrvsRef", required = true)
    protected AdditionalReference2 prvsRef;
    @XmlElement(name = "PoolRef")
    protected AdditionalReference2 poolRef;
    @XmlElement(name = "RltdRef")
    protected AdditionalReference2 rltdRef;
    @XmlElement(name = "TrfInConfToBeRvsd")
    protected TransferIn1 trfInConfToBeRvsd;

    /**
     * Gets the value of the prvsRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference2 }
     *     
     */
    public AdditionalReference2 getPrvsRef() {
        return prvsRef;
    }

    /**
     * Sets the value of the prvsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference2 }
     *     
     */
    public Sese00800101 setPrvsRef(AdditionalReference2 value) {
        this.prvsRef = value;
        return this;
    }

    /**
     * Gets the value of the poolRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference2 }
     *     
     */
    public AdditionalReference2 getPoolRef() {
        return poolRef;
    }

    /**
     * Sets the value of the poolRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference2 }
     *     
     */
    public Sese00800101 setPoolRef(AdditionalReference2 value) {
        this.poolRef = value;
        return this;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference2 }
     *     
     */
    public AdditionalReference2 getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference2 }
     *     
     */
    public Sese00800101 setRltdRef(AdditionalReference2 value) {
        this.rltdRef = value;
        return this;
    }

    /**
     * Gets the value of the trfInConfToBeRvsd property.
     * 
     * @return
     *     possible object is
     *     {@link TransferIn1 }
     *     
     */
    public TransferIn1 getTrfInConfToBeRvsd() {
        return trfInConfToBeRvsd;
    }

    /**
     * Sets the value of the trfInConfToBeRvsd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferIn1 }
     *     
     */
    public Sese00800101 setTrfInConfToBeRvsd(TransferIn1 value) {
        this.trfInConfToBeRvsd = value;
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
