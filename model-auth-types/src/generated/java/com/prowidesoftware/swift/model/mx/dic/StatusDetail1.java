
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
 * Specifies the details of the status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusDetail1", propOrder = {
    "ctry",
    "cmptntAuthrty",
    "sts",
    "stsRsn",
    "actvtyPrd",
    "cmnt"
})
public class StatusDetail1 {

    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "CmptntAuthrty", required = true)
    protected SupervisingAuthorityIdentification1 cmptntAuthrty;
    @XmlElement(name = "Sts")
    protected String sts;
    @XmlElement(name = "StsRsn", required = true)
    protected String stsRsn;
    @XmlElement(name = "ActvtyPrd")
    protected Period4Choice actvtyPrd;
    @XmlElement(name = "Cmnt")
    protected String cmnt;

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StatusDetail1 setCtry(String value) {
        this.ctry = value;
        return this;
    }

    /**
     * Gets the value of the cmptntAuthrty property.
     * 
     * @return
     *     possible object is
     *     {@link SupervisingAuthorityIdentification1 }
     *     
     */
    public SupervisingAuthorityIdentification1 getCmptntAuthrty() {
        return cmptntAuthrty;
    }

    /**
     * Sets the value of the cmptntAuthrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupervisingAuthorityIdentification1 }
     *     
     */
    public StatusDetail1 setCmptntAuthrty(SupervisingAuthorityIdentification1 value) {
        this.cmptntAuthrty = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StatusDetail1 setSts(String value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the stsRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStsRsn() {
        return stsRsn;
    }

    /**
     * Sets the value of the stsRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StatusDetail1 setStsRsn(String value) {
        this.stsRsn = value;
        return this;
    }

    /**
     * Gets the value of the actvtyPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period4Choice }
     *     
     */
    public Period4Choice getActvtyPrd() {
        return actvtyPrd;
    }

    /**
     * Sets the value of the actvtyPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period4Choice }
     *     
     */
    public StatusDetail1 setActvtyPrd(Period4Choice value) {
        this.actvtyPrd = value;
        return this;
    }

    /**
     * Gets the value of the cmnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmnt() {
        return cmnt;
    }

    /**
     * Sets the value of the cmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StatusDetail1 setCmnt(String value) {
        this.cmnt = value;
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
