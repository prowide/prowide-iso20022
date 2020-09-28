
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Aggregated position of holdings held in a securities account for a specified financial instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentAggregateBalance1", propOrder = {
    "itmDt",
    "hldgs",
    "pric"
})
public class FinancialInstrumentAggregateBalance1 {

    @XmlElement(name = "ItmDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar itmDt;
    @XmlElement(name = "Hldgs", required = true)
    protected FinancialInstrumentAggregateBalance1Choice hldgs;
    @XmlElement(name = "Pric")
    protected List<Price6> pric;

    /**
     * Gets the value of the itmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getItmDt() {
        return itmDt;
    }

    /**
     * Sets the value of the itmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public FinancialInstrumentAggregateBalance1 setItmDt(XMLGregorianCalendar value) {
        this.itmDt = value;
        return this;
    }

    /**
     * Gets the value of the hldgs property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAggregateBalance1Choice }
     *     
     */
    public FinancialInstrumentAggregateBalance1Choice getHldgs() {
        return hldgs;
    }

    /**
     * Sets the value of the hldgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAggregateBalance1Choice }
     *     
     */
    public FinancialInstrumentAggregateBalance1 setHldgs(FinancialInstrumentAggregateBalance1Choice value) {
        this.hldgs = value;
        return this;
    }

    /**
     * Gets the value of the pric property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pric property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPric().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Price6 }
     * 
     * 
     */
    public List<Price6> getPric() {
        if (pric == null) {
            pric = new ArrayList<Price6>();
        }
        return this.pric;
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
     * Adds a new item to the pric list.
     * @see #getPric()
     * 
     */
    public FinancialInstrumentAggregateBalance1 addPric(Price6 pric) {
        getPric().add(pric);
        return this;
    }

}
