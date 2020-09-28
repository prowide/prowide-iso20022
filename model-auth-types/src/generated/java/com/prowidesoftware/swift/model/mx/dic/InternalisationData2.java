
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
 * Specifies the aggregated data of internalised settlement instructions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InternalisationData2", propOrder = {
    "sttld",
    "faild",
    "ttl"
})
public class InternalisationData2 {

    @XmlElement(name = "Sttld", required = true)
    protected InternalisationDataVolume1 sttld;
    @XmlElement(name = "Faild", required = true)
    protected InternalisationDataVolume1 faild;
    @XmlElement(name = "Ttl", required = true)
    protected InternalisationDataVolume1 ttl;

    /**
     * Gets the value of the sttld property.
     * 
     * @return
     *     possible object is
     *     {@link InternalisationDataVolume1 }
     *     
     */
    public InternalisationDataVolume1 getSttld() {
        return sttld;
    }

    /**
     * Sets the value of the sttld property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalisationDataVolume1 }
     *     
     */
    public InternalisationData2 setSttld(InternalisationDataVolume1 value) {
        this.sttld = value;
        return this;
    }

    /**
     * Gets the value of the faild property.
     * 
     * @return
     *     possible object is
     *     {@link InternalisationDataVolume1 }
     *     
     */
    public InternalisationDataVolume1 getFaild() {
        return faild;
    }

    /**
     * Sets the value of the faild property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalisationDataVolume1 }
     *     
     */
    public InternalisationData2 setFaild(InternalisationDataVolume1 value) {
        this.faild = value;
        return this;
    }

    /**
     * Gets the value of the ttl property.
     * 
     * @return
     *     possible object is
     *     {@link InternalisationDataVolume1 }
     *     
     */
    public InternalisationDataVolume1 getTtl() {
        return ttl;
    }

    /**
     * Sets the value of the ttl property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalisationDataVolume1 }
     *     
     */
    public InternalisationData2 setTtl(InternalisationDataVolume1 value) {
        this.ttl = value;
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
