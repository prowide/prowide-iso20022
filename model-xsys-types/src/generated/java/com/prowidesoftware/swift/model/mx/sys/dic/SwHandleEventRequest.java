
package com.prowidesoftware.swift.model.mx.sys.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for HandleEventRequest complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HandleEventRequest", propOrder = {
    "eventEP",
    "eventResourceType",
    "eventResourceName",
    "eventTime",
    "snlId",
    "status"
})
public class SwHandleEventRequest {

    @XmlElement(name = "EventEP", required = true)
    protected String eventEP;
    @XmlElement(name = "EventResourceType", required = true)
    protected String eventResourceType;
    @XmlElement(name = "EventResourceName")
    protected String eventResourceName;
    @XmlElement(name = "EventTime", required = true)
    protected String eventTime;
    @XmlElement(name = "SNLId", namespace = "urn:swift:snl:ns.SwInt", required = true)
    protected String snlId;
    @XmlElement(name = "Status", namespace = "urn:swift:snl:ns.SwGbl", required = true)
    protected SwGblStatus status;

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
    public SwHandleEventRequest setEventEP(String value) {
        this.eventEP = value;
        return this;
    }

    /**
     * Gets the value of the eventResourceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventResourceType() {
        return eventResourceType;
    }

    /**
     * Sets the value of the eventResourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHandleEventRequest setEventResourceType(String value) {
        this.eventResourceType = value;
        return this;
    }

    /**
     * Gets the value of the eventResourceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventResourceName() {
        return eventResourceName;
    }

    /**
     * Sets the value of the eventResourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHandleEventRequest setEventResourceName(String value) {
        this.eventResourceName = value;
        return this;
    }

    /**
     * Gets the value of the eventTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventTime() {
        return eventTime;
    }

    /**
     * Sets the value of the eventTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHandleEventRequest setEventTime(String value) {
        this.eventTime = value;
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
    public SwHandleEventRequest setSNLId(String value) {
        this.snlId = value;
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
    public SwHandleEventRequest setStatus(SwGblStatus value) {
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

}
