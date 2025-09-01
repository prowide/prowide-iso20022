
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
 * Content of the status report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusReportContent7", propOrder = {
    "poiCpblties",
    "poiCmpnt",
    "attndncCntxt",
    "poiDtTm",
    "dataSetReqrd",
    "evt",
    "errs"
})
public class StatusReportContent7 {

    @XmlElement(name = "POICpblties")
    protected PointOfInteractionCapabilities6 poiCpblties;
    @XmlElement(name = "POICmpnt")
    protected List<PointOfInteractionComponent8> poiCmpnt;
    @XmlElement(name = "AttndncCntxt")
    @XmlSchemaType(name = "string")
    protected AttendanceContext1Code attndncCntxt;
    @XmlElement(name = "POIDtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar poiDtTm;
    @XmlElement(name = "DataSetReqrd")
    protected List<TerminalManagementDataSet25> dataSetReqrd;
    @XmlElement(name = "Evt")
    protected List<TMSEvent6> evt;
    @XmlElement(name = "Errs")
    protected List<String> errs;

    /**
     * Gets the value of the poiCpblties property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteractionCapabilities6 }
     *     
     */
    public PointOfInteractionCapabilities6 getPOICpblties() {
        return poiCpblties;
    }

    /**
     * Sets the value of the poiCpblties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteractionCapabilities6 }
     *     
     */
    public StatusReportContent7 setPOICpblties(PointOfInteractionCapabilities6 value) {
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
     * {@link PointOfInteractionComponent8 }
     * 
     * 
     */
    public List<PointOfInteractionComponent8> getPOICmpnt() {
        if (poiCmpnt == null) {
            poiCmpnt = new ArrayList<PointOfInteractionComponent8>();
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
    public StatusReportContent7 setAttndncCntxt(AttendanceContext1Code value) {
        this.attndncCntxt = value;
        return this;
    }

    /**
     * Gets the value of the poiDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
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
     *     {@link String }
     *     
     */
    public StatusReportContent7 setPOIDtTm(XMLGregorianCalendar value) {
        this.poiDtTm = value;
        return this;
    }

    /**
     * Gets the value of the dataSetReqrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataSetReqrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataSetReqrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TerminalManagementDataSet25 }
     * 
     * 
     */
    public List<TerminalManagementDataSet25> getDataSetReqrd() {
        if (dataSetReqrd == null) {
            dataSetReqrd = new ArrayList<TerminalManagementDataSet25>();
        }
        return this.dataSetReqrd;
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
     * {@link TMSEvent6 }
     * 
     * 
     */
    public List<TMSEvent6> getEvt() {
        if (evt == null) {
            evt = new ArrayList<TMSEvent6>();
        }
        return this.evt;
    }

    /**
     * Gets the value of the errs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getErrs() {
        if (errs == null) {
            errs = new ArrayList<String>();
        }
        return this.errs;
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
    public StatusReportContent7 addPOICmpnt(PointOfInteractionComponent8 pOICmpnt) {
        getPOICmpnt().add(pOICmpnt);
        return this;
    }

    /**
     * Adds a new item to the dataSetReqrd list.
     * @see #getDataSetReqrd()
     * 
     */
    public StatusReportContent7 addDataSetReqrd(TerminalManagementDataSet25 dataSetReqrd) {
        getDataSetReqrd().add(dataSetReqrd);
        return this;
    }

    /**
     * Adds a new item to the evt list.
     * @see #getEvt()
     * 
     */
    public StatusReportContent7 addEvt(TMSEvent6 evt) {
        getEvt().add(evt);
        return this;
    }

    /**
     * Adds a new item to the errs list.
     * @see #getErrs()
     * 
     */
    public StatusReportContent7 addErrs(String errs) {
        getErrs().add(errs);
        return this;
    }

}
