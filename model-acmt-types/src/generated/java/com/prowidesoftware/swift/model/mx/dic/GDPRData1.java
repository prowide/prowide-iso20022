
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
 * Information about an individual's consent to use personal data under the General Protection Regulation (GDPR) 2016/679 regulation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GDPRData1", propOrder = {
    "cnsntTp",
    "cnsntInd",
    "cnsntDt"
})
public class GDPRData1 {

    @XmlElement(name = "CnsntTp", required = true)
    protected GDPRDataConsent1Choice cnsntTp;
    @XmlElement(name = "CnsntInd")
    protected boolean cnsntInd;
    @XmlElement(name = "CnsntDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate cnsntDt;

    /**
     * Gets the value of the cnsntTp property.
     * 
     * @return
     *     possible object is
     *     {@link GDPRDataConsent1Choice }
     *     
     */
    public GDPRDataConsent1Choice getCnsntTp() {
        return cnsntTp;
    }

    /**
     * Sets the value of the cnsntTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GDPRDataConsent1Choice }
     *     
     */
    public GDPRData1 setCnsntTp(GDPRDataConsent1Choice value) {
        this.cnsntTp = value;
        return this;
    }

    /**
     * Gets the value of the cnsntInd property.
     * 
     */
    public boolean isCnsntInd() {
        return cnsntInd;
    }

    /**
     * Sets the value of the cnsntInd property.
     * 
     */
    public GDPRData1 setCnsntInd(boolean value) {
        this.cnsntInd = value;
        return this;
    }

    /**
     * Gets the value of the cnsntDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getCnsntDt() {
        return cnsntDt;
    }

    /**
     * Sets the value of the cnsntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public GDPRData1 setCnsntDt(LocalDate value) {
        this.cnsntDt = value;
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
