
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
 * The AcceptorConfigurationUpdate message is sent by a TM to a POI to update configurations.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorConfigurationUpdateV11", propOrder = {
    "hdr",
    "accptrCfgtn",
    "sctyTrlr"
})
public class AcceptorConfigurationUpdateV11 {

    @XmlElement(name = "Hdr", required = true)
    protected TMSHeader1 hdr;
    @XmlElement(name = "AccptrCfgtn", required = true)
    protected AcceptorConfiguration11 accptrCfgtn;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType29 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link TMSHeader1 }
     *     
     */
    public TMSHeader1 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TMSHeader1 }
     *     
     */
    public AcceptorConfigurationUpdateV11 setHdr(TMSHeader1 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the accptrCfgtn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorConfiguration11 }
     *     
     */
    public AcceptorConfiguration11 getAccptrCfgtn() {
        return accptrCfgtn;
    }

    /**
     * Sets the value of the accptrCfgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorConfiguration11 }
     *     
     */
    public AcceptorConfigurationUpdateV11 setAccptrCfgtn(AcceptorConfiguration11 value) {
        this.accptrCfgtn = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType29 }
     *     
     */
    public ContentInformationType29 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType29 }
     *     
     */
    public AcceptorConfigurationUpdateV11 setSctyTrlr(ContentInformationType29 value) {
        this.sctyTrlr = value;
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
