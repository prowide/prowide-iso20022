
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
 * Specifies the central counterparty clearing time.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingPartyAndTime9", propOrder = {
    "ccp",
    "clrDtTm",
    "rptTrckgNb",
    "prtflCd"
})
public class ClearingPartyAndTime9 {

    @XmlElement(name = "CCP")
    protected OrganisationIdentification9Choice ccp;
    @XmlElement(name = "ClrDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar clrDtTm;
    @XmlElement(name = "RptTrckgNb")
    protected String rptTrckgNb;
    @XmlElement(name = "PrtflCd")
    protected String prtflCd;

    /**
     * Gets the value of the ccp property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification9Choice }
     *     
     */
    public OrganisationIdentification9Choice getCCP() {
        return ccp;
    }

    /**
     * Sets the value of the ccp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification9Choice }
     *     
     */
    public ClearingPartyAndTime9 setCCP(OrganisationIdentification9Choice value) {
        this.ccp = value;
        return this;
    }

    /**
     * Gets the value of the clrDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getClrDtTm() {
        return clrDtTm;
    }

    /**
     * Sets the value of the clrDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingPartyAndTime9 setClrDtTm(Calendar value) {
        this.clrDtTm = value;
        return this;
    }

    /**
     * Gets the value of the rptTrckgNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptTrckgNb() {
        return rptTrckgNb;
    }

    /**
     * Sets the value of the rptTrckgNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingPartyAndTime9 setRptTrckgNb(String value) {
        this.rptTrckgNb = value;
        return this;
    }

    /**
     * Gets the value of the prtflCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtflCd() {
        return prtflCd;
    }

    /**
     * Sets the value of the prtflCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingPartyAndTime9 setPrtflCd(String value) {
        this.prtflCd = value;
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
