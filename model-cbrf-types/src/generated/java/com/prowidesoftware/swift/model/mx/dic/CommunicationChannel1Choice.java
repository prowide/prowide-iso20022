
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
 * Choice between channel mode and terminal identification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommunicationChannel1Choice", propOrder = {
    "chanlMd",
    "termnlId"
})
public class CommunicationChannel1Choice {

    @XmlElement(name = "ChanlMd")
    protected String chanlMd;
    @XmlElement(name = "TermnlId")
    protected String termnlId;

    /**
     * Gets the value of the chanlMd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChanlMd() {
        return chanlMd;
    }

    /**
     * Sets the value of the chanlMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CommunicationChannel1Choice setChanlMd(String value) {
        this.chanlMd = value;
        return this;
    }

    /**
     * Gets the value of the termnlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermnlId() {
        return termnlId;
    }

    /**
     * Sets the value of the termnlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CommunicationChannel1Choice setTermnlId(String value) {
        this.termnlId = value;
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
