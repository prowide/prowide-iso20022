
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
 * The TransferOutCancellationInstruction message is sent by an instructing party or an instructing party's designated agent to the executing party.
 * This message is used to request the cancellation of a TransferOutInstruction that was previously sent by the instructing party.
 * Usage
 * The TransferOutCancellationInstruction message is sent by an instructing party to request cancellation of a previously sent TransferOutInstruction.
 * This message must contain the reference of the message to be cancelled. The message may also contain all the details of the message to be cancelled, but this is not recommended.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sese.002.001.01", propOrder = {
    "prvsRef",
    "poolRef",
    "rltdRef",
    "trfOutToBeCanc"
})
public class Sese00200101 {

    @XmlElement(name = "PrvsRef", required = true)
    protected AdditionalReference2 prvsRef;
    @XmlElement(name = "PoolRef")
    protected AdditionalReference2 poolRef;
    @XmlElement(name = "RltdRef")
    protected AdditionalReference2 rltdRef;
    @XmlElement(name = "TrfOutToBeCanc")
    protected TransferOut2 trfOutToBeCanc;

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
    public Sese00200101 setPrvsRef(AdditionalReference2 value) {
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
    public Sese00200101 setPoolRef(AdditionalReference2 value) {
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
    public Sese00200101 setRltdRef(AdditionalReference2 value) {
        this.rltdRef = value;
        return this;
    }

    /**
     * Gets the value of the trfOutToBeCanc property.
     * 
     * @return
     *     possible object is
     *     {@link TransferOut2 }
     *     
     */
    public TransferOut2 getTrfOutToBeCanc() {
        return trfOutToBeCanc;
    }

    /**
     * Sets the value of the trfOutToBeCanc property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferOut2 }
     *     
     */
    public Sese00200101 setTrfOutToBeCanc(TransferOut2 value) {
        this.trfOutToBeCanc = value;
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
