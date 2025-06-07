
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
 * Choice between a code or a proprietary code for the underlying master agreement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgreementFramework1Choice", propOrder = {
    "agrmtFrmwk",
    "prtryId"
})
public class AgreementFramework1Choice {

    @XmlElement(name = "AgrmtFrmwk")
    @XmlSchemaType(name = "string")
    protected AgreementFramework1Code agrmtFrmwk;
    @XmlElement(name = "PrtryId")
    protected GenericIdentification30 prtryId;

    /**
     * Gets the value of the agrmtFrmwk property.
     * 
     * @return
     *     possible object is
     *     {@link AgreementFramework1Code }
     *     
     */
    public AgreementFramework1Code getAgrmtFrmwk() {
        return agrmtFrmwk;
    }

    /**
     * Sets the value of the agrmtFrmwk property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreementFramework1Code }
     *     
     */
    public AgreementFramework1Choice setAgrmtFrmwk(AgreementFramework1Code value) {
        this.agrmtFrmwk = value;
        return this;
    }

    /**
     * Gets the value of the prtryId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getPrtryId() {
        return prtryId;
    }

    /**
     * Sets the value of the prtryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public AgreementFramework1Choice setPrtryId(GenericIdentification30 value) {
        this.prtryId = value;
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
