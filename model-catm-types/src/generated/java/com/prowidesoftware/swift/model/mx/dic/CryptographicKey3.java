
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
 * Indetification of a cryptographic Key to use.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptographicKey3", propOrder = {
    "id",
    "addtlId",
    "vrsn"
})
public class CryptographicKey3 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "AddtlId")
    protected byte[] addtlId;
    @XmlElement(name = "Vrsn", required = true)
    protected String vrsn;

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
    public CryptographicKey3 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the addtlId property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAddtlId() {
        return addtlId;
    }

    /**
     * Sets the value of the addtlId property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public CryptographicKey3 setAddtlId(byte[] value) {
        this.addtlId = value;
        return this;
    }

    /**
     * Gets the value of the vrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrsn() {
        return vrsn;
    }

    /**
     * Sets the value of the vrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CryptographicKey3 setVrsn(String value) {
        this.vrsn = value;
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
