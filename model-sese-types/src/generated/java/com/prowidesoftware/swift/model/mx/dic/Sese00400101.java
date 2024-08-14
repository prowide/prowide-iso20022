
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
 * The ReversalOfTransferOutConfirmation message is sent by an executing party to the instructing party or the instructing party's designated agent. This message is used to reverse a TransferOutConfirmation that was previously sent by the instructing party.
 * Usage
 * The ReversalOfTransferOutConfirmation message is sent by an executing party to reverse a previously sent TransferOutConfirmation.
 * This message must contain the reference of the message to be reversed. The message may also contain all the details of the reversed message, but this is not recommended.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sese.004.001.01", propOrder = {
    "prvsRef",
    "poolRef",
    "rltdRef",
    "trfOutConfToBeRvsd"
})
public class Sese00400101 {

    @XmlElement(name = "PrvsRef", required = true)
    protected AdditionalReference2 prvsRef;
    @XmlElement(name = "PoolRef")
    protected AdditionalReference2 poolRef;
    @XmlElement(name = "RltdRef")
    protected AdditionalReference2 rltdRef;
    @XmlElement(name = "TrfOutConfToBeRvsd")
    protected TransferOut1 trfOutConfToBeRvsd;

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
    public Sese00400101 setPrvsRef(AdditionalReference2 value) {
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
    public Sese00400101 setPoolRef(AdditionalReference2 value) {
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
    public Sese00400101 setRltdRef(AdditionalReference2 value) {
        this.rltdRef = value;
        return this;
    }

    /**
     * Gets the value of the trfOutConfToBeRvsd property.
     * 
     * @return
     *     possible object is
     *     {@link TransferOut1 }
     *     
     */
    public TransferOut1 getTrfOutConfToBeRvsd() {
        return trfOutConfToBeRvsd;
    }

    /**
     * Sets the value of the trfOutConfToBeRvsd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferOut1 }
     *     
     */
    public Sese00400101 setTrfOutConfToBeRvsd(TransferOut1 value) {
        this.trfOutConfToBeRvsd = value;
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
