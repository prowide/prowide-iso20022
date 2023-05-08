
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
 * Payment related to elements not reported in dedicated fields.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherPayment3", propOrder = {
    "pmtAmt",
    "pmtTp",
    "pmtDt",
    "pmtPyer",
    "pmtRcvr"
})
public class OtherPayment3 {

    @XmlElement(name = "PmtAmt", required = true)
    protected AmountAndDirection106 pmtAmt;
    @XmlElement(name = "PmtTp")
    protected PaymentType5Choice pmtTp;
    @XmlElement(name = "PmtDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar pmtDt;
    @XmlElement(name = "PmtPyer")
    protected PartyIdentification235Choice pmtPyer;
    @XmlElement(name = "PmtRcvr")
    protected PartyIdentification235Choice pmtRcvr;

    /**
     * Gets the value of the pmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection106 }
     *     
     */
    public AmountAndDirection106 getPmtAmt() {
        return pmtAmt;
    }

    /**
     * Sets the value of the pmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection106 }
     *     
     */
    public OtherPayment3 setPmtAmt(AmountAndDirection106 value) {
        this.pmtAmt = value;
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
    public OtherPayment3 setPmtTp(PaymentType5Choice value) {
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
    public Calendar getPmtDt() {
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
    public OtherPayment3 setPmtDt(Calendar value) {
        this.pmtDt = value;
        return this;
    }

    /**
     * Gets the value of the pmtPyer property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification235Choice }
     *     
     */
    public PartyIdentification235Choice getPmtPyer() {
        return pmtPyer;
    }

    /**
     * Sets the value of the pmtPyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification235Choice }
     *     
     */
    public OtherPayment3 setPmtPyer(PartyIdentification235Choice value) {
        this.pmtPyer = value;
        return this;
    }

    /**
     * Gets the value of the pmtRcvr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification235Choice }
     *     
     */
    public PartyIdentification235Choice getPmtRcvr() {
        return pmtRcvr;
    }

    /**
     * Sets the value of the pmtRcvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification235Choice }
     *     
     */
    public OtherPayment3 setPmtRcvr(PartyIdentification235Choice value) {
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
