
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
 * Set of characteristics related to a cheque instruction, such as cheque type or cheque number.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cheque10", propOrder = {
    "nb",
    "pyeeId",
    "drweeId",
    "drwrId"
})
public class Cheque10 {

    @XmlElement(name = "Nb")
    protected String nb;
    @XmlElement(name = "PyeeId", required = true)
    protected PartyIdentification139 pyeeId;
    @XmlElement(name = "DrweeId")
    protected FinancialInstitutionIdentification17 drweeId;
    @XmlElement(name = "DrwrId")
    protected PartyIdentification139 drwrId;

    /**
     * Gets the value of the nb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNb() {
        return nb;
    }

    /**
     * Sets the value of the nb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Cheque10 setNb(String value) {
        this.nb = value;
        return this;
    }

    /**
     * Gets the value of the pyeeId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification139 }
     *     
     */
    public PartyIdentification139 getPyeeId() {
        return pyeeId;
    }

    /**
     * Sets the value of the pyeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification139 }
     *     
     */
    public Cheque10 setPyeeId(PartyIdentification139 value) {
        this.pyeeId = value;
        return this;
    }

    /**
     * Gets the value of the drweeId property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification17 }
     *     
     */
    public FinancialInstitutionIdentification17 getDrweeId() {
        return drweeId;
    }

    /**
     * Sets the value of the drweeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification17 }
     *     
     */
    public Cheque10 setDrweeId(FinancialInstitutionIdentification17 value) {
        this.drweeId = value;
        return this;
    }

    /**
     * Gets the value of the drwrId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification139 }
     *     
     */
    public PartyIdentification139 getDrwrId() {
        return drwrId;
    }

    /**
     * Sets the value of the drwrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification139 }
     *     
     */
    public Cheque10 setDrwrId(PartyIdentification139 value) {
        this.drwrId = value;
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
