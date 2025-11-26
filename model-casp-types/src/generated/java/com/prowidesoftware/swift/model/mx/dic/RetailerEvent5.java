
package com.prowidesoftware.swift.model.mx.dic;

import java.time.OffsetDateTime;
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
 * Specifies all information related to an event.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetailerEvent5", propOrder = {
    "evtTmStmp",
    "evtToNtfy",
    "evtCntxt",
    "addtlEvtInf"
})
public class RetailerEvent5 {

    @XmlElement(name = "EvtTmStmp", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime evtTmStmp;
    @XmlElement(name = "EvtToNtfy", required = true)
    @XmlSchemaType(name = "string")
    protected EventToNotify2Code evtToNtfy;
    @XmlElement(name = "EvtCntxt")
    protected EventContext5 evtCntxt;
    @XmlElement(name = "AddtlEvtInf")
    protected String addtlEvtInf;

    /**
     * Gets the value of the evtTmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getEvtTmStmp() {
        return evtTmStmp;
    }

    /**
     * Sets the value of the evtTmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RetailerEvent5 setEvtTmStmp(OffsetDateTime value) {
        this.evtTmStmp = value;
        return this;
    }

    /**
     * Gets the value of the evtToNtfy property.
     * 
     * @return
     *     possible object is
     *     {@link EventToNotify2Code }
     *     
     */
    public EventToNotify2Code getEvtToNtfy() {
        return evtToNtfy;
    }

    /**
     * Sets the value of the evtToNtfy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventToNotify2Code }
     *     
     */
    public RetailerEvent5 setEvtToNtfy(EventToNotify2Code value) {
        this.evtToNtfy = value;
        return this;
    }

    /**
     * Gets the value of the evtCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link EventContext5 }
     *     
     */
    public EventContext5 getEvtCntxt() {
        return evtCntxt;
    }

    /**
     * Sets the value of the evtCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventContext5 }
     *     
     */
    public RetailerEvent5 setEvtCntxt(EventContext5 value) {
        this.evtCntxt = value;
        return this;
    }

    /**
     * Gets the value of the addtlEvtInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlEvtInf() {
        return addtlEvtInf;
    }

    /**
     * Sets the value of the addtlEvtInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RetailerEvent5 setAddtlEvtInf(String value) {
        this.addtlEvtInf = value;
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
