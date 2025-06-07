
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Travel agency component provides details of travel agency, airline, or railway transactions. 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelAgency2", propOrder = {
    "cpny",
    "trvlPackg",
    "addtlData"
})
public class TravelAgency2 {

    @XmlElement(name = "Cpny")
    protected PartyIdentification207 cpny;
    @XmlElement(name = "TrvlPackg")
    protected List<TravelAgencyPackage1> trvlPackg;
    @XmlElement(name = "AddtlData")
    protected String addtlData;

    /**
     * Gets the value of the cpny property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification207 }
     *     
     */
    public PartyIdentification207 getCpny() {
        return cpny;
    }

    /**
     * Sets the value of the cpny property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification207 }
     *     
     */
    public TravelAgency2 setCpny(PartyIdentification207 value) {
        this.cpny = value;
        return this;
    }

    /**
     * Gets the value of the trvlPackg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trvlPackg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrvlPackg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelAgencyPackage1 }
     * 
     * 
     */
    public List<TravelAgencyPackage1> getTrvlPackg() {
        if (trvlPackg == null) {
            trvlPackg = new ArrayList<TravelAgencyPackage1>();
        }
        return this.trvlPackg;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlData() {
        return addtlData;
    }

    /**
     * Sets the value of the addtlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TravelAgency2 setAddtlData(String value) {
        this.addtlData = value;
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
     * Adds a new item to the trvlPackg list.
     * @see #getTrvlPackg()
     * 
     */
    public TravelAgency2 addTrvlPackg(TravelAgencyPackage1 trvlPackg) {
        getTrvlPackg().add(trvlPackg);
        return this;
    }

}
