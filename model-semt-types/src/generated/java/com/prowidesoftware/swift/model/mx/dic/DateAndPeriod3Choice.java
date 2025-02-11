
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice between a date and period.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateAndPeriod3Choice", propOrder = {
    "stmtDt",
    "stmtPrd"
})
public class DateAndPeriod3Choice {

    @XmlElement(name = "StmtDt")
    protected DateAndDateTime2Choice stmtDt;
    @XmlElement(name = "StmtPrd")
    protected Period7Choice stmtPrd;

    /**
     * Gets the value of the stmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getStmtDt() {
        return stmtDt;
    }

    /**
     * Sets the value of the stmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndPeriod3Choice setStmtDt(DateAndDateTime2Choice value) {
        this.stmtDt = value;
        return this;
    }

    /**
     * Gets the value of the stmtPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period7Choice }
     *     
     */
    public Period7Choice getStmtPrd() {
        return stmtPrd;
    }

    /**
     * Sets the value of the stmtPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period7Choice }
     *     
     */
    public DateAndPeriod3Choice setStmtPrd(Period7Choice value) {
        this.stmtPrd = value;
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
