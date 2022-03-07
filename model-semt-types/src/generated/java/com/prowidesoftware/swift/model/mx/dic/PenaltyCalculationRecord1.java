
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * Specifies the details for the penalty calculation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PenaltyCalculationRecord1", propOrder = {
    "dt",
    "mssngRefData",
    "finInstrmAttrbts",
    "dscntRate",
    "subAmtPnltyBrkdwn"
})
public class PenaltyCalculationRecord1 {

    @XmlElement(name = "Dt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "MssngRefData")
    protected Boolean mssngRefData;
    @XmlElement(name = "FinInstrmAttrbts", required = true)
    protected PenaltyFinancialInstrumentIdentification1 finInstrmAttrbts;
    @XmlElement(name = "DscntRate")
    protected PriceRateOrAmount4Choice dscntRate;
    @XmlElement(name = "SubAmtPnltyBrkdwn")
    protected List<PenaltyAmountBreakdown1> subAmtPnltyBrkdwn;

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PenaltyCalculationRecord1 setDt(XMLGregorianCalendar value) {
        this.dt = value;
        return this;
    }

    /**
     * Gets the value of the mssngRefData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMssngRefData() {
        return mssngRefData;
    }

    /**
     * Sets the value of the mssngRefData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PenaltyCalculationRecord1 setMssngRefData(Boolean value) {
        this.mssngRefData = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyFinancialInstrumentIdentification1 }
     *     
     */
    public PenaltyFinancialInstrumentIdentification1 getFinInstrmAttrbts() {
        return finInstrmAttrbts;
    }

    /**
     * Sets the value of the finInstrmAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyFinancialInstrumentIdentification1 }
     *     
     */
    public PenaltyCalculationRecord1 setFinInstrmAttrbts(PenaltyFinancialInstrumentIdentification1 value) {
        this.finInstrmAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the dscntRate property.
     * 
     * @return
     *     possible object is
     *     {@link PriceRateOrAmount4Choice }
     *     
     */
    public PriceRateOrAmount4Choice getDscntRate() {
        return dscntRate;
    }

    /**
     * Sets the value of the dscntRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRateOrAmount4Choice }
     *     
     */
    public PenaltyCalculationRecord1 setDscntRate(PriceRateOrAmount4Choice value) {
        this.dscntRate = value;
        return this;
    }

    /**
     * Gets the value of the subAmtPnltyBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subAmtPnltyBrkdwn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubAmtPnltyBrkdwn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PenaltyAmountBreakdown1 }
     * 
     * 
     */
    public List<PenaltyAmountBreakdown1> getSubAmtPnltyBrkdwn() {
        if (subAmtPnltyBrkdwn == null) {
            subAmtPnltyBrkdwn = new ArrayList<PenaltyAmountBreakdown1>();
        }
        return this.subAmtPnltyBrkdwn;
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
     * Adds a new item to the subAmtPnltyBrkdwn list.
     * @see #getSubAmtPnltyBrkdwn()
     * 
     */
    public PenaltyCalculationRecord1 addSubAmtPnltyBrkdwn(PenaltyAmountBreakdown1 subAmtPnltyBrkdwn) {
        getSubAmtPnltyBrkdwn().add(subAmtPnltyBrkdwn);
        return this;
    }

}
