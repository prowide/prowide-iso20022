
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
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Participant profile participant information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParticipantInformation1", propOrder = {
    "prflDeltnDt",
    "bkBrnch",
    "termnlId",
    "rstrctns",
    "xtrnlPmtSysInf",
    "mgrtn"
})
public class ParticipantInformation1 {

    @XmlElement(name = "PrflDeltnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar prflDeltnDt;
    @XmlElement(name = "BkBrnch")
    protected CentralisedAndAuthorisedBranchIdentification1Choice bkBrnch;
    @XmlElement(name = "TermnlId")
    protected String termnlId;
    @XmlElement(name = "Rstrctns")
    protected List<String> rstrctns;
    @XmlElement(name = "XtrnlPmtSysInf")
    protected ExternalPaymentSystemDetails1 xtrnlPmtSysInf;
    @XmlElement(name = "Mgrtn", required = true)
    protected SystemMigration1 mgrtn;

    /**
     * Gets the value of the prflDeltnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getPrflDeltnDt() {
        return prflDeltnDt;
    }

    /**
     * Sets the value of the prflDeltnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ParticipantInformation1 setPrflDeltnDt(XMLGregorianCalendar value) {
        this.prflDeltnDt = value;
        return this;
    }

    /**
     * Gets the value of the bkBrnch property.
     * 
     * @return
     *     possible object is
     *     {@link CentralisedAndAuthorisedBranchIdentification1Choice }
     *     
     */
    public CentralisedAndAuthorisedBranchIdentification1Choice getBkBrnch() {
        return bkBrnch;
    }

    /**
     * Sets the value of the bkBrnch property.
     * 
     * @param value
     *     allowed object is
     *     {@link CentralisedAndAuthorisedBranchIdentification1Choice }
     *     
     */
    public ParticipantInformation1 setBkBrnch(CentralisedAndAuthorisedBranchIdentification1Choice value) {
        this.bkBrnch = value;
        return this;
    }

    /**
     * Gets the value of the termnlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermnlId() {
        return termnlId;
    }

    /**
     * Sets the value of the termnlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ParticipantInformation1 setTermnlId(String value) {
        this.termnlId = value;
        return this;
    }

    /**
     * Gets the value of the rstrctns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rstrctns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRstrctns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRstrctns() {
        if (rstrctns == null) {
            rstrctns = new ArrayList<String>();
        }
        return this.rstrctns;
    }

    /**
     * Gets the value of the xtrnlPmtSysInf property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalPaymentSystemDetails1 }
     *     
     */
    public ExternalPaymentSystemDetails1 getXtrnlPmtSysInf() {
        return xtrnlPmtSysInf;
    }

    /**
     * Sets the value of the xtrnlPmtSysInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalPaymentSystemDetails1 }
     *     
     */
    public ParticipantInformation1 setXtrnlPmtSysInf(ExternalPaymentSystemDetails1 value) {
        this.xtrnlPmtSysInf = value;
        return this;
    }

    /**
     * Gets the value of the mgrtn property.
     * 
     * @return
     *     possible object is
     *     {@link SystemMigration1 }
     *     
     */
    public SystemMigration1 getMgrtn() {
        return mgrtn;
    }

    /**
     * Sets the value of the mgrtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemMigration1 }
     *     
     */
    public ParticipantInformation1 setMgrtn(SystemMigration1 value) {
        this.mgrtn = value;
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
     * Adds a new item to the rstrctns list.
     * @see #getRstrctns()
     * 
     */
    public ParticipantInformation1 addRstrctns(String rstrctns) {
        getRstrctns().add(rstrctns);
        return this;
    }

}
