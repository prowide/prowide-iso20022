
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
 * Java class for FileResponse complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileResponse", propOrder = {
    "fileResponseControl",
    "fileResponseE2EControl",
    "fileResponseHeader",
    "fileOpResponse",
    "signatureList"
})
public class SwFileResponse {

    @XmlElement(name = "FileResponseControl")
    protected SwFileResponseControl fileResponseControl;
    @XmlElement(name = "FileResponseE2EControl")
    protected SwE2EControl fileResponseE2EControl;
    @XmlElement(name = "FileResponseHeader", required = true)
    protected SwFileResponseHeader fileResponseHeader;
    @XmlElement(name = "FileOpResponse", required = true)
    protected SwFileOpResponse fileOpResponse;
    @XmlElement(name = "SignatureList", namespace = "urn:swift:snl:ns.SwSec")
    protected List<SwSecSignatureList> signatureList;

    /**
     * Gets the value of the fileResponseControl property.
     * 
     * @return
     *     possible object is
     *     {@link SwFileResponseControl }
     *     
     */
    public SwFileResponseControl getFileResponseControl() {
        return fileResponseControl;
    }

    /**
     * Sets the value of the fileResponseControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwFileResponseControl }
     *     
     */
    public SwFileResponse setFileResponseControl(SwFileResponseControl value) {
        this.fileResponseControl = value;
        return this;
    }

    /**
     * Gets the value of the fileResponseE2EControl property.
     * 
     * @return
     *     possible object is
     *     {@link SwE2EControl }
     *     
     */
    public SwE2EControl getFileResponseE2EControl() {
        return fileResponseE2EControl;
    }

    /**
     * Sets the value of the fileResponseE2EControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwE2EControl }
     *     
     */
    public SwFileResponse setFileResponseE2EControl(SwE2EControl value) {
        this.fileResponseE2EControl = value;
        return this;
    }

    /**
     * Gets the value of the fileResponseHeader property.
     * 
     * @return
     *     possible object is
     *     {@link SwFileResponseHeader }
     *     
     */
    public SwFileResponseHeader getFileResponseHeader() {
        return fileResponseHeader;
    }

    /**
     * Sets the value of the fileResponseHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwFileResponseHeader }
     *     
     */
    public SwFileResponse setFileResponseHeader(SwFileResponseHeader value) {
        this.fileResponseHeader = value;
        return this;
    }

    /**
     * Gets the value of the fileOpResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SwFileOpResponse }
     *     
     */
    public SwFileOpResponse getFileOpResponse() {
        return fileOpResponse;
    }

    /**
     * Sets the value of the fileOpResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwFileOpResponse }
     *     
     */
    public SwFileResponse setFileOpResponse(SwFileOpResponse value) {
        this.fileOpResponse = value;
        return this;
    }

    /**
     * Gets the value of the signatureList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the signatureList property.
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
     * @return
     *     The value of the signatureList property.
     */
    public List<SwSecSignatureList> getSignatureList() {
        if (signatureList == null) {
            signatureList = new ArrayList<>();
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
    public SwFileResponse addSignatureList(SwSecSignatureList signatureList) {
        getSignatureList().add(signatureList);
        return this;
    }

}
