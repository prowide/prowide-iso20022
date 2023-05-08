
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
 * Assessment of securities credit and investment risk.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rating1", propOrder = {
    "ratgSchme",
    "valDt",
    "valId"
})
public class Rating1 {

    @XmlElement(name = "RatgSchme", required = true)
    protected String ratgSchme;
    @XmlElement(name = "ValDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar valDt;
    @XmlElement(name = "ValId", required = true)
    protected String valId;

    /**
     * Gets the value of the ratgSchme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatgSchme() {
        return ratgSchme;
    }

    /**
     * Sets the value of the ratgSchme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Rating1 setRatgSchme(String value) {
        this.ratgSchme = value;
        return this;
    }

    /**
     * Gets the value of the valDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getValDt() {
        return valDt;
    }

    /**
     * Sets the value of the valDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Rating1 setValDt(Calendar value) {
        this.valDt = value;
        return this;
    }

    /**
     * Gets the value of the valId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValId() {
        return valId;
    }

    /**
     * Sets the value of the valId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Rating1 setValId(String value) {
        this.valId = value;
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
