
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information about the cancellation of a notification advice or the withdrawal of a CA event.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationCancellation1", propOrder = {
    "ntfctnCxlTp",
    "lkdAgtCANtfctnAdvcId"
})
public class NotificationCancellation1 {

    @XmlElement(name = "NtfctnCxlTp", required = true)
    @XmlSchemaType(name = "string")
    protected CorporateActionNotificationType2Code ntfctnCxlTp;
    @XmlElement(name = "LkdAgtCANtfctnAdvcId", required = true)
    protected DocumentIdentification8 lkdAgtCANtfctnAdvcId;

    /**
     * Gets the value of the ntfctnCxlTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNotificationType2Code }
     *     
     */
    public CorporateActionNotificationType2Code getNtfctnCxlTp() {
        return ntfctnCxlTp;
    }

    /**
     * Sets the value of the ntfctnCxlTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNotificationType2Code }
     *     
     */
    public NotificationCancellation1 setNtfctnCxlTp(CorporateActionNotificationType2Code value) {
        this.ntfctnCxlTp = value;
        return this;
    }

    /**
     * Gets the value of the lkdAgtCANtfctnAdvcId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getLkdAgtCANtfctnAdvcId() {
        return lkdAgtCANtfctnAdvcId;
    }

    /**
     * Sets the value of the lkdAgtCANtfctnAdvcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public NotificationCancellation1 setLkdAgtCANtfctnAdvcId(DocumentIdentification8 value) {
        this.lkdAgtCANtfctnAdvcId = value;
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
