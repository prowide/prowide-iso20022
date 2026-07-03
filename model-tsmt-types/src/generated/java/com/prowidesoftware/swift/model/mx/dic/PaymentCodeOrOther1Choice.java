
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
 * Choice between a payment term in a coded or free format.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCodeOrOther1Choice", propOrder = {
    "pmtCd",
    "pmtDueDt",
    "othrPmtTerms"
})
public class PaymentCodeOrOther1Choice {

    @XmlElement(name = "PmtCd")
    protected PaymentPeriod3 pmtCd;
    @XmlElement(name = "PmtDueDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pmtDueDt;
    @XmlElement(name = "OthrPmtTerms")
    protected String othrPmtTerms;

    /**
     * Gets the value of the pmtCd property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentPeriod3 }
     *     
     */
    public PaymentPeriod3 getPmtCd() {
        return pmtCd;
    }

    /**
     * Sets the value of the pmtCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentPeriod3 }
     *     
     */
    public PaymentCodeOrOther1Choice setPmtCd(PaymentPeriod3 value) {
        this.pmtCd = value;
        return this;
    }

    /**
     * Gets the value of the pmtDueDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getPmtDueDt() {
        return pmtDueDt;
    }

    /**
     * Sets the value of the pmtDueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentCodeOrOther1Choice setPmtDueDt(XMLGregorianCalendar value) {
        this.pmtDueDt = value;
        return this;
    }

    /**
     * Gets the value of the othrPmtTerms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrPmtTerms() {
        return othrPmtTerms;
    }

    /**
     * Sets the value of the othrPmtTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentCodeOrOther1Choice setOthrPmtTerms(String value) {
        this.othrPmtTerms = value;
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
