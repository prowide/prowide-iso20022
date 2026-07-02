
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
 * Set of elements used to uniquely and unambiguously identify a financial institution or a branch of a financial institution.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BranchAndFinancialInstitutionIdentification4", propOrder = {
    "finInstnId",
    "brnchId"
})
public class BranchAndFinancialInstitutionIdentification4 {

    @XmlElement(name = "FinInstnId", required = true)
    protected FinancialInstitutionIdentification7 finInstnId;
    @XmlElement(name = "BrnchId")
    protected BranchData2 brnchId;

    /**
     * Gets the value of the finInstnId property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification7 }
     *     
     */
    public FinancialInstitutionIdentification7 getFinInstnId() {
        return finInstnId;
    }

    /**
     * Sets the value of the finInstnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification7 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification4 setFinInstnId(FinancialInstitutionIdentification7 value) {
        this.finInstnId = value;
        return this;
    }

    /**
     * Gets the value of the brnchId property.
     * 
     * @return
     *     possible object is
     *     {@link BranchData2 }
     *     
     */
    public BranchData2 getBrnchId() {
        return brnchId;
    }

    /**
     * Sets the value of the brnchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchData2 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification4 setBrnchId(BranchData2 value) {
        this.brnchId = value;
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
