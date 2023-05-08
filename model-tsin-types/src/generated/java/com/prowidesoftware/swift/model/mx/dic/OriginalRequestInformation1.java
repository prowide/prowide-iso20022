
package com.prowidesoftware.swift.model.mx.dic;

import java.util.Calendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
 * Set of characteristics that unambiguously identify the original global invoice financing request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalRequestInformation1", propOrder = {
    "id",
    "creDtTm",
    "fincgRqstr",
    "intrmyAgt",
    "frstAgt",
    "vldtnStsInf",
    "cxlStsInf"
})
public class OriginalRequestInformation1 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "CreDtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar creDtTm;
    @XmlElement(name = "FincgRqstr")
    protected PartyIdentificationAndAccount6 fincgRqstr;
    @XmlElement(name = "IntrmyAgt")
    protected FinancialInstitutionIdentification6 intrmyAgt;
    @XmlElement(name = "FrstAgt")
    protected FinancialInstitutionIdentification6 frstAgt;
    @XmlElement(name = "VldtnStsInf", required = true)
    protected ValidationStatusInformation1 vldtnStsInf;
    @XmlElement(name = "CxlStsInf")
    protected CancellationStatusInformation1 cxlStsInf;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalRequestInformation1 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the creDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getCreDtTm() {
        return creDtTm;
    }

    /**
     * Sets the value of the creDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalRequestInformation1 setCreDtTm(Calendar value) {
        this.creDtTm = value;
        return this;
    }

    /**
     * Gets the value of the fincgRqstr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount6 }
     *     
     */
    public PartyIdentificationAndAccount6 getFincgRqstr() {
        return fincgRqstr;
    }

    /**
     * Sets the value of the fincgRqstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount6 }
     *     
     */
    public OriginalRequestInformation1 setFincgRqstr(PartyIdentificationAndAccount6 value) {
        this.fincgRqstr = value;
        return this;
    }

    /**
     * Gets the value of the intrmyAgt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification6 }
     *     
     */
    public FinancialInstitutionIdentification6 getIntrmyAgt() {
        return intrmyAgt;
    }

    /**
     * Sets the value of the intrmyAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification6 }
     *     
     */
    public OriginalRequestInformation1 setIntrmyAgt(FinancialInstitutionIdentification6 value) {
        this.intrmyAgt = value;
        return this;
    }

    /**
     * Gets the value of the frstAgt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification6 }
     *     
     */
    public FinancialInstitutionIdentification6 getFrstAgt() {
        return frstAgt;
    }

    /**
     * Sets the value of the frstAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification6 }
     *     
     */
    public OriginalRequestInformation1 setFrstAgt(FinancialInstitutionIdentification6 value) {
        this.frstAgt = value;
        return this;
    }

    /**
     * Gets the value of the vldtnStsInf property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationStatusInformation1 }
     *     
     */
    public ValidationStatusInformation1 getVldtnStsInf() {
        return vldtnStsInf;
    }

    /**
     * Sets the value of the vldtnStsInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationStatusInformation1 }
     *     
     */
    public OriginalRequestInformation1 setVldtnStsInf(ValidationStatusInformation1 value) {
        this.vldtnStsInf = value;
        return this;
    }

    /**
     * Gets the value of the cxlStsInf property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationStatusInformation1 }
     *     
     */
    public CancellationStatusInformation1 getCxlStsInf() {
        return cxlStsInf;
    }

    /**
     * Sets the value of the cxlStsInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationStatusInformation1 }
     *     
     */
    public OriginalRequestInformation1 setCxlStsInf(CancellationStatusInformation1 value) {
        this.cxlStsInf = value;
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
