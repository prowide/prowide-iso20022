
package com.prowidesoftware.swift.model.mx.dic;

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
 * Provides information on data related to the notification that is being sent separately to the message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedNotificationData1", propOrder = {
    "ntfctnId",
    "lctn"
})
public class RelatedNotificationData1 {

    @XmlElement(name = "NtfctnId")
    protected String ntfctnId;
    @XmlElement(name = "Lctn")
    protected List<NotificationLocationData1> lctn;

    /**
     * Gets the value of the ntfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtfctnId() {
        return ntfctnId;
    }

    /**
     * Sets the value of the ntfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RelatedNotificationData1 setNtfctnId(String value) {
        this.ntfctnId = value;
        return this;
    }

    /**
     * Gets the value of the lctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotificationLocationData1 }
     * 
     * 
     */
    public List<NotificationLocationData1> getLctn() {
        if (lctn == null) {
            lctn = new ArrayList<NotificationLocationData1>();
        }
        return this.lctn;
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
     * Adds a new item to the lctn list.
     * @see #getLctn()
     * 
     */
    public RelatedNotificationData1 addLctn(NotificationLocationData1 lctn) {
        getLctn().add(lctn);
        return this;
    }

}
