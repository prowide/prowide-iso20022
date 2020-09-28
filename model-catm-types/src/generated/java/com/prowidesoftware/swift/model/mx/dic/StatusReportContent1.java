
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
 * Content of the status report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusReportContent1", propOrder = {
    "poiCpblties",
    "poiCmpnt",
    "attndncCntxt",
    "poiDtTm",
    "dataSetReqrd",
    "evt",
    "errs"
})
public class StatusReportContent1 {

    @XmlElement(name = "POICpblties")
    protected PointOfInteractionCapabilities1 poiCpblties;
    @XmlElement(name = "POICmpnt")
    protected List<PointOfInteractionComponent2> poiCmpnt;
    @XmlElement(name = "AttndncCntxt")
    @XmlSchemaType(name = "string")
    protected AttendanceContext1Code attndncCntxt;
    @XmlElement(name = "POIDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar poiDtTm;
    @XmlElement(name = "DataSetReqrd")
    protected DataSetIdentification2 dataSetReqrd;
    @XmlElement(name = "Evt")
    protected List<TMSEvent1> evt;
    @XmlElement(name = "Errs")
    protected String errs;

    /**
     * Gets the value of the poiCpblties property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteractionCapabilities1 }
     *     
     */
    public PointOfInteractionCapabilities1 getPOICpblties() {
        return poiCpblties;
    }

    /**
     * Sets the value of the poiCpblties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteractionCapabilities1 }
     *     
     */
    public StatusReportContent1 setPOICpblties(PointOfInteractionCapabilities1 value) {
        this.poiCpblties = value;
        return this;
    }

    /**
     * Gets the value of the poiCmpnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the poiCmpnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOICmpnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointOfInteractionComponent2 }
     * 
     * 
     */
    public List<PointOfInteractionComponent2> getPOICmpnt() {
        if (poiCmpnt == null) {
            poiCmpnt = new ArrayList<PointOfInteractionComponent2>();
        }
        return this.poiCmpnt;
    }

    /**
     * Gets the value of the attndncCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link AttendanceContext1Code }
     *     
     */
    public AttendanceContext1Code getAttndncCntxt() {
        return attndncCntxt;
    }

    /**
     * Sets the value of the attndncCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttendanceContext1Code }
     *     
     */
    public StatusReportContent1 setAttndncCntxt(AttendanceContext1Code value) {
        this.attndncCntxt = value;
        return this;
    }

    /**
     * Gets the value of the poiDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPOIDtTm() {
        return poiDtTm;
    }

    /**
     * Sets the value of the poiDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public StatusReportContent1 setPOIDtTm(XMLGregorianCalendar value) {
        this.poiDtTm = value;
        return this;
    }

    /**
     * Gets the value of the dataSetReqrd property.
     * 
     * @return
     *     possible object is
     *     {@link DataSetIdentification2 }
     *     
     */
    public DataSetIdentification2 getDataSetReqrd() {
        return dataSetReqrd;
    }

    /**
     * Sets the value of the dataSetReqrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSetIdentification2 }
     *     
     */
    public StatusReportContent1 setDataSetReqrd(DataSetIdentification2 value) {
        this.dataSetReqrd = value;
        return this;
    }

    /**
     * Gets the value of the evt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TMSEvent1 }
     * 
     * 
     */
    public List<TMSEvent1> getEvt() {
        if (evt == null) {
            evt = new ArrayList<TMSEvent1>();
        }
        return this.evt;
    }

    /**
     * Gets the value of the errs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrs() {
        return errs;
    }

    /**
     * Sets the value of the errs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StatusReportContent1 setErrs(String value) {
        this.errs = value;
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
     * Adds a new item to the pOICmpnt list.
     * @see #getPOICmpnt()
     * 
     */
    public StatusReportContent1 addPOICmpnt(PointOfInteractionComponent2 pOICmpnt) {
        getPOICmpnt().add(pOICmpnt);
        return this;
    }

    /**
     * Adds a new item to the evt list.
     * @see #getEvt()
     * 
     */
    public StatusReportContent1 addEvt(TMSEvent1 evt) {
        getEvt().add(evt);
        return this;
    }

}
