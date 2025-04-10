
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
 * Key encryption key (KEK), using previously distributed symmetric key.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KEK6", propOrder = {
    "vrsn",
    "kekId",
    "keyNcrptnAlgo",
    "ncrptdKey"
})
public class KEK6 {

    @XmlElement(name = "Vrsn")
    protected BigDecimal vrsn;
    @XmlElement(name = "KEKId", required = true)
    protected KEKIdentifier6 kekId;
    @XmlElement(name = "KeyNcrptnAlgo", required = true)
    protected AlgorithmIdentification28 keyNcrptnAlgo;
    @XmlElement(name = "NcrptdKey")
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
    public KEK6 setVrsn(BigDecimal value) {
        this.vrsn = value;
        return this;
    }

    /**
     * Gets the value of the kekId property.
     * 
     * @return
     *     possible object is
     *     {@link KEKIdentifier6 }
     *     
     */
    public KEKIdentifier6 getKEKId() {
        return kekId;
    }

    /**
     * Sets the value of the kekId property.
     * 
     * @param value
     *     allowed object is
     *     {@link KEKIdentifier6 }
     *     
     */
    public KEK6 setKEKId(KEKIdentifier6 value) {
        this.kekId = value;
        return this;
    }

    /**
     * Gets the value of the keyNcrptnAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link AlgorithmIdentification28 }
     *     
     */
    public AlgorithmIdentification28 getKeyNcrptnAlgo() {
        return keyNcrptnAlgo;
    }

    /**
     * Sets the value of the keyNcrptnAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentification28 }
     *     
     */
    public KEK6 setKeyNcrptnAlgo(AlgorithmIdentification28 value) {
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
    public KEK6 setNcrptdKey(byte[] value) {
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
