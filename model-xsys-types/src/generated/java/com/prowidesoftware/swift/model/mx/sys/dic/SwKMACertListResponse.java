
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
 * Java class for KMACertListResponse complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KMACertListResponse", propOrder = {
    "certList",
    "pageToken",
    "status"
})
public class SwKMACertListResponse {

    @XmlElement(name = "CertList")
    protected List<SwCertList> certList;
    @XmlElement(name = "PageToken")
    protected String pageToken;
    @XmlElement(name = "Status", namespace = "urn:swift:snl:ns.SwGbl")
    protected SwGblStatus status;

    /**
     * Gets the value of the certList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwCertList }
     * 
     * 
     */
    public List<SwCertList> getCertList() {
        if (certList == null) {
            certList = new ArrayList<SwCertList>();
        }
        return this.certList;
    }

    /**
     * Gets the value of the pageToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageToken() {
        return pageToken;
    }

    /**
     * Sets the value of the pageToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwKMACertListResponse setPageToken(String value) {
        this.pageToken = value;
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
    public SwKMACertListResponse setStatus(SwGblStatus value) {
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
     * Adds a new item to the certList list.
     * @see #getCertList()
     * 
     */
    public SwKMACertListResponse addCertList(SwCertList certList) {
        getCertList().add(certList);
        return this;
    }

}
