
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details of car rental service.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RentalDetails1", propOrder = {
    "rntlId",
    "rntlDtTm",
    "rntlStart",
    "rntlRtr",
    "rntlTmPrd",
    "tmPrdUnit",
    "tmPrdRate",
    "ccy"
})
public class RentalDetails1 {

    @XmlElement(name = "RntlId")
    protected String rntlId;
    @XmlElement(name = "RntlDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rntlDtTm;
    @XmlElement(name = "RntlStart")
    protected ServiceStartEnd1 rntlStart;
    @XmlElement(name = "RntlRtr")
    protected ServiceStartEnd1 rntlRtr;
    @XmlElement(name = "RntlTmPrd")
    @XmlSchemaType(name = "string")
    protected List<PeriodUnit2Code> rntlTmPrd;
    @XmlElement(name = "TmPrdUnit")
    protected String tmPrdUnit;
    @XmlElement(name = "TmPrdRate")
    protected BigDecimal tmPrdRate;
    @XmlElement(name = "Ccy")
    protected String ccy;

    /**
     * Gets the value of the rntlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRntlId() {
        return rntlId;
    }

    /**
     * Sets the value of the rntlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RentalDetails1 setRntlId(String value) {
        this.rntlId = value;
        return this;
    }

    /**
     * Gets the value of the rntlDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getRntlDtTm() {
        return rntlDtTm;
    }

    /**
     * Sets the value of the rntlDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RentalDetails1 setRntlDtTm(XMLGregorianCalendar value) {
        this.rntlDtTm = value;
        return this;
    }

    /**
     * Gets the value of the rntlStart property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceStartEnd1 }
     *     
     */
    public ServiceStartEnd1 getRntlStart() {
        return rntlStart;
    }

    /**
     * Sets the value of the rntlStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceStartEnd1 }
     *     
     */
    public RentalDetails1 setRntlStart(ServiceStartEnd1 value) {
        this.rntlStart = value;
        return this;
    }

    /**
     * Gets the value of the rntlRtr property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceStartEnd1 }
     *     
     */
    public ServiceStartEnd1 getRntlRtr() {
        return rntlRtr;
    }

    /**
     * Sets the value of the rntlRtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceStartEnd1 }
     *     
     */
    public RentalDetails1 setRntlRtr(ServiceStartEnd1 value) {
        this.rntlRtr = value;
        return this;
    }

    /**
     * Gets the value of the rntlTmPrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rntlTmPrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRntlTmPrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodUnit2Code }
     * 
     * 
     */
    public List<PeriodUnit2Code> getRntlTmPrd() {
        if (rntlTmPrd == null) {
            rntlTmPrd = new ArrayList<PeriodUnit2Code>();
        }
        return this.rntlTmPrd;
    }

    /**
     * Gets the value of the tmPrdUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmPrdUnit() {
        return tmPrdUnit;
    }

    /**
     * Sets the value of the tmPrdUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RentalDetails1 setTmPrdUnit(String value) {
        this.tmPrdUnit = value;
        return this;
    }

    /**
     * Gets the value of the tmPrdRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTmPrdRate() {
        return tmPrdRate;
    }

    /**
     * Sets the value of the tmPrdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public RentalDetails1 setTmPrdRate(BigDecimal value) {
        this.tmPrdRate = value;
        return this;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RentalDetails1 setCcy(String value) {
        this.ccy = value;
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

    /**
     * Adds a new item to the rntlTmPrd list.
     * @see #getRntlTmPrd()
     * 
     */
    public RentalDetails1 addRntlTmPrd(PeriodUnit2Code rntlTmPrd) {
        getRntlTmPrd().add(rntlTmPrd);
        return this;
    }

}
