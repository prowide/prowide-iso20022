
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
@XmlType(name = "SecurityCSDLink12", propOrder = {
    "finInstrmId",
    "issrInvstrCSD",
    "techIssrCSD",
    "sctyMntnc",
    "issncAcct",
    "dfltLk",
    "vldFr",
    "vldTo"
})
public class SecurityCSDLink12 {

    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "IssrInvstrCSD", required = true)
    protected IssuerOrInvestor2Choice issrInvstrCSD;
    @XmlElement(name = "TechIssrCSD")
    protected SystemPartyIdentification2Choice techIssrCSD;
    @XmlElement(name = "SctyMntnc")
    protected boolean sctyMntnc;
    @XmlElement(name = "IssncAcct")
    protected List<IssuanceAccount3> issncAcct;
    @XmlElement(name = "DfltLk")
    protected Boolean dfltLk;
    @XmlElement(name = "VldFr", required = true)
    protected DateAndDateTime2Choice vldFr;
    @XmlElement(name = "VldTo")
    protected DateAndDateTime2Choice vldTo;

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityCSDLink12 setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the issrInvstrCSD property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerOrInvestor2Choice }
     *     
     */
    public IssuerOrInvestor2Choice getIssrInvstrCSD() {
        return issrInvstrCSD;
    }

    /**
     * Sets the value of the issrInvstrCSD property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerOrInvestor2Choice }
     *     
     */
    public SecurityCSDLink12 setIssrInvstrCSD(IssuerOrInvestor2Choice value) {
        this.issrInvstrCSD = value;
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
    public SecurityCSDLink12 setTechIssrCSD(SystemPartyIdentification2Choice value) {
        this.techIssrCSD = value;
        return this;
    }

    /**
     * Gets the value of the sctyMntnc property.
     * 
     */
    public boolean isSctyMntnc() {
        return sctyMntnc;
    }

    /**
     * Sets the value of the sctyMntnc property.
     * 
     */
    public SecurityCSDLink12 setSctyMntnc(boolean value) {
        this.sctyMntnc = value;
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
     * {@link IssuanceAccount3 }
     * 
     * 
     */
    public List<IssuanceAccount3> getIssncAcct() {
        if (issncAcct == null) {
            issncAcct = new ArrayList<IssuanceAccount3>();
        }
        return this.issncAcct;
    }

    /**
     * Gets the value of the dfltLk property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDfltLk() {
        return dfltLk;
    }

    /**
     * Sets the value of the dfltLk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecurityCSDLink12 setDfltLk(Boolean value) {
        this.dfltLk = value;
        return this;
    }

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
    public SecurityCSDLink12 setVldFr(DateAndDateTime2Choice value) {
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
    public SecurityCSDLink12 setVldTo(DateAndDateTime2Choice value) {
        this.vldTo = value;
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
     * Adds a new item to the issncAcct list.
     * @see #getIssncAcct()
     * 
     */
    public SecurityCSDLink12 addIssncAcct(IssuanceAccount3 issncAcct) {
        getIssncAcct().add(issncAcct);
        return this;
    }

}
