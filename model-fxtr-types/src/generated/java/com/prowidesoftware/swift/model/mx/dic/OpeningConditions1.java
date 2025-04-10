
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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
 * Specifies the conditions for the NDF opening.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpeningConditions1", propOrder = {
    "sttlmCcy",
    "valtnDt",
    "sttlmRateSrc"
})
public class OpeningConditions1 {

    @XmlElement(name = "SttlmCcy", required = true)
    protected String sttlmCcy;
    @XmlElement(name = "ValtnDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate valtnDt;
    @XmlElement(name = "SttlmRateSrc", required = true)
    protected List<SettlementRateSource1> sttlmRateSrc;

    /**
     * Gets the value of the sttlmCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmCcy() {
        return sttlmCcy;
    }

    /**
     * Sets the value of the sttlmCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OpeningConditions1 setSttlmCcy(String value) {
        this.sttlmCcy = value;
        return this;
    }

    /**
     * Gets the value of the valtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getValtnDt() {
        return valtnDt;
    }

    /**
     * Sets the value of the valtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OpeningConditions1 setValtnDt(LocalDate value) {
        this.valtnDt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmRateSrc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sttlmRateSrc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttlmRateSrc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementRateSource1 }
     * 
     * 
     * @return
     *     The value of the sttlmRateSrc property.
     */
    public List<SettlementRateSource1> getSttlmRateSrc() {
        if (sttlmRateSrc == null) {
            sttlmRateSrc = new ArrayList<>();
        }
        return this.sttlmRateSrc;
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

    /**
     * Adds a new item to the sttlmRateSrc list.
     * @see #getSttlmRateSrc()
     * 
     */
    public OpeningConditions1 addSttlmRateSrc(SettlementRateSource1 sttlmRateSrc) {
        getSttlmRateSrc().add(sttlmRateSrc);
        return this;
    }

}
