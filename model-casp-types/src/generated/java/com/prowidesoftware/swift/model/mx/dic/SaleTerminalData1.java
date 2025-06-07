
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
 * Information related to the software and hardware feature of the Sale Terminal.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaleTerminalData1", propOrder = {
    "termnlEnvt",
    "saleRcncltnId"
})
public class SaleTerminalData1 {

    @XmlElement(name = "TermnlEnvt")
    @XmlSchemaType(name = "string")
    protected AttendanceContext1Code termnlEnvt;
    @XmlElement(name = "SaleRcncltnId")
    protected String saleRcncltnId;

    /**
     * Gets the value of the termnlEnvt property.
     * 
     * @return
     *     possible object is
     *     {@link AttendanceContext1Code }
     *     
     */
    public AttendanceContext1Code getTermnlEnvt() {
        return termnlEnvt;
    }

    /**
     * Sets the value of the termnlEnvt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttendanceContext1Code }
     *     
     */
    public SaleTerminalData1 setTermnlEnvt(AttendanceContext1Code value) {
        this.termnlEnvt = value;
        return this;
    }

    /**
     * Gets the value of the saleRcncltnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleRcncltnId() {
        return saleRcncltnId;
    }

    /**
     * Sets the value of the saleRcncltnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SaleTerminalData1 setSaleRcncltnId(String value) {
        this.saleRcncltnId = value;
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
