
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
 * Elements which allow to identify a meeting.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingReference2", propOrder = {
    "mtgId",
    "issrMtgId",
    "mtgDtAndTm",
    "tp",
    "clssfctn",
    "xtndedClssfctn",
    "lctn"
})
public class MeetingReference2 {

    @XmlElement(name = "MtgId", required = true)
    protected String mtgId;
    @XmlElement(name = "IssrMtgId")
    protected String issrMtgId;
    @XmlElement(name = "MtgDtAndTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mtgDtAndTm;
    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected MeetingType2Code tp;
    @XmlElement(name = "Clssfctn")
    @XmlSchemaType(name = "string")
    protected MeetingTypeClassification1Code clssfctn;
    @XmlElement(name = "XtndedClssfctn")
    protected String xtndedClssfctn;
    @XmlElement(name = "Lctn")
    protected List<PostalAddress1> lctn;

    /**
     * Gets the value of the mtgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtgId() {
        return mtgId;
    }

    /**
     * Sets the value of the mtgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MeetingReference2 setMtgId(String value) {
        this.mtgId = value;
        return this;
    }

    /**
     * Gets the value of the issrMtgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssrMtgId() {
        return issrMtgId;
    }

    /**
     * Sets the value of the issrMtgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MeetingReference2 setIssrMtgId(String value) {
        this.issrMtgId = value;
        return this;
    }

    /**
     * Gets the value of the mtgDtAndTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMtgDtAndTm() {
        return mtgDtAndTm;
    }

    /**
     * Sets the value of the mtgDtAndTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public MeetingReference2 setMtgDtAndTm(XMLGregorianCalendar value) {
        this.mtgDtAndTm = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingType2Code }
     *     
     */
    public MeetingType2Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingType2Code }
     *     
     */
    public MeetingReference2 setTp(MeetingType2Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the clssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingTypeClassification1Code }
     *     
     */
    public MeetingTypeClassification1Code getClssfctn() {
        return clssfctn;
    }

    /**
     * Sets the value of the clssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingTypeClassification1Code }
     *     
     */
    public MeetingReference2 setClssfctn(MeetingTypeClassification1Code value) {
        this.clssfctn = value;
        return this;
    }

    /**
     * Gets the value of the xtndedClssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedClssfctn() {
        return xtndedClssfctn;
    }

    /**
     * Sets the value of the xtndedClssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MeetingReference2 setXtndedClssfctn(String value) {
        this.xtndedClssfctn = value;
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
    public MeetingReference2 addLctn(PostalAddress1 lctn) {
        getLctn().add(lctn);
        return this;
    }

}
