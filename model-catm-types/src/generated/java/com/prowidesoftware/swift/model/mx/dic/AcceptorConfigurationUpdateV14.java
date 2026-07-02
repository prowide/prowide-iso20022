
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
 * The AcceptorConfigurationUpdate message is sent by a TM to a POI to update configurations.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorConfigurationUpdateV14", propOrder = {
    "hdr",
    "accptrCfgtn",
    "sctyTrlr"
})
public class AcceptorConfigurationUpdateV14 {

    @XmlElement(name = "Hdr", required = true)
    protected TMSHeader1 hdr;
    @XmlElement(name = "AccptrCfgtn", required = true)
    protected AcceptorConfiguration14 accptrCfgtn;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType38 sctyTrlr;

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
    public AcceptorConfigurationUpdateV14 setHdr(TMSHeader1 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the accptrCfgtn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorConfiguration14 }
     *     
     */
    public AcceptorConfiguration14 getAccptrCfgtn() {
        return accptrCfgtn;
    }

    /**
     * Sets the value of the accptrCfgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorConfiguration14 }
     *     
     */
    public AcceptorConfigurationUpdateV14 setAccptrCfgtn(AcceptorConfiguration14 value) {
        this.accptrCfgtn = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType38 }
     *     
     */
    public ContentInformationType38 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType38 }
     *     
     */
    public AcceptorConfigurationUpdateV14 setSctyTrlr(ContentInformationType38 value) {
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
