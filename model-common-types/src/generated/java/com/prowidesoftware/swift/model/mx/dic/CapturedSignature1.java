
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
 * Provides all information related to a handwritten signature capture.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapturedSignature1", propOrder = {
    "imgFrmt",
    "imgData",
    "imgRef",
    "addtlInf"
})
public class CapturedSignature1 {

    @XmlElement(name = "ImgFrmt", required = true)
    protected String imgFrmt;
    @XmlElement(name = "ImgData")
    protected byte[] imgData;
    @XmlElement(name = "ImgRef")
    protected String imgRef;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Gets the value of the imgFrmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImgFrmt() {
        return imgFrmt;
    }

    /**
     * Sets the value of the imgFrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CapturedSignature1 setImgFrmt(String value) {
        this.imgFrmt = value;
        return this;
    }

    /**
     * Gets the value of the imgData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImgData() {
        return imgData;
    }

    /**
     * Sets the value of the imgData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public CapturedSignature1 setImgData(byte[] value) {
        this.imgData = value;
        return this;
    }

    /**
     * Gets the value of the imgRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImgRef() {
        return imgRef;
    }

    /**
     * Sets the value of the imgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CapturedSignature1 setImgRef(String value) {
        this.imgRef = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CapturedSignature1 setAddtlInf(String value) {
        this.addtlInf = value;
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
