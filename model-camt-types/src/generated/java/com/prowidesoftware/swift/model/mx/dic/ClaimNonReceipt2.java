
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies details of a claim non receipt status advice.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimNonReceipt2", propOrder = {
    "dtPrcd",
    "orgnlNxtAgt"
})
public class ClaimNonReceipt2 {

    @XmlElement(name = "DtPrcd", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtPrcd;
    @XmlElement(name = "OrgnlNxtAgt")
    protected BranchAndFinancialInstitutionIdentification6 orgnlNxtAgt;

    /**
     * Gets the value of the dtPrcd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtPrcd() {
        return dtPrcd;
    }

    /**
     * Sets the value of the dtPrcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public ClaimNonReceipt2 setDtPrcd(XMLGregorianCalendar value) {
        this.dtPrcd = value;
        return this;
    }

    /**
     * Gets the value of the orgnlNxtAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getOrgnlNxtAgt() {
        return orgnlNxtAgt;
    }

    /**
     * Sets the value of the orgnlNxtAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public ClaimNonReceipt2 setOrgnlNxtAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.orgnlNxtAgt = value;
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
