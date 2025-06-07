
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
 * Key encryption key (KEK), encrypted previously distributed symmetric key.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyTransport1", propOrder = {
    "vrsn",
    "rcptId",
    "keyNcrptnAlgo",
    "ncrptdKey"
})
public class KeyTransport1 {

    @XmlElement(name = "Vrsn", required = true)
    protected BigDecimal vrsn;
    @XmlElement(name = "RcptId", required = true)
    protected CertificateIdentifier1 rcptId;
    @XmlElement(name = "KeyNcrptnAlgo", required = true)
    protected AlgorithmIdentification1 keyNcrptnAlgo;
    @XmlElement(name = "NcrptdKey", required = true)
    protected byte[] ncrptdKey;

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
    public KeyTransport1 setVrsn(BigDecimal value) {
        this.vrsn = value;
        return this;
    }

    /**
     * Gets the value of the rcptId property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateIdentifier1 }
     *     
     */
    public CertificateIdentifier1 getRcptId() {
        return rcptId;
    }

    /**
     * Sets the value of the rcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateIdentifier1 }
     *     
     */
    public KeyTransport1 setRcptId(CertificateIdentifier1 value) {
        this.rcptId = value;
        return this;
    }

    /**
     * Gets the value of the keyNcrptnAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link AlgorithmIdentification1 }
     *     
     */
    public AlgorithmIdentification1 getKeyNcrptnAlgo() {
        return keyNcrptnAlgo;
    }

    /**
     * Sets the value of the keyNcrptnAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentification1 }
     *     
     */
    public KeyTransport1 setKeyNcrptnAlgo(AlgorithmIdentification1 value) {
        this.keyNcrptnAlgo = value;
        return this;
    }

    /**
     * Gets the value of the ncrptdKey property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getNcrptdKey() {
        return ncrptdKey;
    }

    /**
     * Sets the value of the ncrptdKey property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public KeyTransport1 setNcrptdKey(byte[] value) {
        this.ncrptdKey = value;
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
