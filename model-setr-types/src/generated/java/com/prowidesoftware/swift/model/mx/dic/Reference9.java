
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
 * Additional references linked to the order cancel request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reference9", propOrder = {
    "orgnlClntOrdrId",
    "ordrId",
    "orgnlOrdrModTm"
})
public class Reference9 {

    @XmlElement(name = "OrgnlClntOrdrId", required = true)
    protected String orgnlClntOrdrId;
    @XmlElement(name = "OrdrId")
    protected String ordrId;
    @XmlElement(name = "OrgnlOrdrModTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar orgnlOrdrModTm;

    /**
     * Gets the value of the orgnlClntOrdrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlClntOrdrId() {
        return orgnlClntOrdrId;
    }

    /**
     * Sets the value of the orgnlClntOrdrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference9 setOrgnlClntOrdrId(String value) {
        this.orgnlClntOrdrId = value;
        return this;
    }

    /**
     * Gets the value of the ordrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdrId() {
        return ordrId;
    }

    /**
     * Sets the value of the ordrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference9 setOrdrId(String value) {
        this.ordrId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlOrdrModTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getOrgnlOrdrModTm() {
        return orgnlOrdrModTm;
    }

    /**
     * Sets the value of the orgnlOrdrModTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference9 setOrgnlOrdrModTm(Calendar value) {
        this.orgnlOrdrModTm = value;
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
