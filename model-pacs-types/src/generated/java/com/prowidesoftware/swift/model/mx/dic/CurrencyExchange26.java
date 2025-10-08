
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
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
 * Set of elements used to provide details of the currency exchange.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyExchange26", propOrder = {
    "unitCcy",
    "qtdCcy",
    "preAgrdXchgRate",
    "qtnDtTm",
    "qtId",
    "fxAgt"
})
public class CurrencyExchange26 {

    @XmlElement(name = "UnitCcy")
    protected String unitCcy;
    @XmlElement(name = "QtdCcy")
    protected String qtdCcy;
    @XmlElement(name = "PreAgrdXchgRate", required = true)
    protected BigDecimal preAgrdXchgRate;
    @XmlElement(name = "QtnDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime qtnDtTm;
    @XmlElement(name = "QtId")
    protected String qtId;
    @XmlElement(name = "FXAgt")
    protected BranchAndFinancialInstitutionIdentification8 fxAgt;

    /**
     * Gets the value of the unitCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitCcy() {
        return unitCcy;
    }

    /**
     * Sets the value of the unitCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CurrencyExchange26 setUnitCcy(String value) {
        this.unitCcy = value;
        return this;
    }

    /**
     * Gets the value of the qtdCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtdCcy() {
        return qtdCcy;
    }

    /**
     * Sets the value of the qtdCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CurrencyExchange26 setQtdCcy(String value) {
        this.qtdCcy = value;
        return this;
    }

    /**
     * Gets the value of the preAgrdXchgRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPreAgrdXchgRate() {
        return preAgrdXchgRate;
    }

    /**
     * Sets the value of the preAgrdXchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CurrencyExchange26 setPreAgrdXchgRate(BigDecimal value) {
        this.preAgrdXchgRate = value;
        return this;
    }

    /**
     * Gets the value of the qtnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getQtnDtTm() {
        return qtnDtTm;
    }

    /**
     * Sets the value of the qtnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CurrencyExchange26 setQtnDtTm(OffsetDateTime value) {
        this.qtnDtTm = value;
        return this;
    }

    /**
     * Gets the value of the qtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtId() {
        return qtId;
    }

    /**
     * Sets the value of the qtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CurrencyExchange26 setQtId(String value) {
        this.qtId = value;
        return this;
    }

    /**
     * Gets the value of the fxAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getFXAgt() {
        return fxAgt;
    }

    /**
     * Sets the value of the fxAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public CurrencyExchange26 setFXAgt(BranchAndFinancialInstitutionIdentification8 value) {
        this.fxAgt = value;
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
