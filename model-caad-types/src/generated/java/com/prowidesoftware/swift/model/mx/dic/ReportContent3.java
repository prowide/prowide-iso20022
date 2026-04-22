
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
 * Contains the content of a report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportContent3", propOrder = {
    "rptLineSeq",
    "txt",
    "binry",
    "prtctdData"
})
public class ReportContent3 {

    @XmlElement(name = "RptLineSeq")
    protected String rptLineSeq;
    @XmlElement(name = "Txt")
    protected String txt;
    @XmlElement(name = "Binry")
    protected byte[] binry;
    @XmlElement(name = "PrtctdData")
    protected EncryptedData2 prtctdData;

    /**
     * Gets the value of the rptLineSeq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptLineSeq() {
        return rptLineSeq;
    }

    /**
     * Sets the value of the rptLineSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportContent3 setRptLineSeq(String value) {
        this.rptLineSeq = value;
        return this;
    }

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
    public ReportContent3 setTxt(String value) {
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
    public ReportContent3 setBinry(byte[] value) {
        this.binry = value;
        return this;
    }

    /**
     * Gets the value of the prtctdData property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptedData2 }
     *     
     */
    public EncryptedData2 getPrtctdData() {
        return prtctdData;
    }

    /**
     * Sets the value of the prtctdData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptedData2 }
     *     
     */
    public ReportContent3 setPrtctdData(EncryptedData2 value) {
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
