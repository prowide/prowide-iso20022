
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
 * Payment related to elements not reported in dedicated fields.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherPayment6", propOrder = {
    "pmtCcy",
    "pmtTp",
    "pmtDt",
    "pmtPyer",
    "pmtRcvr"
})
public class OtherPayment6 {

    @XmlElement(name = "PmtCcy")
    protected String pmtCcy;
    @XmlElement(name = "PmtTp")
    protected PaymentType5Choice pmtTp;
    @XmlElement(name = "PmtDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate pmtDt;
    @XmlElement(name = "PmtPyer")
    protected PartyIdentification236Choice pmtPyer;
    @XmlElement(name = "PmtRcvr")
    protected PartyIdentification236Choice pmtRcvr;

    /**
     * Gets the value of the pmtCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtCcy() {
        return pmtCcy;
    }

    /**
     * Sets the value of the pmtCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OtherPayment6 setPmtCcy(String value) {
        this.pmtCcy = value;
        return this;
    }

    /**
     * Gets the value of the pmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentType5Choice }
     *     
     */
    public PaymentType5Choice getPmtTp() {
        return pmtTp;
    }

    /**
     * Sets the value of the pmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType5Choice }
     *     
     */
    public OtherPayment6 setPmtTp(PaymentType5Choice value) {
        this.pmtTp = value;
        return this;
    }

    /**
     * Gets the value of the pmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getPmtDt() {
        return pmtDt;
    }

    /**
     * Sets the value of the pmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OtherPayment6 setPmtDt(LocalDate value) {
        this.pmtDt = value;
        return this;
    }

    /**
     * Gets the value of the pmtPyer property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification236Choice }
     *     
     */
    public PartyIdentification236Choice getPmtPyer() {
        return pmtPyer;
    }

    /**
     * Sets the value of the pmtPyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification236Choice }
     *     
     */
    public OtherPayment6 setPmtPyer(PartyIdentification236Choice value) {
        this.pmtPyer = value;
        return this;
    }

    /**
     * Gets the value of the pmtRcvr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification236Choice }
     *     
     */
    public PartyIdentification236Choice getPmtRcvr() {
        return pmtRcvr;
    }

    /**
     * Sets the value of the pmtRcvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification236Choice }
     *     
     */
    public OtherPayment6 setPmtRcvr(PartyIdentification236Choice value) {
        this.pmtRcvr = value;
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
