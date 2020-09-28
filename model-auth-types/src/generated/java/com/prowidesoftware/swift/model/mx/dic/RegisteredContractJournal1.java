
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
 * Document that a user must file with an authorised servicer for each contract that involves foreign currency transactions with non residents.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisteredContractJournal1", propOrder = {
    "regnAgt",
    "unqId",
    "clsrDt",
    "clsrRsn"
})
public class RegisteredContractJournal1 {

    @XmlElement(name = "RegnAgt", required = true)
    protected BranchAndFinancialInstitutionIdentification5 regnAgt;
    @XmlElement(name = "UnqId")
    protected DocumentIdentification28 unqId;
    @XmlElement(name = "ClsrDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar clsrDt;
    @XmlElement(name = "ClsrRsn", required = true)
    protected ContractClosureReason1Choice clsrRsn;

    /**
     * Gets the value of the regnAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification5 getRegnAgt() {
        return regnAgt;
    }

    /**
     * Sets the value of the regnAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public RegisteredContractJournal1 setRegnAgt(BranchAndFinancialInstitutionIdentification5 value) {
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
    public RegisteredContractJournal1 setUnqId(DocumentIdentification28 value) {
        this.unqId = value;
        return this;
    }

    /**
     * Gets the value of the clsrDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClsrDt() {
        return clsrDt;
    }

    /**
     * Sets the value of the clsrDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public RegisteredContractJournal1 setClsrDt(XMLGregorianCalendar value) {
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
    public RegisteredContractJournal1 setClsrRsn(ContractClosureReason1Choice value) {
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
