
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
 * Additional references linked to the order modification request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reference10", propOrder = {
    "orgnlClntOrdrId",
    "orgnlOrdrModTm"
})
public class Reference10 {

    @XmlElement(name = "OrgnlClntOrdrId", required = true)
    protected String orgnlClntOrdrId;
    @XmlElement(name = "OrgnlOrdrModTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime orgnlOrdrModTm;

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
    public Reference10 setOrgnlClntOrdrId(String value) {
        this.orgnlClntOrdrId = value;
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
    public OffsetDateTime getOrgnlOrdrModTm() {
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
    public Reference10 setOrgnlOrdrModTm(OffsetDateTime value) {
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
