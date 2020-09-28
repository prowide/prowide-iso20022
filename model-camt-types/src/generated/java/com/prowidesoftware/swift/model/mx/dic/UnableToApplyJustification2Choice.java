
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
 * Specifies the details of missing information or the complete set of available information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnableToApplyJustification2Choice", propOrder = {
    "anyInf",
    "mssngOrIncrrctInf",
    "pssblDplctInstr"
})
public class UnableToApplyJustification2Choice {

    @XmlElement(name = "AnyInf")
    protected Boolean anyInf;
    @XmlElement(name = "MssngOrIncrrctInf")
    protected MissingOrIncorrectInformation2 mssngOrIncrrctInf;
    @XmlElement(name = "PssblDplctInstr")
    protected Boolean pssblDplctInstr;

    /**
     * Gets the value of the anyInf property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnyInf() {
        return anyInf;
    }

    /**
     * Sets the value of the anyInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public UnableToApplyJustification2Choice setAnyInf(Boolean value) {
        this.anyInf = value;
        return this;
    }

    /**
     * Gets the value of the mssngOrIncrrctInf property.
     * 
     * @return
     *     possible object is
     *     {@link MissingOrIncorrectInformation2 }
     *     
     */
    public MissingOrIncorrectInformation2 getMssngOrIncrrctInf() {
        return mssngOrIncrrctInf;
    }

    /**
     * Sets the value of the mssngOrIncrrctInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link MissingOrIncorrectInformation2 }
     *     
     */
    public UnableToApplyJustification2Choice setMssngOrIncrrctInf(MissingOrIncorrectInformation2 value) {
        this.mssngOrIncrrctInf = value;
        return this;
    }

    /**
     * Gets the value of the pssblDplctInstr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPssblDplctInstr() {
        return pssblDplctInstr;
    }

    /**
     * Sets the value of the pssblDplctInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public UnableToApplyJustification2Choice setPssblDplctInstr(Boolean value) {
        this.pssblDplctInstr = value;
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
