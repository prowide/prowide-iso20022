
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
 * Business relationship between two entities; one entity is the account owner, the other entity is the account servicer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubAccount6", propOrder = {
    "id",
    "nm",
    "chrtc",
    "acctDsgnt"
})
public class SubAccount6 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Chrtc")
    protected String chrtc;
    @XmlElement(name = "AcctDsgnt")
    protected String acctDsgnt;

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
    public SubAccount6 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SubAccount6 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the chrtc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChrtc() {
        return chrtc;
    }

    /**
     * Sets the value of the chrtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SubAccount6 setChrtc(String value) {
        this.chrtc = value;
        return this;
    }

    /**
     * Gets the value of the acctDsgnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctDsgnt() {
        return acctDsgnt;
    }

    /**
     * Sets the value of the acctDsgnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SubAccount6 setAcctDsgnt(String value) {
        this.acctDsgnt = value;
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
