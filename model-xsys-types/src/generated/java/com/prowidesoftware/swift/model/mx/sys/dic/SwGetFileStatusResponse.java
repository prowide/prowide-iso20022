
package com.prowidesoftware.swift.model.mx.sys.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for GetFileStatusResponse complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFileStatusResponse", propOrder = {
    "fileStatus",
    "status"
})
public class SwGetFileStatusResponse {

    @XmlElement(name = "FileStatus")
    protected SwFileStatus fileStatus;
    @XmlElement(name = "Status", namespace = "urn:swift:snl:ns.SwGbl")
    protected SwGblStatus status;

    /**
     * Gets the value of the fileStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SwFileStatus }
     *     
     */
    public SwFileStatus getFileStatus() {
        return fileStatus;
    }

    /**
     * Sets the value of the fileStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwFileStatus }
     *     
     */
    public SwGetFileStatusResponse setFileStatus(SwFileStatus value) {
        this.fileStatus = value;
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
    public SwGetFileStatusResponse setStatus(SwGblStatus value) {
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
