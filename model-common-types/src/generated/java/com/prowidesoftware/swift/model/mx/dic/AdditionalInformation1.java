
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
 * Additional information about a request (e.g. financing request).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalInformation1", propOrder = {
    "infTp",
    "infVal"
})
public class AdditionalInformation1 {

    @XmlElement(name = "InfTp", required = true)
    protected InformationType1Choice infTp;
    @XmlElement(name = "InfVal", required = true)
    protected String infVal;

    /**
     * Gets the value of the infTp property.
     * 
     * @return
     *     possible object is
     *     {@link InformationType1Choice }
     *     
     */
    public InformationType1Choice getInfTp() {
        return infTp;
    }

    /**
     * Sets the value of the infTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationType1Choice }
     *     
     */
    public AdditionalInformation1 setInfTp(InformationType1Choice value) {
        this.infTp = value;
        return this;
    }

    /**
     * Gets the value of the infVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfVal() {
        return infVal;
    }

    /**
     * Sets the value of the infVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalInformation1 setInfVal(String value) {
        this.infVal = value;
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
