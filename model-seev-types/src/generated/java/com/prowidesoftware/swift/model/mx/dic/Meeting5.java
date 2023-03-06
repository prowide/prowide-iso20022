
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information about the date and location(s) of a general meeting.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Meeting5", propOrder = {
    "dtAndTm",
    "dtSts",
    "qrmReqrd",
    "lctn",
    "qrmQty",
    "urlAdr"
})
public class Meeting5 {

    @XmlElement(name = "DtAndTm", required = true)
    protected DateFormat58Choice dtAndTm;
    @XmlElement(name = "DtSts")
    @XmlSchemaType(name = "string")
    protected MeetingDateStatus2Code dtSts;
    @XmlElement(name = "QrmReqrd")
    protected boolean qrmReqrd;
    @XmlElement(name = "Lctn", required = true)
    protected List<LocationFormat1Choice> lctn;
    @XmlElement(name = "QrmQty")
    protected QuorumQuantity1Choice qrmQty;
    @XmlElement(name = "URLAdr")
    protected String urlAdr;

    /**
     * Gets the value of the dtAndTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat58Choice }
     *     
     */
    public DateFormat58Choice getDtAndTm() {
        return dtAndTm;
    }

    /**
     * Sets the value of the dtAndTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat58Choice }
     *     
     */
    public Meeting5 setDtAndTm(DateFormat58Choice value) {
        this.dtAndTm = value;
        return this;
    }

    /**
     * Gets the value of the dtSts property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingDateStatus2Code }
     *     
     */
    public MeetingDateStatus2Code getDtSts() {
        return dtSts;
    }

    /**
     * Sets the value of the dtSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingDateStatus2Code }
     *     
     */
    public Meeting5 setDtSts(MeetingDateStatus2Code value) {
        this.dtSts = value;
        return this;
    }

    /**
     * Gets the value of the qrmReqrd property.
     * 
     */
    public boolean isQrmReqrd() {
        return qrmReqrd;
    }

    /**
     * Sets the value of the qrmReqrd property.
     * 
     */
    public Meeting5 setQrmReqrd(boolean value) {
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
     * {@link LocationFormat1Choice }
     * 
     * 
     */
    public List<LocationFormat1Choice> getLctn() {
        if (lctn == null) {
            lctn = new ArrayList<LocationFormat1Choice>();
        }
        return this.lctn;
    }

    /**
     * Gets the value of the qrmQty property.
     * 
     * @return
     *     possible object is
     *     {@link QuorumQuantity1Choice }
     *     
     */
    public QuorumQuantity1Choice getQrmQty() {
        return qrmQty;
    }

    /**
     * Sets the value of the qrmQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuorumQuantity1Choice }
     *     
     */
    public Meeting5 setQrmQty(QuorumQuantity1Choice value) {
        this.qrmQty = value;
        return this;
    }

    /**
     * Gets the value of the urlAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLAdr() {
        return urlAdr;
    }

    /**
     * Sets the value of the urlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Meeting5 setURLAdr(String value) {
        this.urlAdr = value;
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
    public Meeting5 addLctn(LocationFormat1Choice lctn) {
        getLctn().add(lctn);
        return this;
    }

}
