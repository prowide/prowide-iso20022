
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice between pre-defined and user-defined sorting criteria.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SortCriteria1Choice", propOrder = {
    "prdfnd",
    "usrDfnd"
})
public class SortCriteria1Choice {

    @XmlElement(name = "Prdfnd")
    @XmlSchemaType(name = "string")
    protected ReportSortedType1Code prdfnd;
    @XmlElement(name = "UsrDfnd")
    protected DataFormat1Choice usrDfnd;

    /**
     * Gets the value of the prdfnd property.
     * 
     * @return
     *     possible object is
     *     {@link ReportSortedType1Code }
     *     
     */
    public ReportSortedType1Code getPrdfnd() {
        return prdfnd;
    }

    /**
     * Sets the value of the prdfnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportSortedType1Code }
     *     
     */
    public SortCriteria1Choice setPrdfnd(ReportSortedType1Code value) {
        this.prdfnd = value;
        return this;
    }

    /**
     * Gets the value of the usrDfnd property.
     * 
     * @return
     *     possible object is
     *     {@link DataFormat1Choice }
     *     
     */
    public DataFormat1Choice getUsrDfnd() {
        return usrDfnd;
    }

    /**
     * Sets the value of the usrDfnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataFormat1Choice }
     *     
     */
    public SortCriteria1Choice setUsrDfnd(DataFormat1Choice value) {
        this.usrDfnd = value;
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
