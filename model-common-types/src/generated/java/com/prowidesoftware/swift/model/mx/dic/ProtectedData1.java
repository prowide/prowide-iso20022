
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Contains protected data and the attributes used to protect the data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProtectedData1", propOrder = {
    "cnttTp",
    "envlpdData",
    "ncrptdData"
})
public class ProtectedData1 {

    @XmlElement(name = "CnttTp", required = true)
    @XmlSchemaType(name = "string")
    protected ContentType3Code cnttTp;
    @XmlElement(name = "EnvlpdData")
    protected EnvelopedData6 envlpdData;
    @XmlElement(name = "NcrptdData")
    protected EncryptedData1 ncrptdData;

    /**
     * Gets the value of the cnttTp property.
     * 
     * @return
     *     possible object is
     *     {@link ContentType3Code }
     *     
     */
    public ContentType3Code getCnttTp() {
        return cnttTp;
    }

    /**
     * Sets the value of the cnttTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentType3Code }
     *     
     */
    public ProtectedData1 setCnttTp(ContentType3Code value) {
        this.cnttTp = value;
        return this;
    }

    /**
     * Gets the value of the envlpdData property.
     * 
     * @return
     *     possible object is
     *     {@link EnvelopedData6 }
     *     
     */
    public EnvelopedData6 getEnvlpdData() {
        return envlpdData;
    }

    /**
     * Sets the value of the envlpdData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvelopedData6 }
     *     
     */
    public ProtectedData1 setEnvlpdData(EnvelopedData6 value) {
        this.envlpdData = value;
        return this;
    }

    /**
     * Gets the value of the ncrptdData property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptedData1 }
     *     
     */
    public EncryptedData1 getNcrptdData() {
        return ncrptdData;
    }

    /**
     * Sets the value of the ncrptdData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptedData1 }
     *     
     */
    public ProtectedData1 setNcrptdData(EncryptedData1 value) {
        this.ncrptdData = value;
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
