
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "DateAndPeriod1Choice__1", propOrder = {
    "stmtDt",
    "stmtPrd"
})
public class DateAndPeriod1Choice1 {

    @XmlElement(name = "StmtDt")
    protected DateAndDateTimeChoice1Draft stmtDt;
    @XmlElement(name = "StmtPrd")
    protected Period2Choice1 stmtPrd;

    /**
     * Gets the value of the stmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice1Draft }
     *     
     */
    public DateAndDateTimeChoice1Draft getStmtDt() {
        return stmtDt;
    }

    /**
     * Sets the value of the stmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice1Draft }
     *     
     */
    public DateAndPeriod1Choice1 setStmtDt(DateAndDateTimeChoice1Draft value) {
        this.stmtDt = value;
        return this;
    }

    /**
     * Gets the value of the stmtPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period2Choice1 }
     *     
     */
    public Period2Choice1 getStmtPrd() {
        return stmtPrd;
    }

    /**
     * Sets the value of the stmtPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period2Choice1 }
     *     
     */
    public DateAndPeriod1Choice1 setStmtPrd(Period2Choice1 value) {
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
