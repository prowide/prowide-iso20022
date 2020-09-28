
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
 * BranchAndFinancialInstitutionIdentificationSEPA2_DFU1
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BranchAndFinancialInstitutionIdentificationSEPA2_DFU1", propOrder = {
    "finInstnId"
})
public class BranchAndFinancialInstitutionIdentificationSEPA2DFU1 {

    @XmlElement(name = "FinInstnId", required = true)
    protected FinancialInstitutionIdentificationSEPA2DFU1 finInstnId;

    /**
     * Gets the value of the finInstnId property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentificationSEPA2DFU1 }
     *     
     */
    public FinancialInstitutionIdentificationSEPA2DFU1 getFinInstnId() {
        return finInstnId;
    }

    /**
     * Sets the value of the finInstnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentificationSEPA2DFU1 }
     *     
     */
    public BranchAndFinancialInstitutionIdentificationSEPA2DFU1 setFinInstnId(FinancialInstitutionIdentificationSEPA2DFU1 value) {
        this.finInstnId = value;
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
