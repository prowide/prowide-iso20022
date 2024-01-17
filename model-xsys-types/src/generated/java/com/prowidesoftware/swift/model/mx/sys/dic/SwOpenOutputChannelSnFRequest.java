
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
 * Java class for OpenOutputChannelSnFRequest complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenOutputChannelSnFRequest", propOrder = {
    "outputChannel",
    "queue",
    "lastSnFOutputSeq",
    "sessionMode",
    "snlep",
    "subset",
    "deliverPendingNotifyFileRequestHandle",
    "windowSize",
    "eventEP",
    "protocolLevel"
})
public class SwOpenOutputChannelSnFRequest {

    @XmlElement(name = "OutputChannel", required = true)
    protected String outputChannel;
    @XmlElement(name = "Queue", namespace = "urn:swift:snl:ns.SwInt", required = true)
    protected String queue;
    @XmlElement(name = "LastSnFOutputSeq")
    protected String lastSnFOutputSeq;
    @XmlElement(name = "SessionMode", required = true)
    protected String sessionMode;
    @XmlElement(name = "SNLEP", namespace = "urn:swift:snl:ns.SwInt")
    protected String snlep;
    @XmlElement(name = "Subset")
    protected List<String> subset;
    @XmlElement(name = "DeliverPendingNotifyFileRequestHandle")
    protected String deliverPendingNotifyFileRequestHandle;
    @XmlElement(name = "WindowSize")
    protected String windowSize;
    @XmlElement(name = "EventEP")
    protected String eventEP;
    @XmlElement(name = "ProtocolLevel")
    protected String protocolLevel;

    /**
     * Gets the value of the outputChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputChannel() {
        return outputChannel;
    }

    /**
     * Sets the value of the outputChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwOpenOutputChannelSnFRequest setOutputChannel(String value) {
        this.outputChannel = value;
        return this;
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
    public SwOpenOutputChannelSnFRequest setQueue(String value) {
        this.queue = value;
        return this;
    }

    /**
     * Gets the value of the lastSnFOutputSeq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastSnFOutputSeq() {
        return lastSnFOutputSeq;
    }

    /**
     * Sets the value of the lastSnFOutputSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwOpenOutputChannelSnFRequest setLastSnFOutputSeq(String value) {
        this.lastSnFOutputSeq = value;
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
    public SwOpenOutputChannelSnFRequest setSessionMode(String value) {
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
    public SwOpenOutputChannelSnFRequest setSNLEP(String value) {
        this.snlep = value;
        return this;
    }

    /**
     * Gets the value of the subset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the subset property.
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
     * @return
     *     The value of the subset property.
     */
    public List<String> getSubset() {
        if (subset == null) {
            subset = new ArrayList<>();
        }
        return this.subset;
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
    public SwOpenOutputChannelSnFRequest setDeliverPendingNotifyFileRequestHandle(String value) {
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
    public SwOpenOutputChannelSnFRequest setWindowSize(String value) {
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
    public SwOpenOutputChannelSnFRequest setEventEP(String value) {
        this.eventEP = value;
        return this;
    }

    /**
     * Gets the value of the protocolLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolLevel() {
        return protocolLevel;
    }

    /**
     * Sets the value of the protocolLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwOpenOutputChannelSnFRequest setProtocolLevel(String value) {
        this.protocolLevel = value;
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
    public SwOpenOutputChannelSnFRequest addSubset(String subset) {
        getSubset().add(subset);
        return this;
    }

}
