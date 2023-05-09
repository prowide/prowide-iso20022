
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
 * Instructs the POI (Point Of Interaction) how to contact the host of the terminal management system (TMS), to initiate the maintenance of the terminal.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMSTrigger1", propOrder = {
    "tmsCtctLvl",
    "tmsId",
    "tmsCtctDtTm"
})
public class TMSTrigger1 {

    @XmlElement(name = "TMSCtctLvl", required = true)
    @XmlSchemaType(name = "string")
    protected TMSContactLevel1Code tmsCtctLvl;
    @XmlElement(name = "TMSId")
    protected String tmsId;
    @XmlElement(name = "TMSCtctDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime tmsCtctDtTm;

    /**
     * Gets the value of the tmsCtctLvl property.
     * 
     * @return
     *     possible object is
     *     {@link TMSContactLevel1Code }
     *     
     */
    public TMSContactLevel1Code getTMSCtctLvl() {
        return tmsCtctLvl;
    }

    /**
     * Sets the value of the tmsCtctLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link TMSContactLevel1Code }
     *     
     */
    public TMSTrigger1 setTMSCtctLvl(TMSContactLevel1Code value) {
        this.tmsCtctLvl = value;
        return this;
    }

    /**
     * Gets the value of the tmsId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMSId() {
        return tmsId;
    }

    /**
     * Sets the value of the tmsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TMSTrigger1 setTMSId(String value) {
        this.tmsId = value;
        return this;
    }

    /**
     * Gets the value of the tmsCtctDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getTMSCtctDtTm() {
        return tmsCtctDtTm;
    }

    /**
     * Sets the value of the tmsCtctDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TMSTrigger1 setTMSCtctDtTm(OffsetDateTime value) {
        this.tmsCtctDtTm = value;
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
