
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
 * Java class for KMACertInfoResponse complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KMACertInfoResponse", propOrder = {
    "pswdExpiryDays",
    "pswdLifeTime",
    "userPolicy",
    "certInfoList",
    "status"
})
public class SwKMACertInfoResponse {

    @XmlElement(name = "PswdExpiryDays")
    protected String pswdExpiryDays;
    @XmlElement(name = "PswdLifeTime")
    protected String pswdLifeTime;
    @XmlElement(name = "UserPolicy")
    protected String userPolicy;
    @XmlElement(name = "CertInfoList")
    protected List<SwCertInfoList> certInfoList;
    @XmlElement(name = "Status", namespace = "urn:swift:snl:ns.SwGbl")
    protected SwGblStatus status;

    /**
     * Gets the value of the pswdExpiryDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPswdExpiryDays() {
        return pswdExpiryDays;
    }

    /**
     * Sets the value of the pswdExpiryDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwKMACertInfoResponse setPswdExpiryDays(String value) {
        this.pswdExpiryDays = value;
        return this;
    }

    /**
     * Gets the value of the pswdLifeTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPswdLifeTime() {
        return pswdLifeTime;
    }

    /**
     * Sets the value of the pswdLifeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwKMACertInfoResponse setPswdLifeTime(String value) {
        this.pswdLifeTime = value;
        return this;
    }

    /**
     * Gets the value of the userPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPolicy() {
        return userPolicy;
    }

    /**
     * Sets the value of the userPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwKMACertInfoResponse setUserPolicy(String value) {
        this.userPolicy = value;
        return this;
    }

    /**
     * Gets the value of the certInfoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the certInfoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertInfoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwCertInfoList }
     * 
     * 
     * @return
     *     The value of the certInfoList property.
     */
    public List<SwCertInfoList> getCertInfoList() {
        if (certInfoList == null) {
            certInfoList = new ArrayList<>();
        }
        return this.certInfoList;
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
    public SwKMACertInfoResponse setStatus(SwGblStatus value) {
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
     * Adds a new item to the certInfoList list.
     * @see #getCertInfoList()
     * 
     */
    public SwKMACertInfoResponse addCertInfoList(SwCertInfoList certInfoList) {
        getCertInfoList().add(certInfoList);
        return this;
    }

}
