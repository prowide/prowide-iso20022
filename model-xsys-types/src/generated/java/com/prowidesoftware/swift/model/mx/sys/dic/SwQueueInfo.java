
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
 * Java class for QueueInfo complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueueInfo", propOrder = {
    "userDN",
    "snlId",
    "sessionMode",
    "orderBy",
    "recoveryMode",
    "subset"
})
public class SwQueueInfo {

    @XmlElement(name = "UserDN", namespace = "urn:swift:snl:ns.SwSec", required = true)
    protected String userDN;
    @XmlElement(name = "SNLId", namespace = "urn:swift:snl:ns.SwInt", required = true)
    protected String snlId;
    @XmlElement(name = "SessionMode", required = true)
    protected String sessionMode;
    @XmlElement(name = "OrderBy")
    protected String orderBy;
    @XmlElement(name = "RecoveryMode")
    protected String recoveryMode;
    @XmlElement(name = "Subset")
    protected List<String> subset;

    /**
     * Gets the value of the userDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDN() {
        return userDN;
    }

    /**
     * Sets the value of the userDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwQueueInfo setUserDN(String value) {
        this.userDN = value;
        return this;
    }

    /**
     * Gets the value of the snlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNLId() {
        return snlId;
    }

    /**
     * Sets the value of the snlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwQueueInfo setSNLId(String value) {
        this.snlId = value;
        return this;
    }

    /**
     * Gets the value of the sessionMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionMode() {
        return sessionMode;
    }

    /**
     * Sets the value of the sessionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwQueueInfo setSessionMode(String value) {
        this.sessionMode = value;
        return this;
    }

    /**
     * Gets the value of the orderBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderBy() {
        return orderBy;
    }

    /**
     * Sets the value of the orderBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwQueueInfo setOrderBy(String value) {
        this.orderBy = value;
        return this;
    }

    /**
     * Gets the value of the recoveryMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecoveryMode() {
        return recoveryMode;
    }

    /**
     * Sets the value of the recoveryMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwQueueInfo setRecoveryMode(String value) {
        this.recoveryMode = value;
        return this;
    }

    /**
     * Gets the value of the subset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubset() {
        if (subset == null) {
            subset = new ArrayList<String>();
        }
        return this.subset;
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
     * Adds a new item to the subset list.
     * @see #getSubset()
     * 
     */
    public SwQueueInfo addSubset(String subset) {
        getSubset().add(subset);
        return this;
    }

}
