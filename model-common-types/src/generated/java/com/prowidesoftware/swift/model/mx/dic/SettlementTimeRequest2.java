
package com.prowidesoftware.swift.model.mx.dic;

import java.util.Calendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoTimeAdapter;
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
 * Provides information on the requested settlement time(s) of the payment instruction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementTimeRequest2", propOrder = {
    "clsTm",
    "tillTm",
    "frTm",
    "rjctTm"
})
public class SettlementTimeRequest2 {

    @XmlElement(name = "CLSTm", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected Calendar clsTm;
    @XmlElement(name = "TillTm", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected Calendar tillTm;
    @XmlElement(name = "FrTm", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected Calendar frTm;
    @XmlElement(name = "RjctTm", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected Calendar rjctTm;

    /**
     * Gets the value of the clsTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getCLSTm() {
        return clsTm;
    }

    /**
     * Sets the value of the clsTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementTimeRequest2 setCLSTm(Calendar value) {
        this.clsTm = value;
        return this;
    }

    /**
     * Gets the value of the tillTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getTillTm() {
        return tillTm;
    }

    /**
     * Sets the value of the tillTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementTimeRequest2 setTillTm(Calendar value) {
        this.tillTm = value;
        return this;
    }

    /**
     * Gets the value of the frTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getFrTm() {
        return frTm;
    }

    /**
     * Sets the value of the frTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementTimeRequest2 setFrTm(Calendar value) {
        this.frTm = value;
        return this;
    }

    /**
     * Gets the value of the rjctTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getRjctTm() {
        return rjctTm;
    }

    /**
     * Sets the value of the rjctTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementTimeRequest2 setRjctTm(Calendar value) {
        this.rjctTm = value;
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
