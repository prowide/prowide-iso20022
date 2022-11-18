
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice between binary and hexadicimal binary for encrypted data of the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncryptedData1Choice", propOrder = {
    "binryData",
    "hexBinryVal"
})
public class EncryptedData1Choice {

    @XmlElement(name = "BinryData")
    protected byte[] binryData;
    @XmlElement(name = "HexBinryVal")
    protected String hexBinryVal;

    /**
     * Gets the value of the binryData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBinryData() {
        return binryData;
    }

    /**
     * Sets the value of the binryData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public EncryptedData1Choice setBinryData(byte[] value) {
        this.binryData = value;
        return this;
    }

    /**
     * Gets the value of the hexBinryVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHexBinryVal() {
        return hexBinryVal;
    }

    /**
     * Sets the value of the hexBinryVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EncryptedData1Choice setHexBinryVal(String value) {
        this.hexBinryVal = value;
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
