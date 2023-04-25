
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
 * Changes in the schedule.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleChangeDetails1", propOrder = {
    "schdlChngFctvDt",
    "schdlNtry"
})
public class ScheduleChangeDetails1 {

    @XmlElement(name = "SchdlChngFctvDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar schdlChngFctvDt;
    @XmlElement(name = "SchdlNtry", required = true)
    protected List<ScheduleChangeEntry1> schdlNtry;

    /**
     * Gets the value of the schdlChngFctvDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getSchdlChngFctvDt() {
        return schdlChngFctvDt;
    }

    /**
     * Sets the value of the schdlChngFctvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ScheduleChangeDetails1 setSchdlChngFctvDt(Calendar value) {
        this.schdlChngFctvDt = value;
        return this;
    }

    /**
     * Gets the value of the schdlNtry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the schdlNtry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchdlNtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScheduleChangeEntry1 }
     * 
     * 
     * @return
     *     The value of the schdlNtry property.
     */
    public List<ScheduleChangeEntry1> getSchdlNtry() {
        if (schdlNtry == null) {
            schdlNtry = new ArrayList<>();
        }
        return this.schdlNtry;
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
     * Adds a new item to the schdlNtry list.
     * @see #getSchdlNtry()
     * 
     */
    public ScheduleChangeDetails1 addSchdlNtry(ScheduleChangeEntry1 schdlNtry) {
        getSchdlNtry().add(schdlNtry);
        return this;
    }

}
