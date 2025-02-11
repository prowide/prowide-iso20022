
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
 * Specifies corporate action dates.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionDate99", propOrder = {
    "pstngDt",
    "valDt",
    "fxRateFxgDt",
    "earlstPmtDt",
    "pmtDt"
})
public class CorporateActionDate99 {

    @XmlElement(name = "PstngDt", required = true)
    protected DateAndDateTime2Choice pstngDt;
    @XmlElement(name = "ValDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate valDt;
    @XmlElement(name = "FXRateFxgDt")
    protected DateAndDateTime2Choice fxRateFxgDt;
    @XmlElement(name = "EarlstPmtDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate earlstPmtDt;
    @XmlElement(name = "PmtDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate pmtDt;

    /**
     * Gets the value of the pstngDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getPstngDt() {
        return pstngDt;
    }

    /**
     * Sets the value of the pstngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public CorporateActionDate99 setPstngDt(DateAndDateTime2Choice value) {
        this.pstngDt = value;
        return this;
    }

    /**
     * Gets the value of the valDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getValDt() {
        return valDt;
    }

    /**
     * Sets the value of the valDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionDate99 setValDt(LocalDate value) {
        this.valDt = value;
        return this;
    }

    /**
     * Gets the value of the fxRateFxgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getFXRateFxgDt() {
        return fxRateFxgDt;
    }

    /**
     * Sets the value of the fxRateFxgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public CorporateActionDate99 setFXRateFxgDt(DateAndDateTime2Choice value) {
        this.fxRateFxgDt = value;
        return this;
    }

    /**
     * Gets the value of the earlstPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEarlstPmtDt() {
        return earlstPmtDt;
    }

    /**
     * Sets the value of the earlstPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionDate99 setEarlstPmtDt(LocalDate value) {
        this.earlstPmtDt = value;
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
    public CorporateActionDate99 setPmtDt(LocalDate value) {
        this.pmtDt = value;
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
