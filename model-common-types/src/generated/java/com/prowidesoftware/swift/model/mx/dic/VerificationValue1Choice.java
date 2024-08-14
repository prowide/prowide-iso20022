
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
 * Contains the data to be authenticated or verified.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerificationValue1Choice", propOrder = {
    "txtVal",
    "binryVal",
    "hexBinryVal",
    "pinData"
})
public class VerificationValue1Choice {

    @XmlElement(name = "TxtVal")
    protected String txtVal;
    @XmlElement(name = "BinryVal")
    protected byte[] binryVal;
    @XmlElement(name = "HexBinryVal")
    protected String hexBinryVal;
    @XmlElement(name = "PINData")
    protected PINData1 pinData;

    /**
     * Gets the value of the txtVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxtVal() {
        return txtVal;
    }

    /**
     * Sets the value of the txtVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VerificationValue1Choice setTxtVal(String value) {
        this.txtVal = value;
        return this;
    }

    /**
     * Gets the value of the binryVal property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBinryVal() {
        return binryVal;
    }

    /**
     * Sets the value of the binryVal property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public VerificationValue1Choice setBinryVal(byte[] value) {
        this.binryVal = value;
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
    public VerificationValue1Choice setHexBinryVal(String value) {
        this.hexBinryVal = value;
        return this;
    }

    /**
     * Gets the value of the pinData property.
     * 
     * @return
     *     possible object is
     *     {@link PINData1 }
     *     
     */
    public PINData1 getPINData() {
        return pinData;
    }

    /**
     * Sets the value of the pinData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PINData1 }
     *     
     */
    public VerificationValue1Choice setPINData(PINData1 value) {
        this.pinData = value;
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
