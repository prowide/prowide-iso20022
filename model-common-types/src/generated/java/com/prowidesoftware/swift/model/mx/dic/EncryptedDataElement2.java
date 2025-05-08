
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
 * Structure to encrypt data elements.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncryptedDataElement2", propOrder = {
    "id",
    "data",
    "clearTxtFrmt",
    "othrClearTxtFrmt"
})
public class EncryptedDataElement2 {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Data", required = true)
    protected EncryptedData2Choice data;
    @XmlElement(name = "ClearTxtFrmt")
    @XmlSchemaType(name = "string")
    protected EncryptedDataFormat1Code clearTxtFrmt;
    @XmlElement(name = "OthrClearTxtFrmt")
    protected String othrClearTxtFrmt;

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
    public EncryptedDataElement2 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptedData2Choice }
     *     
     */
    public EncryptedData2Choice getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptedData2Choice }
     *     
     */
    public EncryptedDataElement2 setData(EncryptedData2Choice value) {
        this.data = value;
        return this;
    }

    /**
     * Gets the value of the clearTxtFrmt property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptedDataFormat1Code }
     *     
     */
    public EncryptedDataFormat1Code getClearTxtFrmt() {
        return clearTxtFrmt;
    }

    /**
     * Sets the value of the clearTxtFrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptedDataFormat1Code }
     *     
     */
    public EncryptedDataElement2 setClearTxtFrmt(EncryptedDataFormat1Code value) {
        this.clearTxtFrmt = value;
        return this;
    }

    /**
     * Gets the value of the othrClearTxtFrmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrClearTxtFrmt() {
        return othrClearTxtFrmt;
    }

    /**
     * Sets the value of the othrClearTxtFrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EncryptedDataElement2 setOthrClearTxtFrmt(String value) {
        this.othrClearTxtFrmt = value;
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
