
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information about the journey before or after the rental.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JourneyInformation1", propOrder = {
    "jrnyTp",
    "jrnyData",
    "dtAndTm"
})
public class JourneyInformation1 {

    @XmlElement(name = "JrnyTp")
    @XmlSchemaType(name = "string")
    protected JourneyType1Code jrnyTp;
    @XmlElement(name = "JrnyData")
    protected String jrnyData;
    @XmlElement(name = "DtAndTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtAndTm;

    /**
     * Gets the value of the jrnyTp property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyType1Code }
     *     
     */
    public JourneyType1Code getJrnyTp() {
        return jrnyTp;
    }

    /**
     * Sets the value of the jrnyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyType1Code }
     *     
     */
    public JourneyInformation1 setJrnyTp(JourneyType1Code value) {
        this.jrnyTp = value;
        return this;
    }

    /**
     * Gets the value of the jrnyData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJrnyData() {
        return jrnyData;
    }

    /**
     * Sets the value of the jrnyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public JourneyInformation1 setJrnyData(String value) {
        this.jrnyData = value;
        return this;
    }

    /**
     * Gets the value of the dtAndTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getDtAndTm() {
        return dtAndTm;
    }

    /**
     * Sets the value of the dtAndTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public JourneyInformation1 setDtAndTm(XMLGregorianCalendar value) {
        this.dtAndTm = value;
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
