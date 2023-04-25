
package com.prowidesoftware.swift.model.mx.dic;

import java.util.Calendar;
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
 * Describes the activities that took place during a certain period for one trade transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityDetails1", propOrder = {
    "dtTm",
    "actvty",
    "initr"
})
public class ActivityDetails1 {

    @XmlElement(name = "DtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar dtTm;
    @XmlElement(name = "Actvty", required = true)
    protected Activity1 actvty;
    @XmlElement(name = "Initr", required = true)
    protected BICIdentification1 initr;

    /**
     * Gets the value of the dtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDtTm() {
        return dtTm;
    }

    /**
     * Sets the value of the dtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ActivityDetails1 setDtTm(Calendar value) {
        this.dtTm = value;
        return this;
    }

    /**
     * Gets the value of the actvty property.
     * 
     * @return
     *     possible object is
     *     {@link Activity1 }
     *     
     */
    public Activity1 getActvty() {
        return actvty;
    }

    /**
     * Sets the value of the actvty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Activity1 }
     *     
     */
    public ActivityDetails1 setActvty(Activity1 value) {
        this.actvty = value;
        return this;
    }

    /**
     * Gets the value of the initr property.
     * 
     * @return
     *     possible object is
     *     {@link BICIdentification1 }
     *     
     */
    public BICIdentification1 getInitr() {
        return initr;
    }

    /**
     * Sets the value of the initr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BICIdentification1 }
     *     
     */
    public ActivityDetails1 setInitr(BICIdentification1 value) {
        this.initr = value;
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
