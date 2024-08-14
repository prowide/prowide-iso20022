
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
 * Computer file stored in a binary format.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BinaryFile1", propOrder = {
    "mimeTp",
    "ncodgTp",
    "charSet",
    "inclBinryObjct"
})
public class BinaryFile1 {

    @XmlElement(name = "MIMETp")
    protected String mimeTp;
    @XmlElement(name = "NcodgTp")
    protected String ncodgTp;
    @XmlElement(name = "CharSet")
    protected String charSet;
    @XmlElement(name = "InclBinryObjct")
    protected byte[] inclBinryObjct;

    /**
     * Gets the value of the mimeTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIMETp() {
        return mimeTp;
    }

    /**
     * Sets the value of the mimeTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BinaryFile1 setMIMETp(String value) {
        this.mimeTp = value;
        return this;
    }

    /**
     * Gets the value of the ncodgTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNcodgTp() {
        return ncodgTp;
    }

    /**
     * Sets the value of the ncodgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BinaryFile1 setNcodgTp(String value) {
        this.ncodgTp = value;
        return this;
    }

    /**
     * Gets the value of the charSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharSet() {
        return charSet;
    }

    /**
     * Sets the value of the charSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BinaryFile1 setCharSet(String value) {
        this.charSet = value;
        return this;
    }

    /**
     * Gets the value of the inclBinryObjct property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getInclBinryObjct() {
        return inclBinryObjct;
    }

    /**
     * Sets the value of the inclBinryObjct property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public BinaryFile1 setInclBinryObjct(byte[] value) {
        this.inclBinryObjct = value;
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
