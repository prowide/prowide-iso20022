
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Encrypted data with an encryption key.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncryptedContent1", propOrder = {
    "cnttTp",
    "cnttNcrptnAlgo",
    "ncrptdData"
})
public class EncryptedContent1 {

    @XmlElement(name = "CnttTp", required = true)
    @XmlSchemaType(name = "string")
    protected ContentType1Code cnttTp;
    @XmlElement(name = "CnttNcrptnAlgo", required = true)
    protected AlgorithmIdentification1 cnttNcrptnAlgo;
    @XmlElement(name = "NcrptdData", required = true)
    protected byte[] ncrptdData;

    /**
     * Gets the value of the cnttTp property.
     * 
     * @return
     *     possible object is
     *     {@link ContentType1Code }
     *     
     */
    public ContentType1Code getCnttTp() {
        return cnttTp;
    }

    /**
     * Sets the value of the cnttTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentType1Code }
     *     
     */
    public EncryptedContent1 setCnttTp(ContentType1Code value) {
        this.cnttTp = value;
        return this;
    }

    /**
     * Gets the value of the cnttNcrptnAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link AlgorithmIdentification1 }
     *     
     */
    public AlgorithmIdentification1 getCnttNcrptnAlgo() {
        return cnttNcrptnAlgo;
    }

    /**
     * Sets the value of the cnttNcrptnAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentification1 }
     *     
     */
    public EncryptedContent1 setCnttNcrptnAlgo(AlgorithmIdentification1 value) {
        this.cnttNcrptnAlgo = value;
        return this;
    }

    /**
     * Gets the value of the ncrptdData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getNcrptdData() {
        return ncrptdData;
    }

    /**
     * Sets the value of the ncrptdData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public EncryptedContent1 setNcrptdData(byte[] value) {
        this.ncrptdData = value;
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
