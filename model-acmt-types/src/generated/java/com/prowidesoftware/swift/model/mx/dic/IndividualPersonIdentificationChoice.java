
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
 * Choice of identification of an individual person.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualPersonIdentificationChoice", propOrder = {
    "idNb",
    "prsnNm"
})
public class IndividualPersonIdentificationChoice {

    @XmlElement(name = "IdNb")
    protected GenericIdentification10 idNb;
    @XmlElement(name = "PrsnNm")
    protected IndividualPerson4 prsnNm;

    /**
     * Gets the value of the idNb property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification10 }
     *     
     */
    public GenericIdentification10 getIdNb() {
        return idNb;
    }

    /**
     * Sets the value of the idNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification10 }
     *     
     */
    public IndividualPersonIdentificationChoice setIdNb(GenericIdentification10 value) {
        this.idNb = value;
        return this;
    }

    /**
     * Gets the value of the prsnNm property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPerson4 }
     *     
     */
    public IndividualPerson4 getPrsnNm() {
        return prsnNm;
    }

    /**
     * Sets the value of the prsnNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPerson4 }
     *     
     */
    public IndividualPersonIdentificationChoice setPrsnNm(IndividualPerson4 value) {
        this.prsnNm = value;
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
