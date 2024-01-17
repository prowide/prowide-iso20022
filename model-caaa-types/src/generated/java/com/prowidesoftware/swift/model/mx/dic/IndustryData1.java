
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
 * Data container to exchange data elements defined by another standard.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndustryData1", propOrder = {
    "id",
    "val",
    "prtctdVal",
    "tp"
})
public class IndustryData1 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Val")
    protected byte[] val;
    @XmlElement(name = "PrtctdVal")
    protected ContentInformationType19 prtctdVal;
    @XmlElement(name = "Tp")
    protected String tp;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IndustryData1 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public IndustryData1 setVal(byte[] value) {
        this.val = value;
        return this;
    }

    /**
     * Gets the value of the prtctdVal property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType19 }
     *     
     */
    public ContentInformationType19 getPrtctdVal() {
        return prtctdVal;
    }

    /**
     * Sets the value of the prtctdVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType19 }
     *     
     */
    public IndustryData1 setPrtctdVal(ContentInformationType19 value) {
        this.prtctdVal = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IndustryData1 setTp(String value) {
        this.tp = value;
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
