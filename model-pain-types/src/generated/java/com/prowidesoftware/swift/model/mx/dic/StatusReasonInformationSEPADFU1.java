
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
 * StatusReasonInformationSEPA_DFU1
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusReasonInformationSEPA_DFU1", propOrder = {
    "orgtr",
    "rsn"
})
public class StatusReasonInformationSEPADFU1 {

    @XmlElement(name = "Orgtr")
    protected PartyIdentificationSEPA6ChoiceDFU1 orgtr;
    @XmlElement(name = "Rsn")
    protected StatusReasonSEPADFU1 rsn;

    /**
     * Gets the value of the orgtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationSEPA6ChoiceDFU1 }
     *     
     */
    public PartyIdentificationSEPA6ChoiceDFU1 getOrgtr() {
        return orgtr;
    }

    /**
     * Sets the value of the orgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationSEPA6ChoiceDFU1 }
     *     
     */
    public StatusReasonInformationSEPADFU1 setOrgtr(PartyIdentificationSEPA6ChoiceDFU1 value) {
        this.orgtr = value;
        return this;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link StatusReasonSEPADFU1 }
     *     
     */
    public StatusReasonSEPADFU1 getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusReasonSEPADFU1 }
     *     
     */
    public StatusReasonInformationSEPADFU1 setRsn(StatusReasonSEPADFU1 value) {
        this.rsn = value;
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
