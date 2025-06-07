
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
 * Specifies the details for a specific date on the daily data on settlement fails instructions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementFailsDailyData3", propOrder = {
    "rptgDt",
    "dalyRcrd"
})
public class SettlementFailsDailyData3 {

    @XmlElement(name = "RptgDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rptgDt;
    @XmlElement(name = "DalyRcrd", required = true)
    protected SettlementFailsDailyInstrument3 dalyRcrd;

    /**
     * Gets the value of the rptgDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getRptgDt() {
        return rptgDt;
    }

    /**
     * Sets the value of the rptgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementFailsDailyData3 setRptgDt(XMLGregorianCalendar value) {
        this.rptgDt = value;
        return this;
    }

    /**
     * Gets the value of the dalyRcrd property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFailsDailyInstrument3 }
     *     
     */
    public SettlementFailsDailyInstrument3 getDalyRcrd() {
        return dalyRcrd;
    }

    /**
     * Sets the value of the dalyRcrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFailsDailyInstrument3 }
     *     
     */
    public SettlementFailsDailyData3 setDalyRcrd(SettlementFailsDailyInstrument3 value) {
        this.dalyRcrd = value;
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
