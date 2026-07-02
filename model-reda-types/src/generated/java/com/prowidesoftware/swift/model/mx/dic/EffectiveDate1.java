
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Date and date parameters.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EffectiveDate1", propOrder = {
    "fctvDt",
    "fctvDtParam"
})
public class EffectiveDate1 {

    @XmlElement(name = "FctvDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fctvDt;
    @XmlElement(name = "FctvDtParam")
    protected String fctvDtParam;

    /**
     * Gets the value of the fctvDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getFctvDt() {
        return fctvDt;
    }

    /**
     * Sets the value of the fctvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EffectiveDate1 setFctvDt(XMLGregorianCalendar value) {
        this.fctvDt = value;
        return this;
    }

    /**
     * Gets the value of the fctvDtParam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFctvDtParam() {
        return fctvDtParam;
    }

    /**
     * Sets the value of the fctvDtParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EffectiveDate1 setFctvDtParam(String value) {
        this.fctvDtParam = value;
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
