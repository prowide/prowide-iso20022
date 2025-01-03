
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
@XmlType(name = "EncryptedDataElement1", propOrder = {
    "id",
    "othrId",
    "ncrptdData",
    "clearTxtDataFrmt",
    "othrClearTxtDataFrmt"
})
public class EncryptedDataElement1 {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "OthrId")
    protected String othrId;
    @XmlElement(name = "NcrptdData", required = true)
    protected EncryptedData1Choice ncrptdData;
    @XmlElement(name = "ClearTxtDataFrmt")
    @XmlSchemaType(name = "string")
    protected EncryptedDataFormat1Code clearTxtDataFrmt;
    @XmlElement(name = "OthrClearTxtDataFrmt")
    protected String othrClearTxtDataFrmt;

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
    public EncryptedDataElement1 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the othrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrId() {
        return othrId;
    }

    /**
     * Sets the value of the othrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EncryptedDataElement1 setOthrId(String value) {
        this.othrId = value;
        return this;
    }

    /**
     * Gets the value of the ncrptdData property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptedData1Choice }
     *     
     */
    public EncryptedData1Choice getNcrptdData() {
        return ncrptdData;
    }

    /**
     * Sets the value of the ncrptdData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptedData1Choice }
     *     
     */
    public EncryptedDataElement1 setNcrptdData(EncryptedData1Choice value) {
        this.ncrptdData = value;
        return this;
    }

    /**
     * Gets the value of the clearTxtDataFrmt property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptedDataFormat1Code }
     *     
     */
    public EncryptedDataFormat1Code getClearTxtDataFrmt() {
        return clearTxtDataFrmt;
    }

    /**
     * Sets the value of the clearTxtDataFrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptedDataFormat1Code }
     *     
     */
    public EncryptedDataElement1 setClearTxtDataFrmt(EncryptedDataFormat1Code value) {
        this.clearTxtDataFrmt = value;
        return this;
    }

    /**
     * Gets the value of the othrClearTxtDataFrmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrClearTxtDataFrmt() {
        return othrClearTxtDataFrmt;
    }

    /**
     * Sets the value of the othrClearTxtDataFrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EncryptedDataElement1 setOthrClearTxtDataFrmt(String value) {
        this.othrClearTxtDataFrmt = value;
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
