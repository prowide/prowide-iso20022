
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
 * Information regarding the dissemination of data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisseminationData1", propOrder = {
    "dssmntnIdr",
    "orgnlDssmntnIdr",
    "tmStmp"
})
public class DisseminationData1 {

    @XmlElement(name = "DssmntnIdr", required = true)
    protected String dssmntnIdr;
    @XmlElement(name = "OrgnlDssmntnIdr")
    protected String orgnlDssmntnIdr;
    @XmlElement(name = "TmStmp", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime tmStmp;

    /**
     * Gets the value of the dssmntnIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDssmntnIdr() {
        return dssmntnIdr;
    }

    /**
     * Sets the value of the dssmntnIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DisseminationData1 setDssmntnIdr(String value) {
        this.dssmntnIdr = value;
        return this;
    }

    /**
     * Gets the value of the orgnlDssmntnIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlDssmntnIdr() {
        return orgnlDssmntnIdr;
    }

    /**
     * Sets the value of the orgnlDssmntnIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DisseminationData1 setOrgnlDssmntnIdr(String value) {
        this.orgnlDssmntnIdr = value;
        return this;
    }

    /**
     * Gets the value of the tmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getTmStmp() {
        return tmStmp;
    }

    /**
     * Sets the value of the tmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DisseminationData1 setTmStmp(OffsetDateTime value) {
        this.tmStmp = value;
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
