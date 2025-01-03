
package com.prowidesoftware.swift.model.mx.sys.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for ValidationDescriptor complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidationDescriptor", namespace = "urn:swift:snl:ns.SwInt", propOrder = {
    "valResult",
    "valStatus"
})
public class SwIntValidationDescriptor {

    @XmlElement(name = "ValResult", required = true)
    protected String valResult;
    @XmlElement(name = "ValStatus")
    protected SwGblStatus valStatus;

    /**
     * Gets the value of the valResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValResult() {
        return valResult;
    }

    /**
     * Sets the value of the valResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwIntValidationDescriptor setValResult(String value) {
        this.valResult = value;
        return this;
    }

    /**
     * Gets the value of the valStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SwGblStatus }
     *     
     */
    public SwGblStatus getValStatus() {
        return valStatus;
    }

    /**
     * Sets the value of the valStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwGblStatus }
     *     
     */
    public SwIntValidationDescriptor setValStatus(SwGblStatus value) {
        this.valStatus = value;
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
