
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
 * Payment related to elements not reported in dedicated fields.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherPayment5", propOrder = {
    "pmtAmt",
    "pmtTp",
    "pmtDt",
    "pmtPyer",
    "pmtRcvr"
})
public class OtherPayment5 {

    @XmlElement(name = "PmtAmt")
    protected AmountAndDirection106 pmtAmt;
    @XmlElement(name = "PmtTp")
    protected PaymentType5Choice pmtTp;
    @XmlElement(name = "PmtDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pmtDt;
    @XmlElement(name = "PmtPyer")
    protected PartyIdentification236Choice pmtPyer;
    @XmlElement(name = "PmtRcvr")
    protected PartyIdentification236Choice pmtRcvr;

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
    public OtherPayment5 setPmtAmt(AmountAndDirection106 value) {
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
    public OtherPayment5 setPmtTp(PaymentType5Choice value) {
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
    public XMLGregorianCalendar getPmtDt() {
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
    public OtherPayment5 setPmtDt(XMLGregorianCalendar value) {
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
    public OtherPayment5 setPmtPyer(PartyIdentification236Choice value) {
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
    public OtherPayment5 setPmtRcvr(PartyIdentification236Choice value) {
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
