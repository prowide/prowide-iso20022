
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
 * Contains text fields in the local language.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalData17", propOrder = {
    "lang",
    "ncodgFrmt",
    "txtMsg"
})
public class LocalData17 {

    @XmlElement(name = "Lang", required = true)
    protected String lang;
    @XmlElement(name = "NcodgFrmt")
    protected String ncodgFrmt;
    @XmlElement(name = "TxtMsg", required = true)
    protected String txtMsg;

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LocalData17 setLang(String value) {
        this.lang = value;
        return this;
    }

    /**
     * Gets the value of the ncodgFrmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNcodgFrmt() {
        return ncodgFrmt;
    }

    /**
     * Sets the value of the ncodgFrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LocalData17 setNcodgFrmt(String value) {
        this.ncodgFrmt = value;
        return this;
    }

    /**
     * Gets the value of the txtMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxtMsg() {
        return txtMsg;
    }

    /**
     * Sets the value of the txtMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LocalData17 setTxtMsg(String value) {
        this.txtMsg = value;
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
