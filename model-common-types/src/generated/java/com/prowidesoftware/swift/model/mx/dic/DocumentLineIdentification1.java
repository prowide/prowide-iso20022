
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
 * Identifies the documents referred to in the remittance information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentLineIdentification1", propOrder = {
    "tp",
    "nb",
    "rltdDt"
})
public class DocumentLineIdentification1 {

    @XmlElement(name = "Tp")
    protected DocumentLineType1 tp;
    @XmlElement(name = "Nb")
    protected String nb;
    @XmlElement(name = "RltdDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate rltdDt;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentLineType1 }
     *     
     */
    public DocumentLineType1 getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentLineType1 }
     *     
     */
    public DocumentLineIdentification1 setTp(DocumentLineType1 value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the nb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNb() {
        return nb;
    }

    /**
     * Sets the value of the nb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DocumentLineIdentification1 setNb(String value) {
        this.nb = value;
        return this;
    }

    /**
     * Gets the value of the rltdDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getRltdDt() {
        return rltdDt;
    }

    /**
     * Sets the value of the rltdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DocumentLineIdentification1 setRltdDt(LocalDate value) {
        this.rltdDt = value;
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
