
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
 * Java class for GetSnFStatusResponse complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSnFStatusResponse", propOrder = {
    "snFStatus",
    "status"
})
public class SwGetSnFStatusResponse {

    @XmlElement(name = "SnFStatus")
    protected SwSnFStatus snFStatus;
    @XmlElement(name = "Status", namespace = "urn:swift:snl:ns.SwGbl")
    protected SwGblStatus status;

    /**
     * Gets the value of the snFStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SwSnFStatus }
     *     
     */
    public SwSnFStatus getSnFStatus() {
        return snFStatus;
    }

    /**
     * Sets the value of the snFStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwSnFStatus }
     *     
     */
    public SwGetSnFStatusResponse setSnFStatus(SwSnFStatus value) {
        this.snFStatus = value;
        return this;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link SwGblStatus }
     *     
     */
    public SwGblStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwGblStatus }
     *     
     */
    public SwGetSnFStatusResponse setStatus(SwGblStatus value) {
        this.status = value;
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
