
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides further details on the list of direct debit mandate elements that have been modified when the amendment indicator has been set.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmendmentInformationDetails9", propOrder = {
    "orgnlMndtId",
    "orgnlCdtrSchmeId",
    "orgnlCdtrAgt",
    "orgnlDbtr",
    "orgnlDbtrAcct",
    "orgnlDbtrAgt",
    "orgnlFnlColltnDt",
    "orgnlFrqcy"
})
public class AmendmentInformationDetails9 {

    @XmlElement(name = "OrgnlMndtId")
    protected String orgnlMndtId;
    @XmlElement(name = "OrgnlCdtrSchmeId")
    protected PartyIdentification43 orgnlCdtrSchmeId;
    @XmlElement(name = "OrgnlCdtrAgt")
    protected BranchAndFinancialInstitutionIdentification5 orgnlCdtrAgt;
    @XmlElement(name = "OrgnlDbtr")
    protected PartyIdentification43 orgnlDbtr;
    @XmlElement(name = "OrgnlDbtrAcct")
    protected CashAccount24 orgnlDbtrAcct;
    @XmlElement(name = "OrgnlDbtrAgt")
    protected BranchAndFinancialInstitutionIdentification5 orgnlDbtrAgt;
    @XmlElement(name = "OrgnlFnlColltnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar orgnlFnlColltnDt;
    @XmlElement(name = "OrgnlFrqcy")
    @XmlSchemaType(name = "string")
    protected Frequency6Code orgnlFrqcy;

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
    public AmendmentInformationDetails9 setOrgnlMndtId(String value) {
        this.orgnlMndtId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlCdtrSchmeId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getOrgnlCdtrSchmeId() {
        return orgnlCdtrSchmeId;
    }

    /**
     * Sets the value of the orgnlCdtrSchmeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public AmendmentInformationDetails9 setOrgnlCdtrSchmeId(PartyIdentification43 value) {
        this.orgnlCdtrSchmeId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlCdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification5 getOrgnlCdtrAgt() {
        return orgnlCdtrAgt;
    }

    /**
     * Sets the value of the orgnlCdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public AmendmentInformationDetails9 setOrgnlCdtrAgt(BranchAndFinancialInstitutionIdentification5 value) {
        this.orgnlCdtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the orgnlDbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getOrgnlDbtr() {
        return orgnlDbtr;
    }

    /**
     * Sets the value of the orgnlDbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public AmendmentInformationDetails9 setOrgnlDbtr(PartyIdentification43 value) {
        this.orgnlDbtr = value;
        return this;
    }

    /**
     * Gets the value of the orgnlDbtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount24 }
     *     
     */
    public CashAccount24 getOrgnlDbtrAcct() {
        return orgnlDbtrAcct;
    }

    /**
     * Sets the value of the orgnlDbtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount24 }
     *     
     */
    public AmendmentInformationDetails9 setOrgnlDbtrAcct(CashAccount24 value) {
        this.orgnlDbtrAcct = value;
        return this;
    }

    /**
     * Gets the value of the orgnlDbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification5 getOrgnlDbtrAgt() {
        return orgnlDbtrAgt;
    }

    /**
     * Sets the value of the orgnlDbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public AmendmentInformationDetails9 setOrgnlDbtrAgt(BranchAndFinancialInstitutionIdentification5 value) {
        this.orgnlDbtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the orgnlFnlColltnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getOrgnlFnlColltnDt() {
        return orgnlFnlColltnDt;
    }

    /**
     * Sets the value of the orgnlFnlColltnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AmendmentInformationDetails9 setOrgnlFnlColltnDt(XMLGregorianCalendar value) {
        this.orgnlFnlColltnDt = value;
        return this;
    }

    /**
     * Gets the value of the orgnlFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency6Code }
     *     
     */
    public Frequency6Code getOrgnlFrqcy() {
        return orgnlFrqcy;
    }

    /**
     * Sets the value of the orgnlFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency6Code }
     *     
     */
    public AmendmentInformationDetails9 setOrgnlFrqcy(Frequency6Code value) {
        this.orgnlFrqcy = value;
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
