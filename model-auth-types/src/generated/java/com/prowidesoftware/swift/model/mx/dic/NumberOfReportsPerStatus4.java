
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
 * Number of reports per status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberOfReportsPerStatus4", propOrder = {
    "dtldNbOfRpts",
    "dtldSts"
})
public class NumberOfReportsPerStatus4 {

    @XmlElement(name = "DtldNbOfRpts", required = true)
    protected String dtldNbOfRpts;
    @XmlElement(name = "DtldSts", required = true)
    @XmlSchemaType(name = "string")
    protected PairedReconciled3Code dtldSts;

    /**
     * Gets the value of the dtldNbOfRpts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtldNbOfRpts() {
        return dtldNbOfRpts;
    }

    /**
     * Sets the value of the dtldNbOfRpts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NumberOfReportsPerStatus4 setDtldNbOfRpts(String value) {
        this.dtldNbOfRpts = value;
        return this;
    }

    /**
     * Gets the value of the dtldSts property.
     * 
     * @return
     *     possible object is
     *     {@link PairedReconciled3Code }
     *     
     */
    public PairedReconciled3Code getDtldSts() {
        return dtldSts;
    }

    /**
     * Sets the value of the dtldSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PairedReconciled3Code }
     *     
     */
    public NumberOfReportsPerStatus4 setDtldSts(PairedReconciled3Code value) {
        this.dtldSts = value;
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
