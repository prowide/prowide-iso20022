
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
@XmlType(name = "StatusReportContent8", propOrder = {
    "poiCpblties",
    "poiCmpnt",
    "attndncCntxt",
    "poiDtTm",
    "dataSetReqrd",
    "evt",
    "errs"
})
public class StatusReportContent8 {

    @XmlElement(name = "POICpblties")
    protected PointOfInteractionCapabilities8 poiCpblties;
    @XmlElement(name = "POICmpnt")
    protected List<PointOfInteractionComponent9> poiCmpnt;
    @XmlElement(name = "AttndncCntxt")
    @XmlSchemaType(name = "string")
    protected AttendanceContext1Code attndncCntxt;
    @XmlElement(name = "POIDtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar poiDtTm;
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
     *     {@link PointOfInteractionCapabilities8 }
     *     
     */
    public PointOfInteractionCapabilities8 getPOICpblties() {
        return poiCpblties;
    }

    /**
     * Sets the value of the poiCpblties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteractionCapabilities8 }
     *     
     */
    public StatusReportContent8 setPOICpblties(PointOfInteractionCapabilities8 value) {
        this.poiCpblties = value;
        return this;
    }

    /**
     * Gets the value of the poiCmpnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the poiCmpnt property.
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
     * {@link PointOfInteractionComponent9 }
     * 
     * 
     * @return
     *     The value of the poiCmpnt property.
     */
    public List<PointOfInteractionComponent9> getPOICmpnt() {
        if (poiCmpnt == null) {
            poiCmpnt = new ArrayList<>();
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
    public StatusReportContent8 setAttndncCntxt(AttendanceContext1Code value) {
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
    public Calendar getPOIDtTm() {
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
    public StatusReportContent8 setPOIDtTm(Calendar value) {
        this.poiDtTm = value;
        return this;
    }

    /**
     * Gets the value of the dataSetReqrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dataSetReqrd property.
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
     * @return
     *     The value of the dataSetReqrd property.
     */
    public List<TerminalManagementDataSet25> getDataSetReqrd() {
        if (dataSetReqrd == null) {
            dataSetReqrd = new ArrayList<>();
        }
        return this.dataSetReqrd;
    }

    /**
     * Gets the value of the evt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the evt property.
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
     * @return
     *     The value of the evt property.
     */
    public List<TMSEvent6> getEvt() {
        if (evt == null) {
            evt = new ArrayList<>();
        }
        return this.evt;
    }

    /**
     * Gets the value of the errs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the errs property.
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
     * @return
     *     The value of the errs property.
     */
    public List<String> getErrs() {
        if (errs == null) {
            errs = new ArrayList<>();
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
    public StatusReportContent8 addPOICmpnt(PointOfInteractionComponent9 pOICmpnt) {
        getPOICmpnt().add(pOICmpnt);
        return this;
    }

    /**
     * Adds a new item to the dataSetReqrd list.
     * @see #getDataSetReqrd()
     * 
     */
    public StatusReportContent8 addDataSetReqrd(TerminalManagementDataSet25 dataSetReqrd) {
        getDataSetReqrd().add(dataSetReqrd);
        return this;
    }

    /**
     * Adds a new item to the evt list.
     * @see #getEvt()
     * 
     */
    public StatusReportContent8 addEvt(TMSEvent6 evt) {
        getEvt().add(evt);
        return this;
    }

    /**
     * Adds a new item to the errs list.
     * @see #getErrs()
     * 
     */
    public StatusReportContent8 addErrs(String errs) {
        getErrs().add(errs);
        return this;
    }

}
