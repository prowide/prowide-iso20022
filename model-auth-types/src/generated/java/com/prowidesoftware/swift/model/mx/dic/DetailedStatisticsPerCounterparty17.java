
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
 * Detailed information on statistics per combination of counterparties.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedStatisticsPerCounterparty17", propOrder = {
    "refDt",
    "mssngValtn",
    "mssngMrgnInf",
    "abnrmlVals"
})
public class DetailedStatisticsPerCounterparty17 {

    @XmlElement(name = "RefDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate refDt;
    @XmlElement(name = "MssngValtn", required = true)
    protected DetailedMissingValuationsStatistics4Choice mssngValtn;
    @XmlElement(name = "MssngMrgnInf", required = true)
    protected DetailedMissingMarginInformationStatistics4Choice mssngMrgnInf;
    @XmlElement(name = "AbnrmlVals", required = true)
    protected DetailedAbnormalValuesStatistics4Choice abnrmlVals;

    /**
     * Gets the value of the refDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getRefDt() {
        return refDt;
    }

    /**
     * Sets the value of the refDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DetailedStatisticsPerCounterparty17 setRefDt(LocalDate value) {
        this.refDt = value;
        return this;
    }

    /**
     * Gets the value of the mssngValtn property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedMissingValuationsStatistics4Choice }
     *     
     */
    public DetailedMissingValuationsStatistics4Choice getMssngValtn() {
        return mssngValtn;
    }

    /**
     * Sets the value of the mssngValtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedMissingValuationsStatistics4Choice }
     *     
     */
    public DetailedStatisticsPerCounterparty17 setMssngValtn(DetailedMissingValuationsStatistics4Choice value) {
        this.mssngValtn = value;
        return this;
    }

    /**
     * Gets the value of the mssngMrgnInf property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedMissingMarginInformationStatistics4Choice }
     *     
     */
    public DetailedMissingMarginInformationStatistics4Choice getMssngMrgnInf() {
        return mssngMrgnInf;
    }

    /**
     * Sets the value of the mssngMrgnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedMissingMarginInformationStatistics4Choice }
     *     
     */
    public DetailedStatisticsPerCounterparty17 setMssngMrgnInf(DetailedMissingMarginInformationStatistics4Choice value) {
        this.mssngMrgnInf = value;
        return this;
    }

    /**
     * Gets the value of the abnrmlVals property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedAbnormalValuesStatistics4Choice }
     *     
     */
    public DetailedAbnormalValuesStatistics4Choice getAbnrmlVals() {
        return abnrmlVals;
    }

    /**
     * Sets the value of the abnrmlVals property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedAbnormalValuesStatistics4Choice }
     *     
     */
    public DetailedStatisticsPerCounterparty17 setAbnrmlVals(DetailedAbnormalValuesStatistics4Choice value) {
        this.abnrmlVals = value;
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
