
package com.prowidesoftware.swift.model.mx.dic;

import java.util.Calendar;
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
 * Document that a user must file with an authorised servicer for each contract that involves foreign currency transactions with non residents.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisteredContractJournal2", propOrder = {
    "regnAgt",
    "unqId",
    "clsrDt",
    "clsrRsn"
})
public class RegisteredContractJournal2 {

    @XmlElement(name = "RegnAgt", required = true)
    protected BranchAndFinancialInstitutionIdentification6 regnAgt;
    @XmlElement(name = "UnqId")
    protected DocumentIdentification28 unqId;
    @XmlElement(name = "ClsrDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar clsrDt;
    @XmlElement(name = "ClsrRsn", required = true)
    protected ContractClosureReason1Choice clsrRsn;

    /**
     * Gets the value of the regnAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getRegnAgt() {
        return regnAgt;
    }

    /**
     * Sets the value of the regnAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public RegisteredContractJournal2 setRegnAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.regnAgt = value;
        return this;
    }

    /**
     * Gets the value of the unqId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification28 }
     *     
     */
    public DocumentIdentification28 getUnqId() {
        return unqId;
    }

    /**
     * Sets the value of the unqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification28 }
     *     
     */
    public RegisteredContractJournal2 setUnqId(DocumentIdentification28 value) {
        this.unqId = value;
        return this;
    }

    /**
     * Gets the value of the clsrDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getClsrDt() {
        return clsrDt;
    }

    /**
     * Sets the value of the clsrDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RegisteredContractJournal2 setClsrDt(Calendar value) {
        this.clsrDt = value;
        return this;
    }

    /**
     * Gets the value of the clsrRsn property.
     * 
     * @return
     *     possible object is
     *     {@link ContractClosureReason1Choice }
     *     
     */
    public ContractClosureReason1Choice getClsrRsn() {
        return clsrRsn;
    }

    /**
     * Sets the value of the clsrRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractClosureReason1Choice }
     *     
     */
    public RegisteredContractJournal2 setClsrRsn(ContractClosureReason1Choice value) {
        this.clsrRsn = value;
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
