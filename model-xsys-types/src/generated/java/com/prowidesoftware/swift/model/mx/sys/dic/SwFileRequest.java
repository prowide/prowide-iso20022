
package com.prowidesoftware.swift.model.mx.sys.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for FileRequest complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileRequest", propOrder = {
    "fileRequestControl",
    "fileRequestE2EControl",
    "fileRequestHeader",
    "fileOpRequest",
    "signatureList"
})
public class SwFileRequest {

    @XmlElement(name = "FileRequestControl")
    protected SwFileRequestControl fileRequestControl;
    @XmlElement(name = "FileRequestE2EControl")
    protected SwE2EControl fileRequestE2EControl;
    @XmlElement(name = "FileRequestHeader", required = true)
    protected SwFileRequestHeader fileRequestHeader;
    @XmlElement(name = "FileOpRequest", required = true)
    protected SwFileOpRequest fileOpRequest;
    @XmlElement(name = "SignatureList", namespace = "urn:swift:snl:ns.SwSec")
    protected List<SwSecSignatureList> signatureList;

    /**
     * Gets the value of the fileRequestControl property.
     * 
     * @return
     *     possible object is
     *     {@link SwFileRequestControl }
     *     
     */
    public SwFileRequestControl getFileRequestControl() {
        return fileRequestControl;
    }

    /**
     * Sets the value of the fileRequestControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwFileRequestControl }
     *     
     */
    public SwFileRequest setFileRequestControl(SwFileRequestControl value) {
        this.fileRequestControl = value;
        return this;
    }

    /**
     * Gets the value of the fileRequestE2EControl property.
     * 
     * @return
     *     possible object is
     *     {@link SwE2EControl }
     *     
     */
    public SwE2EControl getFileRequestE2EControl() {
        return fileRequestE2EControl;
    }

    /**
     * Sets the value of the fileRequestE2EControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwE2EControl }
     *     
     */
    public SwFileRequest setFileRequestE2EControl(SwE2EControl value) {
        this.fileRequestE2EControl = value;
        return this;
    }

    /**
     * Gets the value of the fileRequestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link SwFileRequestHeader }
     *     
     */
    public SwFileRequestHeader getFileRequestHeader() {
        return fileRequestHeader;
    }

    /**
     * Sets the value of the fileRequestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwFileRequestHeader }
     *     
     */
    public SwFileRequest setFileRequestHeader(SwFileRequestHeader value) {
        this.fileRequestHeader = value;
        return this;
    }

    /**
     * Gets the value of the fileOpRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SwFileOpRequest }
     *     
     */
    public SwFileOpRequest getFileOpRequest() {
        return fileOpRequest;
    }

    /**
     * Sets the value of the fileOpRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwFileOpRequest }
     *     
     */
    public SwFileRequest setFileOpRequest(SwFileOpRequest value) {
        this.fileOpRequest = value;
        return this;
    }

    /**
     * Gets the value of the signatureList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signatureList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignatureList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwSecSignatureList }
     * 
     * 
     */
    public List<SwSecSignatureList> getSignatureList() {
        if (signatureList == null) {
            signatureList = new ArrayList<SwSecSignatureList>();
        }
        return this.signatureList;
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
     * Adds a new item to the signatureList list.
     * @see #getSignatureList()
     * 
     */
    public SwFileRequest addSignatureList(SwSecSignatureList signatureList) {
        getSignatureList().add(signatureList);
        return this;
    }

}
