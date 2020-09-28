
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
 * AmendmentInformationDetailsSDD_DFU1
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmendmentInformationDetailsSDD_DFU1", propOrder = {
    "orgnlMndtId",
    "orgnlCdtrSchmeId",
    "orgnlDbtrAcct",
    "orgnlDbtrAgt"
})
public class AmendmentInformationDetailsSDDDFU1 {

    @XmlElement(name = "OrgnlMndtId")
    protected String orgnlMndtId;
    @XmlElement(name = "OrgnlCdtrSchmeId")
    protected PartyIdentificationSEPA4DFU1 orgnlCdtrSchmeId;
    @XmlElement(name = "OrgnlDbtrAcct")
    protected CashAccountSEPA2DFU1 orgnlDbtrAcct;
    @XmlElement(name = "OrgnlDbtrAgt")
    protected BranchAndFinancialInstitutionIdentificationSEPA2DFU1 orgnlDbtrAgt;

    /**
     * Gets the value of the orgnlMndtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlMndtId() {
        return orgnlMndtId;
    }

    /**
     * Sets the value of the orgnlMndtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AmendmentInformationDetailsSDDDFU1 setOrgnlMndtId(String value) {
        this.orgnlMndtId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlCdtrSchmeId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationSEPA4DFU1 }
     *     
     */
    public PartyIdentificationSEPA4DFU1 getOrgnlCdtrSchmeId() {
        return orgnlCdtrSchmeId;
    }

    /**
     * Sets the value of the orgnlCdtrSchmeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationSEPA4DFU1 }
     *     
     */
    public AmendmentInformationDetailsSDDDFU1 setOrgnlCdtrSchmeId(PartyIdentificationSEPA4DFU1 value) {
        this.orgnlCdtrSchmeId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlDbtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountSEPA2DFU1 }
     *     
     */
    public CashAccountSEPA2DFU1 getOrgnlDbtrAcct() {
        return orgnlDbtrAcct;
    }

    /**
     * Sets the value of the orgnlDbtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountSEPA2DFU1 }
     *     
     */
    public AmendmentInformationDetailsSDDDFU1 setOrgnlDbtrAcct(CashAccountSEPA2DFU1 value) {
        this.orgnlDbtrAcct = value;
        return this;
    }

    /**
     * Gets the value of the orgnlDbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentificationSEPA2DFU1 }
     *     
     */
    public BranchAndFinancialInstitutionIdentificationSEPA2DFU1 getOrgnlDbtrAgt() {
        return orgnlDbtrAgt;
    }

    /**
     * Sets the value of the orgnlDbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentificationSEPA2DFU1 }
     *     
     */
    public AmendmentInformationDetailsSDDDFU1 setOrgnlDbtrAgt(BranchAndFinancialInstitutionIdentificationSEPA2DFU1 value) {
        this.orgnlDbtrAgt = value;
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
