
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
 * Describes information needed to identify a change in the party related static data, the time when it was performed and the user requesting the change and approving it.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyAuditTrail1", propOrder = {
    "rcrd",
    "oprTmStmp",
    "instgUsr",
    "apprvgUsr"
})
public class PartyAuditTrail1 {

    @XmlElement(name = "Rcrd", required = true)
    protected List<UpdateLogPartyRecord1Choice> rcrd;
    @XmlElement(name = "OprTmStmp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar oprTmStmp;
    @XmlElement(name = "InstgUsr", required = true)
    protected String instgUsr;
    @XmlElement(name = "ApprvgUsr")
    protected String apprvgUsr;

    /**
     * Gets the value of the rcrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rcrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdateLogPartyRecord1Choice }
     * 
     * 
     */
    public List<UpdateLogPartyRecord1Choice> getRcrd() {
        if (rcrd == null) {
            rcrd = new ArrayList<UpdateLogPartyRecord1Choice>();
        }
        return this.rcrd;
    }

    /**
     * Gets the value of the oprTmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOprTmStmp() {
        return oprTmStmp;
    }

    /**
     * Sets the value of the oprTmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public PartyAuditTrail1 setOprTmStmp(XMLGregorianCalendar value) {
        this.oprTmStmp = value;
        return this;
    }

    /**
     * Gets the value of the instgUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstgUsr() {
        return instgUsr;
    }

    /**
     * Sets the value of the instgUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyAuditTrail1 setInstgUsr(String value) {
        this.instgUsr = value;
        return this;
    }

    /**
     * Gets the value of the apprvgUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprvgUsr() {
        return apprvgUsr;
    }

    /**
     * Sets the value of the apprvgUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyAuditTrail1 setApprvgUsr(String value) {
        this.apprvgUsr = value;
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
     * Adds a new item to the rcrd list.
     * @see #getRcrd()
     * 
     */
    public PartyAuditTrail1 addRcrd(UpdateLogPartyRecord1Choice rcrd) {
        getRcrd().add(rcrd);
        return this;
    }

}
