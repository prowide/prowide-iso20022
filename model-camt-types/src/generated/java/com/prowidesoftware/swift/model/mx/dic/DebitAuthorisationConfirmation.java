
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
 * Indicates if the debit authorisation is granted or not.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DebitAuthorisationConfirmation", propOrder = {
    "dbtAuthstn",
    "amtToDbt",
    "valDtToDbt",
    "rsn"
})
public class DebitAuthorisationConfirmation {

    @XmlElement(name = "DbtAuthstn")
    protected boolean dbtAuthstn;
    @XmlElement(name = "AmtToDbt")
    protected CurrencyAndAmount amtToDbt;
    @XmlElement(name = "ValDtToDbt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate valDtToDbt;
    @XmlElement(name = "Rsn")
    protected String rsn;

    /**
     * Gets the value of the dbtAuthstn property.
     * 
     */
    public boolean isDbtAuthstn() {
        return dbtAuthstn;
    }

    /**
     * Sets the value of the dbtAuthstn property.
     * 
     */
    public DebitAuthorisationConfirmation setDbtAuthstn(boolean value) {
        this.dbtAuthstn = value;
        return this;
    }

    /**
     * Gets the value of the amtToDbt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getAmtToDbt() {
        return amtToDbt;
    }

    /**
     * Sets the value of the amtToDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public DebitAuthorisationConfirmation setAmtToDbt(CurrencyAndAmount value) {
        this.amtToDbt = value;
        return this;
    }

    /**
     * Gets the value of the valDtToDbt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getValDtToDbt() {
        return valDtToDbt;
    }

    /**
     * Sets the value of the valDtToDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DebitAuthorisationConfirmation setValDtToDbt(LocalDate value) {
        this.valDtToDbt = value;
        return this;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DebitAuthorisationConfirmation setRsn(String value) {
        this.rsn = value;
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
