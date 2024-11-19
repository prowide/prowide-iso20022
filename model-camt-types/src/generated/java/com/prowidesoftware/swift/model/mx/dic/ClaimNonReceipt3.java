
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
@XmlType(name = "ClaimNonReceipt3", propOrder = {
    "dtPrcd",
    "orgnlNxtAgt"
})
public class ClaimNonReceipt3 {

    @XmlElement(name = "DtPrcd", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dtPrcd;
    @XmlElement(name = "OrgnlNxtAgt")
    protected BranchAndFinancialInstitutionIdentification8 orgnlNxtAgt;

    /**
     * Gets the value of the dtPrcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDtPrcd() {
        return dtPrcd;
    }

    /**
     * Sets the value of the dtPrcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClaimNonReceipt3 setDtPrcd(LocalDate value) {
        this.dtPrcd = value;
        return this;
    }

    /**
     * Gets the value of the orgnlNxtAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getOrgnlNxtAgt() {
        return orgnlNxtAgt;
    }

    /**
     * Sets the value of the orgnlNxtAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public ClaimNonReceipt3 setOrgnlNxtAgt(BranchAndFinancialInstitutionIdentification8 value) {
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
