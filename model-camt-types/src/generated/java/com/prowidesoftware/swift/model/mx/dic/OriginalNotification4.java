
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Identify the original notification, to which the cancellation advice refers.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalNotification4", propOrder = {
    "orgnlMsgId",
    "orgnlCreDtTm",
    "orgnlNtfctnId",
    "ntfctnCxl",
    "orgnlNtfctnRef"
})
public class OriginalNotification4 {

    @XmlElement(name = "OrgnlMsgId", required = true)
    protected String orgnlMsgId;
    @XmlElement(name = "OrgnlCreDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar orgnlCreDtTm;
    @XmlElement(name = "OrgnlNtfctnId", required = true)
    protected String orgnlNtfctnId;
    @XmlElement(name = "NtfctnCxl")
    protected Boolean ntfctnCxl;
    @XmlElement(name = "OrgnlNtfctnRef")
    protected List<OriginalNotificationReference1> orgnlNtfctnRef;

    /**
     * Gets the value of the orgnlMsgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlMsgId() {
        return orgnlMsgId;
    }

    /**
     * Sets the value of the orgnlMsgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalNotification4 setOrgnlMsgId(String value) {
        this.orgnlMsgId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlCreDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getOrgnlCreDtTm() {
        return orgnlCreDtTm;
    }

    /**
     * Sets the value of the orgnlCreDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalNotification4 setOrgnlCreDtTm(Calendar value) {
        this.orgnlCreDtTm = value;
        return this;
    }

    /**
     * Gets the value of the orgnlNtfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlNtfctnId() {
        return orgnlNtfctnId;
    }

    /**
     * Sets the value of the orgnlNtfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalNotification4 setOrgnlNtfctnId(String value) {
        this.orgnlNtfctnId = value;
        return this;
    }

    /**
     * Gets the value of the ntfctnCxl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNtfctnCxl() {
        return ntfctnCxl;
    }

    /**
     * Sets the value of the ntfctnCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public OriginalNotification4 setNtfctnCxl(Boolean value) {
        this.ntfctnCxl = value;
        return this;
    }

    /**
     * Gets the value of the orgnlNtfctnRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the orgnlNtfctnRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrgnlNtfctnRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OriginalNotificationReference1 }
     * 
     * 
     * @return
     *     The value of the orgnlNtfctnRef property.
     */
    public List<OriginalNotificationReference1> getOrgnlNtfctnRef() {
        if (orgnlNtfctnRef == null) {
            orgnlNtfctnRef = new ArrayList<>();
        }
        return this.orgnlNtfctnRef;
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
     * Adds a new item to the orgnlNtfctnRef list.
     * @see #getOrgnlNtfctnRef()
     * 
     */
    public OriginalNotification4 addOrgnlNtfctnRef(OriginalNotificationReference1 orgnlNtfctnRef) {
        getOrgnlNtfctnRef().add(orgnlNtfctnRef);
        return this;
    }

}
