
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
 * Java class for FileResponseHandle complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileResponseHandle", propOrder = {
    "fileRequestDescriptor",
    "fileResponseDescriptor",
    "fileResponseE2EControl",
    "fileResponseHeader",
    "fileOpResponseHandle",
    "signatureList"
})
public class SwFileResponseHandle {

    @XmlElement(name = "FileRequestDescriptor", required = true)
    protected SwFileRequestDescriptor fileRequestDescriptor;
    @XmlElement(name = "FileResponseDescriptor")
    protected SwFileResponseDescriptor fileResponseDescriptor;
    @XmlElement(name = "FileResponseE2EControl")
    protected SwE2EControl fileResponseE2EControl;
    @XmlElement(name = "FileResponseHeader", required = true)
    protected SwFileResponseHeader fileResponseHeader;
    @XmlElement(name = "FileOpResponseHandle", required = true)
    protected SwFileOpResponseHandle fileOpResponseHandle;
    @XmlElement(name = "SignatureList", namespace = "urn:swift:snl:ns.SwSec")
    protected List<SwSecSignatureList> signatureList;

    /**
     * Gets the value of the fileRequestDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link SwFileRequestDescriptor }
     *     
     */
    public SwFileRequestDescriptor getFileRequestDescriptor() {
        return fileRequestDescriptor;
    }

    /**
     * Sets the value of the fileRequestDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwFileRequestDescriptor }
     *     
     */
    public SwFileResponseHandle setFileRequestDescriptor(SwFileRequestDescriptor value) {
        this.fileRequestDescriptor = value;
        return this;
    }

    /**
     * Gets the value of the fileResponseDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link SwFileResponseDescriptor }
     *     
     */
    public SwFileResponseDescriptor getFileResponseDescriptor() {
        return fileResponseDescriptor;
    }

    /**
     * Sets the value of the fileResponseDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwFileResponseDescriptor }
     *     
     */
    public SwFileResponseHandle setFileResponseDescriptor(SwFileResponseDescriptor value) {
        this.fileResponseDescriptor = value;
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
    public SwFileResponseHandle setFileResponseE2EControl(SwE2EControl value) {
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
    public SwFileResponseHandle setFileResponseHeader(SwFileResponseHeader value) {
        this.fileResponseHeader = value;
        return this;
    }

    /**
     * Gets the value of the fileOpResponseHandle property.
     * 
     * @return
     *     possible object is
     *     {@link SwFileOpResponseHandle }
     *     
     */
    public SwFileOpResponseHandle getFileOpResponseHandle() {
        return fileOpResponseHandle;
    }

    /**
     * Sets the value of the fileOpResponseHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwFileOpResponseHandle }
     *     
     */
    public SwFileResponseHandle setFileOpResponseHandle(SwFileOpResponseHandle value) {
        this.fileOpResponseHandle = value;
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
    public SwFileResponseHandle addSignatureList(SwSecSignatureList signatureList) {
        getSignatureList().add(signatureList);
        return this;
    }

}
