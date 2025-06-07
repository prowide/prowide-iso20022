
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
 * Identifies the future status of the transaction by means of a code
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionStatus6", propOrder = {
    "cvrgSts",
    "exctnSts"
})
public class TransactionStatus6 {

    @XmlElement(name = "CvrgSts")
    @XmlSchemaType(name = "string")
    protected CollateralStatus1Code cvrgSts;
    @XmlElement(name = "ExctnSts")
    protected CollateralStatus2Choice exctnSts;

    /**
     * Gets the value of the cvrgSts property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralStatus1Code }
     *     
     */
    public CollateralStatus1Code getCvrgSts() {
        return cvrgSts;
    }

    /**
     * Sets the value of the cvrgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralStatus1Code }
     *     
     */
    public TransactionStatus6 setCvrgSts(CollateralStatus1Code value) {
        this.cvrgSts = value;
        return this;
    }

    /**
     * Gets the value of the exctnSts property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralStatus2Choice }
     *     
     */
    public CollateralStatus2Choice getExctnSts() {
        return exctnSts;
    }

    /**
     * Sets the value of the exctnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralStatus2Choice }
     *     
     */
    public TransactionStatus6 setExctnSts(CollateralStatus2Choice value) {
        this.exctnSts = value;
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
