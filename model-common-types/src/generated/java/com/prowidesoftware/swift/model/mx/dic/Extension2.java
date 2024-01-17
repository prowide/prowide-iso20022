
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
 * Additional information that can not be captured in the structured fields and/or any other specific block.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Extension2", propOrder = {
    "plcAndNm",
    "xtnsnEnvlp"
})
public class Extension2 {

    @XmlElement(name = "PlcAndNm")
    protected String plcAndNm;
    @XmlElement(name = "XtnsnEnvlp", required = true)
    protected ExtensionEnvelope1 xtnsnEnvlp;

    /**
     * Gets the value of the plcAndNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcAndNm() {
        return plcAndNm;
    }

    /**
     * Sets the value of the plcAndNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Extension2 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the xtnsnEnvlp property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionEnvelope1 }
     *     
     */
    public ExtensionEnvelope1 getXtnsnEnvlp() {
        return xtnsnEnvlp;
    }

    /**
     * Sets the value of the xtnsnEnvlp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionEnvelope1 }
     *     
     */
    public Extension2 setXtnsnEnvlp(ExtensionEnvelope1 value) {
        this.xtnsnEnvlp = value;
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
