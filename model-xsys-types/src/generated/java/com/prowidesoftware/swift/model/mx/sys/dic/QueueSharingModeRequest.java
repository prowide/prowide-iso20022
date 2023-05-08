
package com.prowidesoftware.swift.model.mx.sys.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for QueueSharingModeRequest complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueueSharingModeRequest", propOrder = {
    "queue",
    "shrMd"
})
public class QueueSharingModeRequest {

    @XmlElement(name = "Queue", namespace = "urn:swift:snl:ns.SwInt", required = true)
    protected String queue;
    @XmlElement(name = "ShrMd", required = true)
    @XmlSchemaType(name = "string")
    protected SharingMode shrMd;

    /**
     * Queue
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
    public QueueSharingModeRequest setQueue(String value) {
        this.queue = value;
        return this;
    }

    /**
     * Gets the value of the shrMd property.
     * 
     * @return
     *     possible object is
     *     {@link SharingMode }
     *     
     */
    public SharingMode getShrMd() {
        return shrMd;
    }

    /**
     * Sets the value of the shrMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharingMode }
     *     
     */
    public QueueSharingModeRequest setShrMd(SharingMode value) {
        this.shrMd = value;
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
