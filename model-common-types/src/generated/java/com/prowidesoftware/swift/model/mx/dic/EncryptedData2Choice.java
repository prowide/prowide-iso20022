
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
 * Choice between binary and hexadecimal binary for encrypted data of the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncryptedData2Choice", propOrder = {
    "binry",
    "hexBinry"
})
public class EncryptedData2Choice {

    @XmlElement(name = "Binry")
    protected byte[] binry;
    @XmlElement(name = "HexBinry")
    protected String hexBinry;

    /**
     * Gets the value of the binry property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBinry() {
        return binry;
    }

    /**
     * Sets the value of the binry property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public EncryptedData2Choice setBinry(byte[] value) {
        this.binry = value;
        return this;
    }

    /**
     * Gets the value of the hexBinry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHexBinry() {
        return hexBinry;
    }

    /**
     * Sets the value of the hexBinry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EncryptedData2Choice setHexBinry(String value) {
        this.hexBinry = value;
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
