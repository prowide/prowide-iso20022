
package com.prowidesoftware.swift.model.mx.sys.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for ListFileStatusResponse complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListFileStatusResponse", propOrder = {
    "fileStatus",
    "endOfList",
    "status"
})
public class SwListFileStatusResponse {

    @XmlElement(name = "FileStatus")
    protected List<SwFileStatus> fileStatus;
    @XmlElement(name = "EndOfList")
    protected String endOfList;
    @XmlElement(name = "Status", namespace = "urn:swift:snl:ns.SwGbl")
    protected SwGblStatus status;

    /**
     * Gets the value of the fileStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwFileStatus }
     * 
     * 
     */
    public List<SwFileStatus> getFileStatus() {
        if (fileStatus == null) {
            fileStatus = new ArrayList<SwFileStatus>();
        }
        return this.fileStatus;
    }

    /**
     * Gets the value of the endOfList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndOfList() {
        return endOfList;
    }

    /**
     * Sets the value of the endOfList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwListFileStatusResponse setEndOfList(String value) {
        this.endOfList = value;
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
    public SwListFileStatusResponse setStatus(SwGblStatus value) {
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

    /**
     * Adds a new item to the fileStatus list.
     * @see #getFileStatus()
     * 
     */
    public SwListFileStatusResponse addFileStatus(SwFileStatus fileStatus) {
        getFileStatus().add(fileStatus);
        return this;
    }

}
