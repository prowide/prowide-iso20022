
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Specifies the physical parameters of a general meeting. Several dates and places can be defined for a  meeting.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Meeting1", propOrder = {
    "dtAndTm",
    "dtSts",
    "qrmReqrd",
    "lctn",
    "qrmQty",
    "qrmQtyPctg"
})
public class Meeting1 {

    @XmlElement(name = "DtAndTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtAndTm;
    @XmlElement(name = "DtSts", required = true)
    @XmlSchemaType(name = "string")
    protected MeetingDateStatus1Code dtSts;
    @XmlElement(name = "QrmReqrd")
    protected Boolean qrmReqrd;
    @XmlElement(name = "Lctn", required = true)
    protected List<PostalAddress1> lctn;
    @XmlElement(name = "QrmQty")
    protected String qrmQty;
    @XmlElement(name = "QrmQtyPctg")
    protected BigDecimal qrmQtyPctg;

    /**
     * Gets the value of the dtAndTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtAndTm() {
        return dtAndTm;
    }

    /**
     * Sets the value of the dtAndTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Meeting1 setDtAndTm(XMLGregorianCalendar value) {
        this.dtAndTm = value;
        return this;
    }

    /**
     * Gets the value of the dtSts property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingDateStatus1Code }
     *     
     */
    public MeetingDateStatus1Code getDtSts() {
        return dtSts;
    }

    /**
     * Sets the value of the dtSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingDateStatus1Code }
     *     
     */
    public Meeting1 setDtSts(MeetingDateStatus1Code value) {
        this.dtSts = value;
        return this;
    }

    /**
     * Gets the value of the qrmReqrd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQrmReqrd() {
        return qrmReqrd;
    }

    /**
     * Sets the value of the qrmReqrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Meeting1 setQrmReqrd(Boolean value) {
        this.qrmReqrd = value;
        return this;
    }

    /**
     * Gets the value of the lctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PostalAddress1 }
     * 
     * 
     */
    public List<PostalAddress1> getLctn() {
        if (lctn == null) {
            lctn = new ArrayList<PostalAddress1>();
        }
        return this.lctn;
    }

    /**
     * Gets the value of the qrmQty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQrmQty() {
        return qrmQty;
    }

    /**
     * Sets the value of the qrmQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Meeting1 setQrmQty(String value) {
        this.qrmQty = value;
        return this;
    }

    /**
     * Gets the value of the qrmQtyPctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQrmQtyPctg() {
        return qrmQtyPctg;
    }

    /**
     * Sets the value of the qrmQtyPctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Meeting1 setQrmQtyPctg(BigDecimal value) {
        this.qrmQtyPctg = value;
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
     * Adds a new item to the lctn list.
     * @see #getLctn()
     * 
     */
    public Meeting1 addLctn(PostalAddress1 lctn) {
        getLctn().add(lctn);
        return this;
    }

}
