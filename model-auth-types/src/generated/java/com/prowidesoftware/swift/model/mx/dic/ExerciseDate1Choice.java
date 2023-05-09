
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
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
 * Choice between a known exercise date and a pending date.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExerciseDate1Choice", propOrder = {
    "frstExrcDt",
    "pdgDtAplbl"
})
public class ExerciseDate1Choice {

    @XmlElement(name = "FrstExrcDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate frstExrcDt;
    @XmlElement(name = "PdgDtAplbl")
    @XmlSchemaType(name = "string")
    protected PriceStatus2Code pdgDtAplbl;

    /**
     * Gets the value of the frstExrcDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getFrstExrcDt() {
        return frstExrcDt;
    }

    /**
     * Sets the value of the frstExrcDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ExerciseDate1Choice setFrstExrcDt(LocalDate value) {
        this.frstExrcDt = value;
        return this;
    }

    /**
     * Gets the value of the pdgDtAplbl property.
     * 
     * @return
     *     possible object is
     *     {@link PriceStatus2Code }
     *     
     */
    public PriceStatus2Code getPdgDtAplbl() {
        return pdgDtAplbl;
    }

    /**
     * Sets the value of the pdgDtAplbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceStatus2Code }
     *     
     */
    public ExerciseDate1Choice setPdgDtAplbl(PriceStatus2Code value) {
        this.pdgDtAplbl = value;
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
