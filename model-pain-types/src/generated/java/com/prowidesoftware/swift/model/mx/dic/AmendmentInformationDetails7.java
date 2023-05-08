
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
 * Set of elements used to provide the list of direct debit mandate elements that have been modified when the amendment indicator has been set.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmendmentInformationDetails7", propOrder = {
    "orgnlMndtId",
    "orgnlCdtrSchmeId",
    "orgnlCdtrAgt",
    "orgnlDbtr",
    "orgnlDbtrAcct",
    "orgnlDbtrAgt",
    "orgnlFnlColltnDt",
    "orgnlFrqcy"
})
public class AmendmentInformationDetails7 {

    @XmlElement(name = "OrgnlMndtId")
    protected String orgnlMndtId;
    @XmlElement(name = "OrgnlCdtrSchmeId")
    protected PartyIdentification43 orgnlCdtrSchmeId;
    @XmlElement(name = "OrgnlCdtrAgt")
    protected BranchAndFinancialInstitutionIdentification5 orgnlCdtrAgt;
    @XmlElement(name = "OrgnlDbtr")
    protected PartyIdentification43 orgnlDbtr;
    @XmlElement(name = "OrgnlDbtrAcct")
    protected CashAccount16 orgnlDbtrAcct;
    @XmlElement(name = "OrgnlDbtrAgt")
    protected BranchAndFinancialInstitutionIdentification5 orgnlDbtrAgt;
    @XmlElement(name = "OrgnlFnlColltnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar orgnlFnlColltnDt;
    @XmlElement(name = "OrgnlFrqcy")
    @XmlSchemaType(name = "string")
    protected Frequency1Code orgnlFrqcy;

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
    public AmendmentInformationDetails7 setOrgnlMndtId(String value) {
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
    public AmendmentInformationDetails7 setOrgnlCdtrSchmeId(PartyIdentification43 value) {
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
    public AmendmentInformationDetails7 setOrgnlCdtrAgt(BranchAndFinancialInstitutionIdentification5 value) {
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
    public AmendmentInformationDetails7 setOrgnlDbtr(PartyIdentification43 value) {
        this.orgnlDbtr = value;
        return this;
    }

    /**
     * Gets the value of the orgnlDbtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount16 }
     *     
     */
    public CashAccount16 getOrgnlDbtrAcct() {
        return orgnlDbtrAcct;
    }

    /**
     * Sets the value of the orgnlDbtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount16 }
     *     
     */
    public AmendmentInformationDetails7 setOrgnlDbtrAcct(CashAccount16 value) {
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
    public AmendmentInformationDetails7 setOrgnlDbtrAgt(BranchAndFinancialInstitutionIdentification5 value) {
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
    public Calendar getOrgnlFnlColltnDt() {
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
    public AmendmentInformationDetails7 setOrgnlFnlColltnDt(Calendar value) {
        this.orgnlFnlColltnDt = value;
        return this;
    }

    /**
     * Gets the value of the orgnlFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency1Code }
     *     
     */
    public Frequency1Code getOrgnlFrqcy() {
        return orgnlFrqcy;
    }

    /**
     * Sets the value of the orgnlFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency1Code }
     *     
     */
    public AmendmentInformationDetails7 setOrgnlFrqcy(Frequency1Code value) {
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
