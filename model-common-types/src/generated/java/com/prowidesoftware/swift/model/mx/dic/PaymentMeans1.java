
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
 * Means by which a payment will be or has been made for settlement purposes.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentMeans1", propOrder = {
    "pmtTp",
    "pmtMtdCd",
    "pyeeCdtrAcct",
    "pyeeFI",
    "pyerDbtrAcct",
    "pyerFI"
})
public class PaymentMeans1 {

    @XmlElement(name = "PmtTp", required = true)
    protected PaymentTypeInformation19 pmtTp;
    @XmlElement(name = "PmtMtdCd", required = true)
    @XmlSchemaType(name = "string")
    protected PaymentMethod4Code pmtMtdCd;
    @XmlElement(name = "PyeeCdtrAcct", required = true)
    protected CashAccount16 pyeeCdtrAcct;
    @XmlElement(name = "PyeeFI", required = true)
    protected BranchAndFinancialInstitutionIdentification4 pyeeFI;
    @XmlElement(name = "PyerDbtrAcct")
    protected CashAccount16 pyerDbtrAcct;
    @XmlElement(name = "PyerFI")
    protected BranchAndFinancialInstitutionIdentification4 pyerFI;

    /**
     * Gets the value of the pmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTypeInformation19 }
     *     
     */
    public PaymentTypeInformation19 getPmtTp() {
        return pmtTp;
    }

    /**
     * Sets the value of the pmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTypeInformation19 }
     *     
     */
    public PaymentMeans1 setPmtTp(PaymentTypeInformation19 value) {
        this.pmtTp = value;
        return this;
    }

    /**
     * Gets the value of the pmtMtdCd property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethod4Code }
     *     
     */
    public PaymentMethod4Code getPmtMtdCd() {
        return pmtMtdCd;
    }

    /**
     * Sets the value of the pmtMtdCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethod4Code }
     *     
     */
    public PaymentMeans1 setPmtMtdCd(PaymentMethod4Code value) {
        this.pmtMtdCd = value;
        return this;
    }

    /**
     * Gets the value of the pyeeCdtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount16 }
     *     
     */
    public CashAccount16 getPyeeCdtrAcct() {
        return pyeeCdtrAcct;
    }

    /**
     * Sets the value of the pyeeCdtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount16 }
     *     
     */
    public PaymentMeans1 setPyeeCdtrAcct(CashAccount16 value) {
        this.pyeeCdtrAcct = value;
        return this;
    }

    /**
     * Gets the value of the pyeeFI property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification4 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification4 getPyeeFI() {
        return pyeeFI;
    }

    /**
     * Sets the value of the pyeeFI property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification4 }
     *     
     */
    public PaymentMeans1 setPyeeFI(BranchAndFinancialInstitutionIdentification4 value) {
        this.pyeeFI = value;
        return this;
    }

    /**
     * Gets the value of the pyerDbtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount16 }
     *     
     */
    public CashAccount16 getPyerDbtrAcct() {
        return pyerDbtrAcct;
    }

    /**
     * Sets the value of the pyerDbtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount16 }
     *     
     */
    public PaymentMeans1 setPyerDbtrAcct(CashAccount16 value) {
        this.pyerDbtrAcct = value;
        return this;
    }

    /**
     * Gets the value of the pyerFI property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification4 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification4 getPyerFI() {
        return pyerFI;
    }

    /**
     * Sets the value of the pyerFI property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification4 }
     *     
     */
    public PaymentMeans1 setPyerFI(BranchAndFinancialInstitutionIdentification4 value) {
        this.pyerFI = value;
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
