
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
 * Identification of a key encryption key (KEK), using previously distributed symmetric key.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KEKIdentifier2", propOrder = {
    "keyId",
    "keyVrsn",
    "seqNb",
    "derivtnId"
})
public class KEKIdentifier2 {

    @XmlElement(name = "KeyId", required = true)
    protected String keyId;
    @XmlElement(name = "KeyVrsn", required = true)
    protected String keyVrsn;
    @XmlElement(name = "SeqNb")
    protected BigDecimal seqNb;
    @XmlElement(name = "DerivtnId")
    protected byte[] derivtnId;

    /**
     * Gets the value of the keyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * Sets the value of the keyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public KEKIdentifier2 setKeyId(String value) {
        this.keyId = value;
        return this;
    }

    /**
     * Gets the value of the keyVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyVrsn() {
        return keyVrsn;
    }

    /**
     * Sets the value of the keyVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public KEKIdentifier2 setKeyVrsn(String value) {
        this.keyVrsn = value;
        return this;
    }

    /**
     * Gets the value of the seqNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeqNb() {
        return seqNb;
    }

    /**
     * Sets the value of the seqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public KEKIdentifier2 setSeqNb(BigDecimal value) {
        this.seqNb = value;
        return this;
    }

    /**
     * Gets the value of the derivtnId property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDerivtnId() {
        return derivtnId;
    }

    /**
     * Sets the value of the derivtnId property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public KEKIdentifier2 setDerivtnId(byte[] value) {
        this.derivtnId = value;
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
