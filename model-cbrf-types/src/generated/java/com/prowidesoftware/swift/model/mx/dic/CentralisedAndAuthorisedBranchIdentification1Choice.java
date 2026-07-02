
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
 * Identifiers for the central and authorised branches.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CentralisedAndAuthorisedBranchIdentification1Choice", propOrder = {
    "authrsdBrnchIdr",
    "cntrldBrnchIdrs"
})
public class CentralisedAndAuthorisedBranchIdentification1Choice {

    @XmlElement(name = "AuthrsdBrnchIdr")
    protected FinancialInstitutionIdentification9 authrsdBrnchIdr;
    @XmlElement(name = "CntrldBrnchIdrs")
    protected FinancialInstitutionIdentificationList1 cntrldBrnchIdrs;

    /**
     * Gets the value of the authrsdBrnchIdr property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification9 }
     *     
     */
    public FinancialInstitutionIdentification9 getAuthrsdBrnchIdr() {
        return authrsdBrnchIdr;
    }

    /**
     * Sets the value of the authrsdBrnchIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification9 }
     *     
     */
    public CentralisedAndAuthorisedBranchIdentification1Choice setAuthrsdBrnchIdr(FinancialInstitutionIdentification9 value) {
        this.authrsdBrnchIdr = value;
        return this;
    }

    /**
     * Gets the value of the cntrldBrnchIdrs property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentificationList1 }
     *     
     */
    public FinancialInstitutionIdentificationList1 getCntrldBrnchIdrs() {
        return cntrldBrnchIdrs;
    }

    /**
     * Sets the value of the cntrldBrnchIdrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentificationList1 }
     *     
     */
    public CentralisedAndAuthorisedBranchIdentification1Choice setCntrldBrnchIdrs(FinancialInstitutionIdentificationList1 value) {
        this.cntrldBrnchIdrs = value;
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
