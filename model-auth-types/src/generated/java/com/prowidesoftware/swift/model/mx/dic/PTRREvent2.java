
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
 * Information if contract results from a post trade risk reduction operation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTRREvent2", propOrder = {
    "tchnq",
    "svcPrvdr"
})
public class PTRREvent2 {

    @XmlElement(name = "Tchnq", required = true)
    @XmlSchemaType(name = "string")
    protected RiskReductionService1Code tchnq;
    @XmlElement(name = "SvcPrvdr")
    protected OrganisationIdentification15Choice svcPrvdr;

    /**
     * Gets the value of the tchnq property.
     * 
     * @return
     *     possible object is
     *     {@link RiskReductionService1Code }
     *     
     */
    public RiskReductionService1Code getTchnq() {
        return tchnq;
    }

    /**
     * Sets the value of the tchnq property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskReductionService1Code }
     *     
     */
    public PTRREvent2 setTchnq(RiskReductionService1Code value) {
        this.tchnq = value;
        return this;
    }

    /**
     * Gets the value of the svcPrvdr property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getSvcPrvdr() {
        return svcPrvdr;
    }

    /**
     * Sets the value of the svcPrvdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public PTRREvent2 setSvcPrvdr(OrganisationIdentification15Choice value) {
        this.svcPrvdr = value;
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
