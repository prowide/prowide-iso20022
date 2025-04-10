
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
 * Java class for ProfileInfo complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileInfo", namespace = "urn:swift:snl:ns.SwSec", propOrder = {
    "pswdExpiryDays",
    "pswdLifeTime",
    "userPolicy",
    "certInfoList"
})
public class SwSecProfileInfo {

    @XmlElement(name = "PswdExpiryDays", namespace = "urn:swift:snl:ns.Sw", required = true)
    protected String pswdExpiryDays;
    @XmlElement(name = "PswdLifeTime", namespace = "urn:swift:snl:ns.Sw", required = true)
    protected String pswdLifeTime;
    @XmlElement(name = "UserPolicy", namespace = "urn:swift:snl:ns.Sw")
    protected String userPolicy;
    @XmlElement(name = "CertInfoList", namespace = "urn:swift:snl:ns.Sw", required = true)
    protected List<SwCertInfoList> certInfoList;

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
    public SwSecProfileInfo setPswdExpiryDays(String value) {
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
    public SwSecProfileInfo setPswdLifeTime(String value) {
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
    public SwSecProfileInfo setUserPolicy(String value) {
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
    public SwSecProfileInfo addCertInfoList(SwCertInfoList certInfoList) {
        getCertInfoList().add(certInfoList);
        return this;
    }

}
