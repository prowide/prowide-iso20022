
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
 * Choice of the report content format.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportContent1Choice", propOrder = {
    "txt",
    "binry",
    "prtctdData"
})
public class ReportContent1Choice {

    @XmlElement(name = "Txt")
    protected String txt;
    @XmlElement(name = "Binry")
    protected byte[] binry;
    @XmlElement(name = "PrtctdData")
    protected ProtectedData1 prtctdData;

    /**
     * Gets the value of the txt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxt() {
        return txt;
    }

    /**
     * Sets the value of the txt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportContent1Choice setTxt(String value) {
        this.txt = value;
        return this;
    }

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
    public ReportContent1Choice setBinry(byte[] value) {
        this.binry = value;
        return this;
    }

    /**
     * Gets the value of the prtctdData property.
     * 
     * @return
     *     possible object is
     *     {@link ProtectedData1 }
     *     
     */
    public ProtectedData1 getPrtctdData() {
        return prtctdData;
    }

    /**
     * Sets the value of the prtctdData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectedData1 }
     *     
     */
    public ReportContent1Choice setPrtctdData(ProtectedData1 value) {
        this.prtctdData = value;
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
