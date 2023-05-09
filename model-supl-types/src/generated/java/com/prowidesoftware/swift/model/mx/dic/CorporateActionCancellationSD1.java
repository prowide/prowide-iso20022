
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
 * Provides additional information regarding linkage details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionCancellationSD1", propOrder = {
    "plcAndNm",
    "lkdCorpActnId",
    "lkgTp",
    "lkAddedDt",
    "lkModfdDt"
})
public class CorporateActionCancellationSD1 {

    @XmlElement(name = "PlcAndNm", required = true)
    protected String plcAndNm;
    @XmlElement(name = "LkdCorpActnId", required = true)
    protected String lkdCorpActnId;
    @XmlElement(name = "LkgTp", required = true)
    @XmlSchemaType(name = "string")
    protected DTCCLinkType1Code lkgTp;
    @XmlElement(name = "LkAddedDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate lkAddedDt;
    @XmlElement(name = "LkModfdDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate lkModfdDt;

    /**
     * Gets the value of the plcAndNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcAndNm() {
        return plcAndNm;
    }

    /**
     * Sets the value of the plcAndNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionCancellationSD1 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the lkdCorpActnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLkdCorpActnId() {
        return lkdCorpActnId;
    }

    /**
     * Sets the value of the lkdCorpActnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionCancellationSD1 setLkdCorpActnId(String value) {
        this.lkdCorpActnId = value;
        return this;
    }

    /**
     * Gets the value of the lkgTp property.
     * 
     * @return
     *     possible object is
     *     {@link DTCCLinkType1Code }
     *     
     */
    public DTCCLinkType1Code getLkgTp() {
        return lkgTp;
    }

    /**
     * Sets the value of the lkgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCCLinkType1Code }
     *     
     */
    public CorporateActionCancellationSD1 setLkgTp(DTCCLinkType1Code value) {
        this.lkgTp = value;
        return this;
    }

    /**
     * Gets the value of the lkAddedDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getLkAddedDt() {
        return lkAddedDt;
    }

    /**
     * Sets the value of the lkAddedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionCancellationSD1 setLkAddedDt(LocalDate value) {
        this.lkAddedDt = value;
        return this;
    }

    /**
     * Gets the value of the lkModfdDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getLkModfdDt() {
        return lkModfdDt;
    }

    /**
     * Sets the value of the lkModfdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionCancellationSD1 setLkModfdDt(LocalDate value) {
        this.lkModfdDt = value;
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
