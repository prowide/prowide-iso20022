
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
 * Java class for SnFStatus complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SnFStatus", propOrder = {
    "sessionStatus",
    "userDN",
    "sessionMode",
    "orderBy",
    "recoveryMode",
    "snFOutputSeq",
    "lastActivityTime",
    "subset",
    "queue"
})
public class SwSnFStatus {

    @XmlElement(name = "SessionStatus", required = true)
    protected String sessionStatus;
    @XmlElement(name = "UserDN", namespace = "urn:swift:snl:ns.SwSec", required = true)
    protected String userDN;
    @XmlElement(name = "SessionMode", required = true)
    protected String sessionMode;
    @XmlElement(name = "OrderBy")
    protected String orderBy;
    @XmlElement(name = "RecoveryMode")
    protected String recoveryMode;
    @XmlElement(name = "SnFOutputSeq", required = true)
    protected String snFOutputSeq;
    @XmlElement(name = "LastActivityTime", required = true)
    protected String lastActivityTime;
    @XmlElement(name = "Subset")
    protected List<String> subset;
    @XmlElement(name = "Queue", namespace = "urn:swift:snl:ns.SwInt")
    protected String queue;

    /**
     * Gets the value of the sessionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionStatus() {
        return sessionStatus;
    }

    /**
     * Sets the value of the sessionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSnFStatus setSessionStatus(String value) {
        this.sessionStatus = value;
        return this;
    }

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
    public SwSnFStatus setUserDN(String value) {
        this.userDN = value;
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
    public SwSnFStatus setSessionMode(String value) {
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
    public SwSnFStatus setOrderBy(String value) {
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
    public SwSnFStatus setRecoveryMode(String value) {
        this.recoveryMode = value;
        return this;
    }

    /**
     * Gets the value of the snFOutputSeq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnFOutputSeq() {
        return snFOutputSeq;
    }

    /**
     * Sets the value of the snFOutputSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSnFStatus setSnFOutputSeq(String value) {
        this.snFOutputSeq = value;
        return this;
    }

    /**
     * Gets the value of the lastActivityTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastActivityTime() {
        return lastActivityTime;
    }

    /**
     * Sets the value of the lastActivityTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSnFStatus setLastActivityTime(String value) {
        this.lastActivityTime = value;
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

    /**
     * Gets the value of the queue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueue() {
        return queue;
    }

    /**
     * Sets the value of the queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSnFStatus setQueue(String value) {
        this.queue = value;
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
     * Adds a new item to the subset list.
     * @see #getSubset()
     * 
     */
    public SwSnFStatus addSubset(String subset) {
        getSubset().add(subset);
        return this;
    }

}
