
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
 * Java class for AcquireSnFRequest complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcquireSnFRequest", propOrder = {
    "queue",
    "sessionMode",
    "snlep",
    "forceAcquire",
    "subset",
    "orderBy",
    "recoveryMode",
    "deliverPendingNotifyFileRequestHandle",
    "windowSize",
    "eventEP"
})
public class SwAcquireSnFRequest {

    @XmlElement(name = "Queue", namespace = "urn:swift:snl:ns.SwInt", required = true)
    protected String queue;
    @XmlElement(name = "SessionMode", required = true)
    protected String sessionMode;
    @XmlElement(name = "SNLEP", namespace = "urn:swift:snl:ns.SwInt")
    protected String snlep;
    @XmlElement(name = "ForceAcquire")
    protected String forceAcquire;
    @XmlElement(name = "Subset")
    protected List<String> subset;
    @XmlElement(name = "OrderBy")
    protected String orderBy;
    @XmlElement(name = "RecoveryMode")
    protected String recoveryMode;
    @XmlElement(name = "DeliverPendingNotifyFileRequestHandle")
    protected String deliverPendingNotifyFileRequestHandle;
    @XmlElement(name = "WindowSize")
    protected String windowSize;
    @XmlElement(name = "EventEP")
    protected String eventEP;

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
    public SwAcquireSnFRequest setQueue(String value) {
        this.queue = value;
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
    public SwAcquireSnFRequest setSessionMode(String value) {
        this.sessionMode = value;
        return this;
    }

    /**
     * Gets the value of the snlep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNLEP() {
        return snlep;
    }

    /**
     * Sets the value of the snlep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwAcquireSnFRequest setSNLEP(String value) {
        this.snlep = value;
        return this;
    }

    /**
     * Gets the value of the forceAcquire property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForceAcquire() {
        return forceAcquire;
    }

    /**
     * Sets the value of the forceAcquire property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwAcquireSnFRequest setForceAcquire(String value) {
        this.forceAcquire = value;
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
    public SwAcquireSnFRequest setOrderBy(String value) {
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
    public SwAcquireSnFRequest setRecoveryMode(String value) {
        this.recoveryMode = value;
        return this;
    }

    /**
     * Gets the value of the deliverPendingNotifyFileRequestHandle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliverPendingNotifyFileRequestHandle() {
        return deliverPendingNotifyFileRequestHandle;
    }

    /**
     * Sets the value of the deliverPendingNotifyFileRequestHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwAcquireSnFRequest setDeliverPendingNotifyFileRequestHandle(String value) {
        this.deliverPendingNotifyFileRequestHandle = value;
        return this;
    }

    /**
     * Gets the value of the windowSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindowSize() {
        return windowSize;
    }

    /**
     * Sets the value of the windowSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwAcquireSnFRequest setWindowSize(String value) {
        this.windowSize = value;
        return this;
    }

    /**
     * Gets the value of the eventEP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventEP() {
        return eventEP;
    }

    /**
     * Sets the value of the eventEP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwAcquireSnFRequest setEventEP(String value) {
        this.eventEP = value;
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
    public SwAcquireSnFRequest addSubset(String subset) {
        getSubset().add(subset);
        return this;
    }

}
