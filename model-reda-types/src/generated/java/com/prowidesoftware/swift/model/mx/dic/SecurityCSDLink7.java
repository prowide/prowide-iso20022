
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
 * Defines how the CSD is linked to the security.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityCSDLink7", propOrder = {
    "vldFr",
    "vldTo",
    "sctyMntnc",
    "issrCSD",
    "invstrCSD",
    "techIssrCSD",
    "issncAcct"
})
public class SecurityCSDLink7 {

    @XmlElement(name = "VldFr", required = true)
    protected DateAndDateTime2Choice vldFr;
    @XmlElement(name = "VldTo")
    protected DateAndDateTime2Choice vldTo;
    @XmlElement(name = "SctyMntnc")
    protected Boolean sctyMntnc;
    @XmlElement(name = "IssrCSD")
    protected SystemPartyIdentification2Choice issrCSD;
    @XmlElement(name = "InvstrCSD")
    protected SystemPartyIdentification2Choice invstrCSD;
    @XmlElement(name = "TechIssrCSD")
    protected SystemPartyIdentification2Choice techIssrCSD;
    @XmlElement(name = "IssncAcct")
    protected List<IssuanceAccount2> issncAcct;

    /**
     * Gets the value of the vldFr property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getVldFr() {
        return vldFr;
    }

    /**
     * Sets the value of the vldFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public SecurityCSDLink7 setVldFr(DateAndDateTime2Choice value) {
        this.vldFr = value;
        return this;
    }

    /**
     * Gets the value of the vldTo property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getVldTo() {
        return vldTo;
    }

    /**
     * Sets the value of the vldTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public SecurityCSDLink7 setVldTo(DateAndDateTime2Choice value) {
        this.vldTo = value;
        return this;
    }

    /**
     * Gets the value of the sctyMntnc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSctyMntnc() {
        return sctyMntnc;
    }

    /**
     * Sets the value of the sctyMntnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecurityCSDLink7 setSctyMntnc(Boolean value) {
        this.sctyMntnc = value;
        return this;
    }

    /**
     * Gets the value of the issrCSD property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification2Choice }
     *     
     */
    public SystemPartyIdentification2Choice getIssrCSD() {
        return issrCSD;
    }

    /**
     * Sets the value of the issrCSD property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification2Choice }
     *     
     */
    public SecurityCSDLink7 setIssrCSD(SystemPartyIdentification2Choice value) {
        this.issrCSD = value;
        return this;
    }

    /**
     * Gets the value of the invstrCSD property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification2Choice }
     *     
     */
    public SystemPartyIdentification2Choice getInvstrCSD() {
        return invstrCSD;
    }

    /**
     * Sets the value of the invstrCSD property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification2Choice }
     *     
     */
    public SecurityCSDLink7 setInvstrCSD(SystemPartyIdentification2Choice value) {
        this.invstrCSD = value;
        return this;
    }

    /**
     * Gets the value of the techIssrCSD property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification2Choice }
     *     
     */
    public SystemPartyIdentification2Choice getTechIssrCSD() {
        return techIssrCSD;
    }

    /**
     * Sets the value of the techIssrCSD property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification2Choice }
     *     
     */
    public SecurityCSDLink7 setTechIssrCSD(SystemPartyIdentification2Choice value) {
        this.techIssrCSD = value;
        return this;
    }

    /**
     * Gets the value of the issncAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issncAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssncAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IssuanceAccount2 }
     * 
     * 
     */
    public List<IssuanceAccount2> getIssncAcct() {
        if (issncAcct == null) {
            issncAcct = new ArrayList<IssuanceAccount2>();
        }
        return this.issncAcct;
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
     * Adds a new item to the issncAcct list.
     * @see #getIssncAcct()
     * 
     */
    public SecurityCSDLink7 addIssncAcct(IssuanceAccount2 issncAcct) {
        getIssncAcct().add(issncAcct);
        return this;
    }

}
