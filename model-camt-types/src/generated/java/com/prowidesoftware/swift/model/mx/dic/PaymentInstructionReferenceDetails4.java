
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Identifies a payment instruction by a set of characteristics (as per EBA system requirements) which provides an unambiguous identification of the instruction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInstructionReferenceDetails4", propOrder = {
    "pmtInstrRef",
    "intrBkSttlmAmt",
    "intrBkValDt",
    "pmtMtd",
    "instgAgtId",
    "instdAgtId",
    "ntryTp",
    "rltdRef"
})
public class PaymentInstructionReferenceDetails4 {

    @XmlElement(name = "PmtInstrRef", required = true)
    protected String pmtInstrRef;
    @XmlElement(name = "IntrBkSttlmAmt", required = true)
    protected BigDecimal intrBkSttlmAmt;
    @XmlElement(name = "IntrBkValDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar intrBkValDt;
    @XmlElement(name = "PmtMtd")
    protected PaymentOrigin1Choice pmtMtd;
    @XmlElement(name = "InstgAgtId", required = true)
    protected String instgAgtId;
    @XmlElement(name = "InstdAgtId", required = true)
    protected String instdAgtId;
    @XmlElement(name = "NtryTp")
    protected String ntryTp;
    @XmlElement(name = "RltdRef")
    protected String rltdRef;

    /**
     * Gets the value of the pmtInstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtInstrRef() {
        return pmtInstrRef;
    }

    /**
     * Sets the value of the pmtInstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentInstructionReferenceDetails4 setPmtInstrRef(String value) {
        this.pmtInstrRef = value;
        return this;
    }

    /**
     * Gets the value of the intrBkSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIntrBkSttlmAmt() {
        return intrBkSttlmAmt;
    }

    /**
     * Sets the value of the intrBkSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PaymentInstructionReferenceDetails4 setIntrBkSttlmAmt(BigDecimal value) {
        this.intrBkSttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the intrBkValDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getIntrBkValDt() {
        return intrBkValDt;
    }

    /**
     * Sets the value of the intrBkValDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentInstructionReferenceDetails4 setIntrBkValDt(XMLGregorianCalendar value) {
        this.intrBkValDt = value;
        return this;
    }

    /**
     * Gets the value of the pmtMtd property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentOrigin1Choice }
     *     
     */
    public PaymentOrigin1Choice getPmtMtd() {
        return pmtMtd;
    }

    /**
     * Sets the value of the pmtMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentOrigin1Choice }
     *     
     */
    public PaymentInstructionReferenceDetails4 setPmtMtd(PaymentOrigin1Choice value) {
        this.pmtMtd = value;
        return this;
    }

    /**
     * Gets the value of the instgAgtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstgAgtId() {
        return instgAgtId;
    }

    /**
     * Sets the value of the instgAgtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentInstructionReferenceDetails4 setInstgAgtId(String value) {
        this.instgAgtId = value;
        return this;
    }

    /**
     * Gets the value of the instdAgtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstdAgtId() {
        return instdAgtId;
    }

    /**
     * Sets the value of the instdAgtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentInstructionReferenceDetails4 setInstdAgtId(String value) {
        this.instdAgtId = value;
        return this;
    }

    /**
     * Gets the value of the ntryTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtryTp() {
        return ntryTp;
    }

    /**
     * Sets the value of the ntryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentInstructionReferenceDetails4 setNtryTp(String value) {
        this.ntryTp = value;
        return this;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentInstructionReferenceDetails4 setRltdRef(String value) {
        this.rltdRef = value;
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
