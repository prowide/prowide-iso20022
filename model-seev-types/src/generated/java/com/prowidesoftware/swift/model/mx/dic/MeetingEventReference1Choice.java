
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice between a meeting event identification or a meeting event official identification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingEventReference1Choice", propOrder = {
    "lkdIssrMtgId",
    "lkdMtgId"
})
public class MeetingEventReference1Choice {

    @XmlElement(name = "LkdIssrMtgId")
    protected String lkdIssrMtgId;
    @XmlElement(name = "LkdMtgId")
    protected String lkdMtgId;

    /**
     * Gets the value of the lkdIssrMtgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLkdIssrMtgId() {
        return lkdIssrMtgId;
    }

    /**
     * Sets the value of the lkdIssrMtgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MeetingEventReference1Choice setLkdIssrMtgId(String value) {
        this.lkdIssrMtgId = value;
        return this;
    }

    /**
     * Gets the value of the lkdMtgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLkdMtgId() {
        return lkdMtgId;
    }

    /**
     * Sets the value of the lkdMtgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MeetingEventReference1Choice setLkdMtgId(String value) {
        this.lkdMtgId = value;
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
