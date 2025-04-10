
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
 * Grace period applicable to an instalment plan.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GracePeriod2", propOrder = {
    "tm",
    "unitTp",
    "othrUnitTp",
    "cstmrSelctdGracePrd"
})
public class GracePeriod2 {

    @XmlElement(name = "Tm")
    protected String tm;
    @XmlElement(name = "UnitTp")
    @XmlSchemaType(name = "string")
    protected GracePeriodUnitType1Code unitTp;
    @XmlElement(name = "OthrUnitTp")
    protected String othrUnitTp;
    @XmlElement(name = "CstmrSelctdGracePrd")
    protected Boolean cstmrSelctdGracePrd;

    /**
     * Gets the value of the tm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTm() {
        return tm;
    }

    /**
     * Sets the value of the tm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public GracePeriod2 setTm(String value) {
        this.tm = value;
        return this;
    }

    /**
     * Gets the value of the unitTp property.
     * 
     * @return
     *     possible object is
     *     {@link GracePeriodUnitType1Code }
     *     
     */
    public GracePeriodUnitType1Code getUnitTp() {
        return unitTp;
    }

    /**
     * Sets the value of the unitTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GracePeriodUnitType1Code }
     *     
     */
    public GracePeriod2 setUnitTp(GracePeriodUnitType1Code value) {
        this.unitTp = value;
        return this;
    }

    /**
     * Gets the value of the othrUnitTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrUnitTp() {
        return othrUnitTp;
    }

    /**
     * Sets the value of the othrUnitTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public GracePeriod2 setOthrUnitTp(String value) {
        this.othrUnitTp = value;
        return this;
    }

    /**
     * Gets the value of the cstmrSelctdGracePrd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCstmrSelctdGracePrd() {
        return cstmrSelctdGracePrd;
    }

    /**
     * Sets the value of the cstmrSelctdGracePrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public GracePeriod2 setCstmrSelctdGracePrd(Boolean value) {
        this.cstmrSelctdGracePrd = value;
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
