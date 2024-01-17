
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
 * Choice of mandate related information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MandateRelatedData1Choice", propOrder = {
    "drctDbtMndt",
    "cdtTrfMndt"
})
public class MandateRelatedData1Choice {

    @XmlElement(name = "DrctDbtMndt")
    protected MandateRelatedInformation14 drctDbtMndt;
    @XmlElement(name = "CdtTrfMndt")
    protected CreditTransferMandateData1 cdtTrfMndt;

    /**
     * Gets the value of the drctDbtMndt property.
     * 
     * @return
     *     possible object is
     *     {@link MandateRelatedInformation14 }
     *     
     */
    public MandateRelatedInformation14 getDrctDbtMndt() {
        return drctDbtMndt;
    }

    /**
     * Sets the value of the drctDbtMndt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateRelatedInformation14 }
     *     
     */
    public MandateRelatedData1Choice setDrctDbtMndt(MandateRelatedInformation14 value) {
        this.drctDbtMndt = value;
        return this;
    }

    /**
     * Gets the value of the cdtTrfMndt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditTransferMandateData1 }
     *     
     */
    public CreditTransferMandateData1 getCdtTrfMndt() {
        return cdtTrfMndt;
    }

    /**
     * Sets the value of the cdtTrfMndt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditTransferMandateData1 }
     *     
     */
    public MandateRelatedData1Choice setCdtTrfMndt(CreditTransferMandateData1 value) {
        this.cdtTrfMndt = value;
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
