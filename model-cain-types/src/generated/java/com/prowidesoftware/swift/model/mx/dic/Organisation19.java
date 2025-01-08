
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
 * Card acceptor performing the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organisation19", propOrder = {
    "id",
    "cmonNm",
    "selctdLang",
    "schmeData"
})
public class Organisation19 {

    @XmlElement(name = "Id", required = true)
    protected GenericIdentification32 id;
    @XmlElement(name = "CmonNm", required = true)
    protected String cmonNm;
    @XmlElement(name = "SelctdLang")
    protected String selctdLang;
    @XmlElement(name = "SchmeData")
    protected String schmeData;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification32 }
     *     
     */
    public GenericIdentification32 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification32 }
     *     
     */
    public Organisation19 setId(GenericIdentification32 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the cmonNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmonNm() {
        return cmonNm;
    }

    /**
     * Sets the value of the cmonNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Organisation19 setCmonNm(String value) {
        this.cmonNm = value;
        return this;
    }

    /**
     * Gets the value of the selctdLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelctdLang() {
        return selctdLang;
    }

    /**
     * Sets the value of the selctdLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Organisation19 setSelctdLang(String value) {
        this.selctdLang = value;
        return this;
    }

    /**
     * Gets the value of the schmeData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchmeData() {
        return schmeData;
    }

    /**
     * Sets the value of the schmeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Organisation19 setSchmeData(String value) {
        this.schmeData = value;
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
