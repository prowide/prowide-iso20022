
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
 * Additional data to be considered for risk assessment.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RiskInputData2", propOrder = {
    "nttyTp",
    "othrNttyTp",
    "tp",
    "val"
})
public class RiskInputData2 {

    @XmlElement(name = "NttyTp")
    @XmlSchemaType(name = "string")
    protected PartyType28Code nttyTp;
    @XmlElement(name = "OthrNttyTp")
    protected String othrNttyTp;
    @XmlElement(name = "Tp", required = true)
    protected String tp;
    @XmlElement(name = "Val", required = true)
    protected String val;

    /**
     * Gets the value of the nttyTp property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType28Code }
     *     
     */
    public PartyType28Code getNttyTp() {
        return nttyTp;
    }

    /**
     * Sets the value of the nttyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType28Code }
     *     
     */
    public RiskInputData2 setNttyTp(PartyType28Code value) {
        this.nttyTp = value;
        return this;
    }

    /**
     * Gets the value of the othrNttyTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrNttyTp() {
        return othrNttyTp;
    }

    /**
     * Sets the value of the othrNttyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RiskInputData2 setOthrNttyTp(String value) {
        this.othrNttyTp = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RiskInputData2 setTp(String value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RiskInputData2 setVal(String value) {
        this.val = value;
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
