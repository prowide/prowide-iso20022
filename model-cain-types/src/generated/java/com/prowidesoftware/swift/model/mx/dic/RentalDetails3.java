
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
@XmlType(name = "RentalDetails3", propOrder = {
    "id",
    "dtTm",
    "start",
    "rtr",
    "tmPrd",
    "tmPrdUnit",
    "tmPrdRate",
    "ccy"
})
public class RentalDetails3 {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "DtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtTm;
    @XmlElement(name = "Start")
    protected ServiceStartEnd3 start;
    @XmlElement(name = "Rtr")
    protected ServiceStartEnd3 rtr;
    @XmlElement(name = "TmPrd")
    @XmlSchemaType(name = "string")
    protected List<PeriodUnit2Code> tmPrd;
    @XmlElement(name = "TmPrdUnit")
    protected String tmPrdUnit;
    @XmlElement(name = "TmPrdRate")
    protected BigDecimal tmPrdRate;
    @XmlElement(name = "Ccy")
    protected String ccy;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RentalDetails3 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the dtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getDtTm() {
        return dtTm;
    }

    /**
     * Sets the value of the dtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RentalDetails3 setDtTm(XMLGregorianCalendar value) {
        this.dtTm = value;
        return this;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceStartEnd3 }
     *     
     */
    public ServiceStartEnd3 getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceStartEnd3 }
     *     
     */
    public RentalDetails3 setStart(ServiceStartEnd3 value) {
        this.start = value;
        return this;
    }

    /**
     * Gets the value of the rtr property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceStartEnd3 }
     *     
     */
    public ServiceStartEnd3 getRtr() {
        return rtr;
    }

    /**
     * Sets the value of the rtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceStartEnd3 }
     *     
     */
    public RentalDetails3 setRtr(ServiceStartEnd3 value) {
        this.rtr = value;
        return this;
    }

    /**
     * Gets the value of the tmPrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tmPrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTmPrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodUnit2Code }
     * 
     * 
     */
    public List<PeriodUnit2Code> getTmPrd() {
        if (tmPrd == null) {
            tmPrd = new ArrayList<PeriodUnit2Code>();
        }
        return this.tmPrd;
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
    public RentalDetails3 setTmPrdUnit(String value) {
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
    public RentalDetails3 setTmPrdRate(BigDecimal value) {
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
    public RentalDetails3 setCcy(String value) {
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
     * Adds a new item to the tmPrd list.
     * @see #getTmPrd()
     * 
     */
    public RentalDetails3 addTmPrd(PeriodUnit2Code tmPrd) {
        getTmPrd().add(tmPrd);
        return this;
    }

}
