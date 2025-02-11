
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
 * The status of an instruction, advice or request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepairReason1", propOrder = {
    "cd",
    "addtlRsnInf"
})
public class RepairReason1 {

    @XmlElement(name = "Cd", required = true)
    protected RepairReason1Choice cd;
    @XmlElement(name = "AddtlRsnInf")
    protected String addtlRsnInf;

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link RepairReason1Choice }
     *     
     */
    public RepairReason1Choice getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairReason1Choice }
     *     
     */
    public RepairReason1 setCd(RepairReason1Choice value) {
        this.cd = value;
        return this;
    }

    /**
     * Gets the value of the addtlRsnInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlRsnInf() {
        return addtlRsnInf;
    }

    /**
     * Sets the value of the addtlRsnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RepairReason1 setAddtlRsnInf(String value) {
        this.addtlRsnInf = value;
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
