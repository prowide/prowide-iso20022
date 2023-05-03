
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
 * Provides further specific details on the direct debit transaction and the related mandate.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectDebitTransaction8", propOrder = {
    "mndtRltdInf",
    "cdtrSchmeId",
    "preNtfctnId",
    "preNtfctnDt"
})
public class DirectDebitTransaction8 {

    @XmlElement(name = "MndtRltdInf")
    protected MandateRelatedInformation10 mndtRltdInf;
    @XmlElement(name = "CdtrSchmeId")
    protected PartyIdentification43 cdtrSchmeId;
    @XmlElement(name = "PreNtfctnId")
    protected String preNtfctnId;
    @XmlElement(name = "PreNtfctnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate preNtfctnDt;

    /**
     * Gets the value of the mndtRltdInf property.
     * 
     * @return
     *     possible object is
     *     {@link MandateRelatedInformation10 }
     *     
     */
    public MandateRelatedInformation10 getMndtRltdInf() {
        return mndtRltdInf;
    }

    /**
     * Sets the value of the mndtRltdInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateRelatedInformation10 }
     *     
     */
    public DirectDebitTransaction8 setMndtRltdInf(MandateRelatedInformation10 value) {
        this.mndtRltdInf = value;
        return this;
    }

    /**
     * Gets the value of the cdtrSchmeId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getCdtrSchmeId() {
        return cdtrSchmeId;
    }

    /**
     * Sets the value of the cdtrSchmeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public DirectDebitTransaction8 setCdtrSchmeId(PartyIdentification43 value) {
        this.cdtrSchmeId = value;
        return this;
    }

    /**
     * Gets the value of the preNtfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreNtfctnId() {
        return preNtfctnId;
    }

    /**
     * Sets the value of the preNtfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DirectDebitTransaction8 setPreNtfctnId(String value) {
        this.preNtfctnId = value;
        return this;
    }

    /**
     * Gets the value of the preNtfctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getPreNtfctnDt() {
        return preNtfctnDt;
    }

    /**
     * Sets the value of the preNtfctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DirectDebitTransaction8 setPreNtfctnDt(LocalDate value) {
        this.preNtfctnDt = value;
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
