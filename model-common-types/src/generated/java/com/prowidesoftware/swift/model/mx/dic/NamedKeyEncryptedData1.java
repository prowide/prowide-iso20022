
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Encrypted data with an encryption key identified with a name.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NamedKeyEncryptedData1", propOrder = {
    "vrsn",
    "keyNm",
    "ncrptdCntt"
})
public class NamedKeyEncryptedData1 {

    @XmlElement(name = "Vrsn")
    protected BigDecimal vrsn;
    @XmlElement(name = "KeyNm")
    protected String keyNm;
    @XmlElement(name = "NcrptdCntt", required = true)
    protected EncryptedContent1 ncrptdCntt;

    /**
     * Gets the value of the vrsn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVrsn() {
        return vrsn;
    }

    /**
     * Sets the value of the vrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public NamedKeyEncryptedData1 setVrsn(BigDecimal value) {
        this.vrsn = value;
        return this;
    }

    /**
     * Gets the value of the keyNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyNm() {
        return keyNm;
    }

    /**
     * Sets the value of the keyNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NamedKeyEncryptedData1 setKeyNm(String value) {
        this.keyNm = value;
        return this;
    }

    /**
     * Gets the value of the ncrptdCntt property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptedContent1 }
     *     
     */
    public EncryptedContent1 getNcrptdCntt() {
        return ncrptdCntt;
    }

    /**
     * Sets the value of the ncrptdCntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptedContent1 }
     *     
     */
    public NamedKeyEncryptedData1 setNcrptdCntt(EncryptedContent1 value) {
        this.ncrptdCntt = value;
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
