
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Entity who has signed the data and its digital signature.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Signer3", propOrder = {
    "vrsn",
    "sgnrId",
    "dgstAlgo",
    "sgntrAlgo",
    "sgntr"
})
public class Signer3 {

    @XmlElement(name = "Vrsn")
    protected BigDecimal vrsn;
    @XmlElement(name = "SgnrId")
    protected Recipient5Choice sgnrId;
    @XmlElement(name = "DgstAlgo", required = true)
    protected AlgorithmIdentification16 dgstAlgo;
    @XmlElement(name = "SgntrAlgo", required = true)
    protected AlgorithmIdentification17 sgntrAlgo;
    @XmlElement(name = "Sgntr", required = true)
    protected byte[] sgntr;

    /**
     * Gets the value of the vrsn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVrsn() {
        return vrsn;
    }

    /**
     * Sets the value of the vrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Signer3 setVrsn(BigDecimal value) {
        this.vrsn = value;
        return this;
    }

    /**
     * Gets the value of the sgnrId property.
     * 
     * @return
     *     possible object is
     *     {@link Recipient5Choice }
     *     
     */
    public Recipient5Choice getSgnrId() {
        return sgnrId;
    }

    /**
     * Sets the value of the sgnrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Recipient5Choice }
     *     
     */
    public Signer3 setSgnrId(Recipient5Choice value) {
        this.sgnrId = value;
        return this;
    }

    /**
     * Gets the value of the dgstAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link AlgorithmIdentification16 }
     *     
     */
    public AlgorithmIdentification16 getDgstAlgo() {
        return dgstAlgo;
    }

    /**
     * Sets the value of the dgstAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentification16 }
     *     
     */
    public Signer3 setDgstAlgo(AlgorithmIdentification16 value) {
        this.dgstAlgo = value;
        return this;
    }

    /**
     * Gets the value of the sgntrAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link AlgorithmIdentification17 }
     *     
     */
    public AlgorithmIdentification17 getSgntrAlgo() {
        return sgntrAlgo;
    }

    /**
     * Sets the value of the sgntrAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentification17 }
     *     
     */
    public Signer3 setSgntrAlgo(AlgorithmIdentification17 value) {
        this.sgntrAlgo = value;
        return this;
    }

    /**
     * Gets the value of the sgntr property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSgntr() {
        return sgntr;
    }

    /**
     * Sets the value of the sgntr property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public Signer3 setSgntr(byte[] value) {
        this.sgntr = value;
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
