
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details about the schedule change.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleChangeEntry1", propOrder = {
    "schdlEvtTp",
    "schdlEvtId",
    "evtFrqcy",
    "evtPrvsFrqcy",
    "evtTm",
    "evtPrvsTm",
    "evtDrtn",
    "evtPrvsDrtn",
    "chngTp"
})
public class ScheduleChangeEntry1 {

    @XmlElement(name = "SchdlEvtTp", required = true)
    protected SystemEventType2Choice schdlEvtTp;
    @XmlElement(name = "SchdlEvtId")
    protected String schdlEvtId;
    @XmlElement(name = "EvtFrqcy")
    protected String evtFrqcy;
    @XmlElement(name = "EvtPrvsFrqcy")
    protected String evtPrvsFrqcy;
    @XmlElement(name = "EvtTm")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar evtTm;
    @XmlElement(name = "EvtPrvsTm")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar evtPrvsTm;
    @XmlElement(name = "EvtDrtn")
    protected String evtDrtn;
    @XmlElement(name = "EvtPrvsDrtn")
    protected String evtPrvsDrtn;
    @XmlElement(name = "ChngTp", required = true)
    protected String chngTp;

    /**
     * Gets the value of the schdlEvtTp property.
     * 
     * @return
     *     possible object is
     *     {@link SystemEventType2Choice }
     *     
     */
    public SystemEventType2Choice getSchdlEvtTp() {
        return schdlEvtTp;
    }

    /**
     * Sets the value of the schdlEvtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemEventType2Choice }
     *     
     */
    public ScheduleChangeEntry1 setSchdlEvtTp(SystemEventType2Choice value) {
        this.schdlEvtTp = value;
        return this;
    }

    /**
     * Gets the value of the schdlEvtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchdlEvtId() {
        return schdlEvtId;
    }

    /**
     * Sets the value of the schdlEvtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ScheduleChangeEntry1 setSchdlEvtId(String value) {
        this.schdlEvtId = value;
        return this;
    }

    /**
     * Gets the value of the evtFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtFrqcy() {
        return evtFrqcy;
    }

    /**
     * Sets the value of the evtFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ScheduleChangeEntry1 setEvtFrqcy(String value) {
        this.evtFrqcy = value;
        return this;
    }

    /**
     * Gets the value of the evtPrvsFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtPrvsFrqcy() {
        return evtPrvsFrqcy;
    }

    /**
     * Sets the value of the evtPrvsFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ScheduleChangeEntry1 setEvtPrvsFrqcy(String value) {
        this.evtPrvsFrqcy = value;
        return this;
    }

    /**
     * Gets the value of the evtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEvtTm() {
        return evtTm;
    }

    /**
     * Sets the value of the evtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public ScheduleChangeEntry1 setEvtTm(XMLGregorianCalendar value) {
        this.evtTm = value;
        return this;
    }

    /**
     * Gets the value of the evtPrvsTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEvtPrvsTm() {
        return evtPrvsTm;
    }

    /**
     * Sets the value of the evtPrvsTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public ScheduleChangeEntry1 setEvtPrvsTm(XMLGregorianCalendar value) {
        this.evtPrvsTm = value;
        return this;
    }

    /**
     * Gets the value of the evtDrtn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtDrtn() {
        return evtDrtn;
    }

    /**
     * Sets the value of the evtDrtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ScheduleChangeEntry1 setEvtDrtn(String value) {
        this.evtDrtn = value;
        return this;
    }

    /**
     * Gets the value of the evtPrvsDrtn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtPrvsDrtn() {
        return evtPrvsDrtn;
    }

    /**
     * Sets the value of the evtPrvsDrtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ScheduleChangeEntry1 setEvtPrvsDrtn(String value) {
        this.evtPrvsDrtn = value;
        return this;
    }

    /**
     * Gets the value of the chngTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChngTp() {
        return chngTp;
    }

    /**
     * Sets the value of the chngTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ScheduleChangeEntry1 setChngTp(String value) {
        this.chngTp = value;
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
