
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
 * Choice between details of missing information or the complete set of available information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnableToApplyJustificationChoice", propOrder = {
    "anyInf",
    "mssngOrIncrrctInf"
})
public class UnableToApplyJustificationChoice {

    @XmlElement(name = "AnyInf")
    protected Boolean anyInf;
    @XmlElement(name = "MssngOrIncrrctInf")
    protected MissingOrIncorrectInformation mssngOrIncrrctInf;

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
    public UnableToApplyJustificationChoice setAnyInf(Boolean value) {
        this.anyInf = value;
        return this;
    }

    /**
     * Gets the value of the mssngOrIncrrctInf property.
     * 
     * @return
     *     possible object is
     *     {@link MissingOrIncorrectInformation }
     *     
     */
    public MissingOrIncorrectInformation getMssngOrIncrrctInf() {
        return mssngOrIncrrctInf;
    }

    /**
     * Sets the value of the mssngOrIncrrctInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link MissingOrIncorrectInformation }
     *     
     */
    public UnableToApplyJustificationChoice setMssngOrIncrrctInf(MissingOrIncorrectInformation value) {
        this.mssngOrIncrrctInf = value;
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
