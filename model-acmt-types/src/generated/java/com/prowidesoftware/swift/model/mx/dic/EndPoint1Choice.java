
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
 * Choice of either the last payment date or the number of payments to make. 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndPoint1Choice", propOrder = {
    "nbOfPmts",
    "lastPmtDt"
})
public class EndPoint1Choice {

    @XmlElement(name = "NbOfPmts")
    protected String nbOfPmts;
    @XmlElement(name = "LastPmtDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate lastPmtDt;

    /**
     * Gets the value of the nbOfPmts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfPmts() {
        return nbOfPmts;
    }

    /**
     * Sets the value of the nbOfPmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EndPoint1Choice setNbOfPmts(String value) {
        this.nbOfPmts = value;
        return this;
    }

    /**
     * Gets the value of the lastPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getLastPmtDt() {
        return lastPmtDt;
    }

    /**
     * Sets the value of the lastPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EndPoint1Choice setLastPmtDt(LocalDate value) {
        this.lastPmtDt = value;
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
