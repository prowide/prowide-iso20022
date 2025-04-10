
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "Signer1", propOrder = {
    "vrsn",
    "sgnrId",
    "dgstAlgo",
    "sgntrAlgo",
    "sgntr"
})
public class Signer1 {

    @XmlElement(name = "Vrsn")
    protected BigDecimal vrsn;
    @XmlElement(name = "SgnrId", required = true)
    protected CertificateIdentifier1 sgnrId;
    @XmlElement(name = "DgstAlgo", required = true)
    protected AlgorithmIdentification1 dgstAlgo;
    @XmlElement(name = "SgntrAlgo", required = true)
    protected AlgorithmIdentification1 sgntrAlgo;
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
    public Signer1 setVrsn(BigDecimal value) {
        this.vrsn = value;
        return this;
    }

    /**
     * Gets the value of the sgnrId property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateIdentifier1 }
     *     
     */
    public CertificateIdentifier1 getSgnrId() {
        return sgnrId;
    }

    /**
     * Sets the value of the sgnrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateIdentifier1 }
     *     
     */
    public Signer1 setSgnrId(CertificateIdentifier1 value) {
        this.sgnrId = value;
        return this;
    }

    /**
     * Gets the value of the dgstAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link AlgorithmIdentification1 }
     *     
     */
    public AlgorithmIdentification1 getDgstAlgo() {
        return dgstAlgo;
    }

    /**
     * Sets the value of the dgstAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentification1 }
     *     
     */
    public Signer1 setDgstAlgo(AlgorithmIdentification1 value) {
        this.dgstAlgo = value;
        return this;
    }

    /**
     * Gets the value of the sgntrAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link AlgorithmIdentification1 }
     *     
     */
    public AlgorithmIdentification1 getSgntrAlgo() {
        return sgntrAlgo;
    }

    /**
     * Sets the value of the sgntrAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentification1 }
     *     
     */
    public Signer1 setSgntrAlgo(AlgorithmIdentification1 value) {
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
    public Signer1 setSgntr(byte[] value) {
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
